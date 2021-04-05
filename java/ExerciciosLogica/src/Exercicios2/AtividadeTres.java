package Exercicios2;

import java.util.Scanner;

public class AtividadeTres
{

	/*[3]Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
	categoria ela se encontra:*/
	
	public static void main(String[] args) 
	{

		//KEY
		Scanner leia = new Scanner(System.in);
						
		//VAR
		int idade;

			System.out.println("\tPROGRAMA [3] \n");
			
			System.out.print("\tInforme a sua idade: ");
			idade = leia.nextInt();
			
					if (idade >= 10 && idade <= 14)
					{
						System.out.println("\tCategoria Infantil");
					}
					
					else if (idade >= 15 && idade <= 17)
					{
						System.out.println("\tCategoria Juvenil");
					}

					else if(idade >= 18 && idade <=25)
					{
						System.out.println("\tCategoria Adulta");
					}
					
					else if(idade < 10 || idade>25)
					{
						System.out.println("Sua idade não foi categorizada em nosso sistema.");
					}
					
	}

}
