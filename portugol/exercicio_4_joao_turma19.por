programa
{
	inclua biblioteca Matematica --> Mat
	
//Um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão:
//D = R+S/2

	
 funcao inicio ()
 {
		
		real A
		real B
		real C
		real D
		real R
		real S
		
//Input

						escreva("Olá, insira o valor de A: ")
						leia(A)
						escreva("Agora, insira o valor de B: ")
						leia(B)
						escreva("Por último, insira o valor de C: ")
						leia(C)

//Processando os Dados

						R = Mat.potencia((A+B),2)
						S = Mat.potencia((B+C),2)

						D = (R+S)/2

//Output

						escreva("Segundo os cálculos, o valor de de D é: " + D)
						
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */