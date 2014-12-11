import java.text.DecimalFormat;
import java.util.Random;

/**
 * Write a description of class KantineSimulatie here.
 * 
 * @author Robert & Jan-Bert
 * @version 1.1.1
 */

public class KantineSimulatie {
    // kantine
    private Kantine kantine;
    // kantineaanbod
    private KantineAanbod kantineaanbod;
    // random generator
    private Random random;
    // aantal artikelen
    private static final int AANTAL_ARTIKELEN=4;
    // artikelen
    private static final String[] artikelnamen = new String[] {"Koffie","Broodje pindakaas", "Broodje kaas","Appelsap"};
    // prijzen
    private static double[] artikelprijzen = new double[]{1.50, 2.10, 1.65, 1.65};
    // minimum en maximum aantal artikelen per soort
    private static final int MIN_ARTIKELEN_PER_SOORT=10000;
    private static final int MAX_ARTIKELEN_PER_SOORT=20000;
    // minimum en maximum aantal personen per dag
    private static final int MIN_PERSONEN_PER_DAG=50;
    private static final int MAX_PERSONEN_PER_DAG=100;
    // minimum en maximum artikelen per persoon
    private static final int MIN_ARTIKELEN_PER_PERSOON=1;
    private static final int MAX_ARTIKELEN_PER_PERSOON=4;
    //decimal format
    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#.00");
    
    /**
     * Constructor
     */
    public KantineSimulatie() 
    {
        kantine=new Kantine();
        random=new Random();
        int[] hoeveelheden=getRandomArray(AANTAL_ARTIKELEN,MIN_ARTIKELEN_PER_SOORT, MAX_ARTIKELEN_PER_SOORT);
        kantineaanbod=new KantineAanbod(artikelnamen, artikelprijzen,hoeveelheden);
        kantine.setKantineAanbod(kantineaanbod);
    }
    
    /**
     * Methode om een array van random getallen liggend tussen min en max
     * van de gegeven lengte te genereren
     * @param lengte
     * @param min
     * @param max
     * @return De array met random getallen
     */
    private int[] getRandomArray(int lengte, int min, int max) {
        int[] temp=new int[lengte];
        for(int i=0;i<lengte;i++) {
            temp[i]=getRandomValue(min, max);
        }
        return temp;
    }
    
    /**
     * Methode om een random getal tussen min(incl) en
     * max(incl) te genereren.
     * @param min
     * @param max
     * @return Een random getal
     */
    private int getRandomValue(int min, int max) {
        return random.nextInt(max-min+1)+min;
    }
    
    /**
     * Methode om op basis van een array van indexen voor de array
     * artikelnamen de bijhorende array van artikelnamen te maken
     * @param indexen
     * @return De array met artikelnamen
     */
    private String[] geefArtikelNamen(int[] indexen) {
        String[] artikelen=new String[indexen.length];
        for(int i=0;i<indexen.length;i++) {
            artikelen[i]=artikelnamen[indexen[i]];
        }
        return artikelen;
    }

    /**
     * Deze methode simuleert een aantal dagen in het
     * verloop van de kantine
     * @param dagen
     */
    public void simuleer(int dagen) 
    {
    	
    	//array met aantal artikelen per dag.
        int[] aantal = new int[dagen];
        //array met omzet per dag.
        double[] omzet = new double[dagen];
        			 
        // for lus voor dagen
         for(int i=0; i<=dagen-1; i++)
         {
             
        	 
        	 
        	 // per dag nu even vast 10+i personen naar binnen
             // laten gaan, wordt volgende week veranderd
             // for lus voor personen
             int aantalPersonen = getRandomValue(MIN_PERSONEN_PER_DAG, MAX_PERSONEN_PER_DAG);
             // laat de personen maar komen...
             for(int j=0;j<aantalPersonen+i;j++) 
             {
                 Persoon persoon;
                 
                 int wie = getRandomValue(0,99);
                 if(wie<88)
                 {
                     persoon = new Student();
                 }
                 else if(wie==99)
                 {
                	 persoon = new Kantinemedewerker();
                 }
                 else
                 {
                	 persoon = new Docent();
                 }
                 
                 Dienblad dienblad = new Dienblad();
                 persoon.pakDienblad(dienblad);
                 int aantalartikelen = getRandomValue(MIN_ARTIKELEN_PER_PERSOON, MAX_ARTIKELEN_PER_PERSOON);
                 // random getal tussen 0 en 5
                 // genereer de artikelnummers, dit zijn indexen
                 // van de artikelnamen array
                 int[] nodig = getRandomArray(aantalartikelen, 0, AANTAL_ARTIKELEN-1);
                 // vind de artikelnamen op basis van de indexen hierboven
                 String[] artikelen = geefArtikelNamen(nodig);

                 kantine.loopPakSluitAan(persoon, artikelen);
                 System.out.println(persoon);
             }
 
             // verwerk rij voor de kassa
             kantine.verwerkRijVoorKassa();
 
             // druk de dagtotalen (artikelen en geld in kassa) af en hoeveel personen binnen
             // zijn gekomen
             System.out.println("Dag." + (i+1) + " Geld: " + DECIMAL_FORMAT.format(kantine.getKassa().hoeveelheidGeldInKassa()) + " Aantal Artikelen: " + kantine.getKassa().aantalArtikelen());
             
             //dagtotalen aan arrays toevoegen.
             aantal[i] = kantine.getKassa().aantalArtikelen();
             omzet[i] = kantine.getKassa().hoeveelheidGeldInKassa();
             
             // reset de kassa voor de volgende dag
             kantine.getKassa().resetKassa();
         }
         
         System.out.println("Gemiddelde aantal artikelen per dag: " + Administratie.berekenGemiddeldAantal(aantal));         
         System.out.println("Gemiddelde omzet per dag: " + DECIMAL_FORMAT.format(Administratie.berekenGemiddeldeOmzet(omzet)));
        for(double dag : Administratie.berekenDagOmzet(omzet)){
        	System.out.println(DECIMAL_FORMAT.format(dag));
        }
    }
}