import java.util.Iterator;

public class Kassa {
	private KassaRij kassarij;
	private int artikelenKassa = 0;
	private double geldInKassa = 0;
	
	/**
	 * Constructor
	 */
	public Kassa(KassaRij kassarij) {
		this.kassarij = kassarij;
	}
	
	
	
	/**
	* vraag het aantal artikelen en de totaalprijs op.
	* De implementatie wordt later vervangen
	* door een echte betaling door de persoon.
	* @param persoon die moet afrekenen
	*/
	public void rekenAf(Persoon persoon) {
		double totaalPrijs = getTotaalPrijs(persoon);
		int totaalArtikelen = getAantalArtikelen(persoon);
		geldInKassa += totaalPrijs;
		artikelenKassa += totaalArtikelen;
	}
	
	/**
	* Geeft het aantal artikelen dat de kassa
	* heeft gepasseerd,
	* vanaf het moment dat de methode resetWaarden
	* is aangeroepen.
	* @return aantal artikelen
	*/
	public int aantalArtikelen() {
		return artikelenKassa;
	}
	
	/**
	* Geeft het totaalbedrag van alle artikelen die
	* de kassa zijn gepasseerd, vanaf het moment dat de methode
	* resetKassa is aangeroepen.
	* @return hoeveelheid geld in de kassa
	*/
	public double hoeveelheidGeldInKassa() {
		return geldInKassa;
	}
	
	/**
	* reset de waarden van het aantal gepasseerde artikelen en
	* de totale hoeveelheid geld in de kassa.
	*/
	public void resetKassa() {
		artikelenKassa = 0;
		geldInKassa = 0;
	}
	
	/**
	 * Setter voor de hoeveelheid geld in de kassa
	 * @param geldInKassa
	 */
	public void setGeldInKassa(double geldInKassa){
		this.geldInKassa = geldInKassa;
	}
	
	/**
	 * Setter voor het aantal artikelen dat de kassa is gepasseerd
	 * @param artikelenKassa
	 */
	public void setArtikelenKassa(int artikelenKassa){
		this.artikelenKassa = artikelenKassa;
	}
	
	/**
	 * Haalt de totaalprijs op van de artikelen die deze persoon op zijn dienblad heeft.
	 * @param persoon 
	 * @return De totaalprijs.
	 */
	private double getTotaalPrijs(Persoon persoon){
		Iterator<Artikel> iterator = persoon.getDienblad().getIterator();
		double totaalPrijs = 0;
		while(iterator.hasNext()){
			totaalPrijs += iterator.next().getPrijs();
		}
		
		return totaalPrijs;
	}
	
	/**
	 * Haalt de totaalprijs op van de artikelen die deze persoon op zijn dienblad heeft.
	 * @param persoon
	 * @return Het totaal aantal
	 */
	private int getAantalArtikelen(Persoon persoon){
		Iterator<Artikel> iterator = persoon.getDienblad().getIterator();
		int totaal = 0;
		while(iterator.hasNext()){
			iterator.next();
			totaal += 1;
		}
		
		return totaal;
	}
}