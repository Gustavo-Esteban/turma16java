package projetojava;

import java.util.*;

public class ProjetoEvento {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
				String agenda[][] = new String [24][31];
				String nome;
				int dia=0, hora=0;
				char opcao;
	
				System.out.print("Digite o seu nome: ");
				nome = ler.next();
			
				do
				{
					
					System.out.print("\nESCOLHA UM DIA para CADASTRO [1/31] :");
					dia = ler.nextInt();
					while (dia <=0 || dia > 31)
					{
						System.out.print("\nData informada incorreta, escolha uma data entre 1 e 31:");
						dia = ler.nextInt();
					}
					dia -= 1;
					System.out.print("SELECIONE A HORA DO EVENTO[0-23]: ");
					hora = ler.nextInt();
					while( hora < 0 || hora > 23 )
					{
						System.out.print("\nHora informada incorreta, escolha entre 0 e 23 h: ");
						hora = ler.nextInt();
					}
					System.out.print("\nInforme a tarefa nesta data e hora:");
					agenda[hora][dia] = ler.next();
					System.out.print("Continua 1-sim ou 2-não:");
					opcao = ler.next().charAt(0);
					
				} while(opcao=='1');
				for (int l= 0; l<31; l++)
				{
					for(int c=0; c<24;c++)
					{
						if (agenda[c][l] != null)
						{
							System.out.print("\nDia: "+l+1+" hora: "+c+":00"+" Evento: "+agenda[c][l]);
						}
						
					}
				}
		
		
		
	}

}
