import java.util.HashMap;
import java.util.ArrayList;

/**
 * Write a description of class KantineAanbod here.
 * 
 * @author Robert & Jan-Bert
 * @version 1.234.5
 */

public class KantineAanbod {
    // interne opslag voorraad
    private HashMap<String, ArrayList<Artikel>> aanbod;
   
   
    /**
     * Constructor. Het eerste argument is een lijst met artikelnamen,
     * het tweede argument is een lijst met prijzen en het derde argument
     * is een lijst met hoeveelheden. Let op: de dimensies van de drie arrays
     * moeten wel gelijk zijn!
     */
    public KantineAanbod(String[] artikelnaam, double[] prijs, int[] hoeveelheid)
    {
        aanbod=new HashMap<String, ArrayList<Artikel>>();
        for(int i=0;i<artikelnaam.length;i++)
        {
            ArrayList<Artikel> artikelen=new ArrayList<Artikel>();
            for(int j=0;j<hoeveelheid[i];j++)
            {
                artikelen.add(new Artikel(artikelnaam[i], prijs[i]));
            }
            aanbod.put(artikelnaam[i], artikelen);
        }
    }

    /**
     * Private methode om de lijst van artikelen te krijgen op basis van de    
     * naam van het artikel. Retourneert null als artikel niet bestaat.
     */
    private ArrayList<Artikel> getArrayList(String productnaam) {
         return aanbod.get(productnaam);
    }

    /**
     * Private methode om een Artikel van de stapel artikelen af te pakken.
     * Retourneert null als de stapel leeg is.
     */
    private Artikel getArtikel(ArrayList<Artikel> stapel)
    {
        if (stapel==null) {
            return null;
        }
        if (stapel.size()==0)
        {
           return null;
        }
        else
        {
            Artikel a=stapel.get(0);
            stapel.remove(0);
            return a;
        }
    }

    /**
     * Publieke methode om een artikel via naam van de stapel te pakken.
     * Retouneert null als artikel niet bestaat of niet op voorraad is.
     * @param naam (van artikel)
     * @return artikel
     */
    public Artikel getArtikel(String naam) {
        Artikel artikel = getArtikel(getArrayList(naam));
        
        //Als de voorraad lager is dan 5 artikelen
        if(aanbod.get(naam).size() < 5)
        {
            //Vul de voorraad dan bij met 500 Artikelen van het desbetreffende artikel
            setHoeveelheid(naam, 500);
        }
               
        if(aanbod.get(naam).isEmpty()) {
                return null;
        }
        else
        {
                aanbod.remove(artikel);
        }
        return artikel;
    }
    
    public void setHoeveelheid( String naam, int aantal ) {
        ArrayList<Artikel> artikelList = aanbod.get(naam);
        Artikel artikel = aanbod.get(naam).get(0);
       
        for( int i = 0; i < aantal; i++ ) {
                artikelList.add(artikel);
        }
    }
}
