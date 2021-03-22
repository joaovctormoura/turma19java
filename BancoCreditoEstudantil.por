programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{


//Variáveis
			real limiteEstudantil=0.00
			real saldo = 5000
			real valorMovimentado = 0.00
			caracter opcao
			
			
						
//Entrada					
						para(inteiro m=0; m<2; m++) //m = movimentação
						{			
									limpa()
									escreva("Grupo1 \n")
									escreva("Slogan \n")
			
									escreva("\nConta: Estudantil\n")
			
									escreva("\nSaldo Atual R$:" + saldo)
								
										
									escreva("\nMovimento \n (D) Débito ou (C) Crédito \n")

	
								faca
								{	leia(opcao)						
									escreva("\nPor favor, insira uma opção válida")
									escreva("\n (D) Débito ou (C) Crédito \n")
								
									
								}enquanto (opcao != 'D' e opcao != 'd' e opcao != 'c' e opcao != 'C')
								
									limpa()
									se(opcao == 'd' ou opcao == 'D')
									{
										escreva("\nValor do movimento em débito R$: ")
										leia(valorMovimentado)
										
									}
			
									senao se(opcao == 'c' ou opcao == 'C')
									{
										
										escreva("\nValor do movimento em crédito R$: ")
										leia(valorMovimentado)
										
										//deseja continuar?
	
									}

									
									saldo -= valorMovimentado
		
									
										
						}
									limpa()
									escreva ("Deseja um empréstimo de R$5000?")
									escreva ("\n (S)Sim (N)Nao \n")
									
									faca
									{	
									leia(opcao)						
									escreva("\nPor favor, insira uma opção válida")
									escreva("\n (S)Sim (N)Nao \n")
								
									
									}enquanto (opcao != 'S' e opcao != 's' e opcao != 'N' e opcao != 'n')

									


		
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1651; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */