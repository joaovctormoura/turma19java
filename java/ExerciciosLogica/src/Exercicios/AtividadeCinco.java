package Exercicios;
/* 5 - Sistema que leia as 3 notas de um aluno e calcule a sua média ponderada final. 
//Considerando que os pesos das notas são: 2,3 e 5, respectivamente.
 */

import java.util.Scanner;

public class AtividadeCinco 
{

	public static void main(String[] args) 
	{
	
	//TECLADO
	Scanner leia = new Scanner(System.in);
	
					//VARIAVEIS
					String nome;
					double prova1;
					double prova2;
					double prova3;
					double mediaFinal;
					
										//INPUT
										System.out.println("Olá, qual o seu nome? ");
										nome = leia.next();
										System.out.println("Certo, digite a nota da primeira prova: ");
										prova1 = leia.nextDouble();
										System.out.println("Agora, digite a nota da segunda prova: ");
										prova2 = leia.nextDouble();
										System.out.println("Por último, digite a nota da terceira prova: ");
										prova3 = leia.nextDouble();
										
					//PROCESSANDO
					mediaFinal = ((prova1 * 2) + (prova2 * 3) + (prova3 * 5))/(2 + 3 + 5);
					
										//OUTPUT
										System.out.println(nome + ", sua média final foi " + mediaFinal + ", parabéns! :)");
					
	}
}