package br.com.macielbrendoo.petbrasil.model;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.*;

@EnableAutoConfiguration
@Entity
public class Candidato {
    @Id
    private String cpf;
    private String nome;
    private String email;
    private int idade;
    private int telefone;
    private String especialidade;

    @OneToOne
    private Endereco endereco;

    @OneToOne
    private Candidatura candidatura;

    public Candidato() {
    }

    public Candidato(String nome, int idade, String cpf, String email, int telefone, String especialidade, Endereco endereco, Candidatura candidatura) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.especialidade = especialidade;
        this.endereco = endereco;
        this.candidatura = candidatura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefone() {
        return telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public Candidatura  getCandidatura() { return candidatura; }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setCandidatura(Candidatura candidatura) { this.candidatura = candidatura; }
}
