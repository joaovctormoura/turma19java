package Exercicios3;

import java.util.Scanner;

public class AtividadeTres 
{
	/*[3] (WHILE) Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
	21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	idade for =-99. */
	
	public static void main(String[] args) 
	{

	//KEY
	Scanner leia = new Scanner (System.in);
		
	int idade = 0, menor21 = 0, maior50 = 0;
	
	
	System.out.println("\n\tPROGRAMA [3] (WHILE)\n");
	
	
					//INPUT	
					while(idade != -99)
					{
						
					System.out.print("Informe a idade:");
					idade= leia.nextInt();
							
								if(idade<21 && idade!=-99)
								{
									menor21++;
								}
								else if(idade>50 && idade!=-99)
								{
									maior50++;
								}
					}
					
					System.out.println("\n\tRESULTADO");
					
					System.out.println("Total de pessoas com menos de 21 anos (" + menor21 + ")");
					System.out.println("Total de pessoas com mais de 50 anos (" + maior50 + ")");
	}

	static void linha()
	{
		System.out.println("---------------------------------------------------");
	}
}
