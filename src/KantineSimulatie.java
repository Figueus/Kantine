public class KantineSimulatie {
	private Kantine kantine;
	
	/**
	 * Constructor
	 */
	public KantineSimulatie() {
		kantine = new Kantine();
	}
	 
	/**
	 * Deze methode simuleert een aantal dagen in het
	 * verloop van de kantine
	 * @param dagen
	 */
	 public void simuleer(int dagen) {
		int artikelenKassa;
		double geldInKassa;
		// for lus voor dagen
		for(int i = 0; i < dagen; i++) {
			// per dag nu even vast 10+i personen naar binnen
			// laten gaan, wordt volgende week veranderd...
			// for lus voor personen
			for(int j = 0; j < 10 + i; j++){
				kantine.loopPakSluitAan();
			}
			// verwerk rij voor de kassa
			kantine.verwerkRijVoorKassa();
			// toon dagtotalen (artikelen en geld in kassa)
			artikelenKassa = kantine.getKassa().aantalArtikelen();
			geldInKassa = kantine.getKassa().hoeveelheidGeldInKassa();
			System.out.println("Dagtotalen:\n Aantal gepasseerde artikelen: \t" + artikelenKassa + 
					"\n Hoeveelheid geld in kassa: \t" + geldInKassa);
			// reset de kassa voor de volgende dag
			kantine.getKassa().resetKassa();
		}
	}
}