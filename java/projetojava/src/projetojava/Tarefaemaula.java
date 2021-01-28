package projetojava;

import java.util.*;

public class Tarefaemaula {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double saldo = 0.00;
		char conta;
		char movimento;
		double valor;
		char continua;
		
		System.out.print("Bem vindo ao banco G4\n\n\nDigite qual conta você vai escolher\n1 - CONTA POUPANÇA\r\n2 - CONTA CORRENTE\r\n3 - CONTA ESPECIAL \r\n4 - CONTA EMPRESA\r\n5 - CONTA ESTUDANTIL\r\n6 - SAIR\r\nSELECIONE O TIPO DE CONTA: ");
		conta = ler.next().charAt(0);
		
		while (conta >=1 && conta <=6)
		{
			do
			{
				System.out.print("Selecione o movimento - D/C: ");
				movimento = ler.next().charAt(0);
				
			}while(movimento == 'D' && movimento == 'd');
			
			
				System.out.print("Valor: ");
				valor = ler.nextDouble();
				System.out.printf("Saldo atual: %.2f",saldo);
				System.out.println("Continua - S/N: ");
				continua = ler.next().charAt(0);
			
			
			
			
			
		}
		
		
		
	}

}
