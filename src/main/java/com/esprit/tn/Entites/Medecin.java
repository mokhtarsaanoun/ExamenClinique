package com.esprit.tn.Entites;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Medecin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMedecin;
    private String nomMedecin;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    private  int telephone;
    private  int prixConsultation;
    @ManyToMany(mappedBy = "medecins")
    private Set<Clinique>cliniques;
    @OneToMany(mappedBy = "medecin")
    private Set<RendezVous>rendezVousss;

}
