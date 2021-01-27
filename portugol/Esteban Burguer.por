programa
{
	inclua biblioteca Matematica --> math
	inclua biblioteca Util --> u

		const inteiro qntdItens = 10

		cadeia produtO[qntdItens] = {"Misto-Quente","Americano","X-Burguer","X-Salada","X-Bacon","X-Egg","X-BaconEgg","X-Frango","X-FrangoEgg","X-TUDO"}
		real precO[qntdItens] = {4.0,5.0,6.5,7.0,8.0,6.5,9.0,7.0,8.0,12.5}
		inteiro ID = 0, qntd = 0
		real total = 0.0
		inteiro carrinhO[qntdItens], estoquE[qntdItens]
		inteiro opcao = 0
		cadeia tratamento = ""
		cadeia nome = ""
	
	funcao inicio()
	{
		se (opcao == 0)
		{
			para (inteiro i=0; i<qntdItens; i++)
			{
				estoquE[i] = 10
			}

			opcao = menu(tratamento,nome)
		}
		escolha (opcao)
		{
			caso 1:
			cadastro()
			pare

			caso 2:
			produtos()
			pare

			caso 3:
			carrinho()
			pare

			caso contrario:
			limpa()
			escreva("Opção invalida!\n\nTente novamente. ")
			u.aguarde(3000)
			inicio()
			
		}
	}
	funcao inteiro menu(cadeia tratamento1, cadeia nome1)
	{
		cadeia virgula =""
		
		se(tratamento!=""){
			virgula = ","
		}
		
		escreva ("Bem Vindo ao Estebann Burguer!!\n",
		"Antes de escolher seu produto Por Favor faça seu cadastro clicando no numero-1:\n",
		"Caso querira apenas ver o cardapio clique no botão-2:\n",
		"Caso queira ver o carrinho clique no botão-3:",
		"\nInsira o numero Aqui: ")
		leia(opcao)

		retorne opcao
		
	}
	funcao cadastro()
	{
		
		caracter sexo

		para(inteiro i=0;i<qntdItens;i++)
			{
				estoquE[i] += carrinhO[i] 
				carrinhO[i] = 0
				total = 0.0
			}	
		
		escreva("\n\nInsira o seu nome: ")
		leia(nome)
		escreva("Insira o seu sexo (F/M): ")
		leia(sexo)
		
		se(sexo=='M' ou sexo=='m')
		{
			tratamento = "Sr. "
		}
		senao se(sexo=='F' ou sexo=='f')
		{
			tratamento = "Sra. "
		}
		senao
		{
			tratamento = "Srx. "
		}
		
		u.aguarde(1000)
		limpa()
		escreva("cadastro concluido!")
		u.aguarde(2000)
		inicio()
	}
	
	funcao produtos()
	{
		total = 0.0
		
		limpa()
		
		escreva("\n\n\tID\t\tPreço\t    Carrinho        Estoque   \tProduto\t\n")
					
		para(inteiro i=0;i<qntdItens;i++)
		{
			escreva("\t",(i+1),"\t\t",precO[i],"\t\t",carrinhO[i],"\t\t",estoquE[i],"\t\t",produtO[i],"\n")
			se (carrinhO[i] != 0)
			{
			total += carrinhO[i]*precO[i]
			}
		}
		
		escreva("\nTotal Geral: ",math.arredondar(total, 2),"\n")
		
		
		escreva("\nPor favor, insira o ID do produto que deseja comprar:\n",
		"[Caso deseje voltar para o menu, insira 0 (Zero)]."," Insira aqui: ")
		leia(ID)

		se(ID == 0)
		{
			u.aguarde(1000)
			limpa()
			escreva("Voltando...")
			u.aguarde(1500)
			inicio()	
		}
		senao se (ID > qntdItens ou ID < 0)
		{
			escreva("\ncaracter invalido!\nTente novamente.")
			u.aguarde(2000)
			produtos()
		}
		senao se (estoquE[ID-1] == 0){
			escreva("\nSinto muito!\nEste produto esta sem estoque, selecione outro produto")
			u.aguarde(5000)
			produtos()
		}

				
		escreva("\nQuantos(",produtO[ID-1],") você deseja?: ")
		leia(qntd)
	
		se (qntd > estoquE[ID-1]){
			escreva("\nInfelizmente só temos ",estoquE[ID-1]," unidades de ",produtO[ID-1]," em estoque.",
			"\nEscolha outro produto ou selecione uma quantidade menor para este produto")
			u.aguarde(8000)
			produtos()
			}
		senao se (qntd <= 0){
			escreva("\nQuantidade invalida!\nEscolha outro produto.")
			u.aguarde(2000)
			produtos()
		}	
		
		estoquE[ID-1] -= qntd
		carrinhO[ID-1] += qntd

		faca
		{
		limpa()
		escreva("Foram adicionadas ",carrinhO[ID-1]," ",produtO[ID-1]," ao seu carrinho!",
		"\nVocê deseja continuar comprando?\n1. Sim\n2. Não\n\nInsira aqui: ")
		leia(opcao)
		se(opcao!=1 e opcao!=2)
		{
			limpa()
			escreva("Opção invalida!")
			u.aguarde(1000)
			limpa()
		}
		}enquanto (opcao!=1 e opcao!=2)

		se (opcao==1)
		{
			produtos()
		}
		senao
		{
			carrinho()
		}
	}
	funcao carrinho()
	{
		limpa()
		caracter efetuarCompra
		cadeia formaPagamento = ""
		real totalPagar = 0.0
		total = 0.0
		inteiro verificaCarrinho = 0
		
		

		para(inteiro i=0;i<qntdItens;i++)
		{
			se (carrinhO[i] == 0){
				verificaCarrinho++
			}
			se(verificaCarrinho == qntdItens){
				escreva("\n\nO Carrinho esta vazio")
				total = 0.0
				u.aguarde(2000)
				inicio()
			}
		}
		
		escreva("\n\n\tID\t\tPreço\t    Carrinho   \tProduto\t\n")
		
					
		para(inteiro i=0;i<qntdItens;i++)
		{
			se (carrinhO[i] != 0){
			escreva("\t",(i+1),"\t\t",precO[i],"\t\t",carrinhO[i],"\t\t",produtO[i],"\n")
			total += carrinhO[i]*precO[i]
			}
		}
		escreva  ("\nTotal Geral: ",math.arredondar(total, 2)," - IMPOSTO (9%): ",math.arredondar((total*0.09), 2),"\n")
		escreva(	"\nEscolha a forma de pagamento\n",
				"\n0. DESISTIR DA COMPRA",
				"\n1. A VISTA - 10% DESCONTO: ",(math.arredondar((total*0.9), 2)),
				"\n2. CARTÃO - 1 VEZ: ",math.arredondar((total), 2)," - SEM DESCONTO",
				"\n3. CARTÃO - 2 VEZES - JUROS (10%) - PARCELAS DE: ",math.arredondar((total*1.1/2), 2)," - TOTAL DE: ",math.arredondar((total*1.1), 2),
				"\n4. CARTÃO - 3 VEZES - JUROS (15%) - PARCELAS DE: ",math.arredondar((total*1.15/3), 2)," - TOTAL DE:",math.arredondar((total*1.15), 2),
				"\n\nInsira Aqui: ")
		leia(opcao)

		se(opcao == 0){
			para(inteiro i=0;i<qntdItens;i++)
			{
				estoquE[i] += carrinhO[i] 
				carrinhO[i] = 0
				total = 0.0
			}
			inicio()
		
		}
		senao se(opcao == 1){
			formaPagamento = "A VISTA"
			totalPagar = math.arredondar((total*0.9), 2)
		}
		senao se(opcao == 2){
			formaPagamento = "1 VEZ NO CARTÃO"
			totalPagar = math.arredondar((total), 2)
		}
		senao se(opcao == 3){
			formaPagamento = "2 VEZES NO CARTÃO"
			totalPagar = math.arredondar((total*1.1), 2)
		}
		senao se(opcao == 4){
			formaPagamento = "3 VEZES NO CARTÃO"
			totalPagar = math.arredondar((total*1.15), 2)
		}senao{
			escreva("\ncaracter invalido!\nTente novamente")
			u.aguarde(2000)
			carrinho()
		}
		
		escreva("\nVocê deseja efeturar a compra na opção ",formaPagamento," no valor de ",totalPagar,"? (S/N): ")
		leia(efetuarCompra)

		se(efetuarCompra=='S' ou efetuarCompra=='s')
		{
			limpa()
			escreva("Compra efetuada com sucesso!")
			u.aguarde(1500)
			limpa()
			escreva("VALOR DO IMPOSTO (9%): ",math.arredondar((total*0.09), 2),"\n\n")
			escreva("Carrinho\tPreço\tProduto\n")
			para(inteiro i=0;i<qntdItens;i++){
				se (carrinhO[i] != 0){
				escreva(carrinhO[i],"\t\t",(precO[i]*carrinhO[i]),"\t",produtO[i],"\n")
				}
			}

			escreva(	"\nTotal: ",total,
					"\nForma de pagamento: ",formaPagamento,
					"\nTotal a pagar: ",totalPagar,"\n",
					"\nVolte sempre!")
			u.aguarde(10000)
			
			para(inteiro i=0;i<qntdItens;i++)
			{
				carrinhO[i] = 0
			}
			inicio()
		}
		senao se(efetuarCompra=='N' ou efetuarCompra=='n')
		{
			carrinho()
		}
		senao
		{
			escreva("\ncaracter invalido!\nTente novamente")
			u.aguarde(2000)
			carrinho()
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1265; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */