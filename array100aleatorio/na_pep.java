//package variosyjuegos;

import java.util.Scanner;

public class na_pep {

	public static void main(String[] args) {
		
		int numeros [] = new int [100000];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=(int) Math.floor(Math.random() * 100000 + 1);
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
			System.out.print(numeros[i]+" ");
		}

	}

}
