programa
{
	
	funcao inicio()
	{
		inteiro idade, dia, mes, ano

		escreva ("Digite sua idade em dias: ")
		leia (idade)
		dia = (idade % 365) % 30
		mes = (idade % 365) / 30
		ano = (idade / 365)
		
		escreva ("\n Sua idade convertida em Anos é: " + ano)

		escreva ("\n Sua idade convertida em Meses é: " + mes)
		
		escreva ("\n Sua idade convertida em dias é: " + dia)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 63; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */