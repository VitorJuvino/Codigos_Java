package Test_Unitario_Retangulo;

public class Retangulo_Main {
    public static void main(String[] args) {

        Test_Retangulo teste = new Test_Retangulo();  // instanciando obj teste do type Test_Ratngulo
        boolean resultado;                           // var do type boolean para receber o resultado

        resultado = teste.test_calcular_area();           // executando o test de calcular area
        System.out.println("Teste Area: " + resultado);

        resultado = teste.test_calcular_perimetro();     // executando o test de calcular perimetro
        System.out.println("Teste Perimetro: " + resultado);


    }
    
}
