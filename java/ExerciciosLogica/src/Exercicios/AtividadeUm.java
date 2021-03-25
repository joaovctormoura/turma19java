package Exercicios;

/*1. Faça um sistema que leia a idade de uma pessoa expressa em 
 *anos, meses e dias e mostre-a expressa apenas em dias.
 */

import java.util.Scanner;

public class AtividadeUm 
{

	public static void main(String[] args) 
	{
	//TECLADO
	Scanner leia = new Scanner(System.in);
				
				
				//VARIAVEIS
				int idade;
				int mes;
				int dia;
				int resDias;
				
				
							//INPUT
							System.out.println("Informe a sua idade: ");
							idade = leia.nextInt();
							System.out.println("Informe o mês do seu nascimento: ");
							mes = leia.nextInt();
							System.out.println("Informe o dia do seu aniversário: ");
							dia = leia.nextInt();
				
	//PROCESSANDO
	resDias = (idade*365) + (mes*30) + dia;
				
							//OUTPUT
							System.out.println("Sua idade em dias é: (" + resDias +")");
				
							

	}

}
