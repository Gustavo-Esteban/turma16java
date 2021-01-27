programa
{
	
	funcao inicio()
	{
		//PEDI AO USUARIO NOME[COMPLETO OU SO PRIMEIRO]
		//SEXO[M/F]
		// ANO NASCIMENTO[AAAA]
		// ESCREVA NA TELA A IDADE APROXIMADA DA PESSOA

		
		cadeia nome
		caracter sexo
		inteiro nascimento
		inteiro resultado
		
		escreva ("Digite seu nome: ")
		leia (nome)
		escreva ("Você é do sexo M ou F ? ")
		leia (sexo)
		escreva ("Digite seu ano de nascimento: ")
		leia (nascimento)

		resultado = 2021 - nascimento


		escreva ("Ola "+nome + " Sua idade aproximada é : "+  resultado)
		

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 468; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */