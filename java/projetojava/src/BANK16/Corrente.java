package BANK16;

public class Corrente extends Conta {

	private int diaAniversario;
	public Corrente(String numero, String cpf, double saldo,int diaAniversario) {
		super(numero, cpf, saldo);
		this.diaAniversario = diaAniversario;
		
	}

}
