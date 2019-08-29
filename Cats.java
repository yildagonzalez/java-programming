// subclass of Animals class,
// this just means we want to copy all fields and methods defined in the animal class
// this is defined as *inheritance*
public class Cats extends Animals {
	
	public String favToy = "Yarn"; 
	
	public void playWith() {
		System.out.println("Yeah " + favToy);
	}
	
	// modify the walkAround, and we are able to do this because it doesn't have the *final* keyword in pit
	public void walkAround() {
		System.out.println(this.getName() + " stalks around");
	}
	
	public String getToy() {
		return this.favToy;
	}
	
	public Cats() {
		
	}
	
	public Cats(String name, String favFood, String favToy) {
		// to call a superclass (Animals) constructor:
		super(name, favFood);
		// favToy does not exist in Animals class, so we define it here:
		this.favToy = favToy;
	}
	
	
	
}
