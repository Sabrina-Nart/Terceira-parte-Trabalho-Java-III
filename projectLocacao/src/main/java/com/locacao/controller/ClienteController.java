
package com.locacao.controller;

import com.locacao.DTO.ClienteDTO;
import com.locacao.model.Cliente;
import com.locacao.service.ClienteService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")

public class ClienteController {

   final ClienteService clienteService; 

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }
   
    //METODO SALVAR
    @PostMapping
    public ResponseEntity<Object> saveCliente(@RequestBody @Valid ClienteDTO clienteDTO){ 
        Cliente cliente = new Cliente();
         BeanUtils.copyProperties(clienteDTO, cliente); 
         return (ResponseEntity.status(HttpStatus.OK).body(clienteService.save(cliente)));
    }
    
    //TUDO que chega e TUDO que sai é em Json
    
    //METODO LISTAR 
    @GetMapping
    public ResponseEntity<List<Cliente>> getAllCategorias(){
        return ResponseEntity.status(HttpStatus.OK).body(clienteService.findAll());
    }
}
