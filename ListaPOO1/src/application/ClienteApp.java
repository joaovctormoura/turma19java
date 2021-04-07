package application;

import java.util.Scanner;

import entity.Cliente;

public class ClienteApp 
{

	public static void main(String[] args) 
	{	Scanner leia = new Scanner (System.in);
		Cliente pessoa1 = new Cliente ();
		
		System.out.println("Me diga quem é você:");
		System.out.print("\nQual o seu nome? ");
		pessoa1.nome = leia.nextLine().toUpperCase();
		System.out.print("Qual ano você nasceu? ");
		pessoa1.anoNascimento = leia.nextInt();
		System.out.print("Qual a sua altura, em metros? ");
		pessoa1.altura = leia.nextDouble();
		System.out.println("A partir de qual pronome podemos lhe chamar?");
		System.out.print("1.neutro 2.feminino 3.masculino ");
		pessoa1.genero = leia.next().charAt(0);
		
		
		System.out.println("\nConheça você:\n");
		System.out.printf("Seu nome é: %s\n", pessoa1.nome);
		System.out.printf("Você tem: %d anos\n", pessoa1.idade(pessoa1.anoNascimento));
		System.out.printf("Sua altura é: %.2fM\n", pessoa1.altura);
		pessoa1.tratamento(pessoa1.genero);

		
	}

}
