package br.com.macielbrendoo.petbrasil.model;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.*;
import java.io.Serializable;

@EnableAutoConfiguration
@Entity
public class Endereco {
    @EmbeddedId
    private enderecoPK enderecoPK;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String uf;

    public Endereco() {
    }

    public br.com.macielbrendoo.petbrasil.model.enderecoPK getEnderecoPK() {
        return enderecoPK;
    }

    public void setEnderecoPK(br.com.macielbrendoo.petbrasil.model.enderecoPK enderecoPK) {
        this.enderecoPK = enderecoPK;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}

@Embeddable
class enderecoPK implements Serializable{
    private int numero;
    private String cep;
    private String complemento;
}
