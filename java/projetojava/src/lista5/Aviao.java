package lista5;

import java.util.Scanner;

public class Aviao {
	Scanner ler = new Scanner(System.in);
	
	public char opcao;
	public void avioes()

	{
		
		System.out.print("Escolha um desses avioes!!!\n"
				+ "1-Avião de Caça\n"
				+ "2-Avião Blindado\n"
				+ "3-Avião Super Sônico\n"
				+ "4-Avião mormal\n"
				+ "Insira aqui: ");
		opcao = ler.next().charAt(0);
		
		
		/*switch(opcao)
		{
		case 1:
			System.out.print("Parabens você escolheu o Avião de Caça!!");
			break;
		case 2:
			System.out.print("Parabens você escolheu o Avião Blindado");
			break;
		case 3:
			System.out.print("Parabens você escolheu o Avião Super Sônico");
			break;
		case 4:
			System.out.print("Parabens você escolheu o Avião mormal");
			break;
		default:
			System.out.print("Digite uma opção valida!!!");
			break;
		}*/
		if (opcao <='0' && opcao >=5)
		{
			System.out.print("Digite uma opção valida!!!");
		}
		else if (opcao == '1')
		{
			System.out.print("Parabens você escolheu o Avião de Caça!!");
		}
		else if (opcao == '2')
		{
			System.out.print("Parabens você escolheu o Avião Blindado!!");
		}
		else if (opcao == '3')
		{
			System.out.print("Parabens você escolheu o Avião Super Sônico!!");
		}
		else if (opcao == '4')
		{
			System.out.print("Parabens você escolheu o Avião mormal!!");
		}
		
		
	}

}
