package lista4;

import java.util.*;

public class Tarefa2 {

	public static void main(String[] args) {
		/*
		 * Um dado � lan�ado 10 vezes e o valor correspondente � anotado.
		 * Fa�a um programa que gere um vetor com os lan�amentos, escreva
		 * esse vetor. A seguir determine e imprima a m�dia aritm�tica dos
		 * lan�amentos, contabilize e apresente tamb�m quantas foram as ocorr�ncias
		 * da maior pontua��o.
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
			
			System.out.print("Lancamento "+(x+1)+"� � igual a "+lancamentos[x]+"\n");
		}
		media = somatorio/TAMANHO;
		System.out.print("A soma dos valores � "+ somatorio+"\n");
		System.out.print("A m�dia aritm�tica � "+ media+"\n");
		System.out.printf("Maior valor informado foi %d que aparece %d, nos lan�amentos", maiorValor,contador);
	}
	
}
