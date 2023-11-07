
package com.locacao.Repository;

import com.locacao.model.ReservaTraje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaTrajeRepository extends JpaRepository<ReservaTraje, Integer>{
    
}
