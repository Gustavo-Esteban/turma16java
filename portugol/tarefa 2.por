programa
{
	
	funcao inicio()
	{
		real peso = 0.00, altura = 0.00
		cadeia nome
		//real imc = (peso / altura) / 2

		escreva ("Digite seu nome: ")
		leia (nome)
		escreva ("Digite sua altura: ")
		leia (altura)
		escreva ("Digite seu peso: ")
		leia (peso)

		real imc = (peso / altura) / 2
		

		se (imc < 18.5)
		{
			escreva ("Seu Indice de massa corporal é ",imc," e você esta Abaixo do peso!!")
		}senao se (imc >= 18.5 e imc < 25)
		{
			escreva ("Seu Indice de massa corporal é ",imc," e você esta no peso normal!!")
		}
		senao se (imc >= 25 e imc < 30)
		{
			escreva ("Seu Indice de massa corporal é ",imc," e você esta Acima do peso!!")
		}
		senao
		{
			escreva ("Seu Indice de massa corporal é ",imc," e você esta Obeso!!")
		}
		escreva("\n\nFim do Programa\n\n")
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 764; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */