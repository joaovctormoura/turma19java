package Exercicios2;

import java.util.Scanner;

public class AtividadeQuatro 
{

	/*[4]Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
	n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
	�mpar exiba o n�mero elevado ao quadrado.*/
	
	public static void main(String[] args) 
	{

		//KEY
		Scanner leia = new Scanner(System.in);
								
			//VAR
			float num;

				System.out.println("\tPROGRAMA [4] \n");
				
			//INPUT
				System.out.print("\tInforme um n�mero qualquer:");
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
			System.out.println("\tO n�mero " + n + " � par.");
			System.out.printf("\tSua raiz quadrada �: %.0f", Math.sqrt(n));
		}
		
		else if(mod != 0)
		{
			System.out.println("\tO n�mero escolhido � impar.");
			System.out.printf("\tSeu valor ao quadrado �: %.1f", Math.pow(n,2));
		}
	}

}
