programa
{
	
	funcao inicio()
	{
		//PEDI AO USUARIO NOME[COMPLETO OU SO PRIMEIRO]
		//SEXO[M/F]
		// ANO NASCIMENTO[AAAA]
		// ESCREVA NA TELA A IDADE APROXIMADA DA PESSOA
		
		//variaveis - ingredientes
		cadeia nomePessoa
		caracter sexoPessoa
		inteiro anoNascimento
		inteiro idade
		const inteiro ANOATUAL = 2021
		//entradas
		escreva("Digite o nome da pessoa: ")
		leia(nomePessoa)
		escreva("Digite M-masculino ou F-feminino: ")
		leia(sexoPessoa)
		escreva("Digite apenas o ano de nascimento [aaaa]: ")
		leia(anoNascimento)
		/*
		 * até 18 - jovem
		 * de 18 até 59 anos - adulto/a
		 * de 60 anos pra cima idoso/a
		 *
		 */
		//processamento
		idade = ANOATUAL - anoNascimento
		//saida
		se (sexoPessoa =='M' )
		{
			se (idade <17)
			{
				escreva("Bom dia "+nomePessoa+" sua idade aproximada é "+idade+" anos e você é considerado jovem")
			}
			senao se (idade <59)
			{
				escreva("Bom dia "+nomePessoa+" sua idade aproximada é "+idade+" anos e você é considerado adulto")
			}
			senao
			{
				escreva("Bom dia Sr. "+nomePessoa+" sua idade aproximada é "+idade+" anos e você é considerado idoso")
			}
			
		}
		senao se (sexoPessoa =='m')
		{
			se (idade <17)
			{
				escreva("Bom dia "+nomePessoa+" sua idade aproximada é "+idade+" anos e você é considerado jovem")
			}
			senao se (idade <59)
			{
				escreva("Bom dia "+nomePessoa+" sua idade aproximada é "+idade+" anos e você é considerado adulto")
			}
			senao
			{
				escreva("Bom dia Sr. "+nomePessoa+" sua idade aproximada é "+idade+" anos e você é considerado idoso")
			}		
		}
		senao se (sexoPessoa =='F')
		{
			se (idade <17)
			{
				escreva("Bom dia "+nomePessoa+" sua idade aproximada é "+idade+" anos e você é considerada jovem")
			}
			senao se (idade <59)
			{
				escreva("Bom dia "+nomePessoa+" sua idade aproximada é "+idade+" anos e você é considerada adulta")
			}
			senao
			{
				escreva("Bom dia Sra. "+nomePessoa+" sua idade aproximada é "+idade+" anos e você é considerada idosa")
			}	
		}
		senao se (sexoPessoa =='f')
		{
			se (idade <17)
			{
				escreva("Bom dia "+nomePessoa+" sua idade aproximada é "+idade+" anos e você é considerada jovem")
			}
			senao se (idade <59)
			{
				escreva("Bom dia "+nomePessoa+" sua idade aproximada é "+idade+" anos e você é considerada adulta")
			}
			senao
			{
				escreva("Bom dia Sra. "+nomePessoa+" sua idade aproximada é "+idade+" anos e você é considerada idosa")
			}
		}
		senao
		{
			se (idade <17)
			{
				escreva("Bom dia "+nomePessoa+" sua idade aproximada é "+idade+" anos e você é consideradx jovem")
			}
			senao se (idade <59)
			{
				escreva("Bom dia "+nomePessoa+" sua idade aproximada é "+idade+" anos e você é consideradx adultx")
			}
			senao
			{
				escreva("Bom dia Srx. "+nomePessoa+" sua idade aproximada é "+idade+" anos e você é consideradx idosx")
			}	
		}
		escreva("\nFIM DE PROGRAMA!!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2603; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */