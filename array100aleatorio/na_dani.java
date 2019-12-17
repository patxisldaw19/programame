import java.util.Scanner;

public class na_dani {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int contador = 0;
		int[] usados = new int [100000];
		int num; 
		
			for (int i = 0; i < usados.length; i++) {
			 num = (int)Math.floor(Math.random()*(1-100001)+100001);
			
			
			if (comprobarUsado(usados,num)) {
				while (comprobarUsado(usados,num)) {
					num = (int)Math.floor(Math.random()*(1-100001)+100001); 	
				}
				usados[i] = num;
				//System.out.println(num);
			}
			else {
				usados[i] = num;
				//System.out.println(num);
			}
			}
			
			for (int i = 0; i < usados.length; i++) {

                System.out.print(usados[i]+" ");
            }
				
	}
	
	public static boolean comprobarUsado(int[]a,int b) {
		boolean usado = false;
		for (int i = 0; i < a.length; i++) {
			if (b == a[i]) {
				usado = true;
			}
		}
		
		return usado;
	}
	
	
	

}
