package Exercicios3;

import java.util.Scanner;

public class AtividadeDois 
{

	//[2] (FOR) Ler 10 números e imprimir quantos são pares e quantos são ímpares. 
	
	public static void main(String[] args) 
	
	{
		//KEY
		Scanner leia = new Scanner(System.in);
		
		//VAR
		int[] num = {0,0,0,0,0,0,0,0,0,0};
		int qntPar = 0;
		int qntImpar = 0;
		
		System.out.println("\n\tPROGRAMA [2] (FOR)\n");
						
						//INPUT
						for(int x=0;x<10;x++)
						{
							System.out.print("Informe o número (" + (x+1) + "):");
							num[x] = leia.nextInt();
							
							if (num[x]%2 == 0)
							{
								qntPar++;
							}
							
							else if (num[x]%2 != 0)
							{
								qntImpar++;
							}
							
						}
						
						//OUTPUT
							System.out.println("\n\tRESULTADO");
							System.out.println("Quantidade de pares: " + qntPar);
							System.out.println("Quantidade de impares: " + qntImpar);
	}

}
