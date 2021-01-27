programa
{
	
	funcao inicio()
	{
		
		const inteiro HABITANTES = 5
		real salario = 0.00
		inteiro numeroFilhos = 0
		real mediaSalario = 0.00
		real mediaFilhos = 0.00
		real maiorSalario = 0.00
		real percentualSalario100 = 0.00		
		real totalSalario = 0.00
		inteiro totalFilhos = 0
		real contadorValor100 = 0 

		

		para (inteiro giro=1; giro<=HABITANTES; giro++) 
		{
			escreva ("Digite o salario do habitante "+ giro + " :")
			leia (salario)
			escreva ("Digite o numero de filhos deste habitante: ")
			leia (numeroFilhos)
			totalSalario += salario
			totalFilhos += numeroFilhos
			se(salario > maiorSalario)
			{
				maiorSalario = salario
			}
			se(salario <= 100)
			{
				contadorValor100++
			}
			
		}
		mediaSalario = totalSalario / HABITANTES
		mediaFilhos = totalFilhos / HABITANTES
		percentualSalario100 = (contadorValor100 / HABITANTES) * 100
		escreva ("A media salarial é: R$ ",mediaSalario,"\n")
		escreva ("A media salarial é: R$ ",mediaFilhos,"\n")
		escreva ("O maior salario informado foi: ",maiorSalario,"\n")
		escreva ("Numero de pessoas que ganham até R$ 100 = ", 	contadorValor100, " sendo um percentual total de :", percentualSalario100,"%\n")
		escreva ("Obrigado pela ajuda! Fim do Programa!!")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1127; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */