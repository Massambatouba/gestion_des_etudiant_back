package com.thiam.projetgestiondesetudiant.service;

import com.thiam.projetgestiondesetudiant.entities.Etudiant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public interface EtudiantService {
    public Etudiant createEtudiant(Etudiant etudiant);
    public Etudiant editEtudiant(Etudiant etudiant);

    public Optional<Etudiant> getEtudiantById(Long id);
    public Page<Etudiant> chercherEtudiantParMotCle(String mc, Pageable pageable);
    public Page<Etudiant> getByName(String name, Pageable pageable);

    public List<Etudiant> findBetweenToDate(LocalDate d1, LocalDate d2);

    public List<Etudiant> getAllEtudiant(String name);
}
