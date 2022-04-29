/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author RavTec
 */
public class Cliente extends Pessoa {
    
    private String endereco;
    private int cep;

    public Cliente(String endereco, int cep, int id, String nome, char sexo, Date nascimento, int telefone, String email, int rg) {
        super(id, nome, sexo, nascimento, telefone, email, rg);
        this.endereco = endereco;
        this.cep = cep;
    }

    public Cliente( int id, String nome, String endereco, int cep) {
        super(id, nome);
        this.endereco = endereco;
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }   
    
}
