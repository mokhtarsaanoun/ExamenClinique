package com.esprit.tn.Repository;

import com.esprit.tn.Entites.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RendezVousRepository extends JpaRepository <RendezVous,Long> {
}
