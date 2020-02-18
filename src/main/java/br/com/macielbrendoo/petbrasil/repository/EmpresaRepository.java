package br.com.macielbrendoo.petbrasil.repository;

import br.com.macielbrendoo.petbrasil.model.Empresa;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmpresaRepository extends CrudRepository<Empresa, String> {
    List<Empresa> findDistinctByVagasIsNotNull();
}
