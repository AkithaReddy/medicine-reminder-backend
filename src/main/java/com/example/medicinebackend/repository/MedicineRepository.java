package com.example.medicinebackend.repository;

import com.example.medicinebackend.model.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicineRepository extends JpaRepository<Medicine, Long> {
    // nothing else needed
}