package Exercicios;

import java.util.Scanner;

/*3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.
 */

public class AtividadeTres 
{

	public static void main(String[] args) 
	{
		
	//TECLADO
	Scanner leia = new Scanner(System.in);
		
				//VARIAVEIS
				double horas;
				double minutos;
				double segundos;
			
									//INPUT
									System.out.println("Ol�, em segundos, escreva a dura��o do evento: ");
									segundos = leia.nextDouble();
								
	//PROCESSANDO
	horas = segundos/3600;
	minutos = segundos/60;
	segundos = 3600*horas;
			
									//OUTPUT
									System.out.println("Segundo os c�lculos, o evento durar� ("+ horas + ") horas , (" + minutos + ") minutos %,0f e (" + segundos + ") segundos.");
	
	}
}
