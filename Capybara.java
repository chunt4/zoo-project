public class Capybara extends Mammal{
	Boolean WebbedFeet;
	Capybara(String name, Boolean WebbedFeet){
		this.Name = name;
		this.Species = "Capybara";
		this.ConservationStatus = "Least Concern";
		this.EatingHabit = "Herbivore";
		this.Sound = "Ruff Ruff";
		this.CanineTeeth = false;
		this.WebbedFeet = WebbedFeet;
	}
	public void setWebbedFeet(Boolean WebbedFeet){ 
this.WebbedFeet = WebbedFeet;}
	public Boolean getWebbedFeet(){ return 
this.WebbedFeet;}
	public void makeSound(){
		System.out.println(" When " + this.getSpecies() 
+ "'s are together, they make clicking and whistling sounds, but when they want to sound the alarm, they " + 
this.getSound());
	}
}
