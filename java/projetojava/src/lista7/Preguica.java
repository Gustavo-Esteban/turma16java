package lista7;

public class Preguica extends Animal implements EmitirSom,SubirArvore{

	public Preguica(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String subirArvore() {
		// TODO Auto-generated method stub
		return "Estou subindo lentamente...";
	}

	@Override
	public String emitirSom() {
		// TODO Auto-generated method stub
		return "AAAAAA";
	}

}
