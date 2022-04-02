package com.letscode.springboot.springbootExercicio.models;

import lombok.Data;

import java.math.BigDecimal;
import java.util.UUID;

@Data
public class Fornecedor {

    private UUID id;
    private String nome;
    private String produto;
    private BigDecimal preco;

}
