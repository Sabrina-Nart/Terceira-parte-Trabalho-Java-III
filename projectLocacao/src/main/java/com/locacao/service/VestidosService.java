
package com.locacao.service;

import com.locacao.Repository.VestidosRepository;
import com.locacao.model.Vestidos;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service 
public class VestidosService {
 
    final VestidosRepository vestidosRepository; 

    public VestidosService(VestidosRepository vestidosRepository) {
        
        this.vestidosRepository = vestidosRepository;
    }
    
    @Transactional 
    public Vestidos save(Vestidos vestidos){
        
        return vestidosRepository.save(vestidos); 
    }
    
    public List<Vestidos> findAll(){
        
        return vestidosRepository.findAll();
    }     
}
