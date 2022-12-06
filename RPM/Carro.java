package RPM;

class Carro {

    private String modelo; // criando string para dar o modelo do motor

    private Motor motor; // colocando o motor no carro

    public Carro(String modelo){
        this.modelo = modelo;
    }
    public void setMotor(Motor motor1) {
    }

    // colocando os metodos no carro

    public void acelera(){motor.acelerar();}

    public void desacelera(){motor.desacelerar();}

    public void desliga(){motor.desligar();}


}
