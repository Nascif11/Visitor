package Padrao.Visitor;

public class Vendedor implements Entidade {

    private int matricula;
    private String nome;
    private double comissao;

    public Vendedor(int matricula, String nome, double comissao) {
        this.matricula = matricula;
        this.nome = nome;
        this.comissao = comissao;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getComissao() {
        return comissao;
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirVendedor(this);
    }
}