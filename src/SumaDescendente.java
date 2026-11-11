import java.util.Scanner;

public class SumaDescendente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iNum; // Numero introducido, y el que vamos modificando
        int iCounter; // Contador para el for
        long lResultado = 0;
        int iDigitoIzq; // Almacena el digito más a la izquierda
        int iRestarNum; // Valor que hace iNum más pequeño
        int iLongitud; // Guarda la longitud de iNum

        do {
            System.out.println("Dime un numero y te dire su suma descendente (0 para salir):");
            iNum = sc.nextInt();

            // Reseteamos los parámetros si llevamos más de un cálculo
            lResultado = 0;
            iDigitoIzq = 0;
            iRestarNum = 0;
            iLongitud = 0;

            iLongitud = String.valueOf(iNum).length(); // Guardamos la longitud de iNum
            iCounter = iLongitud;

            // Convertimos el valor de iNum a un String, para poder hacer charAt que necesita un String
            String strNum = String.valueOf(iNum);

            for (int i = 0; i < iCounter; i++) {
                iDigitoIzq = Character.getNumericValue(strNum.charAt(i)); // Recorremos el digito

                if (iDigitoIzq != 0){
                    iRestarNum = (int) Math.pow(10, iLongitud - 1);

                    iNum = iNum - (iDigitoIzq * iRestarNum);

                    strNum = String.valueOf(iNum); // Error actual: Aplastamos el valor de strNum
                    // mientras miramos el digito de la izq usando ese mismo numero. Tengo que arreglarlo

                    lResultado += iNum;
                }

                iLongitud =- 1;
                i++;
            }

            System.out.printf("El resultado de la suma descendente es %s %n", lResultado);
        }
        while (iNum != 0);
    }
}
