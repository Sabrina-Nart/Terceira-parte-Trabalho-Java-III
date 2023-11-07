
package com.locacao.Repository;

import com.locacao.model.Vestidos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VestidosRepository extends JpaRepository<Vestidos, Integer>{
    
}
