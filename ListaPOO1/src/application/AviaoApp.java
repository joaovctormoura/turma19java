package application;

import java.util.Scanner;

import entity.Aviao;
import entity.Cliente;

public class AviaoApp 
{
	public static void main(String[] args) 
	{
	Scanner leia = new Scanner (System.in);
	Aviao aviao1 = new Aviao ();
	
	System.out.println("Me diga como é o seu avião:");
	System.out.print("\nQual o modelo? ");
	aviao1.modelo = leia.nextLine().toUpperCase();
	System.out.print("Qual o comprimento, em metros? ");
	aviao1.tamanho = leia.nextDouble();
	
	System.out.println("\nConheça seu avião:\n");
	System.out.printf("Modelo: %s \n", aviao1.modelo);
	System.out.printf("Comprimento: %.1f metros \n", aviao1.tamanho);
	aviao1.porte (aviao1.tamanho);
	System.out.printf("Capacidade: Até %.0f pessoas", aviao1.capacidade(aviao1.tamanho));
	}
}
