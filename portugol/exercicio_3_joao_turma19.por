programa
{
//Sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos.
	
	funcao inicio()
	{

		real horas
		real minutos
		real segundos

//Coletando os Dados

					escreva("Olá, em segundos, escreva a duração do evento ")
					leia(segundos)

//Processando os Dados

			horas = segundos/3600
			minutos = segundos/60
			segundos = 3600*horas

//Revelando os Dados ao usuário
			
					escreva("Segundo os cálculos, o evento durará " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 482; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */