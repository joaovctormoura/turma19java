package Exercicios;

import java.util.Scanner;

/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
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
									System.out.println("Olá, em segundos, escreva a duração do evento: ");
									segundos = leia.nextDouble();
								
	//PROCESSANDO
	horas = segundos/3600;
	minutos = segundos/60;
	segundos = 3600*horas;
			
									//OUTPUT
									System.out.println("Segundo os cálculos, o evento durará ("+ horas + ") horas , (" + minutos + ") minutos %,0f e (" + segundos + ") segundos.");
	
	}
}
