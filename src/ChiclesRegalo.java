import java.util.Scanner;
public class ChiclesRegalo {
    public static void main(String[]args){
        int iChiclesIniciales = 0; //chicles iniciales
        int iChiclesNecesarios = 0; //chicles para que se cumpla la oferta
        int iChiclesRegalados = 0; //chicles que da la oferta
        int iChiclesComidos = 0; //Chicles comidos
        int iEnvoltorios = 0; //envoltorios actuales

        Scanner sc = new Scanner(System.in); // Solo hace falta un scanner

        System.out.println("Dime cuantos chicles hacen falta para que te regalen chicles, cuantos chicles regalamos" +
                " y el numero de chicles iniciales");
        iChiclesNecesarios = sc.nextInt();
        iChiclesRegalados = sc.nextInt();
        iChiclesIniciales = sc.nextInt();

        //si los 3 valores son 0 o negativo, se vuelven a pedir los valores
        while ((iChiclesIniciales <= 0) && (iChiclesNecesarios <= 0) && (iChiclesRegalados <= 0)){
            System.out.println("Uno de los valores introducidos es negativo o igual a 0, vuelva a introducirlos");
            iChiclesNecesarios = sc.nextInt();
            iChiclesRegalados = sc.nextInt();
            iChiclesIniciales = sc.nextInt();
        }

        // check RUINA
        if (iChiclesNecesarios <= iChiclesRegalados){
            System.out.print("RUINA");
        }
        else {
            iChiclesComidos = iChiclesIniciales;
            iEnvoltorios = iChiclesIniciales;
            while (iEnvoltorios >= iChiclesNecesarios){
                int iChiclesActuales = (iEnvoltorios/iChiclesNecesarios) * iChiclesRegalados;
                int iEnvoltoriosRestantes = iEnvoltorios % iChiclesNecesarios;
                iChiclesComidos += iChiclesActuales;
                iEnvoltorios = iChiclesActuales + iEnvoltoriosRestantes;
            }
            
            System.out.println(iChiclesComidos + " " + iEnvoltorios);
        }
    }
}
