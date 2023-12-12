package com.esprit.tn.Entites;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class RendezVous {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRDV;
    private Date dateRDV;
    private String remarque;
    @ManyToOne
    private Patient patient;
    @ManyToOne
    private Medecin medecin;

}
