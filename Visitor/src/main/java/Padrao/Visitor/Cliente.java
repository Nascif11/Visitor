package Padrao.Visitor;

public class Cliente implements Entidade {

    private int codigo;
    private String nome;
    private String cidade;

    public Cliente(int codigo, String nome, String cidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.cidade = cidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirCliente(this);
    }
}
