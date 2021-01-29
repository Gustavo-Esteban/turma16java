package lista4;

import java.util.*;

public class Tarefa4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int matriz [][] = new int [3][3];
		int	l, c, somaMatriz = 0, somaDiagonal = 0;

				for (l = 0; l < 3; l++)
				{
					for (c = 0; c < 3; c++)
					{
						System.out.print ("insira os valores: ");
						matriz [l][c] = ler.nextInt();
						somaMatriz += matriz[l][c];
						if (l == c)
						{;
							somaDiagonal += matriz[l][c] ;
						}
					}
				}
				System.out.print("\n A soma da diagonal é: "+ somaDiagonal);
				System.out.print("\n A soma da matriz é: "+ somaMatriz);
	
	}
}
