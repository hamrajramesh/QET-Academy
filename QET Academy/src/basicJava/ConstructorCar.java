package basicJava;

public class ConstructorCar {
	
	int noWheels;
	int noSeats;
	int headlights;
	
    public ConstructorCar() {
    	System.out.println("it runs 300km/hr");
    	noSeats=4;
		noWheels=4;
    	
    }
	

	public static void main(String[] args) {
		
		ConstructorCar c1= new ConstructorCar();
		c1.headlights=6;
		
		
		System.out.println(c1.headlights);
		
		
		
		
		
		
		

	}

}
