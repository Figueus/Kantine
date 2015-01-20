/**
 * 
 * 
 * @author Robert van Timmeren & Jan-Bert
 * @version 1
 */

public class Pinpas extends Betaalwijze {
	private double kredietlimiet;

	/**
	 * Methode om kredietlimiet te zetten
	 * 
	 * @param kredietlimiet
	 */
	public void setKredietLimiet(double kredietlimiet) {
		this.kredietlimiet = kredietlimiet;
	}

	/**
	 * Methode om betaling af te handelen
	 * @throws TeWeinigGeldException 
	 */
	public void betaal(double tebetalen) throws TeWeinigGeldException {
		// omitted
		if(saldo+kredietlimiet >= tebetalen){
			setSaldo(saldo - tebetalen);
			
		}
		else{
			throw new TeWeinigGeldException();
		}
	}
}