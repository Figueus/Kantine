/**
 * 
 * @author Robert van Timmeren & Jan-Bert
 *
 */
public class Docent extends Persoon implements KortingskaartHouder{

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
	public String toString(){
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Afkorting: " + getAfkorting());
		stringBuilder.append(System.getProperty("line.separator"));
		stringBuilder.append("Afdeling: " + getAfdeling());
		
		return stringBuilder.toString();
		
		/*
		System.out.println("Afkorting: " + getAfkorting());
		System.out.println("Afdeling: " + getAfdeling());
		*/
	}

	@Override
	public double geefKortingsPercentage() {
		// TODO Auto-generated method stub
		return 0.25;
	}

	@Override
	public boolean heeftMaximum() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public double geefMaximum() {
		// TODO Auto-generated method stub
		return 1;
	}
}
