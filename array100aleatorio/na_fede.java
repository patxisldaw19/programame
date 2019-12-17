//package Prueba;

import java.util.Random;

public class na_fede {

	public static void main(String[] args) {


		int vector [] = new int [100000];
		int random;

		for (int i = 0; i < vector.length; i++) {
			compruebo(vector, i);
			//System.out.print(vector[i]+" ");	
		}

	}

	public static void compruebo(int [] a, int i) {
		int random = (int) Math.floor(Math.random()*(100000-0+1)+0);
		boolean serepite = false;
		int numero = random;
		int [] vector = a;
		int l = i;

		for (int j = 0; j < a.length; j++) {

			if (numero == a[j]) {

				serepite = true;

			}
		}

		if (serepite) {

			compruebo(vector , l);

		}else {

			a[i] = numero;


		}	
	}


}
