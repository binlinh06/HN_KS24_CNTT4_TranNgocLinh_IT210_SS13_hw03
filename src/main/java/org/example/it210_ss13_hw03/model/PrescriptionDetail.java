package org.example.it210_ss13_hw03.model;

import jakarta.persistence.*;

@Entity
@Table(name = "prescription_details")
public class PrescriptionDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String medicineName;
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "prescription_id")
    private Prescription prescription;

    // getter/setter
}
