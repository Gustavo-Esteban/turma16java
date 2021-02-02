package entidades;

public class Pessoas {
	
	public String nome;
	public char genero;
	public int nascimento;
	
	public String tratamento ()
	{
		
		if(genero == 'F' || genero == 'f')
		{
			return ("Bom dia Sra");
		}
		else if(genero == 'M' || genero == 'm')
		{
			return ("Bom dia Sr");
		}
		else
		{
			return ("Bom dia Srx");
		}
		
		
		
	}
	
	public int idade ()
	{
		if (nascimento < 18)
		{
			System.out.println("Você nao pode comprar revistas pornograficas!!!");
		}
		else
		{
			System.out.println("Compre oque quiser XD!!!");
		}
		return 2021 - nascimento;
	}
	

}
