package lista3;

import java.util.*;

public class Tarefa3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		
		  int idade,contador21=0,contador50=0;
          System.out.printf("\n DIGITE A IDADE: ");
          idade = ler.nextInt();
          while(idade!=-99)
             {
                 if(idade<21) contador21++;
                 if(idade>50) contador50++;
                 System.out.printf("\n Digite a idade da pessoa (para Sair digite -99) : ");
                 idade = ler.nextInt();
             }
          
          System.out.printf("\n O Total com menos de 21 anos E:%d",contador21);
          System.out.printf("\n O Total com mais de 50 anos E:%d",contador50);
          System.out.printf("\n\n");
		
		
	}

}
