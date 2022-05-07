package com.imdedicine.imdedicinebackservice.service.PrescriptionDrug;

import com.imdedicine.imdedicinebackservice.domain.PrescriptionDrug;
import com.imdedicine.imdedicinebackservice.model.PrescriptionDrugResponse;
import com.imdedicine.imdedicinebackservice.repository.PrescriptionDrugRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
@AllArgsConstructor
public class PrescriptionDrugService {

    private final PrescriptionDrugRepository prescriptionDrugRepository;

    public Optional<String> getDosageById(Long objectId) {
        log.info("got id value" + objectId + " and turn to Repository with findByPrescriptionDrugId");
        Optional<PrescriptionDrug> objectResponse = prescriptionDrugRepository.findByPrescriptionDrugId(objectId);
        log.info("retrun optional value" + objectResponse);
        return objectResponse.map(PrescriptionDrug::getDosage);
        }

    public Optional<PrescriptionDrugResponse> getPrescriptionDrugByDrugName(String AccontId , String drugName) {
        PrescriptionDrugResponse.PrescriptionDrugResponseBuilder prescriptionDrugResponse = PrescriptionDrugResponse.builder();
        log.info("got id drugName " + drugName + " and turn to Repository with findByDrugName");
        return prescriptionDrugRepository.findByAccountIdAndDrugName(AccontId, drugName)
                .map(this::mapPrescriptionDrugToPrescriptionDrugResponse);
    }

        private PrescriptionDrugResponse mapPrescriptionDrugToPrescriptionDrugResponse(PrescriptionDrug prescriptionDrug) {
        return PrescriptionDrugResponse.builder()
                .accountId(prescriptionDrug.getAccountId())
                .drugName(prescriptionDrug.getDrugName())
                .dosage(prescriptionDrug.getDosage())
                .medicalSpecialty(prescriptionDrug.getMedicalSpecialty().getValue())
                .build();

    }
}
