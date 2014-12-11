/**
 * Deze klasse wordt gebruikt om kassagegevens uit te lezen en en paar
 * statistische berekeningen uit te voeren.
 * 
 * @author Robert van Timmeren & Jan-Bert
 * @version 1.0
 */
public class Administratie {
	/**
	 * Deze methode berekent van de int array aantal de gemiddelde waarde
	 * 
	 * @param aantal
	 * @return het gemiddelde
	 */
	private final static int DAYS_IN_WEEK = 7;
	
	private Administratie() {

	}

	public static double berekenGemiddeldAantal(int[] aantal) {

		double lengte = new Double(aantal.length).doubleValue();
		if (lengte > 0) {
			int totaal = 0;
			for (int dag : aantal) {
				totaal = totaal + dag;
			}
			return new Double(totaal).doubleValue() / lengte;
		} else {
			return 0;
		}
	}

	/**
	 * Deze methode berekent van de double array omzet de gemiddelde waarde
	 * 
	 * @param omzet
	 * @return Het gemiddelde
	 */
	public static double berekenGemiddeldeOmzet(double[] omzet) {
		double lengte = new Double(omzet.length).doubleValue();
		if (lengte > 0) {
			double totaal = 0;
			for (double dag : omzet) {
				totaal = totaal + dag;
			}
			return totaal / lengte;
		} else {
			return 0;
		}
	}

	public static double[] berekenDagOmzet(double[] omzet) {
		double[] temp=new double[DAYS_IN_WEEK];
		for(int i=0;i<DAYS_IN_WEEK;i++) {
			int j=0;
			while((i+DAYS_IN_WEEK*j)<omzet.length) {
				temp[i]+=omzet[i+DAYS_IN_WEEK*j];
				j++;
			}
		}
		return temp;
	}
}