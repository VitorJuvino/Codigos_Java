package Dados_de_uma_pessoa;

class Endereco {

    private String logradouro;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getlogradouro() {
        return logradouro;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getnumero() {
        return numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getbairro() {
        return bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getcidade() {
        return cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getestado() {
        return estado;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getcep() {
        return cep;
    }

}
