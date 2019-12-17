import java.util.Random;

public class na_nicanor {

	public static void main(String[] args) {

		int[] vector = new int[100000];
		int i;
		
		for (i = 0; i < vector.length; i++) {
			comprobarAletorio(vector, i);	
		}
		
		for (int j = 0; j < vector.length; j++) {
			System.out.print(vector[j]+" ");
        }
        System.out.println();
	}

	private static void comprobarAletorio(int[] vector, int auxiliar) {
		
		int aletorio;
		boolean seRepite = false;
		aletorio = (int) (Math.random()*100000 + 1);			
		
		for (int i = 0; i < (auxiliar +1); i++) {
			if (aletorio == vector[i] ) {
				seRepite = true;
			}
		}
		
		if (seRepite) {
		 comprobarAletorio(vector,auxiliar);			
		}else {
			vector[auxiliar] = aletorio;
		}
	}	
}
