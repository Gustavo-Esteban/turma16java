package lista5;

import java.util.Scanner;

public class Aviao {
	Scanner ler = new Scanner(System.in);
	
	public char opcao;
	public void avioes()

	{
		
		System.out.print("Escolha um desses avioes!!!\n"
				+ "1-Avi�o de Ca�a\n"
				+ "2-Avi�o Blindado\n"
				+ "3-Avi�o Super S�nico\n"
				+ "4-Avi�o mormal\n"
				+ "Insira aqui: ");
		opcao = ler.next().charAt(0);
		
		
		/*switch(opcao)
		{
		case 1:
			System.out.print("Parabens voc� escolheu o Avi�o de Ca�a!!");
			break;
		case 2:
			System.out.print("Parabens voc� escolheu o Avi�o Blindado");
			break;
		case 3:
			System.out.print("Parabens voc� escolheu o Avi�o Super S�nico");
			break;
		case 4:
			System.out.print("Parabens voc� escolheu o Avi�o mormal");
			break;
		default:
			System.out.print("Digite uma op��o valida!!!");
			break;
		}*/
		if (opcao <='0' && opcao >=5)
		{
			System.out.print("Digite uma op��o valida!!!");
		}
		else if (opcao == '1')
		{
			System.out.print("Parabens voc� escolheu o Avi�o de Ca�a!!");
		}
		else if (opcao == '2')
		{
			System.out.print("Parabens voc� escolheu o Avi�o Blindado!!");
		}
		else if (opcao == '3')
		{
			System.out.print("Parabens voc� escolheu o Avi�o Super S�nico!!");
		}
		else if (opcao == '4')
		{
			System.out.print("Parabens voc� escolheu o Avi�o mormal!!");
		}
		
		
	}

}
