package entity;

public class Cliente 
{	
	//attributes//
	public String nome;
	public int anoNascimento;
	public double altura;
	public char genero;
	
	//methods//
	
	//calculo idade
	public int idade (int anoNascimento)
	{
		return (2021- anoNascimento);
	}
	
	//preferencia de pronome
	public void tratamento (char genero)
	{
		if(genero == '1')
		{
			System.out.println("Você prefere ser tratade por pronome neutro"); 
		}
		else if(genero == '2')
		{
			System.out.println("Você prefere ser tratada por pronome feminino");
		}
		else if(genero == '3')
		{
			System.out.println("Você prefere ser tratado por pronome masculino");
		}
	}
}
