/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.tds.cliente;

/**
 *
 * @author aluno
 */
public class Principal {
    
    public static void main(String[] args){
        System.out.println("Testando objetos da classe cliente");
        //Usando a classe Cliente
        Cliente c1 = new Cliente("Davi", "190.055.960-19",19);
        c1.imprimeDadosCliente();
        Cliente c2 = new Cliente("João", "150.900.060-12",43);  
        c2.imprimeDadosCliente();
        Cliente c3 = new Cliente("Manoel"," 200.800.090-01",33);  
        c3.imprimeDadosCliente();
        Cliente c4 = new Cliente();
        c4.setNome("Amaral");
        c4.setCPF("300.080.789-40");
        c4.setIdade(88);
        c4.imprimeDadosCliente();
        
        //Imprimer somente o nome de um cliente
        //Usando métodos Get
        String nome = c4.getNome();
        System.out.println("Nome obtido pelo get: " + nome);

    }
    
}
