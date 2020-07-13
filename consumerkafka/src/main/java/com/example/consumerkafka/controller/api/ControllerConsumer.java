package com.example.consumerkafka.controller.api;

import com.example.consumerkafka.model.Mensagem;
import com.example.consumerkafka.usecase.ConsumerUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mensagem")
@AllArgsConstructor
public class ControllerConsumer {
    private ConsumerUseCase useCase;

    @GetMapping
    public List<Mensagem> busca() {

        return useCase.busca();
    }

}
