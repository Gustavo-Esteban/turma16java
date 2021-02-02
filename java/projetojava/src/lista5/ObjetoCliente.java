package lista5;

import java.util.Scanner;

import lista5.Cliente;

public class ObjetoCliente {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		Cliente cadastro = new Cliente ();
		
		
		System.out.println("CADASTRO###\n\n");
		System.out.print("Digite seu nome: ");
		cadastro.nome = ler.nextLine();
		System.out.print("Digite sua idade: ");
		cadastro.idade = ler.nextInt();
		System.out.print("Digite seu genero M-masculino F-feminino X-outros: "+"\n");
		cadastro.genero = ler.next().toUpperCase().charAt(0);
		
		System.out.printf("CADASTRO CONCLUIDO##\n\n%s %s.", cadastro.tratamento(),cadastro.nome);
		
	}

}
