package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Carrinho {
	private List<Produtos> produtos = new ArrayList<>();

    public void adicionarProduto(Produtos produto) {
        produtos.add(produto);
    }

    public List<Produtos> getProdutos() {
        return produtos;
    }

    public double calcularTotal() {
        return produtos.stream().mapToDouble(Produtos::getPreco).sum();
    }

	public void removerProduto(int indiceRemover) {
		// TODO Auto-generated method stub
		
	}

	public void limparCarrinho() {
		// TODO Auto-generated method stub
		
	}

private static Carrinho newCarrinho() {
	// TODO Auto-generated method stub
	return null;
}
}


