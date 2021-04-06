package Exercicios3;

import java.util.Scanner;

public class AtividadeQuatro 
{
		/*[4] (WHILE) Uma empresa desenvolveu uma pesquisa para saber as características
		psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
		era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
		(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
		agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
		pessoas, calcule e mostre: 
		 o número de pessoas calmas;
		 o número de mulheres nervosas;
		 o número de homens agressivos;
		 o número de outros calmos;
		 o número de pessoas nervosas com mais de 40 anos;
		 o número de pessoas calmas com menos de 18 anos.*/
	
	public static void main(String[] args) 
	{

		//KEY
		Scanner leia = new Scanner(System.in);
	
	//VAR
	int analise = 0, idade = 0;
	char genero, emocional;
	int calmas = 0, mulheresNervosas = 0, homensAgressivos = 0, nbCalmes = 0, nervosesMaior40 = 0, calmesMenor18 = 0;
	
	System.out.println("\n\tPROGRAMA [4] (WHILE)\n");
		
	
		 while (analise < 150) 
		 {		
			 					//mensagem inicial
			 					System.out.println("\t\tANALISE (" + (analise+1) + ")");
			 
				 //IDADE	
			      System.out.print("\n(1) Por favor, informe a sua idade: ");
			      idade = leia.nextInt();
		      	
		      	//GENERO
			      do 
			      {
			      System.out.println("\n(2) Qual a sua identidade de gênero? ");
			      System.out.print("   [1]Masculino [2]Feminino [3]Não-Binarie ");
			      genero = leia.next().charAt(0);
			      		
				      		  //mensagem de erro
						      if(genero != '1' && genero !='2' && genero !='3')
						        {
						      	System.out.println("\nOpa! Você não digitou uma opção válida. \n Tente novamente!");
						        }
			      }
			      while (genero != '1' && genero !='2' && genero !='3');
			    	  
		      
			     //EMOCIONAL
			      do
			      {    
				      System.out.println("\n(3) Você se considera uma pessoa: ");
			      System.out.print("   [1]Calme [2]Nervose [3]Agressive ");
			      emocional = leia.next().charAt(0);
			      
						      //mensagem de erro
						      if(emocional != '1' && emocional !='2' && emocional !='3')
						        {
						      	System.out.println("Você não digitou uma opção válida. \n Tente novamente!");
						        }
				   }
			 	   while (emocional != '1' && emocional !='2' && emocional !='3');
			      
			      		if(emocional == '1')
			      		{
			      			calmas++;
			      			
			      			if(idade < 18)
			      			{
			      				calmesMenor18 ++;
			      			}
			      			
			      			if(genero == '3') 
			      			{
			      				nbCalmes ++;
			      			}
			      		}
			      		
			      		else if(emocional == '2')
			      		{
			      			if (idade> 40)
			      			{
			      				nervosesMaior40 ++;
			      			}
			      			
			      			else if (genero == '2')
			      			{
			      			mulheresNervosas ++;
			      			}
			      		}
			      		
			      		else if(emocional == '3')
			      		{
			      			if(genero == '1')
			      			{
			      				homensAgressivos ++;
			      			}
			      		}
			      		
			      				//mensagem final
			      				System.out.println("\n\n\t" + (1+analise) + "ª Pesquisa concluída.");
			      				System.out.println("\t\tObrigado!");
			      				linha();
		      
			      				//contador
			      				analise++;
		 }
		 
		 //OUTPUT
		 
		 System.out.println("\n\tRESULTADO\n");
		 
		 System.out.println("O número de pessoas calmes: (" + calmas + ")");
		 System.out.println("O número de mulheres nervosas: (" + mulheresNervosas + ")");
		 System.out.println("O número de homens agressivos: (" + homensAgressivos + ")");
		 System.out.println("O número de não-bináries calmes: (" + nbCalmes + ")");
		 System.out.println("O número de pessoas nervoses com mais de 40 anos: (" + nervosesMaior40 + ")");
		 System.out.println("O número de pessoas calmes com menos de 18 anos: (" + calmesMenor18 + ")");

	}

	static void linha()
	{
		System.out.println("---------------------------------------------------");
	}
}
