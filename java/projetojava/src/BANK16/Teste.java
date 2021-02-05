package BANK16;

import java.util.*;

public class Teste {
	char op;	
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		
		System.out.println("Informe numero da conta: ");
		String numero = ler.next();
		System.out.println("Informe seu CPF: ");
		String cpf = ler.next();
		Conta  conta = new Conta (numero,cpf);
		
		for(int x = 0; x <10; x++)
		{
			System.out.println("Digite D-Debito C-Credito: ");
			char op = ler.next().toUpperCase().charAt(0);
			if (op == 'd')
			{
				
			}
			System.out.printf("Saldo atual = R$ %.2f");
			
		}
		
		

	}

}
