import java.util.Scanner;

class Main{
	Scanner sc = new Scanner(System.in);
	public Main(){
		
		KantineSimulatie kantineSimulatie = new KantineSimulatie();
		kantineSimulatie.simuleer(100);
	}
	public Main(String[] namen, double[] prijzen, int[] hoeveelheden){
		KantineSimulatie kantineSimulatie = new KantineSimulatie(namen, prijzen, hoeveelheden);
		kantineSimulatie.simuleer(100);
	}
	
	public static void main(String[] args) {
	
		if(args.length>0){
			int aantal = new Integer(args[0]).intValue();
			String[] namen = new String[aantal];
			double[] prijzen = new double[aantal];
			int[] hoeveelheden = new int[aantal];
			
			int i = 0;
			while(i<aantal){
				//formule voor args positie is[<default offset> + <array offset> + <regelnumer in output array> * <aantal output arrays>]
				namen[i]=args[1+0+i*3];
				prijzen[i]= new Double(args[1+1+i*3]).doubleValue();
				hoeveelheden[i]= new Integer(args[1+2+i*3]).intValue();
				
				i++;
			}
			
			new Main(namen, prijzen, hoeveelheden);
		}
		else{
			new Main();
		}
	}
	
}
