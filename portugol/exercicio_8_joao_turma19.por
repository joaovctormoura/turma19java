programa
{
//Escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor.
	
	funcao inicio()
	{	
//tipagem de dados/variáveis		
		real custoFabrica = 0.00
		real custoConsumidor = 0.00
	


//Input
					escreva("Olá, em reais, insira o custo de fábrica do automóvel: ")
					leia(custoFabrica)
				

//Processando os d ados:
					custoConsumidor = ((custoFabrica) + (custoFabrica*0.45) + (custoFabrica*0.28))
					
					
		
//Output
					escreva("O custo do automóvel ao consumidor é de R$" + custoConsumidor)
					
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 378; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */