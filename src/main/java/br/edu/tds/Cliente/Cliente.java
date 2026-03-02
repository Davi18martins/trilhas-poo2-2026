/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.tds.Cliente;

/**
 *
 * @author Davi
 */
public class Cliente {
    //Definição de atributos da classe
    private String nome;
    private int idade;
    private String cpf;
    
    //Definir o(s) meu(s) construtor
    public Cliente(){
   
    }
    
    public Cliente(String n, String c, int i){
        this.nome = n;
        this.idade = i;
        this.cpf = c;
    }
    
    //Métodos get & set 
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public String getCPF(){
        return this.cpf;
    }
    public void setCPF(String c){
        this.cpf = c;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int i){
        this.idade = i;
    }
    
    //Métodos funcionais
    public void imprimeDadosCliente(){
        System.out.println("\nNome.: " + this.nome);
        System.out.println("Cpf..: " + this.cpf);
        System.out.println("Idade: " + this.idade);
        System.out.println("----------------------");
    }
}
