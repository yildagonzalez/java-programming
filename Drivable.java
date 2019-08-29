public interface Drivable {
	
	// An interface is an empty class that provides to someone or tells someone
	// what methods they must implement if they want to use this interface
	
	// fields inside an interface are final (they never change)
	
	double PI = 3.14;
	
	int getWheels();
	
	void setWheels(int numWheels);
	
	double getSpeed();
	
	void setSpeed(double Speed);
}
