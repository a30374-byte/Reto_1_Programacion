import java.util.Scanner;
public class ChiclesRegalo {
    public static void main(String[]args){
        int iChiclesIniciales; //chicles iniciales
        int iChiclesNecesarios; //chicles para que se cumpla la oferta
        int iChiclesRegalados; //chicles que da la oferta

        Scanner sc = new Scanner(System.in); // Solo hace falta un scanner
        do {
            do {
                System.out.println("Dime cuantos chicles hacen falta para que te regalen chicles, cuantos chicles regalamos" +
                        " y el numero de chicles iniciales");
                iChiclesNecesarios = sc.nextInt();
                iChiclesRegalados = sc.nextInt();
                iChiclesIniciales = sc.nextInt();

            } while ((iChiclesIniciales < 0) && (iChiclesNecesarios < 0) && (iChiclesRegalados < 0));

            if (iChiclesNecesarios <= iChiclesRegalados){
                if ((iChiclesIniciales == 0) && (iChiclesNecesarios == 0) && (iChiclesRegalados == 0)) {
                    System.out.println("APAGANDO PROGRAMA");
                }
                else {
                    System.out.println("RUINA");
                }
            }
            else {
                calculoChicles(iChiclesIniciales, iChiclesNecesarios, iChiclesRegalados);

            }

        } while (((iChiclesIniciales != 0) && (iChiclesNecesarios != 0) && (iChiclesRegalados != 0)));
    }
    public static void calculoChicles(int iChiclesIniciales, int iChiclesNecesarios, int iChiclesRegalados){
        int iChiclesComidos = iChiclesIniciales;
        int iEnvoltorios = iChiclesIniciales;
        int iChiclesActuales;
        int iEnvoltoriosRestantes;

        while (iEnvoltorios >= iChiclesNecesarios){
            iChiclesActuales = (iEnvoltorios/iChiclesNecesarios) * iChiclesRegalados;
            iEnvoltoriosRestantes = iEnvoltorios % iChiclesNecesarios;
            iChiclesComidos += iChiclesActuales;
            iEnvoltorios = iChiclesActuales + iEnvoltoriosRestantes;
        }
        System.out.println(iChiclesComidos + " " + iEnvoltorios);
    }
}
