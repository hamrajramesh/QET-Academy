package basicJava;

public class For_each {

	public static void main(String[] args) {
	   
		int[] value= new int[] {11,22,33};
		/*for(int i=0;i<value.length;i++) {
			
			System.out.println(value[i]);*/
		
			
			for(int i:value) {
				System.out.println(i);
			}
		}
		

	}


