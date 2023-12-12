package com.esprit.tn.Repository;

import com.esprit.tn.Entites.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatienRepository extends JpaRepository<Patient,Long> {
}
