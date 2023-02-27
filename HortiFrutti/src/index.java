
import java.util.Scanner;

import estoque.Estoque;

public class index {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String tipoProduto = "";
		String marcaProduto = "";
		double preco = 0;
		int quantidade = 0;
		int opcao = 0;
		int cont = 0;
		Estoque e1 = new Estoque();

		// INICIO MENU PRINCIPAL
		while (true) {
			System.out.println("MERCEARIA HORFIFRUTE\n" + "1 - Estoque\n" + "2 - \n" + "3 - \n" + "4 - \n" + "5 - sair"
					+ "\nInfome a função desejada: ");
			opcao = input.nextInt();
			switch (opcao) {

			// INICIO Menu do Estoque
			case 1:
				while (true) {
					System.out.println("\nESTOQUE\n" + "1 - Adicionar produto\n" + "2 - Remover produto\n"
							+ "3 - Alterar produto\n" + "4 - Visualizar estoque\n" + "5 - sair"
							+ "\nInfome a função desejada: ");
					opcao = input.nextInt();
					switch (opcao) {
					// INICIO Adicionar produtos na lista
					case 1: {
						System.out.println("Informe o tipo de produto: ");
						tipoProduto = input.next();
						System.out.println("Informe a marca do produto: ");
						marcaProduto = input.next();
						System.out.println("Informe o preco: ");
						preco = input.nextDouble();
						System.out.println("Quantidade: ");
						quantidade = input.nextInt();

						// Caso já exista o produto citado dentro do estoque irá consultar se o usuario
						// gostaria de crescentar
						// mais e alterar o preco do produto.
						if (e1.checarEstoque(tipoProduto, marcaProduto) == true) {
							opcao = 0;
							System.out.println("Produto já se encontra no estoque!!");
							System.out.println("1 - SIM | 2 - NÃO"
									+ "\nDeseja acrecentar mais e alterar o preco desse produto ao estoque?");
							opcao = input.nextInt();
							if (opcao == 1) {
								e1.alterarValorEstoque(preco, quantidade);
								break;
							} else if (opcao == 2) {
								System.out
										.println("Produto já encontra-se no estoque. Removendo os dados citado acima!");
								break;
							}
						}

						e1.adicionarLista(tipoProduto, marcaProduto, preco, cont++, quantidade);
						opcao = 0;
						break;
					} // FIM do adicionar produto na lista

					// INICIO do Remover um produto da lista
					case 2: {
						System.out.println("Informe o nome do produto que deseja remover: ");
						marcaProduto = input.next();
						e1.removerLista(marcaProduto);
						break;
					} // FIM do Remover um produto da lista

					// INICIO de Alterar dados do produto
					case 3: {
						// - Deve ter a condição de alterar preco, e quantidade
						System.out.println("Digite o nome do produto: ");
						marcaProduto = input.next();
						System.out.println(
								"1 - Alterar preco\n" + "2 - Alterar quantidade" + "Informe a opcao desejada: ");
						opcao = input.nextInt();
						switch (opcao) {
						case 1: {
							System.out.println("Informe oo novo preco: ");
							preco = input.nextDouble();
							e1.alterarPreco(marcaProduto, opcao, preco, quantidade);
							break;
						}
						case 2: {
							System.out.println("Informe oo nova quantidade: ");
							quantidade = input.nextInt();
							e1.alterarPreco(marcaProduto, opcao, preco, quantidade);
							break;
						}
						default: {
							System.out.println("Valor Invalido.");
						}
						}
						break;
					} // FIM de Alterar dados do produto

					// INICIO da tela de visualização
					case 4: {
						System.out.println("VISUALIZAR ESTOQUE: \n");
						e1.visualizarLista();

						System.out.println("Digite para sair.");
						@SuppressWarnings("unused")
						String pass = input.next();
						break;
					} // FIM da tela de visualização

					// INICIO DE SAIR
					case 5: {
						break;
					}
					default: {
						System.out.println("Valor invalido.");
					}
					}
					if (opcao == 5) {
						opcao = 0;
						break;
					}

				}
				// FIM Menu do Estoque

				// FIM Menu do Estoque
			case 2:

				// SAIR DO MENU PRINICIPAL
			case 5:
				break;
			default:
				System.out.println("Valor invalido.");
				break;
			}
			if (opcao == 5) {
				opcao = 0;
				break;
			}
		}
		// FIM MENU PRINCIPAL
		input.close();
	}
}