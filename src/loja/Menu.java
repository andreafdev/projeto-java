package loja;

import java.util.Scanner;

import loja.util.Cores;
import model.Carrinho;
import model.Produtos;

public class Menu {
public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	Carrinho carrinho = newCarrinho();
	
	Produtos produto1 = new Produtos("Caixa Misteriosa - Pacote 1", 75);
	Produtos produto2 = new Produtos("Caixa Misteriosa - Pacote 2", 110);
	Produtos produto3 = new Produtos("Caixa Misteriosa - Pacote 3", 200);
	Produtos produto4 = new Produtos("Caixa Misteriosa - Pacote 4", 225);
	Produtos produto5 = new Produtos("Caixa Misteriosa - Pacote 5", 250);
	
	int opcao;

	while (true) {

		System.out.println(Cores.TEXT_PURPLE_BRIGHT + Cores.ANSI_BLACK_BACKGROUND + "======================================================");
		System.out.println("                                                     ");
		System.out.println("               LOJINHA MISTERIOSA                     ");
		System.out.println("                                                     ");
		System.out.println("======================================================");
		System.out.println("                                                      ");
		System.out.println("            1 - Adicionar produto:                    ");
		System.out.println("            2 - Lista de produtos                     ");
		System.out.println("            3 - Exibir carrinho:                      ");
		System.out.println("            4 - Finalizar a compra:                   ");
		System.out.println("            5 - Sair                                 ");
		System.out.println("                                                     ");
		System.out.println("======================================================");
		System.out.println("            Entre com a opção desejada:              ");
		System.out.println("                                                     ");

		opcao = leia.nextInt();

		if (opcao == 5) {
			System.out.println("\nLojinha Misteriosa agradece o contato. Volte sempre!");
			leia.close();
			System.exit(0);
		}

		switch (opcao) {
			case 1:
				System.out.println("Adicionar produto no carrinho\n\n");
				
				
				System.out.println("Digite o nome do produto a ser adicionado: ");
				String nomeProduto = leia.next();
			adicionarProdutos(leia, carrinho);
			System.out.println("O produto foi adicionado!");
			
			
				keypress();
				break;
				
				
			case 2:
				System.out.println("Lista de produtos: \n\n");
				System.out.println("1. Caixa Misteriosa - Pacote 1: Contém 5 itens misteriosos.");
				System.out.println("2. Caixa Misteriosa - Pacote 2: Contém 8 itens misteriosos.");
				System.out.println("3. Caixa Misteriosa - Pacote 3: Contém 12 itens misteriosos + brinde misterioso.");
				System.out.println("4. Caixa Misteriosa - Pacote 4: Contém 13 itens misteriosos + 2 brindes misteriosos.");
				System.out.println("5. Caixa Misteriosa - Pacote 5: Contém 16 itens misteriosos + 2 brindes misteriosos.");
				String listar = leia.next();
				
				break;
			case 3:
				System.out.println("Abrir carrinho\n\n");
				String abrirCarrinho = leia.next();

				break;
			case 4:
				System.out.println("Pagamento\n\n");
				String pagar = leia.next();

				break;
			case 5:
				System.out.println("Sair\n\n");

				break;
			
			default:
				System.out.println("\nOPÇÃO INVÁLIDA!\n");
				break;
		}
	}
}

private static void keypress() {
	// TODO Auto-generated method stub
	
}

private static Carrinho newCarrinho() {
	// TODO Auto-generated method stub
	return null;
}

private static void adicionarProdutos(Scanner leia, Carrinho carrinho) {
	// TODO Auto-generated method stub
	
}

public static void sobre() {
	System.out.println("\n*********************************************************");
	System.out.println("Projeto Desenvolvido por:  ");
	System.out.println("Andrea Furtunato - andreafps.dev@gmail.com");
	System.out.println("github.com/andreafdev");
	System.out.println("*********************************************************");
	
    }

}
	
	
