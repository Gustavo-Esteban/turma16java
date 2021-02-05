package exercicioPolimorfismo;

public class Terceiro extends Empregado implements Salario{
	
	private double acrescimo;

	public Terceiro(String nome, int matricula, int horas, double valorHora, double acrescimo) {
		super(nome, matricula, horas, valorHora);
		this.acrescimo = acrescimo;
	}
	
	@Override
	public double salario() {
		acrescimo = getHoras() * (getValorHora()+(getValorHora()*acrescimo));
		return (acrescimo);
		
	}
	

	
}
