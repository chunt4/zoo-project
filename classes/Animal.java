// package AnimalPack;

import java.util.ArrayList;

public class Animal{
	final Boolean Breathes = true;
	String SkinType;
	String Name;
	String Sound;
	String ConservationStatus;
	String EatingHabit;
//	Animal[] animalList;

	public abstract void setSkinType();
	public String getSkinType(){
		return this.SkinType;
	}
	public abstract void setName();
	public String getName(){
		return this.Name;
	}
	public abstract void setSound();
	public String getSound(){
		return this.Sound;
	}
	public abstract void setConservationStatus();
	public String getConservationStatus(){
		return this.ConservationStatus;
	}
	public abstract void setEatingHabit();
	public String getEatingHabit(){
		return this.EatingHabit;
	}
/*	public final void listAnimals(){
		
	} */
}
