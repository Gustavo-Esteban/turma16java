package projetojava;

import java.util.Scanner;

public class ProjetoPessoa {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		Pessoa ser = new Pessoa ("Gustavo");
		ser.estaViva = true;
		
		if (ser.estaViva)
		{
			System.out.printf("%s Esta vivo!!", ser.nome);
		}
		else
		{
			System.out.println("Sei la mano");
		}
		
		
		
		
		
	}

}
