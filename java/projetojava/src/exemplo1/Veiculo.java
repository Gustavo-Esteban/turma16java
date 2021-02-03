package exemplo1;

public class Veiculo {
	
	private String cor;
	private String modelo;
	private String rodas;
	
	
	
	public void ligar ()
	{
		boolean ligar = true;
		if (ligar == true)
		{
			System.out.println("O veiculo esta ligado!!!");
		}
		else
		{
			System.out.println("O veiculo esta desligado"); 
		}
	}



	public Veiculo(String cor, String modelo, String rodas) {
		super();
		this.cor = cor;
		this.modelo = modelo;
		this.rodas = rodas;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}



	public String getRodas() {
		return rodas;
	}



	public void setRodas(String rodas) {
		this.rodas = rodas;
	}
	
	
	
	
	
	

}
