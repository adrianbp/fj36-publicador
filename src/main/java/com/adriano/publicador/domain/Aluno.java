package com.adriano.publicador.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@Document(collection = "alunos")
public class Aluno {


    @Id
    private String id;
    private String nome;
    private String matricula;
    private Integer idade;
    private String  apelido;



}
