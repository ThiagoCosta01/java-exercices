package uninter;

public class Dolar extends Moeda{
	//construtor
	public Dolar(double valor){
		this.valor = valor;
	}
	
	@Override
	public void info() {
		System.out.println("Dólar - " + valor);
		
	}
	//converte para real
	@Override
	public double converter() {
		return this.valor*5.37;

	}
	//método de comparação entre objetos, necessário para função de remover
	@Override
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()) {
			return false;
		}
		
		Dolar objetoDeDolar = (Dolar) objeto;
		
		if (this.valor != objetoDeDolar.valor) {
			return false;
		}
		
		return true;
	}
}
