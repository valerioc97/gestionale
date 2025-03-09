package org.lavanderia;

import org.lavanderia.Model.Clienti;
import org.lavanderia.dtos.ClientiDto;

public class Assembler {

    public Clienti dtoToModel(ClientiDto clientiDto) {
        return new Clienti()
                .setNome(clientiDto.getNome())
                .setCognome(clientiDto.getCognome())
                .setIndirizzo(clientiDto.getIndirizzo());

    }
}
