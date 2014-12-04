
public class Artikel {
	private String naam;
	private double prijs;
	
	public Artikel(String naam, double prijs){
		setNaam(naam);
		setPrijs(prijs);
	}
	
	public Artikel(){
		setNaam("");
		setPrijs(-1);
	}
	
	public void drukAf(){
		if(prijs > 0){ 
		System.out.println(" Naam: \t\t" + getNaam() + "\n Prijs: \t" + getPrijs());
		} else {
			System.out.println(" Naam: \t\t" + getNaam() + "\n Prijs: \t Onbekend");
		}
	}
	
	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		if(!naam.isEmpty()){
			this.naam = naam;
		} else {
			this.naam = "Onbekend";
		}
	}

	public double getPrijs() {
		return prijs;
	}

	public void setPrijs(double prijs) {
		this.prijs = prijs;
	}
}
