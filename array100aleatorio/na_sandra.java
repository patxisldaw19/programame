//package clase_random;

import java.util.Arrays;
import java.util.Scanner;

public class na_sandra {

	public static void main(String[] args) {

		int num_random = 0;
		int []vector = new int [100];
		int num;
		int contador = 0;
		
		Scanner sc = new Scanner(System.in);

				
		for (int i = 0; i < vector.length; i++) {
			num_random = generarRandom(num_random);
				if (vector[i] != num_random) {
					vector[i] = num_random;
				}
				else {
					i--;
				}
		}

		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i] + " ");
			
		}
		
		
        System.out.println();
        
        /* comento estas lineas
		System.out.println("num:");
		num = sc.nextInt();
		
		for (int i = 0; i < vector.length; i++) {
			if (num == vector[i]) {
				contador++;
			}
			
		}
		System.out.println("El num se rep:" + contador);
		*/
		



	}

	public static int generarRandom(int num_random) {

		num_random = (int) (Math.random() * 100 + 1); 
		return num_random;

	}


}
	



