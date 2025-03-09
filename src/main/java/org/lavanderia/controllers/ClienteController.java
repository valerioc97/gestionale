package org.lavanderia.controllers;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.lavanderia.Assembler;
import org.lavanderia.Model.Clienti;
import org.lavanderia.Service.ClientiService;
import org.lavanderia.dtos.ClientiDto;

import java.util.List;

@Path("/lavanderia")
public class ClienteController {

    @Inject
    private ClientiService clientiService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("clienti")
    public List<Clienti> clienti() {

        return clientiService.recuperaClienti();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("cliente/{id}")
    public Clienti cliente(@PathParam("id") Integer id){
        return clientiService.recuperaCliente(id);
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("salva")
    public String salva(ClientiDto clienti){
        Assembler assembler = new Assembler();
        return clientiService.salvaCliente(assembler.dtoToModel(clienti));

    }
}
