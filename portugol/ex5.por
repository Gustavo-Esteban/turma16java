programa
{
	
	funcao inicio()
	{
		inteiro tempo, segundos, minutos, horas, resultado

		escreva ("Digite em quantos segundos essa operação ocorre: ")
		leia (tempo)
		segundos = (tempo % 3600) % 30
		minutos = (tempo % 3600) / 30
		horas = (tempo / 3600 )
		
		escreva ("\n Em horas: " + horas)

		escreva ("\n Em minutos: " + minutos)
		
		escreva ("\n Em segundos: " + segundos)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 230; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */