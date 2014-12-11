import java.util.LinkedList;
import java.util.Iterator;

/**
 * Write a description of class Kassa here.
 * 
 * @author Robert van Timmeren & Jan-Bert
 * @version 1.9
 */
public class Kassa {

    private double kassaGeld;
    private int aantalArtikelen;
    private KassaRij kassaRij;
    private Dienblad dienblad;

    /**
     * Constructor
     */
     public Kassa(KassaRij kassaRij) 
     {
         this.kassaRij = kassaRij;
    }
    
    /**
    * Deze methode vraagt het dienblad op.
    * @param dienblad
    */
    public Dienblad getDienblad(Persoon persoon) 
    {       
        return persoon.getDienblad();
    }
    
    /**
    * Deze methode vraagt het aantal artikelen en de totaalprijs op.
    * @param persoon die moet afrekenen.
    */
    public void rekenAf( Persoon persoon )
    {
            Dienblad dienblad = persoon.getDienblad();
            Iterator<Artikel> artikelen = dienblad.getIterator();
            while(artikelen.hasNext())
            {
                    aantalArtikelen++;
                    Artikel artikel = artikelen.next();
                    kassaGeld += artikel.getPrijs();
            }
    }
        
    /**
    * Deze methode geeft het aantal artikelen dat de kassa 
    * heeft gepasserd, vanaf het moment dat de methode resetWaarden 
    * is aangeroepen.
    * @return aantal artikelen
    */
    public int aantalArtikelen() 
    {
      return aantalArtikelen;
    }

    /**
     * Deze methode geeft het totaalbedrag van alle artikelen die
     * de kassa zijn gepasseerd, vanaf het moment dat de methode resetKassa 
     * is aangeroepen.
     * @return hoeveelheid geld in de kassa
     */
    public double hoeveelheidGeldInKassa() 
    {
        return kassaGeld;
    }

    /**
     * Deze methode reset de waarden van het aantal gepasseerde artikelen en 
     * de totale hoeveelheid geld in de kassa.
     */
    public void resetKassa() 
    {
        kassaGeld = 0;
        aantalArtikelen = 0;
    }
}
