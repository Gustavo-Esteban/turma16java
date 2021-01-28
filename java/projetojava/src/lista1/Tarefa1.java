package lista1;

import java.util.Scanner;

public class Tarefa1 
{
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
		int dias,mes,anos, res;
		
		System.out.print("Digite os anos: ");
		anos = leia.nextInt();
		System.out.print("Digite os meses: ");
		mes = leia.nextInt();
		System.out.print("Digite os dias: ");
		dias = leia.nextInt();
		
		res = (anos*365)+(mes*30)+dias;
		
		System.out.printf("\nA idade informada em dias = %d",res);

	}
	
}
