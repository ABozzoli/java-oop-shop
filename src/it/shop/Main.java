package it.shop;

public class Main {

	public static void main(String[] args) {

		Prodotto prodotto = new Prodotto("Paperella di gomma", "Una normalissima paperella di gomma gialla", 5, 22);
		
		// getter test
		System.out.println("codice prodotto: " + prodotto.getCodice());
		System.out.println("nome prodotto: " + prodotto.getNome());
		System.out.println("nome esteso prodotto: " + prodotto.nomeEsteso());
		System.out.println("descrizione prodotto: " + prodotto.getDescrizione());
		System.out.println("prezzo prodotto: " + prodotto.getPrezzo() + "€");
		System.out.println("iva prodotto: " + prodotto.getIva() + "%");
		System.out.println("prezzo con iva: " + prodotto.prezzoIva() + "€");

		System.out.println();
		
		//setter test
		prodotto.setNome("Paperella STRABILIANTE");
		System.out.println("nome prodotto aggiornato: " + prodotto.getNome());
		prodotto.setDescrizione("Una STRABILIANTE paperella di gomma gialla");
		System.out.println("nome esteso prodotto: " + prodotto.nomeEsteso());
		System.out.println("descrizione prodotto aggiornata: " + prodotto.getDescrizione());
		prodotto.setPrezzo(99);
		System.out.println("prezzo prodotto aggiornato: " + prodotto.getPrezzo() + "€");
		prodotto.setIva(50);
		System.out.println("iva prodotto aggiornata: " + prodotto.getIva() + "%");
		
		System.out.println("prezzo con iva: " + prodotto.prezzoIva() + "€");
		
	}

}
