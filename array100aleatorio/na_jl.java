//package jositoluiso;

import java.util.Random;
import java.util.Scanner;

public class na_jl {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int n = sc.nextInt();
		int v = 0;
		int descartes[] = new int[n];
		for (int i = 0; i < n; i++) {
			boolean fin = false;
			int num;
			do {
                num = r.nextInt(n + 1);
                //System.out.println("-> "+num+" ");
				int cont = 0;
				for (int j = 0; j < descartes.length; j++) {
					if (num != descartes[j]) {
						cont++;
					}
					if (cont == descartes.length) {
						fin = true;
					}
				}
			} while (!fin);
			descartes[v] = num;
			System.out.print(num+" ");
			v++;
		}
	}
}