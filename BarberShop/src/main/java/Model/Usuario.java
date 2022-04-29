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
public class Usuario extends Pessoa {
   
    protected String Senha;
    protected String nivelAcesso;

    public Usuario(String Senha, String nivelAcesso, int id, String nome, char sexo, Date nascimento, int telefone, String email, int rg) {
        super(id, nome, sexo, nascimento, telefone, email, rg);
        this.Senha = Senha;
        this.nivelAcesso = nivelAcesso;
    }

    public Usuario(String Senha, String nivelAcesso, int id, String nome) {
        super(id, nome);
        this.Senha = Senha;
        this.nivelAcesso = nivelAcesso;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

}
