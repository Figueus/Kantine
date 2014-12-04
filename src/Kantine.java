public class Kantine {
	private Kassa kassa;
	private KassaRij kassarij;
	private Persoon persoon;
	private Dienblad dienblad; 
	
	/*
	 * Opdracht 5A:
	 * De while-lus is hier beter, omdat je nu van
	 * te voren niet hieft uit te zoeken hoeveel 
	 * mensen er in de rij staan om alle personen 
	 * in de rij te verwerken
	 */
	
	/**
	 *Constructor
	 */
	public Kantine() {
		kassarij= new KassaRij();
		kassa= new Kassa(kassarij);
	}

	/**
	 * In deze methode wordt een Persoon en Dienblad
	 * gemaakt en aan elkaar
	 * gekoppeld. Maak twee Artikelen aan en plaats
	 * deze op het dienblad.
	 * Tenslotte sluit de Persoon zich aan bij de rij
	 * voor de kassa.
	 */
	public void loopPakSluitAan() {
		Artikel artikel1 = new Artikel("Melk", 1.50);
		Artikel artikel2 = new Artikel("Frikandelbroodje", 2);
		persoon = new Persoon();
		dienblad = new Dienblad();
		persoon.pakDienblad(dienblad);
		persoon.getDienblad().voegToe(artikel1);
		persoon.getDienblad().voegToe(artikel2);
		kassarij.sluitAchteraan(persoon);
	}
	
	/**
	 * Deze methode handelt de rij voor de kassa af.
	 */
	public void verwerkRijVoorKassa() {
		Persoon persoon;
		int aantalArtikelen = 0;
		double prijs = 0;
		while(kassarij.erIsEenRij()) {
			persoon = kassarij.eerstePersoonInRij();
			kassa.rekenAf(persoon);
		}
		/* wordt dit niet al in kassa.rekenAf(p) gedaan? 
		kassa.setGeldInKassa(prijs + kassa.hoeveelheidGeldInKassa());
		kassa.setArtikelenKassa(kassa.aantalArtikelen() + aantalArtikelen);
		*/
	}
	
	/**
	 * Deze methode telt het geld uit de kassa
	 * @return hoeveelheid geld in kassa
	 */
	/*
	public double hoeveelheidGeldInKassa() {
		return kassa.hoeveelheidGeldInKassa();
	}
*/
	/**
	 * Deze methode geeft het aantal gepasseerde artikelen.
	 * @return het aantal gepasseerde artikelen
	 */
	/*
	public int aantalArtikelen(){
		return kassa.aantalArtikelen();
	}
	*/

	/**
	 * Deze methode reset de bijgehouden telling van
	 * het aantal artikelen
	 * en "leegt" de inhoud van de kassa.
	 */
	
	/*
	public void resetKassa() {
		kassa.resetKassa();
	}
	*/
	
	public void sluitAchteraan(Persoon persoon){
		kassarij.sluitAchteraan(persoon);
	}
	
	public Kassa getKassa(){
		return kassa;
	}
	
}