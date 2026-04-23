package org.example.it210_ss13_hw03.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "prescriptions")
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String patientName;

    @OneToMany(
            mappedBy = "prescription",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            orphanRemoval = true
    )
    private List<PrescriptionDetail> details;

    // getter/setter
}
