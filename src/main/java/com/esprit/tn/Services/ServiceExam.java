package com.esprit.tn.Services;

import com.esprit.tn.Entites.Clinique;
import com.esprit.tn.Entites.Medecin;
import com.esprit.tn.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class ServiceExam implements IserviceExam {
    @Autowired
    CliniqueRepository cliniqueRepository;
    @Autowired
    MedecinRepository medecinRepository;
    @Autowired
    PatienRepository patienRepository;
    @Autowired
    RendezVousRepository rendezVousRepository;

    @Override
    public Clinique addClinique(Clinique clinique) {
        return cliniqueRepository.save(clinique);
    }

    @Override
    public Medecin addMedecinAndAssignToClinique(Medecin medecin, Long cliniqueId) {

        Clinique c =cliniqueRepository.findById(cliniqueId).get();
        List<Medecin> list = new ArrayList<>();
        list.add(medecin);
        if (c.getMedecins()==null){
            c.setMedecins((Set<Medecin>) list);
        }
        else {
            c.getMedecins().add(medecin);
        }
        return  medecinRepository.save(medecin);
    }
}


