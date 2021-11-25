package it.shop;

import java.util.Random;

public class Prodotto {

	// attributi
	private int codice; // solo lettura
	private String nome;
	private String descrizione;
	private int prezzo;
	private int iva;
	
	// costruttori
	public Prodotto() { 
		this.codice = generaCodice();
	}
	
	private int generaCodice() {
		Random random = new Random();
		return random.nextInt(1000);
	}
	
	//metodi getter/setter
	
	//metodo prezzo base
	
	//metodo prezzo+ivato
	
	//metodo nome esteso
	public String nomeEsteso() {
		return codice + nome;
	}
	
}
