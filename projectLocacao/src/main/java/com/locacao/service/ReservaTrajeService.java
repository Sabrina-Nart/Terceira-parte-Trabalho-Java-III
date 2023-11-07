
package com.locacao.service;

import com.locacao.Repository.ReservaTrajeRepository;
import com.locacao.model.ReservaTraje;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service 
public class ReservaTrajeService {
 
    final ReservaTrajeRepository reservaTrajeRepository; 

    public ReservaTrajeService(ReservaTrajeRepository reservaTrajeRepository) {
        
        this.reservaTrajeRepository = reservaTrajeRepository;
    }
    
    @Transactional 
    public ReservaTraje save(ReservaTraje reservaTraje){
        
        return reservaTrajeRepository.save(reservaTraje); 
    }
    
    public List<ReservaTraje> findAll(){
        
        return reservaTrajeRepository.findAll();
    }      
}
