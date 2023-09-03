package com.example.eco_rich.domain.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class JobHistoryId implements Serializable {
    private Long employeeId;
    private Long startDate;
}
