package lista4;

import java.util.*;

public class Tarefa1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida.
		Encontre após a maior pontuação e a apresente*/

		int valor [] = new int [5]; 
		int maiorValor = 0;

		for (int i=0; i<5; i++)
		{
			System.out.print("Digite a pontuação da atividade "+(i+1)+ ":");
			valor[i] = ler.nextInt();

			if(valor[i] > maiorValor)
			{
				maiorValor = valor[i];
				
			}
			System.out.print("\n");
		}
		System.out.print ("A maior pontuação foi: "+ maiorValor);
	}

}
