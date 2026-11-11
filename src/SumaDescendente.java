import java.util.Scanner;

public class SumaDescendente {
    public static int sumaDescendente(int iNum) {
        // Convertimos el valor de iNum a un String, porque para poder hacer charAt se necesita un String
        String strNum = String.valueOf(iNum);
        int iSuma = 0;
        int iLongitud; // Guarda la longitud de iNum

        char[] charArray = strNum.toCharArray(); // Convertimos el String a un array de caracteres para poder recorrerlo
        iLongitud = charArray.length; // Guardamos la longitud de iNum

        int puntero = 0;
        String strNumAux = null;
        for (int i = 0; i < charArray.length; i++) {
            strNumAux = "";

            for (int j = puntero; j < charArray.length; j++) {
                strNumAux = strNumAux + charArray[j];
            }

            iSuma += Integer.parseInt(strNumAux);
            puntero++;
        }

        return iSuma;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iNum; // Numero introducido, y el que vamos modificando

        do {
            System.out.println("Dime un numero y te dire su suma descendente (0 para salir):");
            iNum = sc.nextInt();

            if (iNum != 0) {
                System.out.printf("El resultado de la suma descendente es %s %n%n", sumaDescendente(iNum));
            }

        } while (iNum != 0);
    }
}
