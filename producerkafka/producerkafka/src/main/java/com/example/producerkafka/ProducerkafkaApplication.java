package com.example.producerkafka;

import com.example.producerkafka.model.Mensagem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
@EnableKafka
public class ProducerkafkaApplication implements CommandLineRunner {
	@Autowired
	private KafkaTemplate<String, Mensagem> template;

	public static void main(String[] args) {
		SpringApplication.run(ProducerkafkaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		template.send("teste", new Mensagem(5));
		template.send("teste",new Mensagem(10));
		template.send("teste", new Mensagem(15));

	}
}
