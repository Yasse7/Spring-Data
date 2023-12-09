package com.example.SpringData_Tp1.repositories;

import com.example.SpringData_Tp1.models.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {

}
