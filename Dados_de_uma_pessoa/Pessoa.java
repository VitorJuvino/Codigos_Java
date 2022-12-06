package Dados_de_uma_pessoa;

class Pessoa {

    private String nome;
    private Data datanasc;
    private Endereco endereco;
    private Contato contato;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getnome() {
        return nome;
    }

    public void setDatanasc(Data datanasc) {
        this.datanasc = datanasc;
    }

    public Data getdatanasc() {
        return datanasc;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getendereco() {
        return endereco;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Contato getcontato() {
        return contato;
    }

}
