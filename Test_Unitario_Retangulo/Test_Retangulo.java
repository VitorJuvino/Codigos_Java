package Test_Unitario_Retangulo;

public class Test_Retangulo {

    Retangulo retangulo;

    public boolean test_calcular_area() {
        retangulo = new Retangulo(10, 2);
        int resultado_esperado = 20;

        int resultado = retangulo.calcular_area();

        if(resultado == resultado_esperado) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean test_calcular_perimetro() {
        retangulo = new Retangulo(10, 2);
        int resultado_esperado = 24;

        int resultado = retangulo.calcular_perimetro();

        if(resultado == resultado_esperado) {
            return true;
        }
        else {
            return false;
        }
    }

    
}
