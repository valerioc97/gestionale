package org.lavanderia.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClientiDto {

    @JsonProperty("nome")
    private String nome;
    @JsonProperty("cognome")
    private String cognome;
    @JsonProperty("indirizzo")
    private String indirizzo;

    public String getNome() {
        return nome;
    }

    public ClientiDto setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getCognome() {
        return cognome;
    }

    public ClientiDto setCognome(String cognome) {
        this.cognome = cognome;
        return this;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public ClientiDto setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
        return this;
    }
}
