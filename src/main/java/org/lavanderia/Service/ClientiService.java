package org.lavanderia.Service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import org.lavanderia.Model.Clienti;

import java.util.List;

@Transactional
@ApplicationScoped
public class ClientiService {

    public List<Clienti> recuperaClienti(){
        return Clienti.listAll();
    }

    public Clienti recuperaCliente(Integer id){
        return Clienti.findById(id);
    }

    public String salvaCliente(Clienti clienti){
        try {
            clienti.persist();
            return "OK";
        }catch (Exception e){
            e.printStackTrace();
            return "KO";
        }

    }
}
