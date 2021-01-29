package lista4;

import java.util.*;

public class Tarefa2 {

	public static void main(String[] args) {
		/*
		 * Um dado é lançado 10 vezes e o valor correspondente é anotado.
		 * Faça um programa que gere um vetor com os lançamentos, escreva
		 * esse vetor. A seguir determine e imprima a média aritmética dos
		 * lançamentos, contabilize e apresente também quantas foram as ocorrências
		 * da maior pontuação.
		 *  *
		 */
		
		Random r = new Random();
		
		
		final int TAMANHO=10;
		int lancamentos[] = new int [TAMANHO];
		double somatorio=0.00;
		double media=0.00;
		int maiorValor=0;
		int contador=0;
		
		
		for (int x = 0; x<TAMANHO; x++) 
		{
			lancamentos[x] = r.nextInt(6)+1;
			
			
			somatorio += lancamentos[x];
			if(lancamentos[x] >= maiorValor);
			{
				if (lancamentos[x] == maiorValor)
				{
					contador++	;
				}
				else 
				{
					contador=1 ;
				}
				
				
				
				maiorValor = lancamentos[x];
			}
			
			
		}
		
		for (int x = 0; x< TAMANHO; x++)
		{
			
			System.out.print("Lancamento "+(x+1)+"º é igual a "+lancamentos[x]+"\n");
		}
		media = somatorio/TAMANHO;
		System.out.print("A soma dos valores é "+ somatorio+"\n");
		System.out.print("A média aritmética é "+ media+"\n");
		System.out.printf("Maior valor informado foi %d que aparece %d, nos lançamentos", maiorValor,contador);
	}
	
}
