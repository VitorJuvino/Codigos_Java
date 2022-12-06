package Coquetel_Class_Abstract;

abstract class Coquetel{

    String nome;
    double valor;

    public double getValor(){
        return valor;
    }

    public String getNome(){
        return nome;
    }

    abstract void setNome();
    abstract void setValor();

}
