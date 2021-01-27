programa
{
	
	funcao inicio()
	{
		inteiro numero
		


		escreva ("Digite um numero inteiro: ")
		leia (numero)

		
		se (numero < 0 e numero % 2 == 0)
		{
			escreva ("O numero digitado é Negativo e Par !!")
		}
		senao se (numero < 0)
		{
			escreva ("O numero digitado é Negativo e Impar !!")
		}
		senao se (numero % 2 == 0)
		{
			escreva ("O numero digitado é Positivo e Par !!")
		}
		senao
		{
			escreva ("O umero digitado é Positivo e Impar !!")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 464; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */