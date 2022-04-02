package com.letscode.springboot.springbootExercicio.repository;

import com.letscode.springboot.springbootExercicio.models.Fornecedor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BancoFornecedor {
    private List<Fornecedor> fornecedores = new ArrayList<>();

    public Fornecedor addFornecedor(Fornecedor fornecedor) {
        fornecedores.add(fornecedor);
        return fornecedor;
    }

    public List<Fornecedor> getFornecedores() {
        return fornecedores;
    }
}
