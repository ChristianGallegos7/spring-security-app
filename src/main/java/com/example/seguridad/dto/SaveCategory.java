package com.example.seguridad.dto;

import java.io.Serializable;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaveCategory implements Serializable {
    @NotBlank
    private String name;

}
