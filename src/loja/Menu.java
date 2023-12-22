package loja;

import java.util.Scanner;

import loja.util.Cores;
import model.Produtos;
import model.Clientes;
import model.Carrinho;

public class Menu {
public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	int opcao;

	while (true) {

		System.out.println(Cores.TEXT_WHITE_BRIGHT + Cores.ANSI_RED_BACKGROUND + "*****************************************************");
		System.out.println("                                                     ");
		System.out.println("               LOJINHA MISTERIOSA                     ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("            1 - Adicionar produto no carrinho:      ");
		System.out.println("            2 - Remover produto do carrinho:         ");
		System.out.println("            3 - Abrir carrinho:                      ");
		System.out.println("            4 - Pagamento:                           ");
		System.out.println("            6 - SAIR                                 ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
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
				
				System.out.println("Digite o produto a ser adicionado: ");
				String produtos = leia.nextLine();
				
				System.out.println("O produto foi adicionado!");
				break;
			case 2:
				System.out.println("Remover produto do carrinho:\n\n");

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

}
	
	
