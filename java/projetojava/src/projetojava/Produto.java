package projetojava;

public class Produto {
	
	
	
	public String descricao;
	public int codigo;
	public double valor;
	
	public Produto (String descricao)
	{
		this.descricao = descricao;
		
	}
	public Produto(String descricao, int codigo)
	{
		this.descricao = descricao;
		this.codigo = codigo;
	}
	public Produto(String descricao, int codigo, double valor)
	{
		this.descricao = descricao;
		this.codigo = codigo;
		this.valor = valor;
	}
	
	public String getDescricao()
	{
		//String descricao = descricao;
		return descricao;
		
	}
	public int getCodigo()
	{
		return codigo;
	}
	public double getValor()
	{
		return valor;
	}
	

}
