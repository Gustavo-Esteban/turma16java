package Ecommerce;//PAGAMENTO
public class Pagamento {
	public double totalPagar;
	public double totalGeral;
	public double imposto;
	
	
	
	public Pagamento(double totalGeral) {
		super();
		this.totalGeral = totalGeral;
	}
	
	public double imposto()
	{
		imposto=((totalGeral*0.09)+totalGeral);
		return (imposto);
	}
	
	public double avista() {
		 totalPagar=((imposto)-imposto*0.10);
		 return (totalPagar) ;
	}
	public double umaVez()
	{
		 totalPagar=imposto;
		 return (totalPagar);
		
	}
	
	public double duasVezes()
	{
		totalPagar=((imposto*0.10)+imposto);
		return (totalPagar);
	}
	
	public double tresVezes()
	{
		totalPagar=((imposto*0.15)+imposto);
		return (totalPagar);
	}
	
	public double parcelaDuasVezes()
	{
		totalPagar=(((imposto*0.10)+imposto)/2);
		return (totalPagar);
	}
	
	public double parcelaTresVezes()
	{
		totalPagar=(((imposto*0.15)+imposto)/3);
		return (totalPagar);
	}
}