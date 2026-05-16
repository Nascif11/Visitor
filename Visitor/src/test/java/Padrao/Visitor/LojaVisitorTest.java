package Padrao.Visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LojaVisitorTest {

    @Test
    void deveExibirCliente() {

        Cliente cliente = new Cliente(1, "Lucas", "Juiz de Fora");

        LojaVisitor visitor = new LojaVisitor();

        assertEquals(
                "Cliente{codigo=1, nome='Lucas', cidade='Juiz de Fora'}",
                visitor.exibir(cliente)
        );
    }

    @Test
    void deveExibirProduto() {

        Categoria categoria = new Categoria("Eletrônicos");

        Produto produto = new Produto(10, "Notebook", categoria);

        LojaVisitor visitor = new LojaVisitor();

        assertEquals(
                "Produto{codigo=10, nome='Notebook', categoria='Eletrônicos'}",
                visitor.exibir(produto)
        );
    }

    @Test
    void deveExibirVendedor() {

        Vendedor vendedor = new Vendedor(100, "Carlos", 15.0);

        LojaVisitor visitor = new LojaVisitor();

        assertEquals(
                "Vendedor{matricula=100, nome='Carlos', comissao=15.0}",
                visitor.exibir(vendedor)
        );
    }
}