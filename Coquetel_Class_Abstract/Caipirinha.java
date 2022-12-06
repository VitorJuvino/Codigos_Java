package Coquetel_Class_Abstract;

public class Caipirinha extends Coquetel{
    String nome = "caipirinha";
    double valor = 25.0;

    @Override
    void setNome(){
        super.nome = nome;
    }

    @Override
    void setValor(){
        super.valor = valor;
    }

}
