public class TestAdministratie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Administratie admin = new Administratie();
		System.out.println();
		System.out.println("Administratie.berekenGemiddeldAantal");
		System.out.println(Administratie.berekenGemiddeldAantal(new int[] { 45,
				56, 34, 39, 40, 31 }));
		
		System.out.println();
		System.out.println("Administratie.berekenGemiddeldeOmzet");
		System.out.println(Administratie.berekenGemiddeldeOmzet(new double[] {
				567.70, 498.25, 458.90 }));

		System.out.println();
		System.out.println("Administratie.berekenDagOmzet");
		double[] tmp = Administratie.berekenDagOmzet(new double[] { 321.35,
				450.50, 210.45, 190.85, 193.25, 159.90, 214.25, 220.90, 201.90,
				242.70, 260.35 });
		for(double bah : tmp){
			System.out.println(bah);
		}
	}

	/*
	 * theorievragen administratie 
	 * 1.c Administratie is een subklasse van
	 * Object, de superconstructor Object() wordt sowieso aangeroepen als je
	 * Administratie aanroept. 
	 * 1.d Er staat niets in de klasse Administratie wat
	 * nodig is voor die methoden. 
	 * 1.e Er kunnen geen Adminstratie objecten
	 * worden angemaakt.
	 * 1.h Zorgt ervoor dat een variabel niet meer kan worden veranderd.
	 * 1.i Voordat de variabel days_in_week bestaat moet eerst een object Adminstratie worden aangemaakt en static methodes werken juist buiten die Objecten.
	 * 1.j De variabel is weer te veranderen.
	 */

}
