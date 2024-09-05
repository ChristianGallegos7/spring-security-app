package com.example.seguridad.dto;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaveProduct implements Serializable {

    private String name;

    private BigDecimal price;

    private Long categoryId;

}
