package com.mycompany.aula04;

public class Caneta {
public String modelo; 
private float ponta;
private String cor; 
private boolean tampada; 

public Caneta(String m,String c,Float p ) {  //Este é o metodo construtor
    this.modelo = m;  
    this.cor = c;
    this.ponta = p; 
    this.tampar();
     
}

public String getModelo () {  //não pode ser void por conta da string
    return this.modelo;
}
public void setModelo (String m) { 
    this.modelo = m; 
}
public float getPonta() { 
    return this.ponta;
}   
public void setPonta (float p){
    this.ponta = p;     
}
public void tampar (){ 
    this.tampada = true; 
}
public void destampar (){
    this.tampada = false; 
}
public void Status(){
    System.out.println ("Sobre a caneta: "); 
    System.out.println ("Modelo:" + this.modelo);
    System.out.println ("Ponta:" + this.ponta); 
    System.out.println ("Cor:" + this.cor);
    System.out.println ("Tampada:" + this.tampada);
}
}
