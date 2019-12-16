
public class randomsinrepetir {

	public static void main(String[] args) {

		int min = 1;
		int max = 100;
		
		int n = 100;
		
		int[] resultado = new int [n];
		
		for(int i = 0; i < n; i++){
			int random = (int)Math.floor(Math.random()*(min-(max+1))+(max));
			resultado[i]=random+1;
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
