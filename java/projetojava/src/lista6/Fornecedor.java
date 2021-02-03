package lista6;

public class Fornecedor extends Pessoa{

	private double valorCredito;
	private double valorDivida;
	private double res;
	
	 public void obterValor() {
			
		if (valorCredito<valorDivida)
		{
			System.out.println("Chei de divida né safado, vai resolver os problema!");
		}else
		{
			res = valorCredito - valorDivida;
			System.out.printf("Conta = %.2f", res);
		}
	}

	public Fornecedor(String nome, String endereco, String telefone,double valorCredito, double valorDivida) {
		super(nome,endereco,telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
}
