package it.shop;

import java.util.Random;

public class Prodotto {

	// attributi
	private int codice; // solo lettura
	private String nome;
	private String descrizione;
	private double prezzo;
	private int iva;
	
	// costruttori
	public Prodotto(String nome, String descrizione, double prezzo, int iva) { 
		this.codice = generaCodice();
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.iva = iva;
	}
	
	private int generaCodice() {
		Random random = new Random();
		return random.nextInt(100000);
	}
	
	//metodo prezzo base
	public double prezzo() {
		return prezzo;
	}
	
	//metodo prezzo con iva
	public double prezzoIva() {
		return prezzo + prezzo * iva / 100;
	}
	
	//metodo nome esteso
	public String nomeEsteso() {
		return codice + " - " + nome;
	}
	
	//metodi getter/setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public int getCodice() {
		return codice;
	}
	
}
