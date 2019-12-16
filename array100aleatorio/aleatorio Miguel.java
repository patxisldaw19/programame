
public class aleatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] casa=new int [100];
		for (int i=0;i<100;i++) {
			casa [i]=0;
		}
		
		for (int g=0;g<100;g++) {
			casa[g]=generador(casa,g);
		}
		for(int c=0;c<100;c++) {
			System.out.println(casa[c]);
		}
	}
	public static int generador(int [] casa, int g) {
		int numero=0;
		int a=-1;
		while(a!=0) {
		a=0;
		numero=(int) (Math.random()*100+1);
			for(int z=0;z<100;z++) {
				if(numero==casa[z]) {
						a++;
				}
			}
		}
		
		return numero;
	}

}
