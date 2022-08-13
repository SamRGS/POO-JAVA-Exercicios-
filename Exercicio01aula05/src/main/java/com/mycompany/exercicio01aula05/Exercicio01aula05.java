package com.mycompany.exercicio01aula05;


public class Exercicio01aula05 {

    public static void main(String[] args) {
      Conta p1 = new Conta ();
      
      p1.depositar(100);
      p1.setNumConta(1234); 
      p1.setTipo("CC");
      p1.setDono("Januario da Silva");
      p1.abrirConta("CC"); 
      p1.estadoAtual();
      
      Conta p2 = new Conta ();
      
     
      p2.setNumConta(5678);
      p2.setTipo("CP");
      p2.setDono("Sebastiana Josefina");
      p2.abrirConta("CP");
      p2.depositar(350);
      p2.estadoAtual();
     
      
      
       
             
      
   }
}
