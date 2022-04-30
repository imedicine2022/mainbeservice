package com.imdedicine.imdedicinebackservice.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum MedicalSpecialty {
    ANESTHESIA("anesthesia"),
    CARDIOVASCULAR("cardiovascular"),
    COMMUNITYHEALTH("communityhealth"),
    DENTISTRY("dentistry"),
    DERMATOLOGYV("dermatologyv"),
    DIETNUTRITION("dietnutrition"),
    EMERGENCY("emergency"),
    ENDOCRINE("endocrine"),
    GASTROENTEROLOGIC("gastroenterologic"),
    GENETIC("genetic"),
    GERIATRIC("geriatric"),
    GYNECOLOGIC("gynecologic"),
    HEMATOLOGIC("hematologic"),
    INFECTIOUS("infectious"),
    LABORATORYSCIENCE("laboratoryscience"),
    MIDWIFERY("midwifery"),
    MUSCULOSKELETAL("musculoskeletal"),
    NEUROLOGIC("neurologic"),
    NURSING("nursing"),
    OBSTETRIC("obstetric"),
    ONCOLOGIC("oncologic"),
    OPTOMETRIC("optometric"),
    OTOLARYNGOLOGIC("otolaryngologic"),
    PATHOLOGY("pathology"),
    PEDIATRIC("pediatric"),
    PHARMACYSPECIALTY("pharmacyspecialty"),
    PHYSIOTHERAPY("physiotherapy"),
    PLASTICSURGERY("plasticsurgery"),
    PODIATRIC("podiatric"),
    PRIMARYCARE("primarycare"),
    PSYCHIATRIC("psychiatric"),
    PUBLICHEALTH("publichealth"),
    PULMONARY("pulmonary"),
    RADIOGRAPHY("radiography"),
    RENAL("renal"),
    RESPIRATORYTHERAPY("respiratorytherapy"),
    RHEUMATOLOGIC("rheumatologic"),
    SPEECHPATHOLOGY("speechpathology"),
    SURGICAL("surgical"),
    TOXICOLOGIC("toxicologic"),
    UROLOGIC("urologic"),
    OTHER("OTHER");

    @Getter
    private final String value;


    public static MedicalSpecialty fromString(String text) {
        for (MedicalSpecialty revenueRangeGroup : MedicalSpecialty.values()) {
            if (revenueRangeGroup.value.equalsIgnoreCase(text)) {
                return revenueRangeGroup;
            }
        }
        return null;
    }
}
