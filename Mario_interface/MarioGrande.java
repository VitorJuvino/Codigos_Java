package Mario_interface;

public class MarioGrande implements InterfaceMario{

    @Override
    public InterfaceMario pegarCogumelo(){
        System.out.println("Mario Grande + 1000 pontos");
        return new MarioGrande();
    }

    @Override
    public InterfaceMario levarDano(){
        System.out.println("Mario Pequeno");
        return new MarioPequeno();
    }

}
