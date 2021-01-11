package io.github.antuniooh.agendaapi.model.repository;

import io.github.antuniooh.agendaapi.model.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}
