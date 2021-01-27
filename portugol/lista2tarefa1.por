programa
{
	
	funcao inicio()
	{
		real pesoTomate
		real excessoPeso
		real multa

		escreva ("Informe em Kg o peso do tomate: ")
		leia (pesoTomate)

		excessoPeso = pesoTomate - 50
		multa = (pesoTomate - 50) * 4
		
		se (pesoTomate > 50.00) 
		{
			escreva ("Voce excedeu o peso permitido em " + excessoPeso +" Kilos e terá de pagar uma multa no valor de: "+ multa)
		}
		senao
		{
			escreva ("O tomate esta em peso permitido !")	
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 301; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */