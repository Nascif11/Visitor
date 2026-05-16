package Padrao.Visitor;

public class Produto implements Entidade {

    private int codigo;
    private String nome;
    private Categoria categoria;

    public Produto(int codigo, String nome, Categoria categoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeCategoria() {
        return this.categoria.getNome();
    }

    @Override
    public String aceitar(Visitor visitor) {
        return visitor.exibirProduto(this);
    }
}
