//package Repaso;

public class na_sergio {

	public static void main(String[] args) {

		int[] aleatorios = new int[10000];
		int numeroaleatorio;

		for (int i = 0; i < aleatorios.length; i++) {
			numeroaleatorio = (int) (Math.random() * 10000 + 1);
			aleatorios[i] = numeroaleatorio;
		}

		for (int i = 0; i < aleatorios.length; i++) {

			for (int j = 0; j < aleatorios.length; j++) {

				if (aleatorios[i] == aleatorios[j] && i != j) {

					numeroaleatorio = (int) (Math.random() * 10000 + 1);
					aleatorios[i] = numeroaleatorio;
					i = 0;
				}
			}
		}

		for (int i = 0; i < aleatorios.length; i++) {
			System.out.print(aleatorios[i]+" ");
        }
        System.out.println();

	}

}
