import java.util.Scanner;

class Main{
	Scanner sc = new Scanner(System.in);
	public Main(){
		
		KantineSimulatie kantineSimulatie = new KantineSimulatie();
		kantineSimulatie.simuleer(100);
	}
	
	public static void main(String[] args) {
	
	new Main();
	
	}
	
}
