
public class na_rodrigo {

	public static void main(String[] args) {

		int min = 1;
		int max = 3000;
		
		int n = 3000;
		
		int[] resultado = new int [n];
		
		for(int i = 0; i < n; i++){
			int random = (int)Math.floor(Math.random()*(min-(max+1))+(max));
		}
		
		for(int j = 0; j < n; j++){
			for(int x = 0; x < n; x++){
				if(resultado[j]==resultado[x] && j!=x){
					int random = (int)Math.floor(Math.random()*(min-(max+1))+(max));
					resultado[j]=random+1;
					j=0;
			    }
			}
		}
		
		for(int i = 0; i < n; i++){
			System.out.print(resultado[i] + " ");
		}
	}

}
