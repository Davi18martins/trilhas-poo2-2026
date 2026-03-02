/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.tds.Produto;

/**
 *
 * @author aluno
 */
public class Produto {
    //Definição de atributos da classe
    private String nome;
    private double preco;
    private int quantidade;
    
    //Definir o(s) meu(s) construtor
    public Produto(){
   
    }
    
    public Produto(String n, double p, int q){
        this.nome = n;
        this.preco = p;
        this.quantidade = q;
    }
    
    //Métodos get & set 
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public double getPreco(){
        return this.preco;
    }
    public void setCPF(double p){
        this.preco = p;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    public void setIdade(int q){
        this.quantidade = q;
    }
    
    //Métodos funcionais
    public void imprimeDadosProduto(){
        System.out.println("\nNome.: " + this.nome);
        System.out.println("Preco.: " + this.preco);
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("----------------------");
    }
        
}

