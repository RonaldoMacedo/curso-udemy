package application;

public class Program16 {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"maria", "bob", "alex"};
		
		System.out.println("------------For normal--------------");
		for(int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println();
		System.out.println("-------------For each--------------");
		for(String obj : vect) {
			System.out.println(obj);
		}

	}

}
