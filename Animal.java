public abstract class Animal{
	final Boolean Breathes = true;
	String SkinType;
	String Name;
	String Sound;
	String ConservationStatus;
	String EatingHabit;
	String Species;

	public String getBreathes(){
		if (this.Breathes == true){
			return "true";
		}else{
			return "false";
		}
	}

	public void setSkinType(String skin){
		this.SkinType = skin;
	}
	public String getSkinType(){
		return this.SkinType;
	}
	public void setName(String name){
		this.Name = name;
	}
	public String getName(){
		return this.Name;
	}
	public void setSound(String sound){
		this.Sound = sound;
	};
	public String getSound(){
		return this.Sound;
	}
	public void setConservationStatus(String cstatus){
		this.ConservationStatus = cstatus;
	}
	public String getConservationStatus(){
		return this.ConservationStatus;
	}
	public void setEatingHabit(String eat){
		this.EatingHabit = eat;
	}
	public String getEatingHabit(){
		return this.EatingHabit;
	}
	public void setSpecies(String species){
		this.Species = species;
	}
	public String getSpecies(){
		return this.Species;
	}
	public abstract void makeSound();

}
