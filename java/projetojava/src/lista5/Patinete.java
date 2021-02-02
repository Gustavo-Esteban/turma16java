package lista5;

import java.util.Scanner;

public class Patinete {

	
	public char opcao;
	public void patinete()
	{
		Scanner ler = new Scanner (System.in);
		System.out.print("Escolha um destes Produtos Eletronicos!!!\n"
				+ "1-Patinete com 2 rodas\n"
				+ "2-Patinete com 3 rodas\n"
				+ "3-Patinete com 4 rodas\n"
				+ "Insira aqui: ");
		opcao = ler.next().charAt(0);

		if (opcao <='0' && opcao >4)
		{
			System.out.print("Digite uma opção valida!!!");
		}
		else if (opcao == '1')
		{
			System.out.print("Parabens você escolheu o Patinete com 2 rodas!!");
		}
		else if (opcao == '2')
		{
			System.out.print("Parabens você escolheu o Patinete com 3 rodas!!");
		}
		else if (opcao == '3')
		{
			System.out.print("Parabens você escolheu o Patinete com 4 rodas!!");
		}
	}
}
