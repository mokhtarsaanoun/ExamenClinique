package com.esprit.tn.Services;

import com.esprit.tn.Entites.Clinique;
import com.esprit.tn.Entites.Medecin;

public interface IserviceExam {
    public Clinique addClinique (Clinique clinique);
    public Medecin addMedecinAndAssignToClinique (Medecin medecin,Long cliniqueId);

}
