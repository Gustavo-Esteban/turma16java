package lista5;

import java.util.Scanner;

public class ContaBancaria {

	public char opcao;
	public void conta()
	{
		Scanner ler = new Scanner (System.in);
		System.out.print("Escolha um destes Produtos Eletronicos!!!\n"
				+ "1-Conta corrente\n"
				+ "2-Conta poupança\n"
				+ "3-Conta executiva\n"
				+ "4-Conta empresa\n"
				+ "Insira aqui: ");
		opcao = ler.next().charAt(0);

		if (opcao <='0' && opcao >4)
		{
			System.out.print("Digite uma opção valida!!!");
		}
		else if (opcao == '1')
		{
			System.out.print("Você esta em Conta corrente!!");
		}
		else if (opcao == '2')
		{
			System.out.print("Você esta em Conta poupança!!");
		}
		else if (opcao == '3')
		{
			System.out.print("Você esta em Conta executiva!!");
		}
		else if (opcao == '4')
		{
			System.out.print("Você esta em Conta empresa!!");
		}
	}

}
