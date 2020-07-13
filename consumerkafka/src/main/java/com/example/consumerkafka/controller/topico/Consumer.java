package com.example.consumerkafka.controller.topico;

import com.example.consumerkafka.model.Mensagem;
import com.example.consumerkafka.usecase.ConsumerUseCase;
import lombok.AllArgsConstructor;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Consumer {

    private ConsumerUseCase useCase;

    @KafkaListener(topics = "teste")
    public void recebeMensagem(Mensagem mensagem) {
        useCase.calcula(mensagem);
    }

}
