// chunt4
// jbigej

// Milestone 2
// Shreya Kumar

//import classes.*;
import java.io.*;
import java.util.*;

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
				System.out.printf(" Name: %s\n Species: %s\n Breathes Above Water: %s\n Conservation Status: %s\n Eating Habits: %s\n Skin Type: %s\n", animals.get(i).getName(), animals.get(i).getSpecies(), animals.get(i).getBreathes(), animals.get(i).getConservationStatus(), animals.get(i).getEatingHabit(), animals.get(i).getSkinType());
				if(animals.get(i).getSpecies().equals("Bullfrog")){
					String Amph;
					if(((Bullfrog)animals.get(i)).getAmphibian()){
						Amph = "True";
					}
					else{
						Amph = "False";
					}
					System.out.printf(" Jump Height: %d\n Amphibian: %s\n", ((Bullfrog)animals.get(i)).getJumpHeight(), Amph);
				}
				if(animals.get(i).getSpecies().equals("Komodo Dragon")){
					String Amph, Fork;
					if(((KomodoDragon)animals.get(i)).getAmphibian()){
						Amph = "True";
					}
					else{
						Amph = "False";
					}
					if(((KomodoDragon)animals.get(i)).getForkedTongue()){
						Fork = "True";
					}
					else{
						Fork = "False";
					}

					System.out.printf(" Forked Tongue: %s\n Amphibian: %s\n", Fork, Amph);
				}
				if(animals.get(i).getSpecies().equals("Lion")){
					String CanineTeeth, Mane;
					if(((Lion)animals.get(i)).getCanineTeeth()){
						CanineTeeth = "True";
					}
					else{
						CanineTeeth = "False";
					}
					if(((Lion)animals.get(i)).getMane()){
						Mane = "True";
					}
					else{
						Mane = "False";
					}

					System.out.printf(" Canine Teeth: %s\n Mane: %s\n", CanineTeeth, Mane);
				}
				if(animals.get(i).getSpecies().equals("Capybara")){
					String CanineTeeth, WebbedFeet;
					if(((Capybara)animals.get(i)).getCanineTeeth()){
						CanineTeeth = "True";
					}
					else{
						CanineTeeth = "False";
					}
					if(((Capybara)animals.get(i)).getWebbedFeet()){
						WebbedFeet = "True";
					}
					else{
						WebbedFeet = "False";
					}

					System.out.printf(" Canine Teeth: %s\n Webbed Feet: %s\n", CanineTeeth, WebbedFeet);
				}
				if(animals.get(i).getSpecies().equals("Flamingo")){
					String Flight, OneLeg;
					if(((Flamingo)animals.get(i)).getFlight()){
						Flight = "True";
					}
					else{
						Flight = "False";
					}
					if(((Flamingo)animals.get(i)).getOneLeg()){
						OneLeg = "True";
					}
					else{
						OneLeg = "False";
					}

					System.out.printf(" Can Fly: %s\n Stands on One Leg: %s\n", Flight, OneLeg);
				}
				if(animals.get(i).getSpecies().equals("Emu")){
					String Flight, Calves;
					if(((Emu)animals.get(i)).getFlight()){
						Flight = "True";
					}
					else{
						Flight = "False";
					}
					if(((Emu)animals.get(i)).getCalfMuscles()){
						Calves = "True";
					}
					else{
						Calves = "False";
					}

					System.out.printf(" Can Fly: %s\n Has calf muscles: %s\n", Flight, Calves);
				}
				animals.get(i).makeSound();
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
					System.out.println("Enter the Bullfrog's jump height (ex. 00): ");
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
				System.out.println("What animal would you like to remove from the zoo? (Name)");
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
					System.out.println("Enter the name of the animal: (Name) ");
					input = sysInput.nextLine();
					printSpecific(zooArray, input);
					System.out.println("");
				}		
			}
		}
	}
}
