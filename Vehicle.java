
public class Vehicle extends Crashable implements Drivable, Cloneable {

	// you must define every single thing that is inside your interface
	
	int numOfWheels = 2;
	double theSpeed = 0;
	
	int carStrenght = 0;
	
	public int getWheels() {
		return this.numOfWheels;
	}
	
	public void setWheels(int numWheels) {
		this.numOfWheels = numWheels;
	}
	
	public double getSpeed() {
		return this.theSpeed;
	}
	
	public void setSpeed(double speed) {
		this.theSpeed = speed;
	}
	
	
	// constructor
	public Vehicle() {
		
	}
	
	public Vehicle(int wheels, double speed) {
		this.numOfWheels = wheels;
		this.theSpeed = speed;
	}
	
	public void setCarStrenght(int carStrenght) {
		this.carStrenght = carStrenght;
	}
	
	public int getCarStrenght() {
		return this.carStrenght;
	}
	
	// to overwrite toString:
	public String toString() {
		return "Num of wheels: " + this.numOfWheels;
	}
	
	// define clone method
	public Object clone() {
		
		Vehicle car;
		
		try {
			car = (Vehicle) super.clone();
		}
		catch(CloneNotSupportedException e) {
			return null;
		}
		return car;
	}
	
	
}
