package com.api.jaebichuri.auth.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class LoginResponseDto {

    private String accessToken;
}