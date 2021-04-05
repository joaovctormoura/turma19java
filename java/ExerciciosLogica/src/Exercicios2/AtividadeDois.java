package Exercicios2;

import java.util.Scanner;

public class AtividadeDois 
{

	//[2]Faça um programa que entre com três números e coloque em ordem crescente.
	
	public static void main(String[] args)
	
	{
		//KEY
		Scanner leia = new Scanner(System.in);
				
		//VAR
		double[] num = {0,0,0};

					System.out.println("\tPROGRAMA [2]\n");
				
		//INPUT
		for(int x=0;x<3;x++)
		{
		System.out.print("\tDigite o número (" + (x+1) + "):");
		num[x] = leia.nextDouble();
		}
		
		//OUTPUT
			
			//primeiro numero maior:
			if(num[0]>num[1] && num[1]>num[2])
			{
				System.out.println("\n\t\tA ORDEM É:");
				System.out.println("\t" + num[2] + " | " + num[1] + " | " + num[0]);
			}
			
				else if(num[0]>num[2] && num[0]>num[1])
				{
					System.out.println("\n\t\tA ORDEM É: ");
					System.out.println("\t" + num[1] + " | " + num[2] + " | " + num[0]);
				}
			
			//segundo numero maior:
			else if(num[1]>num[0] && num[0]>num[2])
			{
				System.out.println("\n\t\tA ORDEM É: ");
				System.out.println("\t" + num[2] + " | " + num[0] + " | " + num[1]);
			}
				
				else if(num[1]>num[2] && num[2]>num[0])
				{
					System.out.println("\n\t\tA ORDEM É: ");
					System.out.println("\t" + num[0] + " | " + num[2] + " | " + num[1]);
				}
			
			//terceiro numero maior:
			else if(num[2]>num[0] && num[0]>num[1])
			{
				System.out.println("\n\t\tA ORDEM É: ");
				System.out.println("\t" + num[1] + "|" + num[0] + "|" + num[2]);
			}
			
				else if(num[2]>num[1] && num[1]>num[0])
				{
					System.out.println("\n\t\tA ORDEM É: ");
					System.out.println("\t" + num[0] + " | " + num[1] + " | " + num[2]);
				}
			
	}

}
