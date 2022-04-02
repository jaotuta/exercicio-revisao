package com.letscode.springboot.springbootExercicio.dtos;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class FornecedorResponse {

    private String nome;
    private String produto;
    private BigDecimal preco;

}
