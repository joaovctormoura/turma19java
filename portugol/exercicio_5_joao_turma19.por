programa {
//Sistema que leia as 3 notas de um aluno e calcule a sua média ponderada final. 
//Considerando que os pesos das notas são: 2,3 e 5, respectivamente.

	funcao inicio() {

//Variáveis 
		  cadeia nome
	       real prova1 
		  real prova2
		  real prova3
		  real mediaFinal
		 
									
//Coletando os dados
					escreva("Olá, qual o seu nome? ")
					leia(nome)
					escreva("Olá, Digite a nota da primeira prova ")
					leia(prova1)
					escreva("Agora, digite a nota da segunda prova ")
					leia(prova2)
					escreva("Por fim, digite a nota da terceira prova ")
					leia(prova3)


//Processando os dados 				
 					mediaFinal = ((prova1 * 2) + (prova2 * 3) + (prova3 * 5))/(2 + 3 + 5) 

			 
//Mensagem ao usuário
		    			escreva(nome + ", sua média final foi " + mediaFinal + ", parabéns! :)")
		        
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 812; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */