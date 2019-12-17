import java.util.Random;

public class na_patxi {

	public  static void main(String[] args){
        
        int max=10000000; 
        int num;
        int[] numeros = new int[max]; //numeros
        
        for(int i=0;i<max;i++){
            num = (int) (Math.random() * max);

            while (numeros[num]!=0){
                num = (num + 1) % max;

            numeros[num] = i;

        }
        
         //Imprime el resultado
        for(int i=0;i<max;i++){
            System.out.print(numeros[i]+" ");
        }
   }


}