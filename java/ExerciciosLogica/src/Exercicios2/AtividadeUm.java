package Exercicios2;

import java.util.Scanner;

public class AtividadeUm 
{

	//[1]Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
	
	public static void main(String[] args) 
	
	{
		//KEY
		Scanner leia = new Scanner(System.in);
		
		//VAR
		int[] inteiro = {0,0,0};

			System.out.println("\tPROGRAMA [1]\n");
		
		//INPUT
		for(int x=0;x<3;x++)
		{
			System.out.print("\tDigite o n�mero (" + (x+1) + "):");
			inteiro[x] = leia.nextInt();
		}
			
		//OUTPUT
			if(inteiro[0] >= inteiro[1] && inteiro[0] >= inteiro[2])
			{	
				System.out.println("\t\tRESULTADO\n");
				System.out.println("\tO maior n�mero �: " + inteiro[0]);
			}
			
			else if(inteiro[1] >= inteiro[0] && inteiro[1] >= inteiro[2])
			{
				System.out.println("\n\t\tRESULTADO\n");
				System.out.println("\tO maior n�mero �: " + inteiro[1]);
			}
			
			else if(inteiro[2] >= inteiro [0] && inteiro[2] >= inteiro[1])
			{
				System.out.println("\n\t\tRESULTADO\n");
				System.out.println("\tO maior n�mero �: " + inteiro[2]);
			}
	}

}
