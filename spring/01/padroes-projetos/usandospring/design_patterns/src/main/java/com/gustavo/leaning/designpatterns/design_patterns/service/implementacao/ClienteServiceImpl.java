package com.gustavo.leaning.designpatterns.design_patterns.service.implementacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import com.gustavo.leaning.designpatterns.design_patterns.model.Cliente;
import com.gustavo.leaning.designpatterns.design_patterns.model.Endereco;
import com.gustavo.leaning.designpatterns.design_patterns.repository.ClienteJpaRepository;
import com.gustavo.leaning.designpatterns.design_patterns.repository.EnderecoJpaRepository;
import com.gustavo.leaning.designpatterns.design_patterns.service.ClienteService;
import com.gustavo.leaning.designpatterns.design_patterns.service.ViaCepService;

/**
 * Implementação da <b>Strategy</b> {@link ClienteService}, a qual pode ser
 * injetada pelo Spring (via {@link Autowired}). Com isso, como essa classe é um
 * {@link Service}, ela será tratada como um <b>Singleton</b>.
 * 
 * @author gustavo
 */

@Service
public class ClienteServiceImpl implements ClienteService {

    // Singleton: Injetar os componentes do Spring com @Autowired.
    @Autowired
    private ClienteJpaRepository clienteJpaRepository;

    @Autowired
    private EnderecoJpaRepository enderecoJpaRepository;

    @Autowired
    private ViaCepService viaCepService;

    // Strategy: Implementar os métodos definidos na interface.
	// Facade: Abstrair integrações com subsistemas, provendo uma interface simples.

    @Override
    public Iterable<Cliente> buscarTodos() {
        // Buscar todos os cliente
        return clienteJpaRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id){
        // Buscar cliente por ID.
        Optional<Cliente> cliente = clienteJpaRepository.findById(id);
        return cliente.get();
    }

    @Override
    public void inserir(Cliente cliente){
        salvarClienteComCep(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente){
        // Buscar cliente por ID, caso exista
        Optional<Cliente> clienteBd = clienteJpaRepository.findById(id);
            if(clienteBd.isPresent()) {
                salvarClienteComCep(cliente);
            }
    }

    @Override
    public void deletar(Long id){
        // Deletar Cliente por ID
        clienteJpaRepository.deleteById(id);
    }

    private void salvarClienteComCep(Cliente cliente){
        // Verificar se o Endereco do Cliente já existe (pelo CEP)
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoJpaRepository.findById(cep).orElseGet(() -> {
            // Caso não exista, integrar com o ViaCep e persistir o retorno.
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoJpaRepository.save(novoEndereco);
            return novoEndereco;
        });

        cliente.setEndereco(endereco);
        // Inserir Cliente, vinculando o Endereco (novo ou existente)
        clienteJpaRepository.save(cliente);
    }
}
