package com.mycompany.praticandoaula2;


public class Agua {

String marca;
double litros;  
boolean tampada; 
boolean gelada;  

void status() { 
    System.out.println ("A agua é da marca:" + this.marca); 
    System.out.println ("A garrafa tem: " + this.litros); 
}
void tampar() {
    this.tampada = true; 
}  
void destampar() { 
    this.tampada = false; 
} 
void gelada(){ 
    this.gelada = true; 
}
void natural() {
    this.gelada = false;
    
}
void temperatura() { 
    if (this.gelada == true) { 
        System.out.println ("A água está geladinha");
    } else { 
        System.out.println ("A água está natural");
    }
}
void beber() {
     if (this.tampada == true){ 
    System.out.println ("Você não pode beber, porque a garrafa está tampada");
} else { 
        System.out.println ("Pode matar sua sede!"); 
     }
   

    
}

}