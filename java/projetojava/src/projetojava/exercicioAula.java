package projetojava;

import java.util.*;

public class exercicioAula {

	public static void main(String[] args) {

		/*A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o sal�rio e n�mero de filhos. A prefeitura deseja saber:   
			a) m�dia do sal�rio da popula��o; 
			b) m�dia do n�mero de filhos; 
			c) maior sal�rio; 
			d) percentual de pessoas com sal�rio at� R$100,00.*/
		
			Scanner ler = new Scanner (System.in);
			final int HABITANTES  = 5; 
			double salario = 0.00;
			int numFilhos = 0;
			double mediaSalario = 0.00;
			double mediaFilhos = 0.00;
			double maiorSalario = 0.00;
			double porcentualSalario100 = 0.00;
			double totalSalario = 0.00;
			int totalFilhos = 0;
			double contadorValor100 = 0;
			
			for (int giro=1; giro < HABITANTES; giro++)
			{
				System.out.printf("Digite o salario do habitante %d:", giro);
				salario = ler.nextDouble();
				System.out.print("Digite o numero de filhos deste habitante: ");
				numFilhos = ler.nextInt();
				totalSalario += salario;
				totalFilhos += numFilhos;
				if (salario > maiorSalario)
				{
					maiorSalario = salario;
				}
				if (salario <= 100)
				{
					contadorValor100++;
				}
				
			}
			mediaSalario = totalSalario / HABITANTES;
			mediaFilhos = totalFilhos / HABITANTES;
			porcentualSalario100 = (contadorValor100 / HABITANTES) * 100;
			System.out.printf("\nA media salarial �: R$ %.2f \n", mediaSalario);
			System.out.printf("\nA media de filhos �: %.2f \n", mediaFilhos);
			System.out.printf("\nO maior salario informado foi: %.2f\n", maiorSalario);
			System.out.print("\nNumero de pessoas q ganham ate R$ 100 = "+contadorValor100+" sendo um percentual total de: "+porcentualSalario100+"%\n");
			System.out.print("\nObrigado pela ajuda, Fim de Programa");
	}

}
