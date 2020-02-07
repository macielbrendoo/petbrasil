package br.com.macielbrendoo.petbrasil.endpoint;

import br.com.macielbrendoo.petbrasil.model.Candidato;
import br.com.macielbrendoo.petbrasil.repository.CandidatoRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("candidato")
public class CandidatoEndpoint {
    private final CandidatoRepository candidatoDAO;

    @Autowired
    public CandidatoEndpoint(CandidatoRepository candidatoDAO) {
        this.candidatoDAO = candidatoDAO;
    }


    @GetMapping("/candidaturas")
    public ResponseEntity<?> listCandidatura() {

        return new ResponseEntity<>(candidatoDAO.findAllByCandidaturaIsNotNull(), HttpStatus.OK);
    }

    @GetMapping("/{cpf}")
    public ResponseEntity<?> getCandidatoByCpf(@PathVariable String cpf) {
        if (candidatoDAO.findById(cpf).isPresent()) {
            return new ResponseEntity<>(candidatoDAO.findById(cpf).get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Não encontrado candidato com o cpf informado",HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/cadastro")
    public ResponseEntity<?> createCandidato(@RequestBody @NotNull Candidato candidato) {
        if(candidatoDAO.findById(candidato.getCpf()).isPresent()) {
            return new ResponseEntity<>("Usuário já cadastrado", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(candidatoDAO.save(candidato),HttpStatus.CREATED);
    }

    @DeleteMapping("/{cpf}")
    public ResponseEntity<?> deleteCandidato(@PathVariable String cpf) {
        candidatoDAO.deleteById(cpf);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> updateCandidato(@RequestBody Candidato candidato) {
        return new ResponseEntity<>(candidatoDAO.save(candidato), HttpStatus.OK);
    }
}
