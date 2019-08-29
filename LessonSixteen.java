// Object class, and class Class 
// Every object created inherits all the methods from the class known as the
// Object class
public class LessonSixteen {

	public static void main(String[] args) {
		
		// type Object
		Object superCar = new Vehicle();
		
		// Since the type of our object is object, it can't access the methods
		// inside the class Vehicle unless we cast it
		
		System.out.println(((Vehicle)superCar).getSpeed());
		
		Vehicle superTruck = new Vehicle();
		
		System.out.println(superCar.equals(superTruck));
		
		// every time we create a new object it creates a unique identifier called a *hash code*
		System.out.println(superCar.hashCode());
		
		// to figure out the class of the object:
		System.out.println(superCar.getClass());
		
		// get name of the class without the class keyword
		System.out.println(superCar.getClass().getName());
		
		// check if two objects have the same class
		if(superCar.getClass() == superTruck.getClass()) {
			System.out.println("Same class");
		}
		
		System.out.println();
		
		// get the superclass
		System.out.println(superCar.getClass().getSuperclass());
		
		System.out.println(superCar.toString());
		
		int randNum = 100;
		System.out.println(Integer.toString(randNum));
		
		// clone allows you to copy all the values of an object at whatever
		// point in time and assign it to another.
		// But, if you make changes to one of the clones after you create it, 
		// that doesn't affect the other clones 
		
		superTruck.setWheels(6);
		
		Vehicle superTruck2 = (Vehicle)superTruck.clone();
		
		System.out.println(superTruck.getWheels());
		System.out.println(superTruck2.getWheels());
		
		System.out.println(superTruck.hashCode());
		System.out.println(superTruck2.hashCode());

		
		
		
		
		
		
		
		
		
		
		
	}
}
