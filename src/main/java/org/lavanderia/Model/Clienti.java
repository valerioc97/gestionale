package org.lavanderia.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Clienti extends PanacheEntity {

    private String nome;
    private String cognome;
    private String indirizzo;

    public String getCognome() {
        return cognome;
    }

    public Clienti setCognome(String cognome) {
        this.cognome = cognome;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Clienti setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public Clienti setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
        return this;
    }
}
