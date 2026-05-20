package com.example.medicinebackend.controller;

import com.example.medicinebackend.model.Medicine;
import com.example.medicinebackend.repository.MedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicines")
@CrossOrigin(origins = "*")
public class MedicineController {

    @Autowired
    private MedicineRepository medicineRepository;

    // GET all medicines
    @GetMapping
    public List<Medicine> getAllMedicines() {
        return medicineRepository.findAll();
    }

    // GET medicine by ID
    @GetMapping("/{id}")
    public Medicine getMedicineById(@PathVariable Long id) {
        return medicineRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Medicine not found"));
    }

    // ADD medicine
    @PostMapping
    public Medicine addMedicine(@RequestBody Medicine medicine) {
        return medicineRepository.save(medicine);
    }

    // UPDATE medicine
    @PutMapping("/{id}")
    public Medicine updateMedicine(@PathVariable Long id, @RequestBody Medicine updatedMedicine) {

        Medicine medicine = medicineRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Medicine not found"));

        medicine.setName(updatedMedicine.getName());
        medicine.setDosage(updatedMedicine.getDosage());
        medicine.setFrequency(updatedMedicine.getFrequency());
        medicine.setTime(updatedMedicine.getTime());

        return medicineRepository.save(medicine);
    }

    // DELETE medicine
    @DeleteMapping("/{id}")
    public void deleteMedicine(@PathVariable Long id) {
        medicineRepository.deleteById(id);
    }
}