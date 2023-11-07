
package com.locacao.controller;

import com.locacao.DTO.LocacaoDTO;
import com.locacao.model.Locacao;
import com.locacao.service.LocacaoService;
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
@RequestMapping("/Locacao")

public class LocacaoController {
 
   final LocacaoService locacaoService; 

    public LocacaoController(LocacaoService locacaoService) {
        this.locacaoService = locacaoService;
    }
   
    @PostMapping
    public ResponseEntity<Object> saveLocacao(@RequestBody @Valid LocacaoDTO locacaoDTO){ 
        Locacao locacao = new Locacao();
         BeanUtils.copyProperties(locacaoDTO, locacao); 
         return (ResponseEntity.status(HttpStatus.OK).body(locacaoService.save(locacao)));
    }
    
    @GetMapping
    public ResponseEntity<List<Locacao>> getAllCategorias(){
        return ResponseEntity.status(HttpStatus.OK).body(locacaoService.findAll());
    }     
}
