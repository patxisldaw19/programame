
public class na_jc {

	public static void main(String[] args) {
		int[] vector = new int[1000000];
		int x;
		boolean hueco = true;

		for (int i = 0; i < vector.length; i++) {

			x = (int)(Math.random() * 1000000) + 1;

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
