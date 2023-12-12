package com.esprit.tn.Repository;

import com.esprit.tn.Entites.Clinique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CliniqueRepository extends JpaRepository<Clinique,Long> {
}
