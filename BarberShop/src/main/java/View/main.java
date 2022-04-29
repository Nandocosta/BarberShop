/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Cliente;
import Model.Servico;
import javax.swing.JOptionPane;

/**
 *
 * @author RavTec
 */
public class main {
    public static void main(String[]args){
        Servico servico = new Servico(1,"Barba",30.2f);
        
        System.out.println(servico.getDescricao());
        System.out.println(servico.getValor());
        
        Cliente cliente = new Cliente(1,"nome","endereco", 20020);
        cliente.setId(1);
        cliente.setNome("fernando");
        cliente.setEndereco("Rua Frexeira");
        cliente.setCep(70023);

       String Cliente = String.format("id: %d\nnome: %s\nEdereço: %s\nCep: %d",
             cliente.getId(),cliente.getNome(),cliente.getEndereco(), cliente.getCep()
        );
       JOptionPane.showMessageDialog(null, Cliente, "Cliente", 3);
        
    }
}
