package Ecommerce;

public class Pessoa
{
	//ATRIBUTOS
	
	private String nome;
	private char sexo;
	private int anoNascimento;
	
	
	public Pessoa(String nome, char sexo, int anoNascimento)
	{
		this.nome = nome;
		this.sexo = sexo;
		this.anoNascimento = anoNascimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public String statusIdade()
	{
		String status;
		
		if(this.idade() < 18)
		{
			status= "MENOR de 18 anos";
		}
		else
		{
			status = "MAIOR de 18 anos";
		}
		return status;
	}
	public String tratamento(char sexo)
	{
		String tratamento ;
		
		
	    if(this.sexo == 'M')
		{
			tratamento = "Seja bem vindo";
		}
		else if(this.sexo == 'F')
		{
			tratamento = "Seja bem vinda";
		}
		else {
			tratamento = "Seja bem vinde";
		}
		return tratamento;
	}
	public int idade() {
		
		return 2021 - anoNascimento;
	}
}