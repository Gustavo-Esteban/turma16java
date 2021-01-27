programa
{
	
	funcao inicio()
	{
		/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.*/


		inteiro l, c, matrizN1 [4][6], matrizN2 [4][6], matrizM1[4][6], matrizM2[4][6]

		para(l=0; l<4; l++)
		{
			para(c=0; c<6; c++)
			{
				escreva ("Valor n1: ")
				leia(matrizN1 [l][c])
				escreva("\n")
			}
		}
		para(l=0; l<4; l++)
		{
			para(c=0; c<6; c++)
			{
				escreva ("Valor n2: ")
				leia(matrizN2 [l][c])
				
			}
			escreva("\n")
		}
		para(l=0; l<4; l++)
		{
			para(c=0; c<6; c++)
			{
				matrizM1[l][c] = matrizN1 [l][c] + matrizN2 [l][c]
				escreva(matrizM1[l][c], " ")
				
			}
			escreva("\n")
		}
		para(l=0; l<4; l++)
		{
			para(c=0; c<6; c++)
			{
				matrizM2[l][c] = matrizN1 [l][c] - matrizN2 [l][c]
				escreva(matrizM2[l][c], " ")
				
			}
			escreva("\n")
		}
		
 
		

		

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 750; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matrizN1, 11, 16, 8}-{matrizN2, 11, 33, 8}-{matrizM1, 11, 50, 8}-{matrizM2, 11, 66, 8};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */