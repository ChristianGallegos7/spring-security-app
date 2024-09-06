package com.example.seguridad.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaveProduct implements Serializable {
    @NotBlank
    private String name;
    @DecimalMin("0.01")
    private BigDecimal price;
    @Min(value = 1)
    private Long categoryId;

}
