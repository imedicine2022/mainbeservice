package com.imdedicine.imdedicinebackservice.convertors;

import com.imdedicine.imdedicinebackservice.domain.MedicalSpecialty;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.stream.Stream;

@Slf4j
@Converter(autoApply = true)
public class MedicalSpecialtyConvertor implements AttributeConverter<MedicalSpecialty,String> {


    @Override
    public String convertToDatabaseColumn(MedicalSpecialty medicalSpecialty) {
        if (medicalSpecialty == null) {
            return null;
        }
        return medicalSpecialty.getValue();
    }

    @Override
    public MedicalSpecialty convertToEntityAttribute(String value) {
        if (value == null) {
            log.error("MedicalSpecialty got Null from DB");
            return null;
        }
        return Stream.of(MedicalSpecialty.values())
                .filter (ms -> ms.getValue().equals(value))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("wrong enum value"));
    }
}
