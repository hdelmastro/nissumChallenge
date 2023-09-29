package com.nissum.challenge.business.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PhoneDto {
    @NotEmpty
    @Pattern(regexp = "^[0-9]{6,10}$")
    private String number;
    @NotEmpty
    @Pattern(regexp = "^[0-9]{1,4}$")
    private String cityCode;
    @NotEmpty
    @Pattern(regexp = "^[0-9]{1,4}$")
    private String countryCode;
}
