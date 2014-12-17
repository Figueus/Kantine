
public class Kantinemedewerker extends Persoon implements KortingskaartHouder{

	private String medewerkersNummer;
	private boolean kassaRechten;
	
	Kantinemedewerker(){
		
	}
	
	Kantinemedewerker(String nummer, boolean kassa){
		setMedewerkersNummer(nummer);
		setKassaRechten(kassa);
	}
	
	public Kantinemedewerker(int bsn, String voornaam, String achternaam, int dag, int maand, int jaar, char geslacht, String nummer, boolean kassa){
		this(nummer, kassa);
		setBsn(bsn);
		setVoornaam(voornaam);
		setAchternaam(achternaam);
		setGeboortedatum(dag, maand, jaar);
		setGeslacht(geslacht);
	}

	public String getMedewerkersNummer() {
		return medewerkersNummer;
	}

	public void setMedewerkersNummer(String medewerkersNummer) {
		this.medewerkersNummer = medewerkersNummer;
	}

	public boolean isKassaRechten() {
		return kassaRechten;
	}

	public void setKassaRechten(boolean kassaRechten) {
		this.kassaRechten = kassaRechten;
	}
	
	@Override
	public void drukAf(){
		System.out.println("Medewerkersnummer: " + getMedewerkersNummer());
		System.out.println("Mag achter de kassa: " + isKassaRechten());
	}

	@Override
	public double geefKortingsPercentage() {
		// TODO Auto-generated method stub
		return 0.35;
	}

	@Override
	public boolean heeftMaximum() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double geefMaximum() {
		// TODO Auto-generated method stub
		return 0;
	}
}
