programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro roleta [100]
		inteiro g1 = 0, g2 = 0, g3 = 0, g4 = 0

		para (inteiro i=1; i< 100; i++)
		{
			roleta[i] = Util.sorteia(1, 100)
			
			
			se (i >= 0 e i <=25)
			{
				g1 = g1 + 1
			}
			senao se (i >25 e i <=50)
			{
				g2 = g2 + 1
			}
			senao se (i > 50 e i <=75)
			{
				g3 = g3 + 1
			}
			senao 
			{
				g4 = g4 + 1
			}

		}
		escreva ("A quantidade de numeros entre 0-25 é: ",g1,", entre 26-50 é: ",g2,", entre 51-75 é: ",g3,", entre 76-100 é: ",g4)

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