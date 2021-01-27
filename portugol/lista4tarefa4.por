programa
{
	
	funcao inicio()
	{
		inteiro matriz [3][3], l, c, somaMatriz = 0, somaDiagonal = 0 

		para (l = 0; l < 3; l++)
		{
			para (c = 0; c < 3; c++)
			{
				escreva ("insira os valores: ")
				leia(matriz[l][c])
				somaMatriz += matriz[l][c]
				se (l == c)
				{
					somaDiagonal += matriz[l][c] 
				}
			}
		}
		escreva ("\n A soma da diagonal é: ", somaDiagonal)
		escreva ("\n A soma da matriz é: ", somaMatriz)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 152; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */