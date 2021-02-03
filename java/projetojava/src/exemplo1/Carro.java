package exemplo1;

public class Carro extends Veiculo{
	
	private int portas;
	
	public Carro(String cor, int portas,String modelo,String rodas) {
		super(cor, modelo,rodas);
		
		this.portas = portas;
		
		
	}
	public int getPortas() {
		return portas;
	}
	public void setPortas(int portas) {
		this.portas = portas;
	}
	
	
	
}
