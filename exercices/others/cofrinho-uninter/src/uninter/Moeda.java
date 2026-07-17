package uninter;

public abstract class Moeda {
	//métodos e variável da classe mãe que serão usados por todos os tipos de moedas
	protected double valor;
	
	public abstract void info();
	public abstract double converter();
	
}
