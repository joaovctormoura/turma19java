package entity;

public class Aviao 
{
		//attributes//
		public String modelo;
		public int capacidade;
		public double tamanho;
		
		//methods//
		
		//classificaçao do tamanho
		public void porte (double tamanho)
		{
			if(tamanho <= 10)
			{
				System.out.println("Porte: Pequeno");
			}
			else if(tamanho > 10 && tamanho <= 30)
			{
				System.out.println("Porte: Médio");
			}
			else if(tamanho> 30)
			{
				System.out.println("Porte: Grande");				
			}
		}
		
		//capacidade com base no tamanho
		public double capacidade (double tamanho)
			{
			return Math.floor(tamanho/1.5);
			}
}
