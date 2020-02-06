package br.com.macielbrendoo.petbrasil.repository;

import br.com.macielbrendoo.petbrasil.model.Candidato;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CandidatoRepository extends CrudRepository<Candidato, String> {
    List<Candidato> findAllByCandidaturaIsNotNull();
}
