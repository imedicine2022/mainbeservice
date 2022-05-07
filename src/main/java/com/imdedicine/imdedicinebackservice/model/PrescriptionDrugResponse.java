package com.imdedicine.imdedicinebackservice.model;


import com.imdedicine.imdedicinebackservice.domain.MedicalSpecialty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class PrescriptionDrugResponse {

    public Long prescriptionDrugId;
    public String accountId;
    public String medicalSpecialty;
    public String issueDate;
    public String drugName;
    public String dosage;
    public int timeLimited=0;
    public String medicationInstructionsLink;

}
