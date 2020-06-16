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
	String Species;
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
	public void setSpecies(String species){
		this.Species = species;
	}
	public String getSpecies(){
		return this.Species;
	}
	public abstract void makeSound();
/*	public final void listAnimals(){
		
	} */
}

abstract class Mammal extends Animal{
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

abstract class Bird extends Animal{
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

abstract class Reptile extends Animal{
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


class KomodoDragon extends Reptile{
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

	public void setForkedTongue(Boolean ForkedTongue){ this.ForkedTongue = ForkedTongue;}

	public Boolean getForkedTongue(){ return this.ForkedTongue;}

	public void makeSound(){
		System.out.println("This sound is a defense mechanism for a threatened " + this.getName() + ", who makes a " + this.getSound() + " sound.");
	}
}

class Bullfrog extends Reptile{
		int JumpHeight;

		Bullfrog(String name, int jumpHeight){
			this.Name = name;
			this.Species = "Bullfrog";
			this.ConservationStatus = "Least Concern";
			this.EatingHabit = "Omnivore";
			this.Sound = "Scree";
			this.Amphibian = true;
			this.JumpHeight = jumpHeight;

		}

		public void setJumpHeight(int jumpHeight){ this.JumpHeight = jumpHeight;}

		public int getJumpHeight(){ return this.JumpHeight; }


		public void makeSound(){
				System.out.println("This sound is a defense mechanism for a threatened " + this.getName() + ", who makes a " + this.getSound() + " sound.");
		}
}


class Lion extends Mammal{
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
		System.out.println("A " + this.getName() + "'s " + this.getSound() + " is mainly used for marking territory, as well as distance");
	}
}

class Capybara extends Mammal{
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

	public void setWebbedFeet(Boolean WebbedFeet){ this.WebbedFeet = WebbedFeet;}

	public Boolean getWebbedFeet(){ return this.WebbedFeet;}

	public void makeSound(){
		System.out.println("When " + this.getName() + "'s are together, they make clicking and whistling sounds, but when they want to sound the alarm, they " + this.getSound());
	}
}

class Flamingo extends Bird{
	Boolean OneLeg;

	Flamingo(String name, Boolean OneLeg){
		this.Name = name;
		this.Species = "Flamingo";
		this.ConservationStatus = "Least Concern";
		this.EatingHabit = "Omnivore";
		this.Sound = "Honk Honk";
		this.Flight = true;
		this.OneLeg = OneLeg;
	}

	public void setOneLeg(Boolean OneLeg){ this.OneLeg = OneLeg;}

	public Boolean getOneLeg(){ return this.OneLeg;}

	public void makeSound(){
		System.out.println("Similar to a goose, a " + this.getName() + " makes a " + this.getSound() + " sound.");
	}
}

class Emu extends Bird{
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

	public void setCalfMuscles(Boolean CalfMuscles){ this.CalfMuscles = CalfMuscles;}

	public Boolean getCalfMuscles(){ return this.CalfMuscles;}

	public void makeSound(){
		System.out.println(this.getName() + "'s make a deep " + this.getSound() + " sound");
	}
}

public class ZooTest{

	static void printSummaryList(LinkedList<Animal> animals){
		int frogs = 0;
		int drags = 0;
		int lions = 0;
		int capys = 0;
		int flams = 0;
		int emus = 0;

		for (int i = 0; i < animals.size(); i++){
			String curr = animals.get(i).Species;
			if(curr.equals("Bullfrog")){
				frogs++;
			}else if (curr.equals("Komodo Dragon")){
				drags++;
			}else if (curr.equals("Lion")){
				lions++;
			}else if (curr.equals("Capybara")){
				capys++;
			}else if (curr.equals("Flamingo")){
				flams++;
			}else if (curr.equals("Emu")){
				emus++;
			}
		}

		int total = frogs + drags + lions + capys + flams + emus;

		System.out.printf("Summary:\nThere are %d animals in the zoo.\n Bullfrog(s): %d \n Capybara(s): %d \n Emu(s): %d \n Flamingo(s): %d \n Komodo Dragon(s): %d\n Lion(s): %d",total, frogs, capys, emus, flams, drags, lions);
	
	}

	static void printVerboseList(LinkedList<Animal> animals){
		int i = 1;
		System.out.printf("\tName\t\tSpecies\n");

		for (int j = 0; j < animals.size(); j++){
			System.out.printf("%d:\t%s\t\t%s\n", j+1, animals.get(j).getName(), animals.get(j).getSpecies());
		}	
	}

	static public void loadZooData(LinkedList<Animal> animals) throws IOException{
		File data = new File("zoo-input.dat");
		Scanner fileScan = new Scanner(data);

		while(fileScan.hasNext()){
			String line = fileScan.nextLine();
			String[] tokens = line.split("::");
			Boolean tempBool;
			Animal temp;

			if (tokens[0].equals("Bullfrog")){
				int height = Integer.parseInt(tokens[2]);
				temp = new Bullfrog(tokens[1], height);
				animals.add(temp);	
			} else if (tokens[0].equals("Capybara")){
				if (tokens[2].equals("true")){
					tempBool = true;
				}else{
					tempBool = false;
				}
				temp = new Capybara(tokens[1], tempBool);
				animals.add(temp);	

			} else if (tokens[0].equals("Emu")){

				if (tokens[2].equals("true")){
					tempBool = true;
				}else{
					tempBool = false;
				}
				temp = new Emu(tokens[1], tempBool);
				animals.add(temp);	
			} else if (tokens[0].equals("Flamingo")){
				if (tokens[2].equals("true")){
					tempBool = true;
				}else{
					tempBool = false;
				}
				temp = new Flamingo(tokens[1], tempBool);
				animals.add(temp);	
			} else if (tokens[0].equals("Komodo Dragon")){
				if (tokens[2].equals("true")){
					tempBool = true;
				}else{
					tempBool = false;
				}
				temp = new KomodoDragon(tokens[1], tempBool);
				animals.add(temp);	
			} else if (tokens[0].equals("Lion")){
				if (tokens[2].equals("true")){
					tempBool = true;
				}else{
					tempBool = false;
				}
				temp = new Lion(tokens[1], tempBool);
				animals.add(temp);	
			}

		}
	}	

	static public void printSpecific(LinkedList<Animal> animals, String name){
		for (int i = 0; i < animals.size(); i++){
			if(animals.get(i).getName().equals(name)){
				System.out.printf(" Name: %s\n Species: %s\n Conservation Status: %s\n Eating Habits: %s\n Skin Type: %s\n", animals.get(i).getName(), animals.get(i).getSpecies(), animals.get(i).getConservationStatus(), animals.get(i).getEatingHabit(), animals.get(i).getSkinType());

			}
		}
	}



	public static void main(String[] args) throws IOException{
		LinkedList<Animal> zooArray = new LinkedList<Animal>();

		loadZooData(zooArray);

		Scanner sysInput = new Scanner(System.in);
		String input = "";
		String[] newAnimal;
		while(!input.equals("exit")){
			System.out.println("");
			System.out.println("Type exit at any time to end the program");
			System.out.println("Options :");
			System.out.println("	Add animal(add)");
			System.out.println("	Delete animal(delete)");
			System.out.println("	Display animal(display)");
			System.out.println("");
			System.out.println("Select action: ");
			input = sysInput.nextLine();
			if (input.equals("add")){
				System.out.println("What animal would you like to add? (species name)");
				input = sysInput.nextLine();
				newAnimal = input.split(" ");
				if (newAnimal[0].equals("bullfrog")){
					System.out.println("Enter the Bullfrog's jump height:");
					input = sysInput.nextLine();
					int inputint = Integer.parseInt(input);
					String name = newAnimal[1].substring(0, 1).toUpperCase() + newAnimal[1].substring(1);
					Bullfrog newFrog = new Bullfrog(name, inputint);
					zooArray.add(newFrog);
				}
				else if (newAnimal[0].equals("komodo")){
					String name = newAnimal[2].substring(0, 1).toUpperCase() + newAnimal[2].substring(1);
					KomodoDragon newKomodo = new KomodoDragon(name, true);
					zooArray.add(newKomodo);
				}
				else if (newAnimal[0].equals("lion")){
					System.out.println("Does this lion have a mane? Enter true or false");
					input = sysInput.nextLine();
					Lion newLion;
					String name = newAnimal[1].substring(0, 1).toUpperCase() + newAnimal[1].substring(1);
					if (input.equals("true")){
						newLion = new Lion(name, true);
					}else{
						newLion = new Lion(name, false);
					}
					zooArray.add(newLion);
				}
				else if (newAnimal[0].equals("capybara")){
					String name = newAnimal[1].substring(0, 1).toUpperCase() + newAnimal[1].substring(1);
					Capybara newCapy = new Capybara(name, true);
					zooArray.add(newCapy);
				}
				else if (newAnimal[0].equals("flamingo")){
					String name = newAnimal[1].substring(0, 1).toUpperCase() + newAnimal[1].substring(1);
					Flamingo newFlam = new Flamingo(name, true);
					zooArray.add(newFlam);
				}
				else if (newAnimal[0].equals("emu")){
					String name = newAnimal[1].substring(0, 1).toUpperCase() + newAnimal[1].substring(1);
					Emu newEmu = new Emu(name, true);
					zooArray.add(newEmu);
				}
			}
			else if (input.equals("delete")){
				System.out.println("What animal would you like to remove from the zoo?");
				input = sysInput.nextLine();
				for(int i = 0; i < zooArray.size(); i++){
					if (input.equals(zooArray.get(i).getName())){
						zooArray.remove(i);
					}
				}
			}else if (input.equals("display")){
				System.out.println("Please enter type of display (summary | verbose | specific):");
				input = sysInput.nextLine();
				System.out.println("");
				if(input.equals("summary")){
					printSummaryList(zooArray);
					System.out.println("");
				}else if (input.equals("verbose")){
					printVerboseList(zooArray);
					System.out.println("");
				}else if (input.equals("specific")){
					System.out.println("Enter the name of the animal: ");
					input = sysInput.nextLine();
					printSpecific(zooArray, input);
					System.out.println("");
				}		
			}
		}
	}
}
