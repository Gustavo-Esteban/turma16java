package Ecommerce;
import java.text.SimpleDateFormat; // biblioteca de formatação
import java.util.ArrayList;
import java.util.Date; // biblioteca Data
import java.util.List;
import java.util.Random; // biblioteca randomica
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		// Variáveis
		Scanner ler = new Scanner(System.in);
		List<Carrinho> lista = new ArrayList<>();
		int IDProduto = 0, quantidade = 0, opcao = 0, cont = 0;
		String produtoA[] = { "Misto-Quente", "Americano ", "X-Burguer", "X-Salada  ", "X-Bacon   ", "X-Egg     ",
				"X-BaconEgg", "X-Frango   ", "X-FrangoEgg", "X-TUDO   " };
		double precoA[] = { 4.0, 5.0, 6.5, 7.0, 8.0, 6.5, 9.0, 7.0, 8.0, 12.5 };
		int estoqueA[] = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
		double total = 0, preco;
		int opcaoPag;
		// Logo e Slogan
		System.out.print("\n\t___  |________________\t\t" + "\n\t __  |    Burguer    /\t\t"
				+ "\n\t  _  |    Store     /\t\t" + "\n\t___  |_____________/\t\t" + "\n\t __  /____________\t\t"
				+ "\n\t____ O          O\t\t\n\n\tComer bem é a nossa arte!!\n\n");
		// Cadastro
		System.out.println("\t\t Cadastro\n");
		System.out.println("Digite seu nome: ");
		String nome = ler.next();
		System.out.println("Digite M-masculino, F-feminino ou O- Outro ");
		char sexo = ler.next().toUpperCase().charAt(0);
		System.out.println("Digite o ano de nascimento [aaaa]: ");
		int anoNascimento = ler.nextInt();
		Pessoa pessoa1 = new Pessoa(nome, sexo, anoNascimento);
		System.out.printf("Olá!%s, %s", pessoa1.tratamento(sexo), pessoa1.getNome());
		System.out.println("\nConfira nossos produtos");
		try {
			// Cardapio
			Produtos();
			// Primeira rodada de add itens no carrinho
			do {
				do {
					System.out.println(
							"\nPor favor, insira o ID correspondente ao produto que você deseja adicionar ao carrinho:");
					IDProduto = ler.nextInt();
				} while (IDProduto <= 0 || IDProduto > 10);
				preco = precoA[IDProduto - 1];
				do {
					System.out.println(
							"\nInsira quantas unidades do produto (" + produtoA[IDProduto - 1] + ") você deseja: ");
					quantidade = ler.nextInt();
				} while (quantidade < 0);
				if (quantidade > estoqueA[IDProduto - 1]) {
					if (estoqueA[IDProduto - 1] >= 0) {
						System.out.println("\nInfelizmente só temos " + estoqueA[IDProduto - 1] + " unidades de "
								+ produtoA[IDProduto - 1] + " em estoque."
								+ "\nEscolha outro produto ou selecione uma quantidade menor para este produto");
					} else {
						System.out.println("\nInfelizmente só temos " + 0 + " unidades de " + produtoA[IDProduto - 1]
								+ " em estoque."
								+ "\nEscolha outro produto ou selecione uma quantidade menor para este produto");
					}
				} else if (quantidade < 0) {
					System.out.println("\nQuantidade invalida!\nEscolha outro produto.");
				}
				estoqueA[IDProduto - 1] -= quantidade;
				if (estoqueA[IDProduto - 1] > -1 && quantidade != 0) {
					lista.add(new Carrinho(produtoA[IDProduto - 1], preco, quantidade));
				}
				do {
					System.out.println("\nVocê deseja continuar comprando?\n1. Sim 2. Ir para o Carrinho");
					opcao = ler.nextInt();
				} while (opcao < 1 || opcao > 2);
			} while (opcao == 1);
			// Mostrar Carrinho
			do {
				System.out.println("\t\tCarrinho");
				if (lista.isEmpty()) {
					System.out.println("\tSeu carrinho está vazio");
				} else {
					System.out.println("  Produto\tQuantidade\tPreço\tSubtotal");
					cont = 0;
					total = 0;
					for (Carrinho com : lista) {
						cont++;
						System.out.printf("%d.%s     \t%d \tR$%.2f \tR$%.2f\n", cont, com.produto, com.quantidade,
								com.preco, com.subtotal());
						total += com.subtotal();
					}
					System.out.printf("\n\t\tTotal :R$%.2f\n", total);
				}
				// Add, remove ou Pagamento?
				do {
					System.out
							.println("\nDeseja 1.Adicionar mais um item 2.Remover algum item 3. Ir para o Pagamento?");
					opcao = ler.nextInt();
				} while (opcao < 1 || opcao > 3);
				if (opcao == 1) { // 2a rodada de add
					do {
						do {
							Produtos();
							System.out.println(
									"\nPor favor, insira o ID correspondente ao produto que você deseja adicionar ao carrinho:");
							IDProduto = ler.nextInt();
						} while (IDProduto <= 0 || IDProduto > 10);
						preco = precoA[IDProduto - 1];
						do {
							System.out.println("\nInsira quantas unidades do produto (" + produtoA[IDProduto - 1]
									+ ") você deseja: ");
							quantidade = ler.nextInt();
						} while (quantidade < 0);
						if (quantidade > estoqueA[IDProduto - 1]) {
							if (estoqueA[IDProduto - 1] >= 0) {
								System.out.println("\nInfelizmente só temos " + estoqueA[IDProduto - 1]
										+ " unidades de " + produtoA[IDProduto - 1] + " em estoque."
										+ "\nEscolha outro produto ou selecione uma quantidade menor para este produto");
							} else {
								System.out.println("\nInfelizmente só temos " + 0 + " unidades de "
										+ produtoA[IDProduto - 1] + " em estoque."
										+ "\nEscolha outro produto ou selecione uma quantidade menor para este produto");
							}
						} else if (quantidade < 0) {
							System.out.println("\nQuantidade invalida!\nEscolha outro produto.");
						} else if (estoqueA[IDProduto - 1] == 0) {
							System.out
									.println("\nSinto muito!\nEste produto esta sem estoque, selecione outro produto");
						}
						estoqueA[IDProduto - 1] -= quantidade;
						if (estoqueA[IDProduto - 1] > -1 && quantidade != 0) {
							lista.add(new Carrinho(produtoA[IDProduto - 1], preco, quantidade));
						}
						do {
							System.out.println("\nVocê deseja continuar comprando?\n1. Sim 2. Ir para o Carrinho");
							opcao = ler.nextInt();
						} while (opcao < 1 || opcao > 2);
					} while (opcao < 1 || opcao > 2);
				} else if (opcao == 2) { // remove
					int item;
					System.out.println("Qual o número do item que deseja remover?");
					item = ler.nextInt();
					lista.remove(item - 1);
				}
			} while (opcao != 3);// sair para pagamento
			if (lista.isEmpty() == false) {
				System.out.println("\t\tPagamento");
				Pagamento opcao1 = new Pagamento(total);
				System.out.print("\nTOTAL GERAL COM IMPOSTO DE 9% :");
				System.out.printf("R$%.2f", opcao1.imposto());
				System.out.println("\nESCOLHA A FORMA DE PAGAMENTO:");
				System.out.println("\n1. A VISTA - 10% DE DESCONTO: ");
				System.out.printf("R$%.2f", opcao1.avista());
				System.out.println("\n2. CARTÃO DE CRÉDITO - UMA VEZ - 0 DESCONTO-PARCELA DE:");
				System.out.printf("R$%.2f", opcao1.umaVez());
				System.out.println("\n3. CARTÃO DE CRÉDITO - DUAS VEZES - 10% DE ACRÉSCIMO-PARCELAS DE:");
				System.out.printf("R$%.2f", opcao1.parcelaDuasVezes());
				System.out.println("\n4. CARTÃO DE CRÉDITO - TRÊS VEZES - 15% DE ACRÉSCIMO-PARCELAS DE:");
				System.out.printf("R$%.2f", opcao1.parcelaTresVezes());
				System.out.printf("\n5. DESISTIR DA COMPRA!!!");
				System.out.println("\nINSIRA A OPÇAO DESEJA");
				opcaoPag = ler.nextInt();
				// Nota Fiscal
				do {
					if (opcaoPag == 1) {
						Cupom();
						System.out.println("Cliente: " + pessoa1.getNome());
						System.out.print("\nO VALOR DO PAGAMENTO É:");
						opcao1.avista();
						System.out.printf("R$%.2f", opcao1.avista());
						info();
					} else if (opcaoPag == 2) {
						Cupom();
						System.out.println("Cliente: " + pessoa1.getNome());
						System.out.print("\nO VALOR DO PAGAMENTO É: ");
						opcao1.umaVez();
						System.out.printf("R$%.2f", opcao1.umaVez());
						info();
					} else if (opcaoPag == 3) {
						Cupom();
						System.out.println("Cliente: " + pessoa1.getNome());
						System.out.print("\nO VALOR DO PAGAMENTO É: ");
						opcao1.parcelaDuasVezes();
						System.out.printf("2 PARCELAS DE: R$%.2f", opcao1.parcelaDuasVezes());
						System.out.println("\n");
						System.out.printf("TOTAL= R$%.2f", opcao1.duasVezes());
						info();
					} else if (opcaoPag == 4) {
						Cupom();
						System.out.println("Cliente: " + pessoa1.getNome());
						System.out.print("\nO VALOR DO PAGAMENTO É: ");
						opcao1.parcelaTresVezes();
						System.out.printf("3 PARCELAS DE: R$%.2f", opcao1.parcelaTresVezes());
						System.out.println("\n");
						System.out.printf("TOTAL= R$%.2f", opcao1.tresVezes());
						info();
					} else if (opcaoPag == 5) {
						System.out.println("\t\tOPERAÇÃO FINALIZADA");
						break;
					}
				} while (opcaoPag <= 0 || opcaoPag > 5);
			}
			ler.close();
		} catch (java.util.InputMismatchException um) {
			System.out.println("Erro! Era para entrar um número...\n Reinicie o programa\"");
		} catch (Exception a) {
			System.out.println("Fatal Error - Reinicie o programa");
		} finally {
			System.out.println("\n\n\tOBRIGADE VOLTE SEMPRE!!!");
		}
	}
	public static void Cupom() {
		System.out.println("\n\n");
		System.out.println("\tBURGUER STORE LTDA\n");
		System.out.println("\tCOMER BEM É A NOSSA ARTE!!!\n");
		System.out.println("\nEndereço: Av. dos Suculentos,n°1000-Bacon-SP\n");
		System.out.println("================================================");
		System.out.println("\t\tCUPOM FISCAL\n================================================");
	}
	public static void info() {
		Random gerador = new Random();
		int codigo = gerador.nextInt(1000) + 1;
		System.out.println("\n================================================\n");
		System.out.printf("\nCÓDIGO DA COMPRA:%d\n", codigo);

		Date data = new Date();
		SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy\nHH:mm:ss");
		String dataFormatada = formatar.format(data);
		System.out.println(dataFormatada);
		data = new Date();
	}
	// Cardapio
	public static void Produtos() {
		String produtoA[] = { "Misto-Quente", "Americano ", "X-Burguer", "X-Salada", "X-Bacon   ", "X-Egg   ",
				"X-BaconEgg", "X-Frango", "X-FrangoEgg", "X-TUDO   " };
		double precoA[] = { 4.0, 5.0, 6.5, 7.0, 8.0, 6.5, 9.0, 7.0, 8.0, 12.5 };
		System.out.println("\tProdutos");
		System.out.println("ID \tLanche   \tPreço");
		for (int i = 0; i < 10; i++) {
			System.out.println((i + 1) + "\t" + produtoA[i] + "\tR$" + precoA[i]);
		}
	}
}