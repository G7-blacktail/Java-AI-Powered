package src.facade;

import src.subsistema1.crm.CrmService;
import src.subsistema2.cep.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep) {

       String cidade = CepApi.getInstancia().recuperarCidade(cep);
       String estado = CepApi.getInstancia().recuperarEstado(cidade);
        CrmService.gravarCliente(nome, cep, cidade, estado);
    } 
}