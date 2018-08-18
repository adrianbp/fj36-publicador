package com.adriano.publicador.repositories;


import com.adriano.publicador.domain.Aluno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AlunoRepository extends CrudRepository<Aluno,String> {


    List<Aluno> findAll();




}
