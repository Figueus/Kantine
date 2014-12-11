
/**
 * Deze klasse zal de methodes bevatten om een naamArtikele en prijsArtikel te setten.
 * 
 * @author Robert van Timmeren & Jan-Bert
 * @version 1.9
 */
public class Artikel
{
    
    public String naam;
    public double prijs;

    /**
     * Het intialiseren van de variabelen.
     */
    
    public Artikel(String naam, double prijs){
        this.naam=naam;
        this.prijs=prijs;
    }
    
    
    /**
     * De methode of de naamArtikel te setten.
     */
    public void setNaam(String naam)    {
       this.naam = naam;
    }
    

    /**
     * De methode of de prijsArtikel te setten.
     * 
     */
    public void setPrijs(double prijs)
    {
        this.prijs=prijs;
    }
    
    /**
     * Een getter met een return.
     */
    
    public String getNaam()
    {
       return naam;
       
    }
    
    /**
     * Een getter met een return.
     */
    
    public double getPrijs()
    {
        
        return prijs;
    }
    
    /**
     * Een getter die alle gegevens print.
     */
    
    public void getGegevens()
    {
       System.out.println(getNaam() + getPrijs());
       
    }
}
