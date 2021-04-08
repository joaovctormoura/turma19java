package entity;

public class Animal 
{
	//attributes
	private String nome;
	private int idade;
	
	
	
	//constructor
		public Animal(String nome, int idade) 
	{
		super();
		this.nome = nome;
		this.idade = idade;
	
	}

	//getters & setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//methods
	public void emitirSom ()
	{
		
	}
	
	
	
}
