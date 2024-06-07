package com.thiam.projetgestiondesetudiant;

import com.thiam.projetgestiondesetudiant.entities.Etudiant;
import com.thiam.projetgestiondesetudiant.repository.EtudiantRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;

import java.time.LocalDate;

@SpringBootApplication
public class ProjetGestionDesEtudiantApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(ProjetGestionDesEtudiantApplication.class, args);
       EtudiantRepository etudiantRepository = ctx.getBean(EtudiantRepository.class);
         etudiantRepository.save(new Etudiant("Massamba", LocalDate.of(1992, 10,06), "massamba@gmail.com", "massamba.jpg"));
         etudiantRepository.save(new Etudiant("Khadija", LocalDate.of(1991, 07,27), "khadija@gmail.com", "khadija.jpg"));
         etudiantRepository.save(new Etudiant("Ousmane", LocalDate.of(1990, 12,20), "ousmane@gmail.com", "ousmane.jpg"));
         etudiantRepository.save(new Etudiant("Aminata", LocalDate.of(1998, 10,06), "aminata@gmail.com", "aminata.jpg"));



    }

}
