//package src;

public class na_jesus {

	public static void main(String[] args) {
		
		int alea = 0, ini = 1, fin = 10000000, x = 1;
		
        int[] numeros = new int[10000001];
        
        long contaleatorios=0;
		
		boolean valido;
		
		while(x <= 10000000) {
			
			valido = false;
			
			while(!valido) {
				
                alea = (int)((Math.random() * (fin - ini + 1)) + ini);
                
                contaleatorios++;
				
				if(numeros[alea] != alea) valido = true;
			}
			numeros[alea] = alea;
			
            //System.out.println(x + " " + alea);
            //System.out.print(" " + alea);	
			
			x++;	
        }

        System.out.println();	
        System.out.println(contaleatorios);	



	}
}