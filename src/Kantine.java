
/**
 * Write a description of class Kantine here.
 * 
 * @author Robert van Timmeren & Jan-Bert
 * @version 1.9
 */
public class Kantine {
    private Kassa kassa;
    private KassaRij kassaRij;
    private KantineAanbod kantineaanbod;

    /**
    * Constructor
    */
    public Kantine() 
    {
        kassaRij=new KassaRij();
        kassa=new Kassa(kassaRij);
    }

    /**
     * In deze methode kiest een Persoon met een dienblad
     * de artikelen in artikelnamen.
     * @param persoon
     * @param artikelnamen
     */
    public void loopPakSluitAan(Persoon persoon, String[] artikelnamen) 
    {
        for(int i=0; i<artikelnamen.length; i++)
        {
            Artikel artikel = kantineaanbod.getArtikel(artikelnamen[i]);
            persoon.getDienblad().voegToe(artikel);
            kassaRij.sluitAchteraan(persoon);
        }
    }

    /**
    * Deze methode handelt de rij voor de kassa af.
    */
    public void verwerkRijVoorKassa() 
    {
        while(kassaRij.erIsEenRij()) 
        {
            kassa.rekenAf(kassaRij.eerstePersoonInRij());
            kassaRij.verwijderUitRij(kassaRij.eerstePersoonInRij());
        }
    }
    
   /**
    * Een getter voor de private instantie
    * variabele kassa in de klasse Kantine
    */
   public Kassa getKassa()
   {
       return kassa;
   }
   
    /**
     * methode om het kantine aanbod te setten in de variabele kantineaanbod.
     */
    public void setKantineAanbod(KantineAanbod kantineaanbod)
    {
        this.kantineaanbod = kantineaanbod;
    }
   
    /**
     * methode om het kantineaanbod object op te vragen.
     */
   
    public KantineAanbod getKantineAanbod()
    {
        return this.kantineaanbod;
    }
}