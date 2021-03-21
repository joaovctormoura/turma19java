programa
{
	
	funcao inicio()
	{

//variaveis 	
			inteiro tratamento = 0.00
			inteiro rendaMensal
			real calculoImposto, salarioLiquido
			
			cadeia nome 
			

//input
			escreva("Olá, por favor, informe o seu nome \n")
			leia(nome) 
			limpa()
			escreva(nome, ",qual a sua identidade de gênero? \n 1-Masculino \n 2-Feminino \n 3-Neutro \n")
			leia(tratamento)
			limpa()
						
							
			
							se (tratamento == 1)
							{
								escreva("Senhor, informe a sua renda mensal bruta:\n")
								leia(rendaMensal)
								limpa()
				
									se (rendaMensal <=1200)
									{
										escreva("Parabens," + nome + "."+ "Você está isento de imposto de renda.")
									}
				
									senao se (rendaMensal> 1200 e rendaMensal<=2500)
									{	
										calculoImposto= rendaMensal*0.15
										salarioLiquido= (rendaMensal - calculoImposto)
										
										escreva(nome + ", com base na sua renda mensal, o senhor pagará 15% de imposto de renda,\n")
										escreva("sendo este, no valor de R$" + calculoImposto +",totalizando um salário de R$" + salarioLiquido + ".")
										escreva("\n \n \n \n \n")
									}
				
									senao se (rendaMensal> 2500 e rendaMensal<=5000)
									{	
										calculoImposto= rendaMensal*0.25
										salarioLiquido= (rendaMensal - calculoImposto)
										
										escreva(nome + ", com base na sua renda mensal, o senhor pagará 25% de imposto de renda,\n")
										escreva("sendo este, no valor de R$" + calculoImposto +",totalizando um salário de R$" + salarioLiquido + ".")
										escreva("\n \n \n \n \n")
									}
									senao se (rendaMensal> 5000)
									{	
										calculoImposto= rendaMensal*0.35
										salarioLiquido= (rendaMensal - calculoImposto)
										
										escreva(nome + ", com base na sua renda mensal, o senhor pagará 35% de imposto de renda,\n")
										escreva("sendo este, no valor de R$" + calculoImposto +", totalizando um salário de R$" + salarioLiquido + ".")
										escreva("\n \n \n \n \n")
										
									}
				
									senao 
									{
										escreva("Digite uma valor válido.")
									}
									
							}
							senao se (tratamento == 2)
							{
									escreva("Senhora, informe a sua renda mensal bruta:\n")
								leia(rendaMensal)
								limpa()
				
									se (rendaMensal <=1200)
									{
										escreva("Parabens," + nome + "."+ "Você está isenta de imposto de renda.")
									}
				
									senao se (rendaMensal> 1200 e rendaMensal<=2500)
									{	
										calculoImposto= rendaMensal*0.15
										salarioLiquido= (rendaMensal - calculoImposto)
										
										escreva(nome + ", com base na sua renda mensal, a senhora pagará 15% de imposto de renda,\n")
										escreva("sendo este, no valor de R$" + calculoImposto +",totalizando um salário de R$" + salarioLiquido + ".")
										escreva("\n \n \n \n \n")
									}
				
									senao se (rendaMensal> 2500 e rendaMensal<=5000)
									{	
										calculoImposto= rendaMensal*0.25
										salarioLiquido= (rendaMensal - calculoImposto)
										
										escreva(nome + ", com base na sua renda mensal, a senhora pagará 25% de imposto de renda,\n")
										escreva("sendo este, no valor de R$" + calculoImposto +",totalizando um salário de R$" + salarioLiquido + ".")
										escreva("\n \n \n \n \n")
									}
									senao se (rendaMensal> 5000)
									{	
										calculoImposto= rendaMensal*0.35
										salarioLiquido= (rendaMensal - calculoImposto)
										
										escreva(nome + ", com base na sua renda mensal, a senhora pagará 35% de imposto de renda,\n")
										escreva("sendo este, no valor de R$" + calculoImposto +",totalizando um salário de R$" + salarioLiquido + ".")
										escreva("\n \n \n \n \n")
										
									}
				
									senao 
									{
										escreva("Digite uma valor válido.")
									}	
							}
							senao se (tratamento == 3) 
							{
							
										escreva("Senhore, informe a sua renda mensal bruta:\n")
										leia(rendaMensal)
										limpa()
				
									se (rendaMensal <=1200)
									{
										escreva("Parabens," + nome + "."+ "Você está isente de imposto de renda.")
									}
				
									senao se (rendaMensal> 1200 e rendaMensal<=2500)
									{	
										calculoImposto= rendaMensal*0.15
										salarioLiquido= (rendaMensal - calculoImposto)
										
										escreva(nome + ", com base na sua renda mensal, senhore pagará 15% de imposto de renda,\n")
										escreva("sendo este, no valor de R$" + calculoImposto +",totalizando um salário de R$" + salarioLiquido + ".")
										escreva("\n \n \n \n \n")
									}
				
									senao se (rendaMensal> 2500 e rendaMensal<=5000)
									{	
										calculoImposto= rendaMensal*0.25
										salarioLiquido= (rendaMensal - calculoImposto)
										
										escreva(nome + ", com base na sua renda mensal, senhore pagará 25% de imposto de renda,\n")
										escreva("sendo este, no valor de R$" + calculoImposto +",totalizando um salário de R$" + salarioLiquido + ".")
										escreva("\n \n \n \n \n")
									}
									senao se (rendaMensal> 5000)
									{	
										calculoImposto= rendaMensal*0.35
										salarioLiquido= (rendaMensal - calculoImposto)
										
										escreva(nome + ", com base na sua renda mensal, senhore pagará 35% de imposto de renda,\n")
										escreva("sendo este, no valor de R$" + calculoImposto +",totalizando um salário de R$" + salarioLiquido + ".")
										escreva("\n \n \n \n \n")
										
									}
				
									senao 
									{
										escreva("Digite uma valor válido.")
									}
							}
							senao 
							{
								escreva("Digite um número válido")
							}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1936; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */