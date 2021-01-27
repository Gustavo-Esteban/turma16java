programa
{
	
	funcao inicio()
	{
		inteiro idadeNadador

		escreva ("Insira sua idade e te informaremos qual Categoria você se encontra: ")
		leia (idadeNadador)

		se (idadeNadador <= 4)
		{
			escreva ("Desculpe mas a idade permitida para nadar é com 5 Anos :/")
		}
		senao se (idadeNadador <= 7)
		{
			escreva ("Você se encontra na Categoria Infantil A !!")
		}
		senao se (idadeNadador <= 11)
		{
			escreva ("Você se encontra na Categoria Infantil B !!")
		}
		senao se (idadeNadador <=13)
		{
			escreva ("Você se encontra na Categoria Juvenil A !!")
		}
		senao se (idadeNadador <=17)
		{
			escreva ("Você se encontra na Categoria Juvenil B !!")
		}
		senao
		{
			escreva ("Você se encontra na Categoria Adulto !!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 656; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */