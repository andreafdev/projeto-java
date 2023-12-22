package model;

public class Produtos {
	
	private String nome;
	private double preco;
	
	public Produtos(String nome, double preco) {
	
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
    	this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }
    
    public void setpreco(String nome) {
    	this.nome = nome;
    }
    
    @Override
    public String toString() {
        return nome + " - R$" + preco;
}
	
}

