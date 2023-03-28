package basicJava;

public class Man implements GodInterface{



	
	public void runs() {
		System.out.println("man runs faster");
		
	}

	public void walk() {
		System.out.println("man walks fast");
		
	}
	
	public static void main (String[] args) {
		
		Man m= new Man();
		m.runs();
		m.walk();
		

	}

}
