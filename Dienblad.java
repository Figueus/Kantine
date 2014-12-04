import java.util.Stack;

public class Dienblad {
	
	public Stack<Artikel> artikelen;
	
	/**
	 * Constructor
	 */
	
	public Dienblad() {
		artikelen = new Stack<Artikel>();
	}
	
	/**
	 * Methode om artikel aan dienblad toe te voegen
	 * @param artikel
	 */
	public void voegToe(Artikel artikel) {
		artikelen.push(artikel);
	}
	
	/**
	* Methode om aantal artikelen op dienblad te tellen
	* @return Het aantal artikelen
	*/
	public int getAantalArtikelen() {
		return artikelen.size();
	}
	
	/**
	 * Getter voor de stack met artikelen
	 * @return de stack met artikelen
	 */
	public Stack<Artikel> getArtikelen(){ 
		return artikelen;
	}
	
	/**
	* Methode om de totaalprijs van de artikelen
	* op dienblad uit te rekenen
	* @return De totaalprijs
	*/
	public double getTotaalPrijs() {
		double totaal = 0;
		for(Artikel artikel : artikelen){
			totaal += artikel.getPrijs();
		}
		return totaal;
	}
}