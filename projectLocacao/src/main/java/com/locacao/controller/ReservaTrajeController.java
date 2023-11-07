
package com.locacao.controller;

import com.locacao.DTO.ReservaTrajeDTO;
import com.locacao.model.ReservaTraje;
import com.locacao.service.ReservaTrajeService;
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
@RequestMapping("/reservaTraje")

public class ReservaTrajeController {
    
   final ReservaTrajeService reservaTrajeService; 

    public ReservaTrajeController(ReservaTrajeService reservaTrajeService) {
        this.reservaTrajeService = reservaTrajeService;
    }
   
    @PostMapping
    public ResponseEntity<Object> saveReservaTraje(@RequestBody @Valid ReservaTrajeDTO reservaTrajeDTO){ 
        ReservaTraje reservaTraje = new ReservaTraje();
         BeanUtils.copyProperties(reservaTrajeDTO, reservaTraje); 
         return (ResponseEntity.status(HttpStatus.OK).body(reservaTrajeService.save(reservaTraje)));
    }
    
    @GetMapping
    public ResponseEntity<List<ReservaTraje>> getAllCategorias(){
        return ResponseEntity.status(HttpStatus.OK).body(reservaTrajeService.findAll());
    }        
}
