programa
{
// 7 - Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y.
	
	funcao inicio()
	{	
		real a
		real b
		real c
		real d
		real er
		real f 
		real x
		real y


//Input		 
					escreva("Insira o valor de a: ")
					leia(a)
					escreva("Insira o valor de b: ")
					leia(b)		
					escreva("Insira o valor de c: ")
					leia(c)
					escreva("Insira o valor de d: ")
					leia(d)
					escreva("Insira o valor de e: ")
					leia(er)
					escreva("Insira o valor de f: ")
					leia(f)


//Processando os Dados
		x = c*er - b*f/a*er - b*d
		y = a*f - c*a/ a*er - b*d
		
		
		b = c/a*x + y
		c = a*x + b*y
		d = f/x + er*y
		er = f/d*x + y
		f = d*x + er*y

		
//Output
					escreva("Sendo assim, o valor de x é " + x + " e o valor de y é " + y + ".")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 18; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */