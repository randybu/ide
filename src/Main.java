public class Main {

	public Main(){
		
	}
	
	
	public static void main(String[] args) {
		Venom v = new Venom("Cyanide", "Deadly", 2);
		Snake cobra = new Snake("Amphibi",3,"Vertebrate",v,"Red","Cobra");
		cobra.attack();
	}

}
