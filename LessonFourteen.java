
public class LessonFourteen {

	public static void main(String[] args) {
		
		Animals genericAnimal = new Animals();
		
		System.out.println(genericAnimal.getName());
		
		System.out.println(genericAnimal.favFood);
		
		System.out.println();
		
		Cats morris = new Cats("Morris", "Tuna", "Rubber Mouse");
		
		System.out.println(morris.getName());
		System.out.println(morris.favFood);
		System.out.println(morris.favToy);
		
		Animals tabby = new Cats("Tabby", "Salmon", "Ball");
		
		acceptAnimal(tabby);
		
		
		
	}
	
	public static void acceptAnimal(Animals randAnimal) {
		System.out.println();
		System.out.println(randAnimal.getName());
		System.out.println(randAnimal.favFood);
		System.out.println();
		
		randAnimal .walkAround();
		
		
		// POLYMORPHISM says: whenever an object is passed or a method is called
		// for a specific object, java says: is this an Animal? yes,  but it
		// is also a subclass of an animal? which it is, it's a cat
		// and if it is a cat, is there a wakAround method inside the Animals class?
		// yes, there is, but polymorphism sees that the same method is defined in the Cats class.
		// So since it sees that, it uses that method instead.
		// The interpreter is not smart enough to use methods not defined
		// in the Animals class
		
		// Polymorphism is smart enough to find any fields or
		// methods defined in both the superclass and the subclass
		// in this example, Animals and Cats class.
		// However, it is not smart enough to find methods only defined
		// in the subclass, Cats.
		
		// If you want to use methods or fields only defined in the subclass
		// you have to *cast* the object to that specific class first
	
		Cats tempCat = (Cats) randAnimal;
		System.out.println(tempCat.favToy);
		
		System.out.println(((Cats)randAnimal).favToy);
	
		
		// To check if an object is an instance of or has the ability to 
		// access the methods and fields defined inside a certain class: 
		
		if (randAnimal instanceof Cats) {
			System.out.println(randAnimal.getName() + " is a cat");
		}
		
		if (randAnimal instanceof Animals) {
			System.out.println(randAnimal.getName() + " is an animal");
		}
	
	
	}
}
