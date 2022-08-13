package com.mycompany.exercicio01aula05;

public class Conta {

//atributos 
    
    public int numConta; 
    protected String tipo; 
    private String dono; 
    private float saldo; 
    private boolean status; 
    
//métodos personalizados 

public void estadoAtual(){
    System.out.println ("<-------------------------------------->");
    System.out.println("Número da conta:" + this.getNumConta());
    System.out.println("Tipo da conta:" + this.getTipo());
    System.out.println("Titular da conta:" + this.getDono()); 
    System.out.println("Saldo:" + this.getSaldo());
    System.out.println("Status da conta:" + this.isStatus());        
    System.out.println ("<-------------------------------------->"); 
}
public void abrirConta(String t){
    this.setTipo(t);  //set = colocar 
    this.setStatus(true); 
    if (t == "CC") {   // o "==" pode ser substituido por equals
        this.setSaldo(50);  
     } else if (t == "CP") {
    }   this.setSaldo(150); 
    System.out.println("Conta aberta com sucesso!");
}   
    
public void fecharConta (){
    if (this.getSaldo() > 0) {   //get = pegar 
    System.out.println ("A conta não pode ser fechada, pois ainda tem saldo");
    } else if (this.getSaldo() < 0) { 
    System.out.println ("A conta não pode ser fechada, pois existe um debito");
    } else { 
        this.setStatus (false);
    System.out.println ("A conta foi encerrada!");
    }
}
public void depositar (float v){
    if (this.isStatus()) { // todo valor boolean retorna como is, não como get
    this.setSaldo(this.getSaldo() + v);
    System.out.println("Depósito realizado na conta de" + this.getDono()); 
    } else{
    System.out.println ("Impossível depositar em uma conta fechada"); 
    }    
}
public void sacar (float v){
    if (this.isStatus()){ 
    if (this.getSaldo() >= v) {
        this.setSaldo(this.getSaldo() - v);
    System.out.println("Saque realizado com sucesso!");
    } else {
    System.out.println("Erro, saldo insuficiente!"); 
            }
    } else { 
    System.out.println ("Conta inativa!");
    }
}
public void pagarMensal(){ 
    int v = 0; 
    if (this.getTipo() == "CC"){
        v = 12; 
    } else if (this.getTipo () == "CP") {
        v = 10;
    }
    if (this.isStatus()) { 
        this.setSaldo(this.getSaldo() - v);
    System.out.println ("Mensalidade paga com sucesso!");
    } else { 
    System.out.println ("Erro, a conta está fechada.");
    }
    
}
//métodos especiais 

public void Conta (){ 
    this.setSaldo(0); 
    this.setStatus(false);
}

public int getNumConta() {
    return numConta;
    }

public void setNumConta(int numConta) {
    this.numConta = numConta;
    }

public String getTipo() {
    return tipo;
    }

public void setTipo(String tipo) {
    this.tipo = tipo;
    }

public String getDono() {
    return dono;
    }

public void setDono(String dono) {
    this.dono = dono;
    }

public float getSaldo() {
    return saldo;
    }

public void setSaldo(float saldo) {
    this.saldo = saldo;
    }

public boolean isStatus() {
    return status;
    }

public void setStatus(boolean status) {
    this.status = status;
    }
 
}


