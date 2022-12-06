package Coquetel_Class_Abstract;

class Main {
    public static void main(String[] args) {
        Coquetel c1 = new Caipirinha();
        c1.setNome();
        c1.setValor();
        System.out.println(" "+c1.getNome()+" "+c1.getValor());
    }
}