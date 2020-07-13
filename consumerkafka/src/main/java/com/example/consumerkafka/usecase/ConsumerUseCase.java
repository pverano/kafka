package com.example.consumerkafka.usecase;

import com.example.consumerkafka.model.Mensagem;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumerUseCase {

    private List<Mensagem> resultado;

    public void calcula(Mensagem mensagem) {
        mensagem.setValor(mensagem.getValor() * 5);
        resultado.add(mensagem);

    }

    public List<Mensagem> busca() {
        return resultado;
    }

}
