package BANK16;

public class Poupanca extends Conta{

	private int diaAniversario;
	
	public Poupanca(String numero, String cpf, double saldo, int diaAniversario) {
		super(numero, cpf, saldo);
		this.diaAniversario = diaAniversario;
	}
	
	public void aniversario (int dia) {
		double correcao = super.getSaldo()*0.005;
		if(dia == diaAniversario) {
		 
		 super.creditar(correcao);
		}
	}

	public int getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	
	
}
