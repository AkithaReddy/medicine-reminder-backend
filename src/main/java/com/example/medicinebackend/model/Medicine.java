package com.example.medicinebackend.model;

import jakarta.persistence.*;

@Entity
public class Medicine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String dosage;
    private String frequency;
    private String time;

    public Medicine() {}

    public Medicine(String name, String dosage, String frequency, String time) {
        this.name = name;
        this.dosage = dosage;
        this.frequency = frequency;
        this.time = time;
    }

    public Long getId() { 
        return id; 
    }

    public void setId(Long id) { 
        this.id = id; 
    }

    public String getName() { 
        return name; 
    }

    public void setName(String name) { 
        this.name = name; 
    }

    public String getDosage() { 
        return dosage; 
    }

    public void setDosage(String dosage) { 
        this.dosage = dosage; 
    }

    public String getFrequency() { 
        return frequency; 
    }

    public void setFrequency(String frequency) { 
        this.frequency = frequency; 
    }

    public String getTime() { 
        return time; 
    }

    public void setTime(String time) { 
        this.time = time; 
    }
}