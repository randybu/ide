public abstract class Animal {
	private String kingdom;
	private int age;
	private String backbone;
	
	public Animal(String kingdom, int age, String backbone){
		this.kingdom=kingdom;
		this.age=age;
		this.backbone=backbone;
	}
	
	public String getKingdom(){
		return kingdom;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getBackbone(){
		return backbone;
	}
	
	
}

