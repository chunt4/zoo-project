public class KomodoDragon extends Reptile{
	Boolean ForkedTongue;
	KomodoDragon(String name, Boolean forkedTongue){
		this.Name = name;
		this.Species = "Komodo Dragon";
		this.ConservationStatus = "Vulnerable";
		this.EatingHabit = "Carnivore";
		this.Sound = "Blehh";
		this.Amphibian = false;
		this.ForkedTongue = forkedTongue;
	}
	public void setForkedTongue(Boolean ForkedTongue){ 
this.ForkedTongue = ForkedTongue;}
	public Boolean getForkedTongue(){ return 
this.ForkedTongue;}
	public void makeSound(){
		System.out.println(" This sound is a defense 
mechanism for a threatened " + this.getSpecies() + ", who makes 
a " + this.getSound() + " sound.");
	}
}
