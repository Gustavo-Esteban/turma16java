package entidades;

import java.util.*;

import entidades.Pessoas;


public class BancaJornal {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		Pessoas brother = new Pessoas();
		
		System.out.print("Digite seu nome: ");
		brother.nome = ler.next();
		System.out.print("Digite seu genero M-masculino F-feminino X-outros: ");
		brother.genero = ler.next().toUpperCase().charAt(0);
		System.out.print("Digite seu ano de nascimento [0000]: ");
		brother.nascimento = ler.nextInt();
		
		System.out.printf(brother.tratamento()," ");
		System.out.println(brother.idade());
		
		
		
	}

}
