import java.util.Scanner;

public class SumaDescendente {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);

        while (true) {
            System.out.println("Dime un numero y te dire su suma descendente (0 para salir):");
            int intro = num1.nextInt(); //numero introducido

            if (intro == 0) {//condicion de parada
                break;
            }

            long resul = 0;//Valor del resultado final
            int descen = intro; //auxiliar que va sumando los valores al resultado final
            int tam = String.valueOf(intro).length(); //longitud del numero introducido
            String descennum = String.valueOf(intro); //auxiliar string
            int desceniz = 0; //auxiliar para almacenar el dígito de más a la izquierda
            int descenres = 0;//valor que se le resta a la variable descen

            while (tam > 0) {
                resul = resul + descen; //añadir el valor al resultado final

                desceniz = Character.getNumericValue(descennum.charAt(0));//ponemos el nuevo digito de la izquierda

                descenres = (int) Math.pow(10, tam - 1);//ajuste de la variable

                descen = descen - (desceniz * descenres);//se resta el digito inicial

                descennum = String.valueOf(descen);//se recorta el string

                tam--;//ajuste del tamaño
            }

            System.out.println("El resultado de la suma descendente es " + resul);
            System.out.println(); //Línea de separacion
        }

        num1.close();
    }
}
