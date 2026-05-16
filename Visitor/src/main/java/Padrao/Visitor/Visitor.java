package Padrao.Visitor;

public interface Visitor {

    String exibirCliente(Cliente cliente);

    String exibirProduto(Produto produto);

    String exibirVendedor(Vendedor vendedor);
}