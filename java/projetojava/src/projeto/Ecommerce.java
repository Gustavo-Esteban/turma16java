package projeto;

import java.util.Scanner;

public class Ecommerce {

	public static void main(String[] args) throws InterruptedException
	{
		
		Scanner ler = new Scanner (System.in);
		
		String tratamento = "";
		String nome = "";
		
		final int nItens = 10;
		int IDProduto = 0, qtd = 0;
		String produtoA[] = {"Misto-Quente","Americano","X-Burguer","X-Salada","X-Bacon","X-Egg","X-BaconEgg","X-Frango","X-FrangoEgg","X-TUDO"};
		double precoA[] = {4.0,5.0,6.5,7.0,8.0,6.5,9.0,7.0,8.0,12.5};
		double totalGeral = 0.0;
		int carrinhoA[] = new int [nItens], estoqueA[] = new int [nItens];
		int opcao = 0;
		
		if(opcao == 0)
		{					
			for(int i=0;i<nItens;i++)
			{	
				estoqueA[i] = 10;		
			}							
		}								
		
		opcao = menu(tratamento, nome);
		
		switch (opcao)
		{
			case 1:
			cadastro();
			break;
			case 2:
			produtos();
			break;
			case 3:
			carrinho();
			break;
			default:
			
			System.out.print("Opção invalida!\n\nTente novamente. ");
			
			return;
		
		}
		/*
		do {      
			System.out.printf(
					"Olá, por favor, escolha uma das opções a seguir"+
					"\ndigitando o numero correspondente a opção deifjada: "+
						   "\n"+
				             "\n1. Cadastro/login"+
					        "\n2. Produtos"+
					        "\n3. Carrinho"+
					        "\n4. Fale conosco"+
				             "\nInsira aqui: ");
				     opcao = ler.nextInt();

	         

	         switch(opcao) {
	               case '0': 
	                   main();
	                   break; 
	               case '1': 
	                   cadastro();
	                   break;
	               case '2': 
	                    produtos();
	                   break;
	               case '3':
	            	   carrinho
	               default:
	                   
	                   break;
	         }
	    } while (opcao != '0');
*/
		/*
		int numero = 0;
		switch (numero){
        case 1:
            System.out.println("Dez");
            break;
        case 2:
            System.out.println("Numero muito grande");
            break;*/

    }

	
	private static void main() {
		// TODO Auto-generated method stub
		
	}
	public static int menu(String tratamento1, String nome1)
	{
		int opcao = 0;
		Scanner ler = new Scanner (System.in);
		
		System.out.printf(
		"Olá, por favor, escolha uma das opções a seguir"+
		"\ndigitando o numero correspondente a opção deifjada: "+
			   "\n"+
	             "\n1. Cadastro/login"+
		        "\n2. Produtos"+
		        "\n3. Carrinho"+
	             "\nInsira aqui: ");
	     opcao = ler.nextInt();
	   	       
		return opcao;
	}
	public static void cadastro() throws InterruptedException
	{
		Scanner ler = new Scanner (System.in);
		char sexo;
		String nome = "";
		String tratamento = "";
		final int nItens = 10;
		int carrinhoA[] = new int [nItens], estoqueA[] = new int [nItens];
		double totalGeral = 0.0;
		for(int i=0;i<nItens;i++)
			{
				estoqueA[i] += carrinhoA[i] ;
				carrinhoA[i] = 0;
				totalGeral = 0.0;
			}
			
		
		System.out.print("#CADASTRO");
		System.out.print("\n\nInsira o seu nome: ");
		nome = ler.next();
		System.out.print("Insira o seu sexo (F/M): ");
		sexo = ler.next().charAt(0);
		
		if(sexo=='M' || sexo=='m')
		{
			tratamento = "Sr. ";
		}
		else if(sexo=='F' || sexo=='f')
		{
			tratamento = "Sra. ";
		}
		else
		{
			tratamento = "Srx. ";
		}
		
		Thread.sleep(1000);
		step();
		
		System.out.print("cadastro concluido!");
		Thread.sleep(2000);
		
		main();
	}
	public static void produtos() throws InterruptedException
{
		Scanner ler= new Scanner(System.in);
		final int nItens = 10;
		int IDProduto = 0, qtd = 0;
		String produtoA[] = {"Misto-Quente","Americano","X-Burguer","X-Salada","X-Bacon","X-Egg","X-BaconEgg","X-Frango","X-FrangoEgg","X-TUDO"};
		double precoA[] = {4.0,5.0,6.5,7.0,8.0,6.5,9.0,7.0,8.0,12.5};
		double totalGeral = 0.0;
		int carrinhoA[] = new int [nItens], estoqueA[] = {10,10,10,10,10,10,10,10,10,10};
		int opcao = 0;
				System.out.println("#PRODUTOS");
				System.out.println("\n\n|\tID\t|\tPreço\t|    Carrinho   |     Estoque   |\tProduto\t\n");
				System.out.println("----------------------------------------------------------------------------------------\n");
				for(int i=0;i<nItens;i++)
				{
					System.out.println("|\t"+(i+1)+"\t|\t"+precoA[i]+"\t|\t"+carrinhoA[i]+"\t|\t"+estoqueA[i]+"\t|\t"+produtoA[i]+"\n");
					if (carrinhoA[i] != 0){
					totalGeral += carrinhoA[i]*precoA[i];
					}
				}
				System.out.println("--------------------------");
				System.out.printf("\nTotal Geral: %.2f",totalGeral,"\n");
				System.out.println("--------------------------");
				System.out.println("\nPor favor, insira o ID correspondente ao produto que você deseja adicionar ao carrinho:\n"+
				"[Caso deseje voltar, insira 0 (Zero)]."+" Insira aqui: ");
				IDProduto=ler.nextInt();
				if(IDProduto == 0)
				{
					//u.aguarde(1000)
					System.out.println("Retornando para o menu.");
					//u.aguarde(1500)
					main();
				}
				else if (IDProduto>nItens || IDProduto<0)
				{
					System.out.println("\ncaracter invalido!\nTente novamente.");
					//u.aguarde(2000)
					produtos();
				}
				else if (estoqueA[IDProduto-1] == 0){
					System.out.println("\nSinto muito!\nEste produto esta sem estoque, selecione outro produto");
					//u.aguarde(5000)
					produtos();
				}
				System.out.println("\nInsira quantas unidades do produto ("+produtoA[IDProduto-1]+") você deseja: ");
				qtd = ler.nextInt();
				if(qtd > estoqueA[IDProduto-1]){
					System.out.println("\nInfelizmente só temos " + estoqueA[IDProduto-1] + " unidades de " + produtoA[IDProduto-1] + " em estoque."+
					"\nEscolha outro produto ou selecione uma quantidade menor para este produto");
					//u.aguarde(8000)
					produtos();
					}
				else if (qtd <= 0){
					System.out.println("\nQuantidade invalida!\nEscolha outro produto.");
					//u.aguarde(2000)
					produtos();
				}	
				estoqueA[IDProduto-1] -= qtd;
				carrinhoA[IDProduto-1] += qtd;
				do{
					System.out.println("Foram adicionadas "+carrinhoA[IDProduto-1]+" unidades de "+produtoA[IDProduto-1]+" ao seu carrinho!"+
					"\nVocê deseja continuar comprando?\n1. Sim\n2. Não\n\nInsira aqui: ");
					opcao= ler.nextInt();
					if(opcao!=1 && opcao!=2){
						System.out.println("Opção invalida!");
						//u.aguarde(1000)
					}
					}while (opcao!=1 && opcao!=2);
					if (opcao==1){
						produtos();
					}
				else{
						carrinho();
					}
	}
	public static void carrinho() throws InterruptedException
	{
		Scanner ler= new Scanner(System.in);
		char efetuarCompra;
		String formaPagamento = "";
		double totalPagar = 0.0;
		double totalGeral = 0.0;
		int verificaCarrinho = 0;
		final int nItens = 10;
		int carrinhoA[] = new int [nItens];
		String produtoA[] = {"Misto-Quente","Americano","X-Burguer","X-Salada","X-Bacon","X-Egg","X-BaconEgg","X-Frango","X-FrangoEgg","X-TUDO"};
		double precoA[] = {4.0,5.0,6.5,7.0,8.0,6.5,9.0,7.0,8.0,12.5};
		int opcao = 0;
		int estoqueA[] = new int [nItens];
		
		System.out.printf("#CARRINHO");
		for(int i=0;i<nItens;i++)
		{
			if (carrinhoA[i] == 0){
				verificaCarrinho++;
			}
			if(verificaCarrinho == nItens){
				System.out.printf("\n\nO Carrinho esta vazio");
				totalGeral = 0.0;
				//u.aguarde(2000)
				main();
			}
		}
		
		System.out.print("\n\n|\tID\t|\tPreço\t|    Carrinho   |\tProduto\t\n");
		System.out.print("---------------------------------------------------------------------\n");
					
		for(int i=0;i<nItens;i++)
		{
			if (carrinhoA[i] != 0){
			System.out.printf("|\t",(i+1),"\t|\t",precoA[i],"\t|\t",carrinhoA[i],"\t|\t",produtoA[i],"\n");
			totalGeral += carrinhoA[i]*precoA[i];
			}
		}
		System.out.print("-----------------------------------------");
		System.out.printf ("\nTotal Geral: %.2f - IMPOSTO (9%): %.2f\n",totalGeral,totalGeral*0.09);
		System.out.printf("-----------------------------------------\n");
		System.out.print("\nEscolha a forma de pagamento\n");
		System.out.print("\n0. DESISTIR DA COMPRA");
		System.out.printf("\n1. A VISTA - 10% DESCONTO: ",(totalGeral*0.9));
		System.out.printf("\n2. CARTÃO - 1 VEZ: %.2f - SEM DESCONTO",totalGeral);
		System.out.printf("\n3. CARTÃO - 2 VEZES - JUROS (10%) - PARCELAS DE: %.2f - TOTAL DE: %.2f",(totalGeral*1.1/2),(totalGeral*1.1));
		System.out.printf("\n4. CARTÃO - 3 VEZES - JUROS (15%) - PARCELAS DE: %.2f - TOTAL DE: %.2f",(totalGeral*1.15/3),(totalGeral*1.15));
		System.out.println("\nInsira Aqui: ");
		System.out.println();
		
		opcao = ler.nextInt();
		
		if(opcao == 0){
			for(int i=0;i<nItens;i++)
			{
				estoqueA[i] += carrinhoA[i];
				carrinhoA[i] = 0;
				totalGeral = 0.0;
			}
			main();
		
		}
		else if(opcao == 1){
			formaPagamento = "A VISTA";
			totalPagar = (totalGeral*0.9);
		}
		else if(opcao == 2){
			formaPagamento = "1 VEZ NO CARTÃO";
			totalPagar = (totalGeral);
		}
		else if(opcao == 3){
			formaPagamento = "2 VEZES NO CARTÃO";
			totalPagar = (totalGeral*1.1);
		}
		else if(opcao == 4){
			formaPagamento = "3 VEZES NO CARTÃO";
			totalPagar = (totalGeral*1.15);
		}
		else
		{
			System.out.print("\ncaracter invalido!\nTente novamente");
			carrinho();
		}
		
		System.out.printf("\nVocê deseja efeturar a compra na opção %s no valor de %.2f? (S/N): ",formaPagamento,totalPagar);
		efetuarCompra = ler.next().charAt(0);
		
		if(efetuarCompra== 'S' || efetuarCompra== 's')
		{
			
			step();//limpa()
			System.out.print("Compra efetuada com Sucesso!");
			Thread.sleep(1500);//u.aguarde(1500)
			step();//limpa()
			System.out.print("Burguer Store\n");
			System.out.print("-------------------------\n");
			System.out.printf("VALOR DO IMPOSTO (9%) %.2f", (totalGeral*0.09),"\n");
		
			System.out.print("CARRINHO\tPREÇO\tPRODUTO\n");
			
			for(int i=0;i<nItens;i++)
			{
				if(carrinhoA[i] !=0)
				{
					System.out.print(carrinhoA[i]+"\t\t"+(precoA[i]*carrinhoA[i])+"\t"+produtoA[i]+"\n");
				}
			}
			
			System.out.printf("\nTOTAL GERAL:",totalGeral);
			System.out.printf("\nOPÇÃO DE PAGAMENTO:",formaPagamento);
			System.out.printf("\nTOTAL A SER PAGO:",totalPagar,"\n");
			System.out.print("\nVOLTE SEMPRE:");
			Thread.sleep(10000);//u.aguarde (10000)
			String nome= "";
			String tratamento ="";
			
			for(int i=0; i<nItens;i++)
			{
				carrinhoA[i]=0;
			}
			main();
		}
		else if(efetuarCompra == 'N' || efetuarCompra == 'n')
		{
			carrinho();
		}
		else
		{
			System.out.print("\nCaracter Inválido\nTente novamente");
			Thread.sleep(2000);//u.aguarde(2000);
			carrinho();
		}
	}
	public static void step ()
	{
		System.out.print("\n\n\n\n\n\n");
	}
}



