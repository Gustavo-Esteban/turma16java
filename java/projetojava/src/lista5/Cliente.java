package lista5;

public class Cliente {
	/*1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto
	cliente, defina as instancias deste objeto e apresente as informações deste objeto no console.*/
	
	
	public String nome;
	public int idade;
	public char genero;
	
	
	public String tratamento()
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
	
}
