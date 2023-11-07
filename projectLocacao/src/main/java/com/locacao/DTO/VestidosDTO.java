
package com.locacao.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class VestidosDTO {
 
    @NotBlank 
    @Size(max = 200) 
    private String descricao;
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return this.descricao;
    }      
}
