package com.workintech.sqlrelations.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "surgery")
public class Surgery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long nurseId;
    private long patientId;
    private long doctorId;

    public Surgery() {}

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public long getNurseId() { return nurseId; }
    public void setNurseId(long nurseId) { this.nurseId = nurseId; }
    public long getPatientId() { return patientId; }
    public void setPatientId(long patientId) { this.patientId = patientId; }
    public long getDoctorId() { return doctorId; }
    public void setDoctorId(long doctorId) { this.doctorId = doctorId; }
}
