package lista5;

import java.util.Scanner;

public class ProdutoEletronico {

	
	public char opcao;
	public void produtos()
	{
		Scanner ler = new Scanner (System.in);
		System.out.print("Escolha um destes Produtos Eletronicos!!!\n"
				+ "1-Computador\n"
				+ "2-Celular\n"
				+ "3-Tablet\n"
				+ "4-Notebook\n"
				+ "Insira aqui: ");
		opcao = ler.next().charAt(0);

		if (opcao <='0' && opcao >=5)
		{
			System.out.print("Digite uma opção valida!!!");
		}
		else if (opcao == '1')
		{
			System.out.print("Parabens você escolheu o Computador!!");
		}
		else if (opcao == '2')
		{
			System.out.print("Parabens você escolheu o Celular!!");
		}
		else if (opcao == '3')
		{
			System.out.print("Parabens você escolheu o Tablet!!");
		}
		else if (opcao == '4')
		{
			System.out.print("Parabens você escolheu o Notebook!!");
		}
	}
}
