package projetojava;

import java.util.Scanner;

public class numeroNegativo {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
			
		
		int numero;
		
		
		System.out.print("Escreva um numero inteiro positivo:" );
		numero = ler.nextInt();
		
		
		if (numero < 0)
		{
			System.out.print("O programa apenas funciona com numero maiores que 0!");
		}
		else if (numero ==0)
		{
			System.out.print("\n0 (zero) � meutro\n");
			
		}
		else
		{
			int resto = numero%2;
			if (resto == 0)
			{
				System.out.printf("\n%d � par\n", numero);
			}
			else
			{
				System.out.printf("\n%d � �mpar\n", numero);
			}
		}
		
		
		

	}

}
