package lista2;

import java.util.*;

public class Tarefa1 {

	public static void main(String[] args) {
		//Faça um programa que receba três inteiros e diga qual deles é o maior.
		
		Scanner ler = new Scanner (System.in);
		
		int n1, n2, n3;
		
		System.out.print("Digite um valor: ");
		n1 = ler.nextInt();
		System.out.print("Digite um valor: ");
		n2 = ler.nextInt();
		System.out.print("Digite um valor: ");
		n3 = ler.nextInt();
		
		if (n1 >= n2)
		{
			if (n1 >= n3)
			{
				System.out.printf("O maior numero é: %d",n1);
			}
			else
			{
				System.out.printf("O maior numero é: %d",n3);
			}
		}
		else
		{
			if(n2 > n3)
			{
				System.out.printf("O maior numero é: %d",n2);
			}
			else
			{
				System.out.printf("O maior numero é: %d",n3);
			}
		}
		
	}

}
