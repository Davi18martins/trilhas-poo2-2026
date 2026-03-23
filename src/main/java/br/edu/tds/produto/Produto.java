/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.tds.produto;

/**
 *
 * @author aluno
 */
public class Produto {
    //Exercício 1
    private String nome;
    private float preco;
    private int quantidade;
    
    //Exercício 2
    public Produto(){
   
    }
    //Exercício 3
    public Produto(String n, float p, int q){
        this.nome = n;
        this.preco = p;
        this.quantidade = q;
    }
    
    //Exercício 3 
    public String getNome(){
        return this.nome;
    }
    public void setNome(String n){
        this.nome = n;
    }
    public float getPreco(){
        return this.preco;
    }
    public void setPreco(float p){
        this.preco = p;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    public void setQuantidade(int q){
        this.quantidade = q;
    }
    
    //Exercício 5.1
    public void aplicarDesconto(float percentual){
        float valorcomdesconto = preco - (preco * (percentual/100));
        System.out.println("Valor após o desconto: " + valorcomdesconto);
    }
    //Exercício 5.2
    public void aumentarQuantidade(int valor){
        quantidade += valor;
    }
    //Exercício 5.3
    public void diminuirQuantidade(int valor){
        if(valor > quantidade){
            System.out.println("Quantidade insuficiente.");
        }else{
            quantidade -= valor;
        }
        
    }
        
}

