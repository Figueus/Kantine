public class Persoon {
	private String bsn;
	private String voornaam;
	private String achternaam;
	private int dag;
	private int maand;
	private int jaar;
	private char geslacht;
	public Dienblad dienblad;
	
	public Persoon(String bsn, String voornaam, String achternaam, int dag, int maand, int jaar, char geslacht){
		setBsn(bsn);
		setVoornaam(voornaam);
		setAchternaam(achternaam);
		setGeboortedatum(dag, maand, jaar);
		setGeslacht(geslacht);
	}
	
	public Persoon(){
		setBsn("");
		setVoornaam("");
		setAchternaam("");
		setGeboortedatum(0, 0, 0);
		setGeslacht('\0');
	}
	
	
	/**
	* Methode om dienblad te koppelen aan een persoon
	* @param dienblad
	*/
	public void pakDienblad(Dienblad dienblad) {
		this.dienblad = dienblad;
	} 
	
	/**
	* Methode om artikel te pakken en te plaatsen op het dienblad
	* @param artikel
	*/
	/*
	public void pakArtikel(Artikel artikel) {
		if(!checkDienblad()){
			pakDienblad(new Dienblad());
		}
		dienblad.voegToe(artikel);
	}
	*/
	/**
	* Methode om de totaalprijs van de artikelen
	* op dienblad dat bij de persoon hoort uit te rekenen
	* @return De totaalprijs
	*/
	/*
	public double getTotaalPrijs() {
		if(!checkDienblad()){
			pakDienblad(new Dienblad());
		}
		return dienblad.getTotaalPrijs();
	}
	*/
	/**
	* Methode om het aantal artikelen op dienblad dat bij de
	* persoon hoort te tellen
	* @return Het aantal artikelen
	*/
	/*
	public int getAantalArtikelen() {
		if(!checkDienblad()){
			pakDienblad(new Dienblad());
		}
		return dienblad.getAantalArtikelen();
	}
	*/
	
	/**
	 * Methode om objecten van de klasse Persoon af te drukken
	 */
	public void drukAf(){
		System.out.println(" BSN:\t \t" + getBsn() + "\n Voornaam:\t" + getVoornaam() + 
				"\n Achternaam: \t" + getAchternaam() + "\n Geboortedatum: " +
				getGeboorteDatum() + "\n Geslacht: \t" + getGeslacht());
		if(dienblad.getIterator().hasNext()){
			String naam;
			double prijs;
			System.out.println("Artikelen op dienblad:");
			for(Artikel artikel : dienblad.getArtikelen()){
				naam = artikel.getNaam();
				prijs = artikel.getPrijs();
				System.out.println("Naam: " + naam + "\t Prijs: " + prijs);
			}
		}
	}
	
	
	/**
	* Getter voor geboortedatum
	* @return Geboortedatum
	*/
	public String getGeboorteDatum() {
		String temp;
		if (dag == 0 && maand == 0 && jaar == 0) {
			temp="Onbekend";
		} else {
			temp=dag + "-" + maand + "-" + jaar;
		}
		return temp;
	}
	/**
	 * Getter voor het BSN
	 * Controleert of de lengte van het BSN gelijk is aan 9, retourneert anders "Onbekend"
	 * @return bsn
	 */
	public String getBsn(){
		String temp;
		if (bsn.length() == 9 &&  true){
			temp = bsn;
		} else {
			temp = "Onbekend";
		}
		return temp;
	}
	
	/**
	 * Getter voor voornaam
	 * Controleert of deze leeg is, in dat geval retourneert hij "Onbekend"
	 * @return Voornaam
	 */
	public String getVoornaam(){
		String temp;
		if(!voornaam.isEmpty()){
			temp = voornaam;
		} else {
			temp = "Onbekend";
		}
		return temp;
	}
	
	/**
	 * Getter voor achternaam
	 * Controleert of deze leeg is, in dat geval retourneert hij "Onbekend"
	 * @return Achternaam
	 */
	public String getAchternaam(){
		String temp;
		if(!achternaam.isEmpty()){
			temp = achternaam;
		} else {
			temp = "Onbekend";
		}
		return temp;
	}
	
	/**
	 * Getter voor geslacht
	 * Controleert of het geslacht 'm' is of 'v', anders retourneert hij "Onbekend"
	 * @return 
	 */
	public String getGeslacht(){
		String temp;
		if(geslacht == 'm'){
			temp = "Man";
		} else if (geslacht == 'v'){
			temp = "Vrouw";
		} else {
			temp = "Onbekend";
		}
		return temp;
	}
	
	/**
	 * Setter voor het BSN
	 * @param bsn
	 */
	public void setBsn(String bsn) {
		this.bsn = bsn;
	}
	
	/**
	 * Setter voor de voornaam
	 * @param voornaam
	 */
	public void setVoornaam(String voornaam) {
		this.voornaam = voornaam;
	}
	
	/**
	 * Setter voor de achternaam
	 * @param achternaam
	 */
	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}
	
	/**
	 * Setter voor de geboortedag, maand en jaar
	 * Indien de datum niet bestaat, zet de datum op 0-0-0
	 * @param dag
	 * @param maand
	 * @param jaar
	 */
	public void setGeboortedatum(int dag, int maand, int jaar) {
		if (datumKlopt(dag, maand, jaar)){
			this.dag = dag;
			this.maand = maand;
			this.jaar = jaar;
		} else {
			//System.out.println("Geboortedatum klopt niet, gereset op 0-0-0");
			this.dag = 0;
			this.maand = 0;
			this.jaar = 0;
		}
		
	}
	
	/**
	 * Setter voor geslacht
	 * Controleert of het geslacht klopt (zie private boolean geslachtKlopt(char geslacht))
	 * @param geslacht
	 */
	public void setGeslacht(char geslacht) {
		if (geslachtKlopt(geslacht) == true){
			this.geslacht = geslacht;
		} else {
			//System.out.println(geslacht + " is geen goede invoer voor Geslacht\n");
		}
		
	}
	
	/**
	 * Methode om te controleren of er al een dienblad gepakt is
	 * @return true als er een dienblad gepakt is, false als dat niet zo is
	 */
	private boolean checkDienblad(){
		if(dienblad != null){
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Methode om te kijken of een jaar een schrikkeljaar is
	 * @param jaar
	 * @return true als schrikkeljaar, false als niet
	 */
	private boolean isSchrikkeljaar(int jaar){
		if(jaar % 4 == 0 && jaar % 400 != 0){
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Methode om te kijken of het geslacht goed is ingevuld
	 * @param geslacht
	 * @return true als geslacht == 'm' of als geslacht == 'v', false in alle andere gevallen
	 */
	private boolean geslachtKlopt(char geslacht){
		if (geslacht == 'v' || geslacht == 'm'){
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Methode om te controleren of een dag-maand-jaar combinatie klopt
	 * @param dag
	 * @param maand
	 * @param jaar
	 * @return true als het klopt, anders false
	 */
	private boolean maandDagKlopt(int dag, int maand, int jaar){
		switch (maand){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if(dag <= 31){
				return true;
			} else {
				return false;
			}
		case 2:
			if(isSchrikkeljaar(jaar)){
				if(dag <= 29){
					return true;
				} else {
					return false;
				}
			} else if (dag <= 28) {
				return true;
			} else {
				return false;
			}
			
		default:
			if(dag <= 30){
				return true;
			} else {
				return false;
			}
		}
	}
	
	/**
	 * Methode om te controleren of een datum goed is ingevuld
	 * @param dag
	 * @param maand
	 * @param jaar
	 * @return true als datum klopt, anders false
	 */
	private boolean datumKlopt(int dag, int maand, int jaar){
		if(dag >= 1 && maand >= 1 && maand <= 12 && jaar >= 1900 && jaar <= 2100 && maandDagKlopt(dag, maand, jaar) ){
		    return true;
		} else {
			return false;
		}
	}
	
	public Dienblad getDienblad(){
		return dienblad;
	}
}
