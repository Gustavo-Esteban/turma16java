package exemplo1;

public class Main {

	public static void main(String[] args) {
		
		Carro car = new Carro ("Preto", 4, "Range-Rover","4 rodas");
		Moto moto = new Moto ("Vermelha", "XJ6", false, "2 rodas");
		
		car.setCor("Vermelho");
		//System.out.println(car.getCor());
		moto.setCor("Branca");
		//System.out.println(moto.getCor());
		
		//System.out.printf(car.getModelo(),car.getCor(),car.getRodas(),car.getPortas());
		
		//System.out.printf(moto.getModelo(),moto.getCor(),moto.carenagem(),moto.getRodas());
		
		System.out.println();
		
	}

}
