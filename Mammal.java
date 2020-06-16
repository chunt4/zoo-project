public abstract class Mammal extends Animal{
	Boolean CanineTeeth;
	Mammal(){
		this.setSkinType("Fur");
	}
	public void setCanineTeeth(Boolean CanineTeeth){
		this.CanineTeeth = CanineTeeth;
	}
	public Boolean getCanineTeeth(){
		return this.CanineTeeth;
	}
	
	
}
