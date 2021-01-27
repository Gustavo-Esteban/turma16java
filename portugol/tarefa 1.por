programa
{
	
	funcao inicio()
	{
		real valorProduto = 1000.00
		caracter formaPagamento
		
		
		escreva ("Escolha a forma de pagamento\n\n1-A vista dinheiro ou cheque \n2-A vista cartão de credito \n3-Em Duas vezes \n4-Em Trez vezes\nDigite a Opcão: ")
		leia(formaPagamento)
		limpa()
		
		se (formaPagamento == '1')
		{
			escreva("Seu pagamento a vista no dinheiro fica com 20% de desconto e o valor final é: ", (valorProduto * -20) / 100 + valorProduto)
		}
		senao se (formaPagamento == '2')
		{
			escreva ("Seu pagamento a vista no cartão fica com 15% de desconto e o valor final é: ",(valorProduto * -15) / 100 +valorProduto)
		}
		senao se (formaPagamento == '3')
		{
			escreva ("Seu pagamento em Duas vezes fica em duas parcelas de: ",valorProduto / 2)
		}
		senao 
		{
			escreva("Seu pagamento em Tres vezes fica com 10% de juros e o valor final em Tres parcelas é: ", ((valorProduto * 10) / 100 + valorProduto) / 3)
			
		}
		escreva ("\n\nFim do Programa")
		escreva ("\n\n\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 961; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */