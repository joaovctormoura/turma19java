package Exercicios3;

import java.util.Scanner;

public class AtividadeCinco 
{
	
	/*[5](DO...WHILE) Crie um programa que leia um n�mero do teclado at� que encontre um
	n�mero igual a zero. No final, mostre a soma dos n�meros digitados.*/	
	
	public static void main(String[] args) 
	{

		//KEY
		Scanner leia = new Scanner(System.in);
		
		//VAR
		int num;
		int soma = 0;
		
		System.out.println("\n\tPROGRAMA [5] (DO...WHILE)\n");
		
						//INPUT
						do 
						{
							System.out.print("Digite um n�mero: ");
							num = leia.nextInt();
							
							soma += num;
						}
						while(num != 0);
										
						//OUTPUT
						System.out.println("\n\tRESULTADO");
						System.out.println("A soma dos n�meros foi " + soma);
	}

}
