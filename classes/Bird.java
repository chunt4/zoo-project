public abstract class Bird extends Animal{
	Boolean Flight;
	Bird(){
		this.setSkinType("Feathers");
	}
	public void setFlight(Boolean Flight){
		this.Flight = Flight;
	}
	public Boolean getFlight(){
		return this.Flight;
	}
}
