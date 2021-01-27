programa
{
	
	funcao inicio()
	{
		real codigoOperario
		real horasTrabalhadas
		real excesso
		real pagamentoExcedente
		real salario

		escreva ("Por Favor, insira seu código: ")
		leia (codigoOperario)
		escreva ("Por Favor, insira suas horas trabalhadas: ")
		leia (horasTrabalhadas)

		salario = horasTrabalhadas * 10 
		pagamentoExcedente = (horasTrabalhadas - 50) * 20
		excesso = (50 * 10) + pagamentoExcedente

		
		se (horasTrabalhadas > 50)
		{
			escreva ("Você fez horas extras!! Seu pagamento será de: R$" + excesso + " Você recebeu: R$" + pagamentoExcedente + " a mais !!")
		}
		senao 
		{
			escreva ("Seu Pagamento é de: R$" + salario + " Aproveite!!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 662; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */