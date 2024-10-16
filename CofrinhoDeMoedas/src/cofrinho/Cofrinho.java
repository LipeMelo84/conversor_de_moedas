package cofrinho;

import java.util.ArrayList;

public class Cofrinho {
	
	private ArrayList<Moeda> listaMoedas; 
	
	public Cofrinho() {
		this.listaMoedas = new ArrayList<Moeda>(); 
	}
	
	public void adicionar (Moeda moeda) {
		this.listaMoedas.add(moeda); 
	}
	
	public void remove (Moeda moeda) {
		this.listaMoedas.remove(moeda); 
	}
	
	public void listagemMoedas() {
		
		if (this.listaMoedas.isEmpty()) {
			System.out.println("Sem moedas no cofrinho :(");
			return; 
		}
		
		for (Moeda moeda : this.listaMoedas) {
			moeda.info();
		}
	}
	
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
