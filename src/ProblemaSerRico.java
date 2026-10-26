import java.util.Scanner;

public class ProblemaSerRico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int iCompartimentos;
        int iLitrosMaximos;
        int iDiffLitros;

        do {
            System.out.println("Introduzca el número de casos de prueba (Positivo)");
            i = sc.nextInt();

            if (i == 0){
                System.out.println("Apagando programa");
                return;
            }
        }
        while (i < 0);

        for(int j = 0; j < i; j++) {
            do {
                System.out.println("Introduzca el número de compartimentos (>0), la capacidad en litros" +
                        "del más grande (>0), y la diferencia de litros entre dos compartimentos adyacentes (≥0)");
                iCompartimentos = sc.nextInt();
                iLitrosMaximos = sc.nextInt();
                iDiffLitros = sc.nextInt();
            }
            while ((iCompartimentos <= 0) || (iLitrosMaximos <= 0) || (iDiffLitros < 0));

            int iLitrosTotales = (iCompartimentos * iLitrosMaximos) - (iDiffLitros * ((iCompartimentos * (iCompartimentos - 1)) / 2));

            System.out.println(iLitrosTotales);
        }



    }
}
