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


public class Clinique {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClinique;
    private String nomClinique;
    private String adresse;
    private  int telephone;
@ManyToMany
private Set<Medecin> medecins;

}
