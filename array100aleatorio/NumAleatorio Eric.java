import java.util.ArrayList;

public class NumAleatorio {

    public static void main(String[] args) {

        //Declaramos las variables

        ArrayList <Integer> numeros = generarVector();

        ArrayList <Integer> vector = new ArrayList<Integer>();


        //Rellenamos el vector de numeros aleatorios

        for (int i = 0; i < 100; i++) {

            vector.add(generarAleatorio(numeros));

        }

        //Imprimos el resultado

        imprimirVector(vector);


    }

    //Funcion que genera un numero aleatorio

    public static int generarAleatorio( ArrayList<Integer> numeros) {

        int tam = numeros.size();

        int num;

        //Cogemos un numero entre 0 y la posicion del vector numeros
        int n = (int) (Math.random() * tam);


        //Cogemos el numero

        num = numeros.get(n);


        //Eliminamos ese numero del vector

        numeros.remove(n);


        return num;

    }

    //Funcion que rellena el 1 al 100 el vector

    public static ArrayList<Integer> generarVector() {

        ArrayList<Integer> vector = new ArrayList<Integer>();

        for (int i = 1; i <= 100; i++) {

            vector.add(i);

        }

        return  vector;

    }



    //Funcion que imprime el vector

    public static void imprimirVector( ArrayList<Integer> vector ) {

        for (int i = 0; i < vector.size(); i++) {

            System.out.println(vector.get(i));

        }


    }



}
