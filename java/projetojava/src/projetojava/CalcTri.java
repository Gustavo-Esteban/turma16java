package projetojava;

import java.util.*;

public class CalcTri {
	
	public static void main(String[] args) 
	{
		Locale. setDefault (Locale.US); //define o tipo de padronização
		//area = base * altura / 2
		Scanner leia = new Scanner(System.in);//instaciar = criar
		double base, altura, area, maiorArea;
		
		
		
		for(int i=0;i<3;i++)
		{
			System.out.printf("Digite a base do triangulo %d: ",(i+1));
			base = leia.nextDouble();
			System.out.printf("Digite a altura do triangulo %d: ",(i+1));
			altura = leia.nextDouble();
			
			area = ((base * altura) / 2 );
			
			System.out.printf("A area do triangulo informado é %.2f", area);
			maiorArea = area;
			if(area > maiorArea)
			{
				maiorArea = area;
				System.out.printf("E a maior area informafo é: ",area);
			}
				
		}
		

	}

}



