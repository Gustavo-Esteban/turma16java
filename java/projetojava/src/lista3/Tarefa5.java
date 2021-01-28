package lista3;

import java.util.*;

public class Tarefa5 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);

		int num, soma=0;
		System.out.println("Digite os numeros que você quer somar \ndepois digite 0 para encerrar: \n");
		do 
		{
		   num = ler.nextInt();
		   soma=soma+num;
		} while(num !=0);  
		System.out.printf("SOMA = %d",soma);
	}

}
