package org.akaydeliorman.model;

import lombok.*;
import org.akaydeliorman.enums.SectorType;

import java.time.LocalDateTime;
import java.time.Month;

@Getter
@Setter
public class Company {

    private String name;
    private SectorType sectorType;

    // Constructor

    public Company(String name, SectorType sectorType) {
        this.name = name;
        this.sectorType = sectorType;
    }
}
