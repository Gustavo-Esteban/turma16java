programa
{
	
	funcao inicio()
	{
		real indicePoluicao

		escreva("Informe o Indice de Poluição ao meio ambiente: ")
		leia (indicePoluicao)

		se (indicePoluicao <= 0.25)
		{
			escreva ("A poluição esta aceitável !")
		}
		senao se (indicePoluicao <= 0.30)
		{
			escreva ("Todas as índustrias do Grupo 1 DEVEM suspender as Atividades IMEDIATAMENTE! ")
		}
		senao se (indicePoluicao <= 0.40)
		{
			escreva ("Todas as índustrias do Grupo 1 e 2 DEVEM suspender as Atividades IMEDIATAMENTE! ")
		}
		senao
		{
			escreva ("TODAS as índustrias de TODOS os Grupos DEVEM paralizar suas Atividades IMEDIATAMENTE!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 613; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */