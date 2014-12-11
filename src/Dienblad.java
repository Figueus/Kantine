import java.util.Stack;
import java.util.Iterator;

/**
 * Als een persoon de kantine binnenloopt pakt deze een dienblad, pakt een aantal artikelen en 
 * plaatst deze op het dienblad. 
 * 
 * @author Robert van Timmeren & Jan-Bert
 * @version 1.9
 */



public class Dienblad {
    private Stack<Artikel> artikelen;
    private Iterator<Artikel> iterator;

    
    /**
     * Constructor
     */
    public Dienblad() 
    {
        artikelen = new Stack<Artikel>();
    }

    /**
     * Methode om artikel aan dienblad toe te voegen
     * @param artikel
     */
    public void voegToe(Artikel artikel) 
    {
        artikelen.push(artikel);
    }
    
    /**
     * methode om via een iterator door de artikelen op het dienblad te lopen.
     */
    public Iterator<Artikel> getIterator()
    {
            iterator = artikelen.iterator();
            return artikelen.iterator();
    }
}


