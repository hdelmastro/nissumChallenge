package com.nissum.challenge.business.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ErrorResponseDto {

    private String message;
}
