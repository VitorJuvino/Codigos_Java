package Dados_de_uma_pessoa;

class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Contato cont1 = new Contato();
        Data data1 = new Data();
        Endereco end1 = new Endereco();

        p1.setNome("Vitor Juvino Marques");

        cont1.setTelefoneResid("(83) 99604-7341");
        cont1.setCelular(" 99604-7341");
        cont1.setEmail("juvinovitor@gmail.com");

        data1.setDia(10);
        data1.setMes(05);
        data1.setAno(2003);

        end1.setLogradouro("Rua 1");
        end1.setNumero(00);
        end1.setBairro("Balduino");
        end1.setCidade("Itaporanga");
        end1.setEstado("Paraiba");
        end1.setCep("58780000");

        System.out.println(" ");

        System.out.println(p1.getnome());

        System.out.println(cont1.getTelefoneResid());
        System.out.println(cont1.getcelular());
        System.out.println(cont1.getemail());

        System.out.println(" ");

        System.out.println(data1.getdia());
        System.out.println(data1.getmes());
        System.out.println(data1.getano());

        System.out.println(" ");

        System.out.println(end1.getlogradouro());
        System.out.println(end1.getnumero());
        System.out.println(end1.getbairro());
        System.out.println(end1.getcidade());
        System.out.println(end1.getestado());
        System.out.println(end1.getcep());

    }
}
