
package com.locacao.service;

import com.locacao.Repository.ClienteRepository;
import com.locacao.model.Cliente;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service 
public class ClienteService {
 
    final ClienteRepository clienteRepository; 

    public ClienteService(ClienteRepository clienteRepository) {
        
        this.clienteRepository = clienteRepository;
    }
    
    @Transactional 
    public Cliente save(Cliente cliente){
        return clienteRepository.save(cliente); 
    }
    
    public List<Cliente> findAll(){
        return clienteRepository.findAll();
    }      
}
