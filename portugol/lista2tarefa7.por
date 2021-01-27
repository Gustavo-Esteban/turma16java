programa
{
	inclua biblioteca Matematica --> math
	
	funcao inicio()
	{
		real baseTriangulo
		real alturaTriangulo
		real resultado

		escreva ("Informe o valor da Base do Triangulo: ")
		leia (baseTriangulo)
		escreva ("Informe o valor da Altura do Triangulo: ")
		leia (alturaTriangulo)

		resultado = (baseTriangulo * alturaTriangulo) / 2

		se (baseTriangulo > 0 e alturaTriangulo > 0)
		{
			
			escreva ("A area do Triangulo é: " + resultado)
		}
		senao
		{
			escreva ("Desculpe, Não é possivel calcular com numeros negativos!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 537; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */