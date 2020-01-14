package br.com.macielbrendoo.petbrasil.endpoint;

import br.com.macielbrendoo.petbrasil.model.Empresa;
import br.com.macielbrendoo.petbrasil.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("empresa")
public class EmpresaEndpoint {
    private final EmpresaRepository empresaDAO;

    @Autowired
    public EmpresaEndpoint(EmpresaRepository empresaDAO) {
        this.empresaDAO = empresaDAO;
    }

    @GetMapping("/{cpfCnpj}")
    public ResponseEntity<?> getEmpresa(@PathVariable String cpfCnpj) {
        if(empresaDAO.findById(cpfCnpj).isPresent()) {
            return new ResponseEntity<>(empresaDAO.findById(cpfCnpj).get(), HttpStatus.OK);
        }
        return  new ResponseEntity<>("Não encontrado a empresa com o CPF/CNPJ informado", HttpStatus.NOT_FOUND);
    }

    @PostMapping("/cadastro")
    public ResponseEntity<?> createEmpresa(@RequestBody Empresa empresa) {
        if(empresaDAO.findById(empresa.getCpfCnpj()).isPresent()) {
            return new ResponseEntity<>("Usuário já cadastrado", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(empresaDAO.save(empresa), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> updateEmpresa(@RequestBody Empresa empresa) {
        return new ResponseEntity<>(empresaDAO.save(empresa), HttpStatus.OK);
    }

    @DeleteMapping("/{cpfCnpj}")
    public ResponseEntity<?> deleteEmpresa(@PathVariable String cpfCnpj) {
        empresaDAO.deleteById(cpfCnpj);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
