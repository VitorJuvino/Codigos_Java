package RPM;

class Motor {

    private int rpm = 0;

    public int getRpm() {
        return rpm;
    }


    // Area dos metodos
    public void acelerar(){
        rpm +=1000;
        System.out.println("RPM: "+rpm);
    }

    public void desacelerar(){
        rpm -= 1000;
        System.out.println("RPM: "+rpm);
    }

    public void desligar(){
        rpm = 0;
        System.out.println("RPM: "+rpm);
    }

}
