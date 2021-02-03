package lista6;

public class Vendedor extends Pessoa{
	private double valorVendas;
	private double res;
	public void comissao()
	{
		res = (valorVendas *0.09) + valorVendas;
		System.out.printf("Salario base mais a comissao pelas vendas = RS %.2f", res);
	}
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	public Vendedor(String nome, String endereco, String telefone, double valorVendas) {
		super(nome, endereco, telefone);
		this.valorVendas = valorVendas;
	}
	
	
	

}
