// chunt4
// jbigej

// Milestone 2
// Shreya Kumar

// import AnimalPack.Animal;
import java.io.*;
import java.util.*;

abstract class Animal{
	final Boolean Breathes = true;
	String SkinType;
	String Name;
	String Sound;
	String ConservationStatus;
	String EatingHabit;
//	Animal[] animalList;

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
	public abstract void makeSound();
/*	public final void listAnimals(){
		
	} */
}

class Mammal extends Animal{
	Boolean CanineTeeth;

	Mammal(){
		this.setSkinType("Fur");
	}
	public void setCanineTeeth(Boolean CanineTeeth){
		this.CanineTeeth = CanineTeeth;
	}
	public Boolean getCanineTeeth(){
		return this.CanineTeeth;
	}
	
	
}

class Bird extends Animal{
	Boolean Flight;

	Bird(){
		this.setSkinType("Feathers");
	}
	public void setFlight(Boolean Flight){
		this.Flight = Flight;
	}
	public Boolean getFlight(){
		return this.Flight;
	}

}

class KomodoDragon extends Reptile{
	Boolean ForkedTongue;

	KomodoDragon(String name, String conservationStatus, String eatingHabit, String sound, Boolean amphibian, Boolean ForkedTongue){
		this.Name = name;
		this.ConservationStatus = conservationStatus;
		this.EatingHabit = eatingHabit;
		this.Sound = sound;
		this.Amphibian = amphibian;
		this.ForkedTongue = ForkedTongue;
	}

	public void setForkedTongue(Boolean ForkedTongue){ this.ForkedTongue = ForkedTongue;}

	public int getForkedTongue(){ return this.ForkedTongue;}

	public void makeSound(){
		System.out.println("This sound is a defense mechanism for a threatened " + this.getName() + ", who makes a " + this.getSound() + " sound.");
	}
}

class Lion extends Mammal{
	Boolean Mane;

	Lion(String name, String conservationStatus, String eatingHabit, String sound, Boolean CanineTeeth, Boolean Mane){
		this.Name = name;
		this.ConservationStatus = conservationStatus;
		this.EatingHabit = eatingHabit;
		this.Sound = sound;
		this.CanineTeeth = CanineTeeth;
		this.Mane = Mane;
	}

	public void setMane(Boolean Mane){ this.Mane = Mane;}

	public int getMane(){ return this.Mane;}

	public void makeSound(){
		System.out.println("A " + this.getName() + "'s " + this.getSound() + " is mainly used for marking territory, as well as distance");
	}
}

class Capybara extends Mammal{
	Boolean WebbedFeet;

	Capybara(String name, String conservationStatus, String eatingHabit, String sound, Boolean CanineTeeth, Boolean WebbedFeet){
		this.Name = name;
		this.ConservationStatus = conservationStatus;
		this.EatingHabit = eatingHabit;
		this.Sound = sound;
		this.CanineTeeth = CanineTeeth;
		this.WebbedFeet = WebbedFeet;
	}

	public void setWebbedFeet(Boolean WebbedFeet){ this.WebbedFeet = WebbedFeet;}

	public int getWebbedFeet(){ return this.WebbedFeet;}

	public void makeSound(){
		System.out.println("When " + this.getName() + "'s are together, they make clicking and whistling sounds, but when they want to sound the alarm, they " + this.getSound());
	}
}

class Flamingo extends Bird{
	Boolean OneLeg;

	KomodoDragon(String name, String conservationStatus, String eatingHabit, String sound, Boolean Flight, Boolean OneLeg){
		this.Name = name;
		this.ConservationStatus = conservationStatus;
		this.EatingHabit = eatingHabit;
		this.Sound = sound;
		this.Flight = Flight;
		this.OneLeg = OneLeg;
	}

	public void setOneLeg(Boolean OneLeg){ this.OneLeg = OneLeg;}

	public int getOneLeg(){ return this.OneLeg;}

	public void makeSound(){
		System.out.println("Similar to a goose, a " + this.getName() + " makes a " + this.getSound() + " sound.");
	}
}

class Emu extends Bird{
	Boolean CalfMuscles;

	KomodoDragon(String name, String conservationStatus, String eatingHabit, String sound, Boolean Flight, Boolean CalfMuscles){
		this.Name = name;
		this.ConservationStatus = conservationStatus;
		this.EatingHabit = eatingHabit;
		this.Sound = sound;
		this.Flight = Flight;
		this.CalfMuscles = CalfMuscles;
	}

	public void setCalfMuscles(Boolean CalfMuscles){ this.CalfMuscles = CalfMuscles;}

	public int getCalfMuscles(){ return this.CalfMuscles;}

	public void makeSound(){
		System.out.println(this.getName() + "'s make a deep " + this.getSound() + " sound");
	}
}

public class ZooTest{
	public static void main(String[] args){
		LinkedList<Animal> zooArray = new LinkedList<Animal>();
/*		Bullfrog Billy = new Bullfrog();
		zooArray[0] = Billy;
		Bullfrog Lily = new Bullfrog();
		zooArray[1] = Lily;
		KomodoDragon Charles = new KomodoDragon();
		zooArray[2] = Charles;
		KomodoDragon Rose = new KomodoDragon();
		zooArray[3] = Rose;
		Lion Lenny = new Lion();
		zooArray[4] = Lenny;
		Lion Nala = new Lion();
		zooArray[5] = Nala;
		Capybara Emma = new Capybara();
		zooArray[6] = Emma;
		Capybara Daniel = new Capybara();
		zooArray[7] = Daniel;
		Flamingo Britney = new Flamingo();
		zooArray[8] = Britney;
		Flamingo Mike = new Flamingo();
		zooArray[9] = Mike;
		Emu Mia = new Emu();
		zooArray[10] = Mia;
		Emu Sebastian = new Emu();
		zooArray[11] = Sebastian; */

		Scanner sysInput = new Scanner();
		String input = sysInput.nextLine();
		String[] newAnimal;
		while(!input.equals("exit")){
			System.out.println("Type exit at any time to end the program");
			System.out.println("Options :");
			System.out.println("Add animal(add)");
			System.out.println("Delete animal(delete)");
			System.out.println("Display animal(display)");
			System.out.println("");
			System.out.println("Select action: ");
			if (input.equals("add")){
				System.out.println("What animal would you like to add?");
				input = sysInput.nextLine();
				newAnimal = input.split(" ");
				if (newAnimal[0].equals("bullfrog")){
					Bullfrog newFrog = new Bullfrog();
					newFrog.setName(newAnimal[1]);
					zooArray.add(newFrog);
				}
				else if (newAnimal[0].equals("komodo")){
					KomodoDragon newKomodo = new KomodoDragon();
					newKomodo.setName(newAnimal[2]);
					zooArray.add(newKomodo);
				}
				else if (newAnimal[0].equals("lion")){
					Lion newLion = new Lion();
					newLion.setName(newAnimal[1]);
					zooArray.add(newLion);
				}
				else if (newAnimal[0].equals("capybara")){
					Capybara newCapy = new Capybara();
					newCapy.setName(newAnimal[1]);
					zooArray.add(newCapy);
				}
				else if (newAnimal[0].equals("flamingo")){
					Flamingo newFlam = new Flamingo();
					newFlam.setName(newAnimal[1]);
					zooArray.add(newFlam);
				}
				else (newAnimal[0].equals("emu")){
					Emu newEmu = new Emu();
					newEmu.setName(newAnimal[1]);
					zooArray.add(newEmu);
				}
			}
			else if (input.equals("delete")){
				System.out.println("What animal would you like to remove from the zoo?");
				input = sysInput.nextLine();
				for(int i = 0; i < zooArray.size(); i++){
					if (input.equals(zooArray[i].getName()))
						zooArray.remove(i);
				}
			}
		}
	}
}
