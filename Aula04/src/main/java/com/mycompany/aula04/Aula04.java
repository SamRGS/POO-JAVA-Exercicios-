package com.mycompany.aula04;

public class Aula04 {

    public static void main(String[] args) {
      Caneta c1 = new Caneta ("Faber Castel","Vermelha",0.7f);
    //c1.setModelo("Compactor"); //metodo acessor "Set"
    //c1.modelo = "Compactor"; acessando diretamento o atributo 
    //c1.setPonta (0.7f); //permite acessar o atributo privado, usando metodo acessor
      c1.Status();
      
      Caneta c2 = new Caneta ("Compactor", "Azul", 0.5f); 
      c2.Status();   //Exemplo feito com metodo construtor
      
    }
}
