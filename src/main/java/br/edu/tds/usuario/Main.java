/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.tds.usuario;

/**
 *
 * @author aluno
 */
public class Main {
    
    public static void main(String[] args){
        
        UsuarioDAO dao = new UsuarioDAO();
        
        //Cadastrando um usuário
        Usuario u1 = new Usuario("Carlos" , "carlos@email.com", "12345");
        dao.cadastrar(u1);
        
        Usuario u2 = new Usuario("Erick" , "erick@email.com", "24680");
        dao.cadastrar(u2);
        
        Usuario u3 = new Usuario("Nicolle" , "nicolle@email.com", "98765");
        dao.cadastrar(u3);
        
        Usuario u4 = new Usuario("Ryan" , "ryan@email.com", "13579");
        dao.cadastrar(u4);
        
        //Testando o Login
        boolean acesso = dao.login("carlos@email.com", "1234");
        
        if(acesso){
            System.out.println("Login realizado com sucesso!!!");
        }
        else{
            System.out.println("Email ou senha inválidos!");
        }
        
    }
    
}
