package exemplo1;

public class Moto extends Veiculo{
	private boolean carenagem;
	public Moto(String cor, String modelo,boolean carenagem, String rodas) {
		super(cor, modelo, rodas);
		this.carenagem = carenagem;
	}
	public boolean isCarenagem() {
		return carenagem;
	}
	public void setCarenagem(boolean carenagem) {
		this.carenagem = carenagem;
	}
	
	public void carenagem()
	{
		if (carenagem == true)
		{
			System.out.println("Moto de Corrida!");
		}
		else
		{
			System.out.println("Moto Esportiva");
		}
	}
}
