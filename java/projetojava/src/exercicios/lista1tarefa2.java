package exercicios;

import java.util.Scanner;

public class lista1tarefa2
{
	public static void main(String[]args)
	{
		Scanner leia = new Scanner(System.in);
		
		int idade, dia, mes, ano;
		
		System.out.print("Digite sua idade em dias: ");
		idade = leia.nextInt();
		dia = (idade% 365) % 30;
		mes = (idade % 365) / 30;
		ano = (idade / 365);
		
		System.out.printf("\nSua idade convertida em Anos é: %d",ano);
		
		System.out.printf("\nSua idade convertida em Meses é: %d",mes);
		
		System.out.printf("\nSua idade convertida em Dias é: %d",dia);
	}

}
