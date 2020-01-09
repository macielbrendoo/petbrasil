package br.com.macielbrendoo.petbrasil.model;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@EnableAutoConfiguration
@Entity
public class Candidatura {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String Mensagem;
    private Date dataPostagem;

    public Candidatura() {
    }

    public Candidatura(String mensagem, Date dataPostagem) {
        Mensagem = mensagem;
        this.dataPostagem = dataPostagem;
    }

    public String getMensagem() {
        return Mensagem;
    }

    public void setMensagem(String mensagem) {
        Mensagem = mensagem;
    }

    public Date getDataPostagem() {
        return dataPostagem;
    }

    public void setDataPostagem(Date dataPostagem) {
        this.dataPostagem = dataPostagem;
    }
}
