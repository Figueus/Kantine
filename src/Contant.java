/**
 * 
 * 
 * @author Robert van Timmeren & Jan-Bert
 * @version 1
 */

public class Contant extends Betaalwijze {
	
	/**
	 * Methode om betaling af te handelen
	 */
	
	public boolean betaal(double tebetalen) {
		// omitted
		if(saldo >= tebetalen){
			setSaldo(saldo - tebetalen);
			return true;
		}
		else{
			return false;
		}
	}
}
