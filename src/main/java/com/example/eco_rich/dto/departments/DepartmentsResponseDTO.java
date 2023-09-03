package com.example.eco_rich.dto.departments;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepartmentsResponseDTO {

    private Long departmentId;
    private String departmentName;
    private Long managerId;
    private Long locationId;
    private String managerName;
    private String locationName;

    public DepartmentsResponseDTO(Long departmentId, String departmentName, Long managerId, Long locationId, String managerName, String locationName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.managerId = managerId;
        this.locationId = locationId;
        this.managerName = managerName;
        this.locationName = locationName;
    }

    public static DepartmentsResponseDTO of(Long departmentId, String departmentName, Long managerId, Long locationId, String managerName, String locationName) {
        return new DepartmentsResponseDTO(departmentId, departmentName, managerId, locationId, managerName, locationName);
    }
}
