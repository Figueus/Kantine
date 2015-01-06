
public class PersoonsVergelijker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//setup persoon 1
		
		Persoon p1 = new Persoon();
		p1.setBsn(6);
		p1.setVoornaam("Jan");
		p1.setAchternaam("Peer");
		p1.setGeboortedatum(3, 2, 1995);
		p1.setGeslacht('m');
		
		//setup persoon 2
		Persoon p2 = new Persoon();
		p2.setBsn(6);
		p2.setVoornaam("Jan");
		p2.setAchternaam("Peer");
		p2.setGeboortedatum(3, 2, 1995);
		p2.setGeslacht('m');
		
		System.out.println("equals: " + p1.equals(p2));
		boolean eq = p1 == p2;
		System.out.println("==:" + eq);
		
		
		/*
		 * conclusie:
		 * == werkt iet omdat het kijkt naar de referentie naar het object
		 * equals werkt wel omdat het de inhoud van het object vergelijkt
		 */
		
		/*
		 * 1d
		 * Een String is een object en daarom moet je equals gebruiken, zodat de inhoud wordt vergeleken
		 * en niet de referentie naar het object.
		 */
		
	}

}
