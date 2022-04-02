package com.letscode.springboot.springbootExercicio.dtos;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class FornecedorRequest {

    private String nome;
    private String produto;
    private BigDecimal preco;

}
