
public class NumeroRandom {

	public static void main(String[] args) {
		int x = 100;
		int r, a;
		int[] numeros = new int [x];
		
		for (int i = 0; i < x; i++) {	
			numeros[i] = i+1;	
		}
		
		for (int i = 0; i < x; i++) {
			r = (int) (Math.random() * x-1) + 1;
			a = numeros[r];
			numeros[r] = numeros[i];
			numeros[i] = r;
		}
		
		for (int i = 0; i < x; i++)
	    {
	      System.out.print(numeros[i] + " ");
	    }
	    System.out.println();

	}

}
