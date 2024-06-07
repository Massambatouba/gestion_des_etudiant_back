package com.thiam.projetgestiondesetudiant.service;

import com.thiam.projetgestiondesetudiant.entities.Etudiant;
import com.thiam.projetgestiondesetudiant.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class EtudiantServiceImpl implements EtudiantService{
    @Autowired
    EtudiantRepository etudiantRepository;
    @Override
    public Etudiant createEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }
    @Override
    public Etudiant editEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Optional<Etudiant> getEtudiantById(Long id) {
        return etudiantRepository.findById(id);
    }
    @Override
    public Page<Etudiant> chercherEtudiantParMotCle(String mc, Pageable pageable) {
        return etudiantRepository.chercherEtudiant(mc, pageable);
    }

    @Override
    public Page<Etudiant> getByName(String name, Pageable pageable) {
        return etudiantRepository.findByName(name, pageable);
    }

    @Override
    public Page<Etudiant> getAllEtudiant(Pageable pageable) {
        return etudiantRepository.findAll(pageable);
    }


    @Override
    public List<Etudiant> findBetweenToDate(LocalDate d1, LocalDate d2) {
        return etudiantRepository.chercherEtudiantParDate(d1, d2);
    }

    @Override
    public List<Etudiant> getAllEtudiant(String name) {
        return etudiantRepository.findAllByName(name);
    }

    @Override
    public void deleteEtudiantById(Long id) {
        etudiantRepository.deleteById(id);
    }
}
