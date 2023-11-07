
package com.locacao.service;

import com.locacao.Repository.LocacaoRepository;
import com.locacao.model.Locacao;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service 
public class LocacaoService {
    
    final LocacaoRepository locacaoRepository; 

    public LocacaoService(LocacaoRepository locacaoRepository) {
        
        this.locacaoRepository = locacaoRepository;
    }
    
    @Transactional 
    public Locacao save(Locacao locacao){
        
        return locacaoRepository.save(locacao); 
    }
    
    public List<Locacao> findAll(){
        
        return locacaoRepository.findAll();
    }       
}
