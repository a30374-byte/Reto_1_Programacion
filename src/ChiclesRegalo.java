import java.util.Scanner;
public class ChiclesRegalo {
    public static void main(String[]args){
        int iChiclesIniciales = 1; //chicles iniciales
        int iChiclesNecesarios = 1; //chicles para que se cumpla la oferta
        int iChiclesRegalados = 1; //chicles que da la oferta
        int iChiclesComidos = 0; //Chicles comidos
        int iEnvoltorios = 0; //envoltorios actuales

        Scanner sc = new Scanner(System.in); // Solo hace falta un scanner
        while (iChiclesIniciales > 0 && iChiclesNecesarios > 0 && iChiclesRegalados > 0) {//bucle hasta que se introduzcan tres 0
            System.out.println("Dime cuantos chicles hacen falta para que te regalen chicles, cuantos chicles regalamos" +
                    " y el numero de chicles iniciales, para acabar el bucle introduce todo 0");
            iChiclesNecesarios = sc.nextInt();
            iChiclesRegalados = sc.nextInt();
            iChiclesIniciales = sc.nextInt();
            // check RUINA
            if (iChiclesNecesarios <= iChiclesRegalados) {
                System.out.print("RUINA");
            } 
            else {
                iChiclesComidos = iChiclesIniciales;// añadirle los chicles iniciales a los que ya se han comido
                iEnvoltorios = iChiclesIniciales;//sacar el numero de envoltorios de los chicles iniciales
                while (iEnvoltorios >= iChiclesNecesarios) {//bucle hasta que no queden envoltorios para la oferta
                    int iChiclesActuales = (iEnvoltorios / iChiclesNecesarios) * iChiclesRegalados;//se sacan los chicles obtenidos de la oferta
                    int iEnvoltoriosRestantes = iEnvoltorios % iChiclesNecesarios;//se sacan los envoltorios que sobran de la oferta
                    iChiclesComidos += iChiclesActuales;//añadirle los chicles de la oferta a los chicles ya comidos
                    iEnvoltorios = iChiclesActuales + iEnvoltoriosRestantes;//añadirle los envoltorios sacados de la oferta a los que quedaban
                }

                System.out.println(iChiclesComidos + " " + iEnvoltorios);
            }
        }
        System.out.print("Fin del programa");
    }
}
