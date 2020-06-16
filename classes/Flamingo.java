public class Flamingo extends Bird{
	Boolean OneLeg;
	Flamingo(String name, Boolean OneLeg){
		this.Name = name;
		this.Species = "Flamingo";
		this.ConservationStatus = "Least Concern";
		this.EatingHabit = "Omnivore";
		this.Sound = "Honk Honk";
		this.Flight = true;
		this.OneLeg = OneLeg;
	}
	public void setOneLeg(Boolean OneLeg){ this.OneLeg = 
OneLeg;}
	public Boolean getOneLeg(){ return this.OneLeg;}
	public void makeSound(){
		System.out.println(" Similar to a goose, a " + 
this.getSpecies() + " makes a " + this.getSound() + " sound.");
	}
}
