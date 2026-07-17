package uninter;

public class Euro extends Moeda{
	//construtor
	public Euro(double valor){
		this.valor = valor;
	}
	
	@Override
	public void info() {
		System.out.println("Euro - " + valor);
		
	}
	//converte para real
	@Override
	public double converter() {
		return this.valor*5.54;

	}
	//método de comparação entre objetos, necessário para função de remover
	@Override
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()) {
			return false;
		}
		
		Euro objetoDeEuro = (Euro) objeto;
		
		if (this.valor != objetoDeEuro.valor) {
			return false;
		}
		
		return true;
	}
}
