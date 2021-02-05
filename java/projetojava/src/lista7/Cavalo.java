package lista7;

public class Cavalo extends Animal implements Correr,EmitirSom{

	public Cavalo(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return "HI,HIN,HIN";
	}

	@Override
	public String correr() {
		// TODO Auto-generated method stub
		return "Estou correndo...";
	}

}
