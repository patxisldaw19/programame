import java.util.ArrayList;

public class na_carlos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Integer> vector = new ArrayList <Integer>(); 
		int aleatorio;

		for (int i = 0; i <= 999999; i++) {

			aleatorio = (int)((Math.random()*(1000000-1+1)) + 1);

			if (vector.contains(aleatorio)) {

				aleatorio = (int)((Math.random()*(1000000-1+1)) + 1);

			}
			else {

				vector.add(aleatorio);
			}			
		}

		System.out.println(vector);			
	}
}
