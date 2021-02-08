package Ecommerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainCarrinhoV2 {
	public static void main(String[] args) {
		//Variáveis
		Scanner ler = new Scanner(System.in);
		List <Carrinho> lista = new ArrayList<>();
		
		int IDProduto=0, quantidade = 0, opcao=0, cont=0;
		String produtoA[] = {"Misto-Quente","Americano ","X-Burguer","X-Salada","X-Bacon   ","X-Egg   ","X-BaconEgg","X-Frango","X-FrangoEgg","X-TUDO   "};
		double precoA[] = {4.0,5.0,6.5,7.0,8.0,6.5,9.0,7.0,8.0,12.5};
		double total=0, preco;
		int estoqueA[] = {10,10,10,10,10,10,10,10,10,10};
		
		try {
		//Mostra produtos
		Produtos();
		//Primeira rodada de add itens no carrinho
		do {
			do {
				System.out.println("\nPor favor, insira o ID correspondente ao produto que você deseja adicionar ao carrinho:");
				IDProduto=ler.nextInt();
			}while (IDProduto<=0 || IDProduto>10);
			preco=precoA[IDProduto];
			do {
				System.out.println("\nInsira quantas unidades do produto ("+produtoA[IDProduto-1]+") você deseja: ");
				quantidade=ler.nextInt();
			}while(quantidade<0);
			if(quantidade > estoqueA[IDProduto-1]){
				System.out.println("\nInfelizmente só temos " + estoqueA[IDProduto-1] + " unidades de " + produtoA[IDProduto-1] + " em estoque."+
				"\nEscolha outro produto ou selecione uma quantidade menor para este produto");
				//u.aguarde(8000)
				}
			else if (quantidade <= 0){
				System.out.println("\nQuantidade invalida!\nEscolha outro produto.");
				//u.aguarde(2000)
			}	
			estoqueA[IDProduto-1] -= quantidade;
			lista.add(new Carrinho(produtoA[IDProduto-1],preco,quantidade));
			do {
			System.out.println("\nVocê deseja continuar comprando?\n1. Sim 2. Ir para o Carrinho");
			opcao= ler.nextInt();
			} while(opcao<1 ||opcao>2);
		} while(opcao==1);
		//Mostrar Carrinho
		do {
			System.out.println("\t\tCarrinho");
			if(lista.isEmpty()) {
				System.out.println("\tSeu carrinho está vazio");
			} else {
			System.out.println("  Produto\tQuantidade\tPreço\tSubtotal");
			cont=0;
			total=0;
			for(Carrinho com:lista) {
				cont++;
				System.out.printf("%d.%s     \t%d \tR$%.2f \tR$%.2f\n",cont,com.produto,com.quantidade,com.preco,com.subtotal());
				total += com.subtotal();
			}
				System.out.printf("\n\t\tTotal :R$%.2f\n",total);
			}
				//Add, remove ou Pagamento?
				do {
				System.out.println("\nDeseja 1.Adicionar mais um item 2.Remover algum item 3. Ir para o Pagamento?");
				opcao=ler.nextInt();
				}while(opcao<1||opcao>3);
					if(opcao==1) { //2a rodada de add 
						do {
							do {
								System.out.println("\nPor favor, insira o ID correspondente ao produto que você deseja adicionar ao carrinho:");
								IDProduto=ler.nextInt();
							}while (IDProduto<=0 || IDProduto>10);
							preco=precoA[IDProduto];
							do {
								System.out.println("\nInsira quantas unidades do produto ("+produtoA[IDProduto-1]+") você deseja: ");
								quantidade=ler.nextInt();
							}while(quantidade<0);
							if(quantidade != 0) {
							lista.add(new Carrinho(produtoA[IDProduto-1],preco,quantidade));
							
							}
							do {
							System.out.println("\nVocê deseja continuar comprando?\n1. Sim 2. Ir para o Carrinho");
							opcao= ler.nextInt();
							} while(opcao<1||opcao>2);
						} while(opcao<1||opcao>2);
					}else if(opcao==2) { //remove
						int item;
						System.out.println("Qual o número do item que deseja remover?");
						item=ler.nextInt();
						lista.remove(item-1);
					} 
				}while(opcao!=3);//sair para pagamento
				System.out.println("\t\tPagamento");
		} catch (java.util.InputMismatchException um){
			System.out.println("Erro! Era para entrar um número...\n Reinicie o programa\"");
		}catch(Exception a) {
			System.out.println("Fatal Error - Reinicie o programa");
		}
		ler.close();
	}
	private static void estoque() {
		// TODO Auto-generated method stub
		
	}
	//Lista-Menu de lanches
	public static void Produtos() {
		String produtoA[] = {"Misto-Quente","Americano ","X-Burguer","X-Salada","X-Bacon   ","X-Egg   ","X-BaconEgg","X-Frango","X-FrangoEgg","X-TUDO   "};
		double precoA[] = {4.0,5.0,6.5,7.0,8.0,6.5,9.0,7.0,8.0,12.5};
			System.out.println("\tProdutos");
			System.out.println("ID \tLanche   \tPreço");
			for(int i=0; i<10;i++) {
				System.out.println((i+1)+"\t"+produtoA[i]+"\tR$"+precoA[i]);	
			}
	}
}
