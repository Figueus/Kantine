import java.util.LinkedList;

/**
 * Write a description of class Kassarij here.
 * 
 * @author Robert van Timmeren & Jan-Bert
 * @version 1.9
 */
public class KassaRij {
    
    private LinkedList<Persoon> personen;
    
    /**
     * Constructor
     */
    public KassaRij() 
    {
        personen = new LinkedList<Persoon>();
    }

    /**
     * Methode om een persoon achter in de rij te laten aansluiten.
     * @param persoon
     */
    public void sluitAchteraan(Persoon persoon) 
    {
        personen.add(persoon);
    }
    
    public void verwijderUitRij(Persoon persoon) 
    {
        personen.remove(persoon);
    }

    /**
     * Methode om, indien er een rij bestaat, de eerste Persoon uit
     * de rij te verwijderen en te retourneren. Als er niemand in de rij     
     * staat geeft deze null terug.
     * @return Eerste persoon in de rij of null
     */
    public Persoon eerstePersoonInRij() 
    {
        if (erIsEenRij())
        {
            return personen.getFirst();   
        }
        else
        {
            return null;
        }
    }

    /**
     * Methode kijkt of er personen in de rij staan. 
     * @return Of er wel of geen rij bestaat
    */
    public boolean erIsEenRij() 
    {
        return !personen.isEmpty();
    }
}