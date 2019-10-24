public class Venom {
	private String compound;
	private String severity;
	private int volume;
	
	public Venom(){
		
	}
	
	public Venom(String compound, String severity, int volume){
		this.compound=compound;
		this.severity=severity;
		this.volume=volume;
	}

	public String getCompound() {
		return compound;
	}

	public void setCompound(String compound) {
		this.compound = compound;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
}
