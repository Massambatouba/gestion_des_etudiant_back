package com.thiam.projetgestiondesetudiant.repository;

import com.thiam.projetgestiondesetudiant.entities.Etudiant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
    public List<Etudiant> findAllByName(String name);
     Page<Etudiant> findByName(String name, Pageable pageable);
    @Query("select e from Etudiant e where e.name ILike :x%")
     Page<Etudiant> chercherEtudiant(@Param("x") String mc, Pageable pageable);

    @Query("select e from Etudiant e where e.dateNaissance  > :x and e.dateNaissance < :y")
     List<Etudiant> chercherEtudiantParDate(@Param("x") LocalDate d1, @Param("y") LocalDate d2);


}
