public class Snake extends Animal implements Attack{

	String species;
	String scale_color;
	private Venom venom;
	
	public Snake(String kingdom, int age, String backbone, Venom v, String color, String species) {
		super(kingdom, age, backbone);
		setVenom(v);
		scale_color=color;
		this.species=species;
	}

	public Venom getVenom() {
		return venom;
	}

	public void setVenom(Venom venom) {
		this.venom = venom;
	}
	
	@Override
	public void attack() {
		System.out.println("Inject Venom with : "+ venom.getVolume());		
	}
	
	
	
	
	
	
}
