package com.imdedicine.imdedicinebackservice.repository;

import com.imdedicine.imdedicinebackservice.domain.PrescriptionDrug;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PrescriptionDrugRepository extends CrudRepository<PrescriptionDrug, Long> {

    Optional<PrescriptionDrug> findByPrescriptionDrugId(Long id);

    Optional<PrescriptionDrug> findByAccountIdAndDrugName(String AccountId ,String durgName);





}