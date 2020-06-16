public class Lion extends Mammal{
	Boolean Mane;
	Lion(String name, Boolean Mane){
		this.Name = name;
		this.Species = "Lion";
		this.ConservationStatus = "Vulnerable";
		this.EatingHabit = "Carnivore";
		this.Sound = "Roar";
		this.CanineTeeth = true;
		this.Mane = Mane;
	}
	public void setMane(Boolean Mane){ this.Mane = Mane;}
	public Boolean getMane(){ return this.Mane;}
	public void makeSound(){
		System.out.println(" A " + this.getSpecies() + 
"'s " + this.getSound() + " is mainly used for marking territory, as well as distance");
	}
}
