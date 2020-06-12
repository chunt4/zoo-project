// chunt4
// jbigej

// Milestone 2
// Shreya Kumar

import AnimalPack.Animal;

import java.io.*;
import java.util.Scanner;

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


public class ZooTest{
	public static void main(String[] args){
		Animal[] zooArray = new Animal[4096];
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

		System.out.println("Type exit at any time to end the program");
		System.out.println("Options :");
		System.out.println("Add animal(add)");
		System.out.println("Delete animal(delete)");
		System.out.println("Display animal(display");
		System.out.println("");
		System.out.println("Select action: ");
	}
}
