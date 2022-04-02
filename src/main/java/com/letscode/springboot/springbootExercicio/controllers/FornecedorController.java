package com.letscode.springboot.springbootExercicio.controllers;

import com.letscode.springboot.springbootExercicio.dtos.FornecedorRequest;
import com.letscode.springboot.springbootExercicio.dtos.FornecedorResponse;
import com.letscode.springboot.springbootExercicio.models.Fornecedor;
import com.letscode.springboot.springbootExercicio.services.FornecedorService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fornecedor")
public class FornecedorController {

    @Autowired
    FornecedorService fornecedorService = new FornecedorService();

    @PostMapping
    public ResponseEntity<FornecedorResponse> novoFornecedor(@RequestBody FornecedorRequest fornecedorRequest) {
        fornecedorService.create(fornecedorRequest);
        FornecedorResponse fornecedorResponse = new FornecedorResponse();
        return ResponseEntity.status(HttpStatus.CREATED).body(fornecedorResponse);
    }
    @GetMapping
    public ResponseEntity<List<Fornecedor>> buscarFornecedores() {
        return ResponseEntity.status(HttpStatus.OK).body(fornecedorService.getAllFornecedores());
    }
}
