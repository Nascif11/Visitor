package Padrao.Visitor;

public class LojaVisitor implements Visitor {

    public String exibir(Entidade entidade) {
        return entidade.aceitar(this);
    }

    @Override
    public String exibirCliente(Cliente cliente) {

        return "Cliente{" +
                "codigo=" + cliente.getCodigo() +
                ", nome='" + cliente.getNome() + '\'' +
                ", cidade='" + cliente.getCidade() + '\'' +
                '}';
    }

    @Override
    public String exibirProduto(Produto produto) {

        return "Produto{" +
                "codigo=" + produto.getCodigo() +
                ", nome='" + produto.getNome() + '\'' +
                ", categoria='" + produto.getNomeCategoria() + '\'' +
                '}';
    }

    @Override
    public String exibirVendedor(Vendedor vendedor) {

        return "Vendedor{" +
                "matricula=" + vendedor.getMatricula() +
                ", nome='" + vendedor.getNome() + '\'' +
                ", comissao=" + vendedor.getComissao() +
                '}';
    }
}