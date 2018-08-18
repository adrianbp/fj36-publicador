package com.adriano.publicador.rabbitMq;

import com.adriano.publicador.domain.Aluno;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class NotificaRabbitMQ {


    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value("${publicador.rabbitmq.topic.aluno}")
    private String topicoAluno;

    public void notificaAluno(Aluno aluno){
        rabbitTemplate.convertAndSend(aluno);

    }



}
