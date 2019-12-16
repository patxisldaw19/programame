import java.util.Random;

public class NumeroRandom {

	public  static void main(String[] args){
        
        int num=100; 
       int num2=num;  
        int[] n=new int[num]; //numeros
        int[] resul=new int[num]; // resultado
        Random Random=new Random(); // genera el numero random
        int res;
        
        
        //se rellenamos la matriz con el Random
        for(int i=0;i<num;i++){
        	n[i]=i+1;
        }
        
        for(int i=0;i<num;i++){
        	
            res=Random.nextInt(num2);
                        
            resul[i]=n[res];
            
            n[res]=n[num2-1];
            
            num2--;
            
        }
         //Imprime el resultado
        for(int i=0;i<num;i++){
        System.out.println(resul[i]);
        }
   }
}