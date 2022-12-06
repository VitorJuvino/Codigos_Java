package RPM;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro("V6");
        Motor motor1 = new Motor();

        carro1.setMotor(motor1);

        System.out.println("RPM do Motor");
        System.out.println(" ");


        motor1.acelerar();
        motor1.acelerar();
        motor1.acelerar();
        motor1.acelerar();

        motor1.desligar();

        motor1.acelerar();
        motor1.acelerar();
        motor1.acelerar();

        motor1.desacelerar();
        motor1.desacelerar();

    }
}
