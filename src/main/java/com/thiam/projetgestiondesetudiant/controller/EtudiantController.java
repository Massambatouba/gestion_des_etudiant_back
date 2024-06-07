package com.thiam.projetgestiondesetudiant.controller;

import com.thiam.projetgestiondesetudiant.entities.Etudiant;
import com.thiam.projetgestiondesetudiant.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etudiants")
public class EtudiantController {
    @Autowired
    public EtudiantService etudiantService;
    
    @GetMapping("/all/{name}")
    public Page<Etudiant> getByName(@PathVariable String name,
                                    @RequestParam int page,
                                    @RequestParam int size) {
        Pageable pageable = PageRequest.of(page, size);
        return etudiantService.getByName(name, pageable);
    }
    @GetMapping("/list/{name}")
    public List<Etudiant> getListEtudiant(@PathVariable String name) {
        return etudiantService.getAllEtudiant(name);
    }
    @PostMapping("/addEtudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.createEtudiant(etudiant);
    }

    @PutMapping("/edit")
    public Etudiant editEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.editEtudiant(etudiant);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEtudiant(@PathVariable Long id){
        etudiantService.deleteEtudiantById(id);
    }
}
