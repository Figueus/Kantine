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
            double totaal = 0;
            while(artikelen.hasNext())
            {
                    aantalArtikelen++;
                    Artikel artikel = artikelen.next();
                    totaal += artikel.getPrijs();
            }
            //kijkt of er korting moet worden gegeven en hoeveel dat dan is.
            if(persoon instanceof KortingskaartHouder){
            	if(persoon instanceof Docent || persoon instanceof Kantinemedewerker){
            		double korting = 0;
            		korting = totaal * ((KortingskaartHouder) persoon).geefKortingsPercentage(); 
            		if(korting > ((KortingskaartHouder) persoon).geefMaximum()){
            			korting = ((KortingskaartHouder) persoon).geefMaximum();
            		}
            		totaal = totaal - korting;
            	}
            }
            //Zorgt voor een betaalwijze zodat de simulatie nog blijft lopen.
            Pinpas pinpas = new Pinpas();
            Betaalwijze betaalwijze = new Contant();
            //TODO fix a random
            betaalwijze.setSaldo(20);
            //*TODO
            persoon.setBetaalwijze(betaalwijze);
            
            try{
            persoon.getBetaalwijze().betaal(totaal);
            kassaGeld += totaal;	
            }
            catch(TeWeinigGeldException e){
            	System.out.println(persoon.getVoornaam()+ " " + persoon.getAchternaam()+" kan de artikelen niet betalen.");
            }
            
            //TODO
            
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
