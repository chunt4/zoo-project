class Bullfrog extends Reptile{
	int JumpHeight;
	Bullfrog(String name, String conservationStatus, String 
eatingHabit, String sound, Boolean amphibian, int jumpHeight){
		this.Name = name;
		this.ConservationStatus = conservationStatus;
		this.EatingHabit = eatingHabit;
		this.Sound = sound;
		this.Amphibian = amphibian;
		this.JumpHeight = jumpHeight;
	}
	public void setJumpHeight(int jumpHeight){ 
this.JumpHeight = jumpHeight;}
	public int getJumpHeight(){ return this.JumpHeight; }
}
