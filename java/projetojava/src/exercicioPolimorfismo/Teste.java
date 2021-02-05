package exercicioPolimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

/*		
		Empregado func = new Empregado("Gustavo",0123,120,50.00);
		System.out.println("Salario final = R$"+func.salario());
*/
		
/*		
		Empregado ter = new Terceiro("Gustavo",01234,120,50.00,0.1);
		System.out.println("Salario final = R$"+ter.salario());
		
*/		
		Scanner ler = new Scanner(System.in);
		
		List <Empregado> lista = new ArrayList <>();
		
		System.out.print( "Digite o numero de empregados: " );
		int numero = ler.nextInt();
		
		for(int x = 0; x< numero; x++)
		{

			System.out.print("Terceiro S/N: ");
			char op = ler.next().toUpperCase().charAt(0);
			System.out.print("Digite seu nome: ");
			String nome = ler.next();
			System.out.print("Digite sua matricula: ");
			int matricula = ler.nextInt();
			System.out.print("Digite as horas trabalhadas: ");
		    int horas = ler.nextInt();
		    System.out.print("Digite o valor por hora trabalhada: ");
		    double valorHora = ler.nextDouble();
			if(op == 'S')
			{
				System.out.print("Quanto de acrescimo?: ");
				double acrescimo = ler.nextDouble();
				lista.add(new Terceiro (nome, matricula, horas, valorHora, acrescimo));
			}
			else if (op == 'N')
			{
				lista.add(new Empregado (nome, matricula, horas, valorHora));
			}
		}
		System.out.println();
		System.out.println("PAGAMENTOS: ");
		for(Empregado emp : lista)
		{
			System.out.println(emp.getNome()+" - $"+emp.salario());
		}	
	}

}
