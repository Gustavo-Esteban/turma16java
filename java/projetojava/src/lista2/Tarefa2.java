package lista2;

import java.util.*;

public class Tarefa2 {

	public static void main(String[] args) {
		//Faça um programa que entre com três números e coloque em ordem crescente.
		Scanner ler = new Scanner (System.in);
		
		int n1, n2, n3, aux;
		
		System.out.print("Escreva um valor: ");
		n1 = ler.nextInt();
		System.out.print("Escreva um valor: ");
		n2 = ler.nextInt();
		System.out.print("Escreva um valor: ");
		n3 = ler.nextInt();
		
		  if (n1 > n2) {
              aux = n1;
              n1 = n2;
              n2 = aux;          
          }

          if (n2 > n3) {
              aux = n2;
              n2 = n3;
              n3 = aux;        
          }
           
       
          if (n1 > n2) {
              aux = n1;
              n1 = n2;
              n2 = aux;  
          }
          System.out.printf("Os valores em ordem crescente é: %d - %d - %d", n1,n2,n3);
		
	}

}
