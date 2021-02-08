package projetojava;

import java.util.Scanner;

public class ExemploDeErro {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		
		try
		{
		
			System.out.println("Digite uma sequencia de nomes:");
			String[] vetor = leia.nextLine().split(" ");//{"ed","rafao","milton"}
			System.out.println("Digite uma posição da lista: ");
			int posicao = leia.nextInt();
			System.out.println("O nome na posição escolhida é "+vetor[posicao]);
		}
		catch (Exception erro)
		{
			System.out.println("Amigão, você precisa digitar corretamente!!!");
		}
		System.out.println("Fim programa!!!");
		
	}
	
}
