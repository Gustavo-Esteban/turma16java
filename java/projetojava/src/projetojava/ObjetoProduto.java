package projetojava;

import projetojava.Produto;

public class ObjetoProduto {

	public static void main(String[] args) {
		Produto item = new Produto ("camiseta 1 ",123,10.50);
		
		
			
		//System.out.print(produto.getDescricao());
		System.out.print("\tProduto"+"\t\tCodigo"+"\tValor"+"\n\t"+item.descricao+"\t"+item.codigo+"\t"+item.valor);
		
	}

}
