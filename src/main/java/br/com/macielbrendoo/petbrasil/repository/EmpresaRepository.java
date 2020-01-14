package br.com.macielbrendoo.petbrasil.repository;

import br.com.macielbrendoo.petbrasil.model.Empresa;
import org.springframework.data.repository.CrudRepository;

public interface EmpresaRepository extends CrudRepository<Empresa, String> {
}
