package com.esprit.tn.Entites;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPatient;
    private String nomPatient;
    private  int telephone;
    private Date dateNaissance;
    @OneToMany(mappedBy = "patient")
    private Set<RendezVous>rendezVouss;

}
