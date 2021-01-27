programa
{
	
	funcao inicio()
	{
		// SO PAGO IMPOSTO
		// RECEBE O SALARIO DE UMA PESSOA
		// RECEBE O NOME DESSA PESSOA
		// BASEADO NO SALARIO VAI RESPONDE:
		// SALARIO ATÉ 1.100(INCLUSIVE) REAIS ISENTO
		// SALARIO MAIOR QUE 1.100 E (INCLUSIVE) 3.500 - 9% IMPOSTO (VALOR DO IMPOSTO E O SALARIO FINAL)
		// SALARIO MAIOR QUE 3.500 E (INCLUSIVE) 10.000 - 15% IMPOSTO (MESMA REGRA DE EXIBIÇÃO)
		// SALARIOS ACIMA DE 10.000 PAGAM 27% IMPOSTO (MOSTRE IGUAL)
		// DETALHE - TRATAR COMO SENHOR OU SENHORA
		 real salarioBruto = 0.00
		 cadeia nome
		 real imposto1
		 real imposto2
		 real imposto3
		 caracter sexo
		 real salarioLiquido1
		 real salarioLiquido2
		 real salarioLiquido3

		escreva ("Digite seu nome: ")
		leia(nome)
		escreva ("Se for do sexo Masculino digite (M) se for Feminino digite (F): ")
		leia(sexo)
		escreva ("Digite seu Salario Bruto: ")
		leia(salarioBruto)
		
		imposto1 = salarioBruto * 0.09
		salarioLiquido1 = salarioBruto - imposto1
		imposto2 = salarioBruto * 0.15
		salarioLiquido2 = salarioBruto - imposto2
		imposto3 = salarioBruto * 0.27
		salarioLiquido3 = salarioBruto - imposto3
		

		se (sexo == 'M' ou sexo == 'm')
		{
			se (salarioBruto <=1100)
			{
				escreva ("O Sr. está isento dos Impostos!!")
			}
			senao se(salarioBruto <=3500)
			{
				escreva ("O Imposto do Sr. ficou em: R$"+ imposto1 + " e Seu Salario Liquido ficou em: R$" + salarioLiquido1)
			}	
			senao se (salarioBruto <= 10000)
			{
				escreva ("O Imposto do Sr. ficou em: R$"+ imposto2 + " e Seu Salario Liquido ficou em: R$" + salarioLiquido2)				
			}
			senao se (salarioBruto > 10000)
			{
				escreva ("O Imposto do Sr. ficou em: R$"+ imposto3 + " e Seu Salario Liquido ficou em: R$" + salarioLiquido3)				
			}
		}
		senao se (sexo == 'F' ou sexo == 'f')
		{
			se (salarioBruto <=1100)
			{
				escreva ("O Sra. está isento dos Impostos!!")
			}
			senao se(salarioBruto <=3500)
			{
				escreva ("O Imposto da Sra. ficou em: R$"+ imposto1 + " e Seu Salario Liquido ficou em: R$" + salarioLiquido1)
			}	
			senao se (salarioBruto <= 10000)
			{
				escreva ("O Imposto da Sra. ficou em: R$"+ imposto2 + " e Seu Salario Liquido ficou em: R$" + salarioLiquido2)				
			}
			senao se (salarioBruto > 10000)
			{
				escreva ("O Imposto da Sra. ficou em: R$"+ imposto3 + " e Seu Salario Liquido ficou em: R$" + salarioLiquido3)				
			}
		}
		se (sexo == 'X' ou sexo == 'x')
		{
			se (salarioBruto <=1100)
			{
				escreva ("O Srx. está isento dos Impostos!!")
			}
			senao se(salarioBruto <=3500)
			{
				escreva ("O Imposto de Srx. ficou em: R$"+ imposto1 + " e Seu Salario Liquido ficou em: R$" + salarioLiquido1)
			}	
			senao se (salarioBruto <= 10000)
			{
				escreva ("O Imposto de Srx. ficou em: R$"+ imposto2 + " e Seu Salario Liquido ficou em: R$" + salarioLiquido2)				
			}
			senao se (salarioBruto > 10000)
			{
				escreva ("O Imposto de Srx. ficou em: R$"+ imposto3 + " e Seu Salario Liquido ficou em: R$" + salarioLiquido3)				
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1751; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */