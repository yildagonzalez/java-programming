// Abstract class, you would use this when you want to create a class in which
// every method does NOT need to be implemented to use the abstract class
public abstract class Crashable {

	boolean carDrivable = true;
	
	public void youCrashed() {
		this.carDrivable = false;
	}
	
	public abstract void setCarStrenght(int carStrenght);
	
	public abstract int getCarStrenght();
		
	
}
