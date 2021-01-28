package lista3;

import java.util.*;

public class Tarefa2 {
	public static void main(String[] args) {
		 Scanner ler = new Scanner (System.in);
		
		int num,par,impar;

		 System.out.printf("A seguir lhe serao solicitados 10 numeros aleatorios, ao fim sera mostrado a quantidade de pares e de impares.\n\n") ;

		 par=0;

		 impar=0;

		 for (int i=1; i<=10;i++)

		 {

		     System.out.printf("Insira o %d° numero inteiro: ",i);
		    

		     num = ler.nextInt();
		    
		     

		     if (num%2==0)

		     {
		    	 

		    	 par++;

		     }
		     
		     if (num%2==1)

		     {

		    	 impar++;
		    	 
		     }
		     /*if(num == 0)
		     {
		    	 System.out.println("O Numero é neutro digite um numero inteiro positivo!!");
		     }
		     else if (num < 0)
		     {
		    	 System.out.println("Por favor digit um numero inteiro positivo!!");

		     }*/

		 }
		

		   System.out.printf("\nA quantidade de numeros pares digitados é de %d e de impares é de %d.",par,impar);
	}

}
