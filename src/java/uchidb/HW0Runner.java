package uchidb;


/**
 * @author aelmore
 */
public class HW0Runner implements InterfaceHolder{

	//TODO you likely will need to add member variable
	public Containers container; //Member container variable named 'container'
	
	// This class is a factory for a singleton containers class.
	// https://www.tutorialspoint.com/java/java_using_singleton.htm

	//added during Banas example

	//added extra variables not in InterfaceHolder
	int numOfWheels = 2;
	double theSpeed = 0;
	int carStrength = 0;

	//add everything to be public.

	public int getWheel(){
		return this.numOfWheels;
	}

	public void setWheels(int numWheels){
		this.numOfWheels = numWheels;
	}

	public double getSpeed(){
		return this.theSpeed;
	}

	public void setSpeed(double speed){
		this.theSpeed = theSpeed;
	}


	//New constructor so we can create new vehicles.

	public HW0Runner(int wheels, double speed){ //so same name as class.

		this.numOfWheels = wheels;
		this.theSpeed = speed;
	}






	// End Banas example






	public static Containers<Integer, String> getContainers() {



		return null;
	}


	public static void main(String[] args){
		
	}
}
