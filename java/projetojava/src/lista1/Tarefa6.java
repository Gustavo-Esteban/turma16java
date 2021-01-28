package lista1;

import java.util.Scanner;

public class Tarefa6 
{
	public static void main (String[]args)
	{
		Scanner leia = new Scanner (System.in);
		double x1, x2, y1, y2, valor1, valor2, 
		potencia1, potencia2, res, raiz;
		
		System.out.print("escreva X1: ");
		x1 = leia.nextDouble();
		System.out.print("escreva X2: ");
		x2 = leia.nextDouble();
		System.out.print("escreva Y1: ");
		y1 = leia.nextDouble();
		System.out.print("escreva Y2: ");
		y2 = leia.nextDouble();
		
		valor1 = (x2-x1);
		valor2 = (y2-y1);
		
		potencia1 = Math.pow(valor1, 2);
		potencia2 = Math.pow(valor2, 2);
		res = potencia1 + potencia2;
		raiz = Math.sqrt(2);
		
		System.out.printf("O resultado é: %f",raiz);
		
		
		
	}
}
