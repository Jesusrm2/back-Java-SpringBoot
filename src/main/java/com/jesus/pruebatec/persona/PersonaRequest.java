package com.jesus.pruebatec.persona;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonaRequest {

    Integer idPersona;
    @NotBlank(message = "El nombre es obligatorio")
    String nombres;
    @NotBlank(message = "El apellido es obligatorio")
    String apellidos;
    @NotBlank(message = "La identificación es obligatoria")
    @Pattern(regexp = "\\d{10}", message = "La identificación debe tener 10 dígitos")
    @Pattern(regexp = "^(?!.*(.)\\1{3})\\d{10}$", message = "La identificación no debe tener letras y no debe tener cuatro numeros repetidos seguidos")
    String identificacion;


    Date fechaNcimiento;
}
