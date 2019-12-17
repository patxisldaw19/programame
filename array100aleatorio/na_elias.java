
public class na_elias {

	public static void main(String[] args) {
		int x = 10;
		int r, a;
		int[] numeros = new int [x];
		
		for (int i = 0; i < x; i++) {	
			numeros[i] = i+1;	
		}
		
		for (int i = 0; i < x; i++) {
			r = (int) (Math.random() * x-1) + 1;
			a = numeros[r];
			numeros[r] = numeros[i];
            //numeros[i] = r;  Supongo que está mal
            numeros[i] = a;

            for (int j = 0; j < x; j++){
	            System.out.print(numeros[j] + " ");
	        }
	        System.out.println();
		}
		
		for (int i = 0; i < x; i++)
	    {
	      System.out.print(numeros[i] + " ");
	    }
	    System.out.println();

	}

}
