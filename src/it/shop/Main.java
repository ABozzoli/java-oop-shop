package it.shop;

public class Main {

	public static void main(String[] args) {

		Prodotto prodotto = new Prodotto("Paperella di gomma", "Una STRABILIANTE paperella di gomma gialla", 17, 22);
		
		// getter test
		System.out.println("[get] codice prodotto: " + prodotto.getCodice());
		System.out.println("[get] nome prodotto: " + prodotto.getNome());
		System.out.println("[get] descrizione prodotto: " + prodotto.getDescrizione());
		System.out.println("[get] prezzo prodotto: " + prodotto.getPrezzo() + "€");
		System.out.println("[get] iva prodotto: " + prodotto.getIva() + "%");
		
	}

}
