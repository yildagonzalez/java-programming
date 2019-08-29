
public class Animals {

	private String name = "Animal"; // only things with access to private is the Animals class
	public String favFood = "Food"; // the whole world has access to this 
	
	// Animals is a super class, because we expect to make subclasses or copies from it
	// and then change those copies in some way
	// if we want those subclasses to be able to access this method, we 
	// have to make it a protected rather than a public or private
	// final keyword means that the method can't be modified by any
	// other classes or subclasses 
	protected final void changeName(String newName) {
		this.name = newName;
	}
	
	protected final String getName() {
		return this.name;
	}
	
	public void eatStuff() {
		System.out.println("Yum " + favFood);
	}
	
	public void walkAround() {
		System.out.println(this.name + " walks around");
	}
	
	public Animals() {
		
	}
	
	public Animals(String name, String favFood) {
		this.changeName(name);
		this.favFood = favFood;
	}
	
	
	
	
	
}
