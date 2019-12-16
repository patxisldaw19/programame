package variosyjuegos;

import java.util.Scanner;

public class NumAleatorios {

	public static void main(String[] args) {
		
		int numeros [] = new int [100];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=(int) Math.floor(Math.random() * 100 + 1);
			if(i!=0) {
				for (int j = i-1; j >= 0; j--) {
					if(numeros[j]==numeros[i]) {
						i--;
						break;
					}
				}
			}
		}
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

	}

}
