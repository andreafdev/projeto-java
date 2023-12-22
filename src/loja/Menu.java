package loja;

import java.util.Scanner;

import loja.util.Cores;
import model.Carrinho;
import model.Produtos;

public class Menu {
public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	Carrinho carrinho = newCarrinho();
	
	Produtos produto1 = new Produtos();
	Produtos produto2 = new Produtos();
	Produtos produto3 = new Produtos();
	
	int opcao;

	while (true) {

		System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_RED_BACKGROUND + "======================================================");
		System.out.println("                                                     ");
		System.out.println("               LOJINHA MISTERIOSA                     ");
		System.out.println("                                                     ");
		System.out.println("======================================================");
		System.out.println("                                                      ");
		System.out.println("            1 - Adicionar produto:                    ");
		System.out.println("            2 - Lista de produtos                     ");
		System.out.println("            3 - Exibir carrinho:                      ");
		System.out.println("            4 - Finalizar a compra:                   ");
		System.out.println("            6 - Sair                                 ");
		System.out.println("                                                     ");
		System.out.println("======================================================");
		System.out.println("            Entre com a opção desejada:              ");
		System.out.println("                                                     ");

		opcao = leia.nextInt();

		if (opcao == 6) {
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
				
				
				break;
			case 3:
				System.out.println("Abrir carrinho\n\n");
				

				break;
			case 4:
				System.out.println("Pagamento\n\n");
				

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
	
	
