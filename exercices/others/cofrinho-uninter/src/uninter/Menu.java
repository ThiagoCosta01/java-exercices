package uninter;

import java.util.Scanner;

public class Menu {
	
	
	private Cofrinho cofrinho;
	private Scanner sc;
	
	public Menu() {
		cofrinho = new Cofrinho();
		 sc = new Scanner(System.in);
		
	}
	
	//Menu principal 
	public void menuPrincipal() {
		System.out.println("COFRINHO");
		System.out.println("1-Adicionar moeda");
		System.out.println("2-Remover moeda");
		System.out.println("3-Listar moedas");
		System.out.println("4-Calcular valor total convertido para real");
		System.out.println("0-Encerrar");
		System.out.print("Escolha uma opção: ");
		//captura a escolha do usuário
		String escolha = sc.next();
		//compara a escolha usando switch-case para executar a função escolhida
		switch (escolha) {
			case "0":
				System.out.println("Encerrando.");
				break;
				
			case "1":
				addMoedas();
				//uso de recursão
				menuPrincipal();
				break;
				
			case "2":
				removerMoedas();
				
				menuPrincipal();
				break;
				
			case "3":
				cofrinho.listagemMoedas();
				
				menuPrincipal();
				break;
				//trata o valor total e apresenta ao usuário
			case "4":
				double conversao = cofrinho.totalConvertido();
				String convTexto = String.format("%.2f",conversao);
				convTexto = convTexto.replace(".",",");
				System.out.println("O valor total convertido para real: R$" + convTexto);
				
				menuPrincipal();
				break;
				
			default:
				System.out.println("Comando inválido!");
				menuPrincipal();
				break;
		};
	}
	
	private void addMoedas() {
		System.out.println("Escolha a moeda: ");
		System.out.println("1 - Real: ");
		System.out.println("2 - Dólar: ");
		System.out.println("3 - Euro: ");
		//lê o valor digitado como string e transforma em double (polimorfismo)
		int opcaoMoeda = sc.nextInt();
		System.out.println("Digite o valor: ");
		String valorTxt = sc.next();
		valorTxt = valorTxt.replace(",",".");
		double valorMoeda = Double.valueOf(valorTxt);
		//inicia o objeto "moeda" como nulo
		Moeda moeda = null;
		//instancia o tipo da moeda
		if (opcaoMoeda==1) {
			moeda = new Real(valorMoeda);
		} else if (opcaoMoeda ==2) {
			moeda = new Dolar(valorMoeda);		
		} else if (opcaoMoeda==3) {
			moeda = new Euro(valorMoeda);
		} else {
			System.out.println("Inválido!");
		}
		//adiciona moeda no cofre
		cofrinho.adicionar(moeda);
		System.out.println("Moeda adicionada.");
	}
	//remove a moeda digitada
	private void removerMoedas() {
		System.out.println("Escolha a moeda: ");
		System.out.println("1 - Real: ");
		System.out.println("2 - Dólar: ");
		System.out.println("3 - Euro: ");
		
		int opcaoMoeda = sc.nextInt();
		System.out.println("Digite o valor: ");
		String valorTextoMoeda = sc.next();
		valorTextoMoeda = valorTextoMoeda.replace(",",".");
		double valorMoeda = Double.valueOf(valorTextoMoeda);
		
		Moeda moeda = null;
		
		if (opcaoMoeda==1) {
			moeda = new Real(valorMoeda);
		} else if (opcaoMoeda ==2) {
			moeda = new Dolar(valorMoeda);		
		} else if (opcaoMoeda==3) {
			moeda = new Euro(valorMoeda);
		} else {
			System.out.println("Inválido!");
		}
		
		cofrinho.remover(moeda);
	}

}
