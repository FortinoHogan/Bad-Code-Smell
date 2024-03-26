package parallel_after;

public class Main {

	public static void main(String[] args) {
		class Animal {
		    // common animal attributes and methods
		}
		class Pet extends Animal {
		    // attributes and methods common to pets
		}
		class WildAnimal extends Animal {
		    // attributes and methods specific to wild animals
		}
		class Dog extends Pet {
		    // dog-specific attributes and methods
		}
		class Cat extends Pet {
		    // cat-specific attributes and methods
		}
		class Bird extends Pet {
		    // bird-specific attributes and methods
		}
		class Shark extends WildAnimal {
		    // shark-specific attributes and methods
		}
		class Tiger extends WildAnimal {
		    // tiger-specific attributes and methods
		}
	}

}
