package com.jesus.pruebatec.session;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SessionRequest {
    Integer sessionId;
    Date fechaIngreso;
    Date fechaCierrre;
    Integer userId;
}
