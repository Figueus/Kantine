import java.util.LinkedList;

public class KassaRij {
	LinkedList<Persoon> personen;
	
	/**
	 * Parameterloze constructor. Maakt een nieuwe LinkedList<Persoon> aan
	 */
	public KassaRij() {
		personen = new LinkedList<Persoon>();
	}
	
	/**
	 * Constructor. Zet de LinkedList<Personen> op de gegeven personenlijst
	 * @param personen
	 */
	public KassaRij(LinkedList<Persoon> personen){
		this.personen = personen;
	}
	
	/**
	* Persoon sluit achter in de rij aan
	* @param persoon
	*/
	public void sluitAchteraan(Persoon persoon) {
		personen.add(persoon);
	}
	
	/**
	* Indien er een rij bestaat, de eerste Persoon uit
	* de rij verwijderen en retourneren.
	* Als er niemand in de rij staat geeft deze null terug.
	* @return Eerste persoon in de rij of null
	*/
	
	public Persoon volgendePersoon(){
		personen.remove(0);
		if(personen.size() > 0){
			return personen.get(0);
		} else {
			return null;
		}
	}
	
	/**
	* Indien er een rij bestaat, de eerste Persoon uit
	* de rij verwijderen en retourneren.
	* Als er niemand in de rij staat geeft deze null terug.
	* @return Eerste persoon in de rij of null
	*/
	public Persoon eerstePersoonInRij() {
		if(erIsEenRij()){
			Persoon persoon = personen.get(0);
			personen.remove(persoon);
			return persoon; 
		} else {
			return null; 
		}
	}
	
	/**
	* Methode kijkt of er personen in de rij staan.
	* @return Of er wel of geen rij bestaat
	*/
	public boolean erIsEenRij() {
		return (personen.size() > 0);
	}
}