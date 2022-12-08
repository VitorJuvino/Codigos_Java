package Test_Unitario_Retangulo;

public class Retangulo {

    private int base;
    private int altura;

    
    // Construtor
    public Retangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }


    // Metodos

    public int calcular_area(){
        return base*altura;

    }

    public int calcular_perimetro(){
        return 2*base + 2*altura;
    }


}
