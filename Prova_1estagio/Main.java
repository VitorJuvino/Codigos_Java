package Prova_1estagio;

public class Main {
    public static void main(String[] args) {
        Ut ut1 = new Ut();
        Ut ut2 = new Ut();
        Estudante estudante1 = new Estudante();

        estudante1.setNome("Pablo");
        estudante1.setCpf("123.456.678-56");
        estudante1.setIdade(27);
        estudante1.setSexo("Masculino");


        ut1.setDisciplina("Matematica");
        ut1.setNota1(86.85);
        ut1.setNota2(70.56);

        ut2.setDisciplina("Portugues");
        ut2.setNota1(67.86);
        ut2.setNota2(59.90);

        System.out.println(" ");
        System.out.println(estudante1.getNome());
        System.out.println(estudante1.getCpf());
        System.out.println(estudante1.getSexo());
        System.out.println(estudante1.getIdade());
        System.out.println(" ");
        System.out.println(ut1.getDisciplina());
        System.out.println(ut1.getNota1());
        System.out.println(ut1.getNota2());
        System.out.println(" ");
        System.out.println(ut2.getDisciplina());
        System.out.println(ut2.getNota1());
        System.out.println(ut2.getNota2());


    }

}
