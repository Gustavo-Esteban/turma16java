package projeto;

import java.util.Scanner;

public class ProjetoBancoG4 
{
	
	
	public static void main(String[] args) 
	{
		//variaveis
		Scanner leia = new Scanner(System.in);
		char opcao;
		
		
		System.out.println("BANCO G4");
		linha(40);
		System.out.println("AQUI SEU DINHEIRO RENDE MAIS!!!");
		
		do 
		{
				
			System.out.println("1 - CONTA POUPANÇA\r\n"
					+ "2 - CONTA CORRENTE\r\n"
					+ "3 - CONTA ESPECIAL \r\n"
					+ "4 - CONTA EMPRESA\r\n"
					+ "5 - CONTA ESTUDANTIL\r\n"
					+ "6 - SAIR\r\n"
					+ "");
			linha(40);
			System.out.print("Digite o numero de sua opção: ");
			opcao = leia.next().charAt(0);
			
			if (opcao == '6')
			{
				break;
			}
			else if (opcao == '1') 
			{
				contaPoupanca();
			}
			else if (opcao == '2')
			{
				contaCorrente();
			}
			else if (opcao == '3')
			{
				contaEspecial();
			}
			

			
			
		} while (true);
		//saida
		System.out.println("Obrigado, volte sempre!!!");

	}
	
	public static void contaPoupanca()
	{
		Scanner tec = new Scanner(System.in);
		double saldo = 0.00;
		char opcaoDC;
		char opcaoSN;
		String descricao[] = new String[10];
		double debito=0.00;
		double credito=0.00;
		double valor[] = new double[10];
		
		linha(40);
		System.out.println("CONTA POUPANÇA | BANCO G4");
		linha(40);
		//processos
		for (int giro=0; giro<10; giro++)
		{
			System.out.printf("Lançamento %d  [D-débito/C-crédito] :",(giro+1));
			opcaoDC = tec.next().toUpperCase().charAt(0);
			if (opcaoDC =='D')
			{
				System.out.print("\nDigite o valor para débito :");
				debito = tec.nextDouble();
				
				valor[giro]=debito*(-1);
				
				if (saldo > 0)
				{
					while (saldo < debito )
					{
						System.out.printf("Saldo indisponivel, atual R$ %.2f, tente de novo!!!\n",saldo);
						System.out.print("Digite o valor para débito :");
						debito = tec.nextDouble();
						valor[giro]=debito*(-1);
						
					}
					tec.nextLine();
					
					
					System.out.print("Descrição do débito :");
					descricao[giro] = tec.nextLine();
					saldo = saldo - debito;
					System.out.printf("Saldo atual é R$ %.2f \n", saldo);
				} 
				else if (saldo == 0) 
				{
					System.out.println("Você está sem saldo no momento, faça um crédito primeiro!!!");
				}
			}
			else if (opcaoDC == 'C')
			{
				System.out.print("\nDigite o valor do crédito: ");
				credito = tec.nextDouble();
				valor[giro]=credito;
				while (credito <=0 )
				{
					System.out.print("Valor informado negativo ou zero, tente de novo:");
					System.out.print("Digite o valor do crédito: ");
					credito = tec.nextDouble();
					valor[giro]=credito;
				}
				tec.nextLine();
				
				System.out.print("Descrição do crédito :");
				descricao[giro] = tec.nextLine();
				
				saldo = saldo + credito;
				System.out.printf("Saldo atual é R$ %.2f \n", saldo);
			}
			else
			{
				System.out.println("Você não escolheu Debito ou Crédito!!!");
			}
			
			System.out.print("Continua S/N :");
			opcaoSN = tec.next().toUpperCase().charAt(0);
			if (opcaoSN == 'N')
			{
				break;
			}
		}
		//correção monetaria
		System.out.println("Deseja fazer a correção hoje sim ou não? ");
		opcaoSN = tec.next().toUpperCase().charAt(0);
		if (opcaoSN == 'S') 
		{
			saldo += (saldo * 0.0005);
		}	
		linha(40);
		System.out.printf("SALDO FINAL DA CONTA POUPANÇA R$ %.2f \n", saldo);
		System.out.println();			
		System.out.print("\tEXTRATO: \n");

		for(int x=0;x<10;x++)
		{
			if(descricao[x] != null) 
			{
			System.out.println(descricao[x]+"\t\t\t"+valor[x]);
			}
			
		}
		linha(40);
	}
	public static void contaEspecial()
	{
		Scanner read = new Scanner(System.in);
		char opcaoDC = 's';
		char opcaoSN = 's';
		double saldo = 0.00;
		double chequeEspecial= 1000,debitoSaldo = 0,debitoChequeEspecial;
		double creditoChequeEspecial = 0;
		String descriçao[] = new String[10]; 
		double valor [] = new double [10];
		
		linha(40);
		System.out.println("Conta Especial | Banco G4");
		
			for (int giro=1; giro<=10; giro++)
			{
				System.out.printf("\nLançamento %d [D-DEBITO/C-CREDITO]:",giro);
				opcaoDC = read.next().toUpperCase().charAt(0);
				
				if(opcaoDC == 'D')
				{
					if(saldo < 0 || saldo ==0)
					{
						System.out.println("Você não tem saldo disponivel para debitos");
					}
					else if(saldo > 0)
					{
						System.out.printf("Seu saldo é R$ %.002f e seu credito no cheque especial é R$ %.002f .",saldo,chequeEspecial);
						System.out.print("Valor do débito: ");
						debitoSaldo = read.nextDouble();
						System.out.println("\nDescrição da transação: ");
						descriçao[giro] = read.next();
						
						read.nextLine();
						valor[giro] = debitoSaldo;
						
						
						if(saldo -debitoSaldo < 0)
						{
							System.out.println("Saldo insuficiente!");
						}
						saldo-=debitoSaldo;
						System.out.printf("Seu saldo é R$ %.002f e seu credito no cheque especial é R$ %.002f \n",saldo,chequeEspecial);
					}
					else
					{
						saldo-=debitoSaldo;
						System.out.printf("Seu saldo é R$ %.002f e seu credito no cheque especial é R$ %.002f",saldo,chequeEspecial);
					}
					
				}
				else if(opcaoDC == 'C')
				{
					System.out.printf("Você tem disponivel R$ %.002f de crédito so cheque especial\nQuanto você deseja usar? ",chequeEspecial);
					debitoChequeEspecial = read.nextDouble();
					
					if(chequeEspecial-debitoChequeEspecial < 0)
					{
						System.out.println("Esse valor ultrapassa o seu limite do cheque especial");
					}
					else 
					{
						chequeEspecial-=debitoChequeEspecial;
						saldo+=debitoChequeEspecial;
						System.out.printf("Seu saldo é R$ %.002f  e seu credito no cheque especial é R$ %.002f ",saldo,chequeEspecial);
						descriçao[giro] = "Credito pelo cheque especial";
						valor [giro] = debitoChequeEspecial;
					}
						
					
				}
				else
				{
					System.out.println("Você não escolheu uma opção válida!");
				}
				
				System.out.print("\nContinua S/N :");
				opcaoSN = read.next().toUpperCase().charAt(0);
				if (opcaoSN == 'N')
				{
					linha(40);
					System.out.println("\tEXTRATO");
					for (int x = 0; x<10;x++)
					{
						if(descriçao[x] != null)
						{
							System.out.println(descriçao[x] +" no valor: R$ " + valor[x]);	
							System.out.println();
						}
					}
					linha(40);
					break;
				}
			}
			
			System.out.println("OBRIGADO PELA VISITA, VOLTEI SEMPRE;) ");
			System.out.println();
			linha(40);
	}
	public static void contaCorrente() 
	{
		Scanner in = new Scanner(System.in);
		int lista = 0 ;
		int talao = 0 ;
		char opcao = ' ';
		double saldo = 0.00, credito=0.00, debito=0.00,valorTalao = 0.00;
		double listaCredito[]= new double [10];
		double listaDebito[]= new double [10];
		String listaDescricaoCredito[]= new String [10];
		String listaDescricaoDebito [] = new String [10];
		char opcaoDC;
		char opcaoSSNN = 'S';
		char opcaoSN;
		String descricao;
		
		linha(40);
		System.out.println("CONTA CORRENTE | BANCO G4");
		linha(40);
		//processos
		System.out.println("Deseja emitir um talão de cheque? [S/N] ");
		opcao= in.next().toUpperCase().charAt(0);
		talao = talao + 1;
		do {
			if(opcao == 'S' ) {
				System.out.print("Digite o valor do talão de cheque :");
				valorTalao = in.nextDouble();
				if(valorTalao > 0 ) {
				talao = talao + 1;
				saldo = saldo + valorTalao ;
				}
				else {
						System.out.println("O Talao de cheque está em branco ou invalidado");
							
					}
				
				System.out.println("Deseja emitir outro talão de cheque? [S/N] ");
				opcao= in.next().toUpperCase().charAt(0);
				if(opcao != 'S') {
					opcao = 'N';
				}
				else if (talao > 3) {
					System.out.println("limite de talões de cheque atingido, ação invalida");
					opcao = 'N';
				}
			}	
		}while(opcao == 'S');
		
		for ( int giro=0; giro<10; giro++)
		{
			
			System.out.printf("Lançamento %d [D-débito/C-crédito] :",giro+1);
			opcaoDC = in.next().toUpperCase().charAt(0);
			if (opcaoDC =='D')
			{
				System.out.print("\nDigite o valor para débito :");
				debito = in.nextDouble();
				listaDebito[giro] = debito;
				if (saldo > 0)
				{
					while (saldo < debito )
					{
						System.out.printf("Saldo indisponivel, atual R$ %.2f, tente de novo!!!\n",saldo);
						System.out.print("Digite o valor para débito :");
						debito = in.nextDouble();
						
					}
					in.nextLine();
					System.out.print("Descrição do débito :");
					descricao = in.nextLine();
					listaDescricaoDebito[giro] = descricao;
					saldo = saldo - debito;
					System.out.printf("Saldo atual é R$ %.2f \n", saldo);
				} 
				else if (saldo == 0) 
				{
					System.out.println("Você está sem saldo no momento, faça um crédito primeiro!!!");
				}
			}
			else if (opcaoDC == 'C')
			{
				System.out.print("\nDigite o valor do crédito: ");
				credito = in.nextDouble();
				listaCredito[giro] = credito;

				while (credito <=0 )
				{
					System.out.print("Valor informado negativo ou zero, tente de novo:");
					System.out.print("Digite o valor do crédito: ");
					credito = in.nextDouble();
				}
				in.nextLine();
				System.out.print("Digite a descrição do crédito: ");
				descricao = in.nextLine();
				listaDescricaoCredito[giro] = descricao;
				saldo = saldo + credito;
				System.out.printf("Saldo atual é R$ %.2f \n", saldo);
			
			}
			else
			{
				System.out.println("Você não escolheu Debito ou Crédito!!!");
			}
			
			
			System.out.print("Continua S/N :");
			opcaoSN = in.next().toUpperCase().charAt(0);
			if (opcaoSN == 'N'){ 
				while(opcaoSSNN == 'S') {
			
				System.out.println("Deseja ver seu extrato [S/N]?");
				opcaoSSNN = in.next().toUpperCase().charAt(0);
				if(opcaoSSNN == 'S') { 
					giro=10;
					for (int gir=0; gir<10; gir++)
					{
						if (listaCredito[gir] != 0.0) {
							System.out.println(listaCredito[gir]+" "+ listaDescricaoCredito[gir]+" (Crédito)\n");
						}

						if (listaDebito[gir] != 0.0) {
							System.out.println((listaDebito[gir]*-1)+" "+listaDescricaoDebito[gir]+" (Débito)\n");
							linha(40);
						}

					}
				
				}else {
						break;
						}
		
				}
			}
		}
		
	}
	public static void linha(int tamanho) 
	{
		for (int x=1;x<tamanho; x++)
		{
			System.out.print("═");
		}
		System.out.println();
	}
}