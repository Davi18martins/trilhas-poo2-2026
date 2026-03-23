/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.tds.produto;

/**
 *
 * @author aluno
 */
public class Main {
    public static void main(String[] args){
        //Exercício 6.1
        Produto p1 = new Produto("Mouse", 500, 10);
        Produto p2 = new Produto("Monitor", 989, 2);
        //Exercício 6.2
        System.out.println("Produto 1:");
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Preço: " + p1.getPreco());
        System.out.println("Quantidade: " + p1.getQuantidade());
        System.out.println("---------------------------");
        System.out.println("Produto 2:");
        System.out.println("Nome: " + p2.getNome());
        System.out.println("Preço: " + p2.getPreco());
        System.out.println("Quantidade: " + p2.getQuantidade());
        //Exercício 6.3
        Produto p3 = new Produto();
        Produto p4 = new Produto();
        //Exercício 6.4
        p3.setNome("Teclado");
        p3.setPreco(100);
        p3.setQuantidade(5);
        System.out.println("---------------------------");
        p4.setNome("Tapitinho");
        p4.setPreco(20);
        p4.setQuantidade(1);
        //Exercício 6.5
        System.out.println("Produto 3:");
        System.out.println("Nome: " + p3.getNome());
        System.out.println("Preço: " + p3.getPreco());
        System.out.println("Quantidade: " + p3.getQuantidade());
        System.out.println("---------------------------");
        System.out.println("Produto 4:");
        System.out.println("Nome: " + p4.getNome());
        System.out.println("Preço: " + p4.getPreco());
        System.out.println("Quantidade: " + p4.getQuantidade());
        //Exercício 6.6
        p3.aplicarDesconto(10);
        //Exercício 6.6
        p3.aumentarQuantidade(10);
        //Exercício 6.7
        p3.diminuirQuantidade(1);
        //Exercício 6.8
        System.out.println("\nProduto 3 após atualizações:");
        System.out.println("Preço atualizado: " + p3.getPreco());
        System.out.println("Quantidade atualizada: " + p3.getQuantidade());
    }
      
}
