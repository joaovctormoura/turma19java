programa
{//Sistema que leia a idade de uma pessoa expressa em anos, meses e dias E mostre-a expressa apenas em dias.


	funcao inicio()
	{
			inteiro idade
			inteiro ano
			inteiro mes
			inteiro dia
			inteiro quantidadeDias
			
//Input
		
					escreva("Olá! primeiramente, informe a sua idade ")
					leia(idade)
					escreva("Agora, informe, numericamente, o mês do seu nascimento  ")
					leia(mes)
					escreva("Ok, por último, me diga o dia do seu aniverário ")
					leia(dia)

					
//Processando os Dados
			quantidadeDias = idade*365 + mes*30 + dia*1 

			
//Output
					escreva("Pronto, segundo os meus cálculos você já viveu " + quantidadeDias + " dias :)")
					
					
					
					

					
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 576; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */