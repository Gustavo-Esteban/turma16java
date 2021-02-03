package lista6;

public class Operario extends Pessoa{
	private double valorProducao;
	private double res;

	public void comissao()
	{
		res = (valorProducao * 0.09) + valorProducao;
		System.out.printf("Salario final mais 9 porcento de comissao = R$ %.2f", res);
	}
	public Operario(String nome, String endereco, String telefone, double valorProducao) {
		super(nome, endereco, telefone);
		this.valorProducao = valorProducao;
	}
	public double getValorProducao() {
		return valorProducao;
	}
	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}
	
	

}
