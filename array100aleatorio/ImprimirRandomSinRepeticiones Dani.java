import java.util.Scanner;

public class ImprimirRandomSinRepeticiones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int contador = 0;
		int[] usados = new int [100];
		int num; 
		
			for (int i = 0; i < usados.length; i++) {
			 num = (int)Math.floor(Math.random()*(1-101)+101);
			
			
			if (comprobarUsado(usados,num)) {
				while (comprobarUsado(usados,num)) {
					num = (int)Math.floor(Math.random()*(1-101)+101); 	
				}
				usados[i] = num;
				System.out.println(num);
			}
			else {
				usados[i] = num;
				System.out.println(num);
			}
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
