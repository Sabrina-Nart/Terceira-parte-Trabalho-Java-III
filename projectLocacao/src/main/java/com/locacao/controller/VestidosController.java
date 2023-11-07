
package com.locacao.controller;

import com.locacao.DTO.VestidosDTO;
import com.locacao.model.Vestidos;
import com.locacao.service.VestidosService;
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
@RequestMapping("/vestidos")

public class VestidosController {

   final VestidosService vestidosService; 

    public VestidosController(VestidosService vestidosService) {
        this.vestidosService = vestidosService;
    }
   
    //METODO SALVAR
    @PostMapping
    public ResponseEntity<Object> saveVestidos(@RequestBody @Valid VestidosDTO vestidosDTO){ 
        Vestidos vestidos = new Vestidos();
         BeanUtils.copyProperties(vestidosDTO, vestidos); 
         return (ResponseEntity.status(HttpStatus.OK).body(vestidosService.save(vestidos)));
    }
    
    //TUDO que chega e TUDO que sai é em Json
    
    //METODO LISTAR 
    @GetMapping
    public ResponseEntity<List<Vestidos>> getAllCategorias(){
        return ResponseEntity.status(HttpStatus.OK).body(vestidosService.findAll());
    }   
}
