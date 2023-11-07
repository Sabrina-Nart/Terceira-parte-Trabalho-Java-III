
package com.locacao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity 
@Table(name = "TB_CLIENTE")

public class Cliente implements java.io.Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "ID_CLIENTE", nullable = false)
    private int id;
    
    @Column(name = "NOME", length = 100, nullable = false)
    private String nome;    

    @Column(name = "CPF", length = 14, nullable = false)    
     private String cpf;
    
    @Column(name = "TELEFONE", length = 11, nullable = false)
    private String telefone;    

    @Column(name = "ENDERECO", length = 100, nullable = false)
    private String endereco;  
    
/////////////////////
    
    public Cliente (){
        
        this.setId(0);
        this.setNome("VÁZIO");
        this.setCpf("");
        this.setTelefone("");
        this.setEndereco("VÁZIO");
    }
    
///////////////////// 

    public Cliente(int id, String nome, String cpf, String telefone, String endereco) {
        
        this.setId(id);
        this.setNome(nome);
        this.setCpf(cpf);
        this.setTelefone(telefone);
        this.setEndereco(endereco);
    }
    
/////////////////////   
    
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome.trim().isEmpty() ? "VÁZIO" : nome.toUpperCase();
    }

    public void setCpf(String cpf) {
        this.cpf = cpf.trim().isEmpty() ? "" : cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone.trim().isEmpty() ? "" : telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco.trim().isEmpty() ? "VÁZIO" : endereco.toUpperCase();
    }
    
/////////////////////   
    
    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getEndereco() {
        return this.endereco;
    }

    
/////////////////////   

    @Override
    public String toString() {
        return "Código: " + id + " , Nome: " + nome;
    }
    
/////////////////////   
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        return this.id == other.id;
    }
    
/////////////////////       
}
