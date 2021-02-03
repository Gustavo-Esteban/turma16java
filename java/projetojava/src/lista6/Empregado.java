package lista6;

public class Empregado extends Pessoa{
	private int codigoSetor;
	private double salarioBase;
	private double res;
	public void imposto()
	{
		res = salarioBase * 0.9;
		System.out.printf("Salario final menos imposto de 9 porcento = R$ %.2f", res);
	}
	public Empregado(String nome, String endereco, String telefone,int codigoSetor, double salarioBase) {
		super(nome, endereco, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		
		
	}
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	

}
