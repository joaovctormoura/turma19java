package Exercicios;

import java.util.Scanner;

/* 4 - Um sistema que leia tr�s n�meros inteiros e positivos (A, B, C)
 * e calcule a seguinte express�o: D = R+S/2
 */

public class AtividadeQuatro 
{

	public static void main(String[] args) 
	{
	
	//TECLADO
	Scanner leia = new Scanner (System.in);
	
						//VARIAVEIS
						double A;
						double B;
						double C;
						double D;
						double R;
						double S;
						
										//INPUT
										System.out.println("Ol�, insira o valor de A:  ");
										A = leia.nextDouble();
										System.out.println("Agora, insira o valor de B: ");
										B = leia.nextDouble();
										System.out.println("Por �ltimo, insira o valor de C: ");
										C = leia.nextDouble();
										
	//PROCESSANDO
	R = Math.pow((A+B),2);
	S = Math.pow((B+C),2);
	D = (R+S)/2;
						
										//OUTPUT
										System.out.println("Segundo os c�lculos, o valor de de D �: " + D);
		
	}
}
