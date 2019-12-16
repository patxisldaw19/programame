package src;

public class Jesus_aleatorios_sin_repeticion {

	public static void main(String[] args) {
		
		int alea = 0, ini = 1, fin = 100, x = 1;
		
		int[] numeros = new int[101];
		
		boolean valido;
		
		while(x <= 100) {
			
			valido = false;
			
			while(!valido) {
				
				alea = (int)((Math.random() * (fin - ini + 1)) + ini);
				
				if(numeros[alea] != alea) valido = true;
			}
			numeros[alea] = alea;
			
			System.out.println(x + " " + alea);	
			
			x++;	
		}
	}
}