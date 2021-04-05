package Exercicios2;

import java.util.Scanner;

public class AtividadeQuatro 
{

	/*[4]Faça um programa em que permita a entrada de um número qualquer e exiba se este
	número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
	ímpar exiba o número elevado ao quadrado.*/
	
	public static void main(String[] args) 
	{

		//KEY
		Scanner leia = new Scanner(System.in);
								
			//VAR
			float num;

				System.out.println("\tPROGRAMA [4] \n");
				
			//INPUT
				System.out.print("\tInforme um número qualquer:");
				num = leia.nextFloat();				
			//OUTPUT
				
				System.out.println("\n\t\tRESULTADO\n");
				parOrImpar(num);
				
	}
	
	
	//FUNCOES
	static void parOrImpar (float n)
	{
		float mod = n%2;
		Math.sqrt(n);
		Math.pow(n,2);
		
		
		if(mod == 0)
		{
			System.out.println("\tO número " + n + " é par.");
			System.out.printf("\tSua raiz quadrada é: %.0f", Math.sqrt(n));
		}
		
		else if(mod != 0)
		{
			System.out.println("\tO número escolhido é impar.");
			System.out.printf("\tSeu valor ao quadrado é: %.1f", Math.pow(n,2));
		}
	}

}
