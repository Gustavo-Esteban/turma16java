package lista7;

public class Cachorro extends Animal implements EmitirSom,Correr{

	public Cachorro(String nome, int idade) {
		super(nome, idade);
		
	}

	@Override
	public String emitirSom() {
		
		return "AU AU";
	}

	@Override
	public String correr() {
		// TODO Auto-generated method stub
		return "Estou correndo...";
	}

}
