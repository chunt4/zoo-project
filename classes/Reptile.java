class Reptile extends Animal{
	Boolean Amphibian;
	Reptile(){
		this.setSkinType("Scales");
	}
	public void setAmphibian(Boolean amphibian){
		this.Amphibian = amphibian;
	}
	public Boolean getAmphibian(){
		return this.Amphibian;
	}
}
