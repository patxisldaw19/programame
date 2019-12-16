package Repaso;

public class Numerosaleatoriosinrepetirse {

	public static void main(String[] args) {

		int[] aleatorios = new int[100];
		int numeroaleatorio;

		for (int i = 0; i < aleatorios.length; i++) {
			numeroaleatorio = (int) (Math.random() * 100 + 1);
			aleatorios[i] = numeroaleatorio;
		}

		for (int i = 0; i < aleatorios.length; i++) {

			for (int j = 0; j < aleatorios.length; j++) {

				if (aleatorios[i] == aleatorios[j] && i != j) {

					numeroaleatorio = (int) (Math.random() * 100 + 1);
					aleatorios[i] = numeroaleatorio;
					i = 0;
				}
			}
		}

		for (int i = 0; i < aleatorios.length; i++) {
			System.out.println(aleatorios[i]);
		}

	}

}
