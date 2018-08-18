package com.adriano.publicador.com.adriano.publicador.controller;

import com.adriano.publicador.domain.Aluno;
import com.adriano.publicador.service.AlunoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController("/alunos")
@AllArgsConstructor
public class AlunoController {

    private AlunoService alunoService;

    @GetMapping
    public List<Aluno> listaAlunos(){
        return alunoService.buscaTodos();

    }

    @PostMapping
    public ResponseEntity<Aluno> criaAluno(@RequestBody Aluno aluno){
        Aluno aluno1 = alunoService.criaAluno(aluno);


        return ResponseEntity.ok(aluno1);

    }


}
