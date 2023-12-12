package com.esprit.tn.Controller;

import com.esprit.tn.Entites.Medecin;
import com.esprit.tn.Services.IserviceExam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/Exam")
@RestController
public class ExamController {
    @Autowired
    IserviceExam iserviceExam;
    @PostMapping("/addMedecinAndAssignToClinique/{cliniqueId}")
    public void addMedecinAndAssignToClinique(@RequestBody Medecin medecin, @PathVariable Long cliniqueId){
        iserviceExam.addMedecinAndAssignToClinique(medecin, cliniqueId);
    }



    }
