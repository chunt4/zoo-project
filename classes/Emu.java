public class Emu extends Bird{
	Boolean CalfMuscles;
	Emu(String name, Boolean CalfMuscles){
		this.Name = name;
		this.Species = "Emu";
		this.ConservationStatus = "Least Concern";
		this.EatingHabit = "Omnivore";
		this.Sound = "Thump Thump";
		this.Flight = false;
		this.CalfMuscles = CalfMuscles;
	}
	public void setCalfMuscles(Boolean CalfMuscles){ 
this.CalfMuscles = CalfMuscles;}
	public Boolean getCalfMuscles(){ return 
this.CalfMuscles;}
	public void makeSound(){
		System.out.println(" " + this.getSpecies() + 
"'s make a deep " + this.getSound() + " sound");
	}
}
