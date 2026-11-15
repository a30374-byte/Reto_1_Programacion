import java.util.Scanner;

public class ProblemaSerRico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;
        int iCompartimentos;
        int iLitrosMaximos;
        int iDiffLitros;
        int iLitrosTotales;

        // Pedimos el numero de casos de prueba hasta que el usuario introduzca un numero positivo (o 0)
        do {
            System.out.println("Introduzca el número de casos de prueba (Positivo)");
            i = sc.nextInt();

            // si el número de casos de prueba no es 0, ejecutamos el programa
            if (i != 0) {
                // Ejecutamos el programa tantas veces como casos de prueba
                for(int j = 0; j < i; j++) {
                    // Pedimos los datos hasta que todos sean mayor que 0
                    do {

                        System.out.print("Introduzca el número de compartimentos (>0), la capacidad en litros");
                        System.out.print("del más grande (>0), y la diferencia de litros entre dos compartimentos");
                        System.out.printf("adyacentes (≥0)%n");

                        iCompartimentos = sc.nextInt();
                        iLitrosMaximos = sc.nextInt();
                        iDiffLitros = sc.nextInt();

                    } while ((iCompartimentos <= 0) || (iLitrosMaximos <= 0) || (iDiffLitros < 0));

                /* Sacamos los litros totales mediante la función calcularLitrosTotales, a la cual le pasamos
                   los datos introducidos. */
                iLitrosTotales = calcularLitrosTotales(iCompartimentos, iLitrosMaximos, iDiffLitros);

                System.out.println(iLitrosTotales);
                }
            }

            // Cuando todos los casos de prueba se han llevado a cabo, o se ha introducido 0, apagamos el programa
            System.out.println("Apagando programa");

        } while (i < 0);
    }

    public static int calcularLitrosTotales(int iCompartimentos, int iLitrosMaximos, int iDiffLitros) {
        int iLitrosTodosLosCompartimentos = iCompartimentos * iLitrosMaximos;

        /* ((iCompartimentos - 1) / 2) es la fórmula del número triangular, calcula la suma descendente de los
        compartimentos. */
        int iSumaDiferencias = ((iCompartimentos * (iCompartimentos - 1)) / 2); 
        
        int iLitrosDescontados = iDiffLitros * iSumaDiferencias;
        
        return iLitrosTodosLosCompartimentos - iLitrosDescontados;
    }
}
