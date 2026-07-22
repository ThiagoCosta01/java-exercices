package uninter;

import java.util.ArrayList;

public class Cofrinho {
	//lista de armazenamento das moedas
	private ArrayList<Moeda> listaMoedas;
	//instancia a lista junto com instanciação do objeto
	public Cofrinho() {
		this.listaMoedas = new ArrayList<>();
	}
	//adiciona moeda na lista
	public void adicionar(Moeda moeda) {
		this.listaMoedas.add(moeda);
	}
	//remove moeda da lista
	public void remover(Moeda moeda) {
		this.listaMoedas.remove(moeda);
	}
	//lista todas as moedas
	public void listagemMoedas() {
		if (this.listaMoedas.isEmpty()) {
			System.out.println("Cofrinho vazio!");
			return;
		}
		for (Moeda moeda : this.listaMoedas) {
			moeda.info();
		}
	}
	//soma o total de moedas do cofre (em R$)
	public double totalConvertido() {
		if (this.listaMoedas.isEmpty()) {
			return 0;
		}
		double valorAcumulado = 0;
		
		for (Moeda moeda : this.listaMoedas) {
			valorAcumulado = valorAcumulado + moeda.converter();
		}
		return valorAcumulado;
	}
}
