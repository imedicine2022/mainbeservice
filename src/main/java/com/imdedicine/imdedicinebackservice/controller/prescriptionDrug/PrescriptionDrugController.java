package com.imdedicine.imdedicinebackservice.controller.prescriptionDrug;

import com.imdedicine.imdedicinebackservice.domain.PrescriptionDrug;
import com.imdedicine.imdedicinebackservice.service.PrescriptionDrug.PrescriptionDrugService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Locale;

@RestController
    @Slf4j
    @RequiredArgsConstructor
    @RequestMapping("v1/PrescriptionDrug")
    @Api(value = "PrescriptionDrug Controller")
    public class PrescriptionDrugController {

            private final PrescriptionDrugService prescriptionDrugService;

        @GetMapping("/getDosage")
        public ResponseEntity<String> getDosage(@RequestParam Long id) {
            return prescriptionDrugService.getDosageById(id)
                    .map(dose -> new ResponseEntity<>(dose, HttpStatus.OK))
                    .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }


    @GetMapping("/getPrescriptionDrug")
    public ResponseEntity<PrescriptionDrug> getPrescriptionDrugByDrugName(@RequestParam String name) {
        return prescriptionDrugService.getPrescriptionDrugByDrugName(name)
                .map(dose -> new ResponseEntity<>(dose, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

}
