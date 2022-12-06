package Mario_interface;

public class MarioPequeno implements InterfaceMario{

    @Override
    public InterfaceMario pegarCogumelo(){
        System.out.println("Mario Grande");
        return new MarioGrande();
    }

    @Override
    public InterfaceMario levarDano(){
        System.out.println("Morreu!!!");
        return new MarioPequeno();
    }

}
