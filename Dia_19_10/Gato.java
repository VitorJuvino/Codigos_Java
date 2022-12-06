package Dia_19_10;

public class Gato extends Mamifero implements AnimalDomesticado, AnimalEstimacao {

    public Gato(String nome) {
        super(nome);

        // TODO Auto-generated constructor stub
    }

    String raça;

    @Override
    public void emitirSom() {
        // TODO Auto-generated method stub
        super.emitirSom();
    }

    @Override
    public void Alimentar() {
        System.out.println("Comendo Carne");

    }

    @Override
    public void levarVeterinario() {
        System.out.println("Levando ao veterinario");

    }

    @Override
    public void chamarVeterinario() {
        System.out.println("Chamando veterinario");

    }

    @Override
    public void brincar() {
        System.out.println("Brincado");

    }

    @Override
    public void levarPrapassear() {
        // TODO Auto-generated method stub

    }
}
