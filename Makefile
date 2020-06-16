JCC = javac

default: Animal.class Reptile.class Mammal.class Bird.class Lion.class Capybara.class KomodoDragon.class Bullfrog.class Emu.class Flamingo.class ZooTest.class

Animal.class:
	$(JCC) ./Animal.java


Reptile.class:
	$(JCC) ./Reptile.java

Mammal.class:
	$(JCC) ./Mammal.java

Bird.class:
	$(JCC) ./Bird.java


Bullfrog.class:
	$(JCC) ./Bullfrog.java

KomodoDragon.class:
	$(JCC) ./KomodoDragon.java

Capybara.class:
	$(JCC) ./Capybara.java

Lion.class:
	$(JCC) ./Lion.java

Emu.class:
	$(JCC) ./Emu.java

Flamingo.class:
	$(JCC) ./Flamingo.java

ZooTest.class:
	$(JCC) ./ZooTest.java

run: 
	java ZooTest

clean:
	$(RM) *.class


