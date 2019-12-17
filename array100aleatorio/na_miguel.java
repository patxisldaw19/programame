
public class na_miguel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] casa=new int [10000];
		for (int i=0;i<10000;i++) { 
			casa [i]=0;
		}
		
		for (int g=0;g<10000;g++) {
			casa[g]=generador(casa,g);
		}
		for(int c=0;c<10000;c++) {
            //System.out.println(casa[c]);
            System.out.print(casa[c]+" ");
		}
	}
	public static int generador(int [] casa, int g) {
		int numero=0;
		int a=-1;
		while(a!=0) {
		a=0;
		numero=(int) (Math.random()*10000+1);
			for(int z=0;z<10000;z++) {
				if(numero==casa[z]) {
						a++;
				}
			}
		}
		
		return numero;
	}

}
