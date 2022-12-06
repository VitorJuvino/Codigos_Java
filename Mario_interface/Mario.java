package Mario_interface;

public class Mario{

    InterfaceMario mario;

    public Mario(){
        mario = new MarioPequeno();
    }

    public void pegarCogumelo(){
        mario = mario.pegarCogumelo();
    }

    public void levarDano(){
        mario = mario.levarDano();
    }

}
