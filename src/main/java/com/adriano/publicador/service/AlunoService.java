package com.adriano.publicador.service;

import com.adriano.publicador.domain.Aluno;
import com.adriano.publicador.rabbitMq.NotificaRabbitMQ;
import com.adriano.publicador.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository repository;

    @Autowired
    private NotificaRabbitMQ notificaRabbitMQ;


    public Aluno criaAluno(Aluno aluno){
        Aluno save = repository.save(aluno);

        notificaRabbitMQ.notificaAluno(save);

        return save;

    }

    public Aluno atualizaAluno(Aluno aluno){
        return  repository.save(aluno);

    }

    public Aluno buscaAlunopeloId(String id){
        return  repository.findOne(id);

    }

    public void deletaAluno(String id){
        repository.delete(id);

    }


    public List<Aluno> buscaTodos() {

        return repository.findAll();
    }
}
