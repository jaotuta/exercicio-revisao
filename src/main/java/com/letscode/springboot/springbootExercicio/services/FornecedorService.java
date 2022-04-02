package com.letscode.springboot.springbootExercicio.services;

import com.letscode.springboot.springbootExercicio.dtos.FornecedorRequest;
import com.letscode.springboot.springbootExercicio.models.Fornecedor;
import com.letscode.springboot.springbootExercicio.repository.BancoFornecedor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedorService {

    @Autowired
    BancoFornecedor bancoFornecedor = new BancoFornecedor();

    public Fornecedor create(FornecedorRequest fornecedorRequest) {
        Fornecedor fornecedor = new Fornecedor();
        BeanUtils.copyProperties(fornecedorRequest, fornecedor);
        bancoFornecedor.addFornecedor(fornecedor);
        return fornecedor;
    }

    public List<Fornecedor> getAllFornecedores() {
        return bancoFornecedor.getFornecedores();
    }
}
