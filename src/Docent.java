/**
 * 
 * @author Robert van Timmeren & Jan-Bert
 *
 */
public class Docent extends Persoon {

	private String afkorting;
	private String afdeling;
	
	public Docent(){
		
	}
	
	public Docent(String afkorting, String afdeling){
		setAfkorting(afkorting);
		setAfdeling(afdeling);
	}
	
	public Docent(int bsn, String voornaam, String achternaam, int dag, int maand, int jaar, char geslacht, String afkorting, String afdeling){
		this(afkorting, afdeling);
		setBsn(bsn);
		setVoornaam(voornaam);
		setAchternaam(achternaam);
		setGeboortedatum(dag, maand, jaar);
		setGeslacht(geslacht);
	}

	public String getAfkorting() {
		return afkorting;
	}

	public void setAfkorting(String afkorting) {
		this.afkorting = afkorting;
	}

	public String getAfdeling() {
		return afdeling;
	}

	public void setAfdeling(String afdeling) {
		this.afdeling = afdeling;
	}
	
	@Override
	public void drukAf(){
		System.out.println("Afkorting: " + getAfkorting());
		System.out.println("Afdeling: " + getAfdeling());
	}
}
