package com.imdedicine.imdedicinebackservice.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;


import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name="prescription_drug")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class PrescriptionDrug {

    @javax.persistence.Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "prescription_drug_id")
    public Long prescriptionDrugId;

    @Column(name = "account_id")
    public String accountId;

    @Column(name = "medical_specialty")
    public MedicalSpecialty medicalSpecialty;

    @Builder.Default
    @Column(name = "issue_date")
    public String issueDate=new SimpleDateFormat("dd-MM-yyyy").format(new Date());

    @Column(name = "drug_name")
    public String drugName;

    @Column(name = "dosage")
    public String dosage;

    @Builder.Default
    @Column(name = "time_limited")
    public int timeLimited=0;

    @Column(name = "medication_instructions_link")
    public String medicationInstructionsLink;

}
