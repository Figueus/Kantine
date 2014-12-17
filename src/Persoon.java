
/**
 * 
 * 
 * @author Robert van Timmeren & Jan-Bert
 * @version 1.9.1
 */
public class Persoon
{
    // instance variables - replace the example below with your own
    private int bsn;
    private String voornaam;
    private String achternaam;
    private int dag;
    private int maand;
    private int jaar;
    private char geslacht;
    private Betaalwijze betaalwijze;
    
    private Dienblad dienblad;
    
    /**
     * Constructor for objects of class persoon
     */
    public Persoon()
    {
        // initialise instance variables
        this.dag=0;
        this.maand=0;
        this.jaar=0;
        this.geslacht=' ';

    }
    
    /**
     * Deze methode zal alle ingevulde gegevens uitprinten.
     * 
     */
    public void drukAf()
    {
        System.out.println("Sofinummer: " + getBsn());
        System.out.println("Voornaam: " + getVoornaam());
        System.out.println("Achternaam: " + getAchternaam());
        System.out.println("Geboortedatum: " + getGeboortedatum());
        System.out.println("Geslacht: " + getGeslacht() + "\n");
    }
    
    /**
     * Methode om dienblad te koppelen aan een persoon
     * @param dienblad
     */
    public void pakDienblad(Dienblad dienblad) 
    {
        if (dienblad != null)
        {
            this.dienblad = dienblad;
        }
    }
    
    public Dienblad getDienblad()
    {
        return dienblad;
    }

    /**
     * Getter voor geboortedatum
     * @return Geboortedatum 
     */
    public String getGeboortedatum() 
    {
        String temp;
        if (dag==0 && maand==0 && jaar==0) 
        {
            temp="Onbekend";
            } 
            else 
                {
            temp=dag+"/"+maand+"/"+jaar;
            }
        return temp;
        }
    
    /**
     * Getter voor geslacht
     * @return geslacht 
     */
    public String getGeslacht() 
    {
      String temp;      
      
        if (geslacht == 'm' || geslacht == 'v') 
        {
        temp="" + geslacht;
        } 
        else 
        {
            temp="Onbekend";
        }
      return temp;
      
    }

    /**
     * Getter voor BSN
     * @return BSN 
     */
    public int getBsn()
    {
        return bsn;
    }
    
    /**
     * Getter voor voornaam
     * @return voornaam 
     */
    public String getVoornaam()
    {
        return voornaam;
    }
    
    /**
     * Getter voor achternaam
     * @return achternaam 
     */
    public String getAchternaam()
    {
        return achternaam;
    }
    
    
     /**
     * Deze methode zal de bsn veranderen.
     */
    
    public void setBsn(int bsn)
    {
       this.bsn = bsn;
    }
    
    
     /**
     * Deze methode zal de voornaam veranderen.
     */
    
    public void setVoornaam(String voornaam)
    {
       this.voornaam = voornaam;
    }
    
    /**
     * Deze methode zal de achternaam veranderen.
     */
        public void setAchternaam(String achternaam)
    {
        this.achternaam = achternaam;
    }
    
    /**
     * Deze methode zal het geslacht veranderen. Er zijn 2 opties:
     * Man: 'm' en vrouw: 'v'
     */
        public void setGeslacht(char geslacht)
    {
        if(geslacht == 'm'){
                    this.geslacht = geslacht;
        }else{     
                if(geslacht == 'v')
                   {
                    this.geslacht = geslacht;
                   }else{     
                         System.out.println("Je moet voor 'm' of 'v' kiezen!");
                        }
             }
        
        
        
    }
    
    /**
     * Deze methode zal de geboortedatum aanpassen.
     * Dag: 1-31
     * Maand: 1-12
     * Jaar: 1900-2100
     */
        public void setGeboortedatum(int dag, int maand, int jaar)
    {
        if(dag >= 1 && dag <= 31 && maand >= 1 && maand <=12 && jaar >= 1900 && jaar <= 2100)
        {
            
           this.dag = dag;
           this.maand = maand;
           this.jaar = jaar;
           
            
                  if(dag > 28){
                     switch(maand){
                                
                          case 2:
                               this.dag = 0;
                               this.maand = 0;
                               this.jaar = 0;
                               break;

                     }
                  }
           
            
            
                                 if(dag == 31){
                                    switch(maand){
                                            
                                         case 1:
                                         case 3:
                                         case 5:
                                         case 7:
                                         case 8:
                                         case 10:
                                             this.dag = dag;
                                             this.maand = maand;
                                             break;
                                             
                                         case 4:
                                         case 6:
                                         case 9:                                            
                                         case 11:
                                             this.dag = 0;
                                             this.maand = 0;
                                             this.jaar = 0;
                                             break;

                                        }
                                      
                                
                                            
                                            
                                
                                 }
                                 

                                        
                                        if(jaar%4 == 0 && maand == 2 && jaar != 1900){
                                            switch(dag){
                                            
                                                case 29:
                                                    this.dag = 29;
                                                    this.maand = 2;
                                                    this.jaar = jaar;
                                                    break;
                                            }
                                        }
                           
            
            
        }else{
             System.out.println("Fout! Vul je geboortedatum opnieuw in. Let erop dat je een datum invult die bestaat!");
        }
    }

	public Betaalwijze getBetaalwijze() {
		return betaalwijze;
	}

	public void setBetaalwijze(Betaalwijze betaalwijze) {
		this.betaalwijze = betaalwijze;
	}
}
