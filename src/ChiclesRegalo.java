import java.util.Scanner;
public class ChiclesRegalo {
    public static void main(String[]args){
        int chicles=0;
        int envoltorios=0;
        int oferta=0;//chicles para que se cumpla la oferta
        int chicles_oferta=0;//chicles que da la oferta
        int chicles1=0;//auxiliar para sacar los chicles finales
        Scanner num1=new Scanner(System.in);
        Scanner num2=new Scanner(System.in);
        Scanner num3=new Scanner(System.in);
        System.out.println("Dime los chicles que se compran inicialmente y de cuanto es la oferta (por cada x chicles te llevas 1 gratis)");
        chicles= num1.nextInt();
        oferta= num2.nextInt();
        chicles_oferta= num3.nextInt();
        if (chicles>=0||oferta>=0||chicles_oferta>=0){
            System.out.println("Uno de los valores introducidos es negativo, vuelva a introducirlos");
            chicles= num1.nextInt();
            oferta= num2.nextInt();
            chicles_oferta= num3.nextInt();
        }
        if (oferta<=chicles_oferta){
            System.out.print("BANCARROTA");
        }
        while (envoltorios>=oferta){
            chicles1=chicles;
            chicles=chicles+((chicles/oferta)*chicles_oferta);
            envoltorios=chicles-envoltorios;
        }
        }
    }

