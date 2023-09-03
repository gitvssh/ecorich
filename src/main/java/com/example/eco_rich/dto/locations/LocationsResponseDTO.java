package com.example.eco_rich.dto.locations;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LocationsResponseDTO {

    private Long locationId;
    private String streetAddress;
    private String postalCode;
    private String city;
    private String stateProvince;
    private String countryId;
    private String countryName;

    public LocationsResponseDTO(Long locationId, String streetAddress, String postalCode, String city, String stateProvince, String countryId, String countryName) {
        this.locationId = locationId;
        this.streetAddress = streetAddress;
        this.postalCode = postalCode;
        this.city = city;
        this.stateProvince = stateProvince;
        this.countryId = countryId;
        this.countryName = countryName;
    }

    public static LocationsResponseDTO of(Long locationId, String streetAddress, String postalCode, String city, String stateProvince, String countryId, String countryName) {
        return new LocationsResponseDTO(locationId, streetAddress, postalCode, city, stateProvince, countryId, countryName);
    }

}
