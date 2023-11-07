
package com.locacao.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ClienteDTO {
 
    @NotBlank 
    @Size(max = 100) 
    private String nome;
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }      
}
