package com.nissum.challenge.business.model;

import com.nissum.challenge.business.validator.ValidPassword;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Getter
@Builder
@ConfigurationProperties(prefix = "custom")
public class UserDto {

    @NotEmpty
    private String name;
    @NotEmpty
    @Email
    private String email;

    @ValidPassword
    private String password;

    private List<PhoneDto> phones;
}