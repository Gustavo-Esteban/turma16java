package lista4;

import java.util.*;

public class Tarefa3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		
		
				int l, c;
				int matrizN1 [][] = new int [4][6];
				int matrizN2 [][] = new int [4][6];
				int matrizM1 [][] = new int [4][6];
				int matrizM2 [][] = new int [4][6];
				for(l=0; l<4; l++)
				{
					for(c=0; c<6; c++)
					{
						System.out.print ("Valor n1: ");
						matrizN1 [l][c]= ler.nextInt();
						System.out.print("\n");
					}
				}
				for(l=0; l<4; l++)
				{
					for(c=0; c<6; c++)
					{
						System.out.print ("Valor n2: ");
						matrizN2 [l][c] = ler.nextInt();
						
					}
					System.out.print("\n");
				}
				for(l=0; l<4; l++)
				{
					for(c=0; c<6; c++)
					{
						matrizM1[l][c] = matrizN1 [l][c] + matrizN2 [l][c];
						System.out.print(matrizM1[l][c]+ " ");
						
					}
					System.out.print("\n");
				}
				for(l=0; l<4; l++)
				{
					for(c=0; c<6; c++)
					{
						matrizM2[l][c] = matrizN1 [l][c] - matrizN2 [l][c];
						System.out.print(matrizM2[l][c]+ " ");
						
					}
					System.out.print("\n");
				}
				
	}

}
