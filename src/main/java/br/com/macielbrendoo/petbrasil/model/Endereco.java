package br.com.macielbrendoo.petbrasil.model;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.*;
import java.io.Serializable;

@EnableAutoConfiguration
@Entity
public class Endereco {
    @EmbeddedId
    private EnderecoPK enderecoPK;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String uf;

    public Endereco() {
    }

    public br.com.macielbrendoo.petbrasil.model.EnderecoPK getEnderecoPK() {
        return enderecoPK;
    }

    public void setEnderecoPK(br.com.macielbrendoo.petbrasil.model.EnderecoPK enderecoPK) {
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
class EnderecoPK implements Serializable{
    private int numero;
    private String cep;
    private String complemento;

    public EnderecoPK() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
