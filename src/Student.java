
/**
 * 
 * @author Robert van Timmeren & Jan-Bert
 *
 */
public class Student extends Persoon {

	private String studentNummer;
	private String studieRichting;
	
	
	public Student(){
		
	}
	
	public Student(String nummer, String richting){
		setStudentNummer(nummer);
		setStudieRichting(richting);
	}
	
	public Student(int bsn, String voornaam, String achternaam, int dag, int maand, int jaar, char geslacht, String nummer, String richting){
		this(nummer, richting);
		setBsn(bsn);
		setVoornaam(voornaam);
		setAchternaam(achternaam);
		setGeboortedatum(dag, maand, jaar);
		setGeslacht(geslacht);
	}
	
	public String getStudentNummer() {
		return studentNummer;
	}
	public void setStudentNummer(String studentNummer) {
		this.studentNummer = studentNummer;
	}
	public String getStudieRichting() {
		return studieRichting;
	}
	public void setStudieRichting(String studieRichting) {
		this.studieRichting = studieRichting;
	}
	
	@Override
	public void drukAf(){
	System.out.println("Studentnummer: " + getStudentNummer());
	System.out.println("Studierichting: " + getStudieRichting());
	}
}
