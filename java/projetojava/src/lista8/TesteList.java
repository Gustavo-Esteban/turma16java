package lista8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteList {

	public static void main(String[] args) {

/*Crie uma um programa para trabalhar com estoque de uma loja, o programa dever� 
 * trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, 
 * o programa dever� atender as seguintes funcionalidades:

 Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
*/
		Scanner ler = new Scanner (System.in);
		List <Produtos> lista = new ArrayList <>();
		
		int numero;
		System.out.println("Digite quantos produtos: ");
		numero = ler.nextInt();
		
		for(int x = 0; x < numero; x++)
		{
			System.out.println("Digite nome do produto: ");
			String nome = ler.next();
			System.out.println("Digite o pre�o: ");
			double preco = ler.nextDouble();
			lista.add(new Produtos(nome, preco));
			System.out.println("Deseja fazer alguma altera��o? 1-Alterar 2-Remover 0-Sair\nInsira aqui:");
			int op = ler.nextInt();
			while(op != 0)
			{
				
				if(op == 1)
				{
					lista.remove(x);
					System.out.println("Digite nome do produto: ");
					String nome1 = ler.next();
					System.out.println("Digite o pre�o: ");
					double preco2 = ler.nextDouble();
					lista.add(new Produtos(nome1, preco2));
				}
	
				else if(op == 2)
					{
						
						lista.remove(x);
						
					}	
				System.out.println("Deseja fazer alguma altera��o? 1-Alterar 2-Remover 0-N�o\nInsira aqui:");
				op = ler.nextInt();
			}
			
		}
		System.out.println();
		System.out.println("PRODUTOS: ");
		for(Produtos prod : lista)
		{
			System.out.println(prod.getProdutos()+" = R$ "+prod.getPreco());
		}
		
		
		

	}

}
