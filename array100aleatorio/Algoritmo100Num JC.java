
public class Algoritmo100Num {

	public static void main(String[] args) {
		int[] vector = new int[100];
		int x;
		boolean hueco = true;

		for (int i = 0; i < vector.length; i++) {

			x = (int)(Math.random() * 100) + 1;

			for (int j = 0; j < vector.length; j++) {

				hueco = true;

				if (vector[j] == x) {

					hueco = false;
					break;
				}

			}

			if (hueco) {

				vector[i] = x;
			}

			else i--;

		}	

		for (int i = 0; i < vector.length; i++) {

			System.out.println(vector[i]);
		}


	}

}
