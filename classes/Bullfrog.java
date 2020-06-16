public class Bullfrog extends Reptile{
		int JumpHeight;
		Bullfrog(String name, int jumpHeight){
			this.Name = name;
			this.Species = "Bullfrog";
			this.ConservationStatus = "Least 
Concern";
			this.EatingHabit = "Omnivore";
			this.Sound = "Scree";
			this.Amphibian = true;
			this.JumpHeight = jumpHeight;
		}
		public void setJumpHeight(int jumpHeight){ 
this.JumpHeight = jumpHeight;}
		public int getJumpHeight(){ return 
this.JumpHeight; }
		public void makeSound(){
				System.out.println(" This sound 
is a defense mechanism for a threatened " + this.getSpecies() + 
", who makes a " + this.getSound() + " sound.");
		}
}
