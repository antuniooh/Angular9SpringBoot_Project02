package io.github.antuniooh.agendaapi;

import io.github.antuniooh.agendaapi.model.entity.Contato;
import io.github.antuniooh.agendaapi.model.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AgendaApiApplication {

	@Bean // executar assimq  inicia
	public CommandLineRunner commandLineRunner(@Autowired ContatoRepository repository){
		return args -> {
			Contato contato = new Contato();
			contato.setNome("Antonio");
			contato.setEmail("Antoio@gmial.com");
			contato.setFavorito(true);

			repository.save(contato);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(AgendaApiApplication.class, args);
	}

}
