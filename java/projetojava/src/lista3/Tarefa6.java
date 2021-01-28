package lista3;

import java.util.*;

public class Tarefa6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int num = 1; 
		int soma;
		double contador = 0.00;
		 
		do
		{
			 
			System.out.println("insira um valor inteiro: \nPara sair digite 0");
			num = ler.nextInt();

		    if(num % 3 == 0 && num != 0)
		    {

		        contador++;

		    } 

		 }while(num < 0);
		 if	(contador!=0)
		 {
			 System.out.printf("a media dos multiplos de 3 é: %f\n",contador);
		 }
		
		 
		 
		  

	}

}
