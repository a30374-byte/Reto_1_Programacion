import java.util.Scanner;
public class ChiclesRegalo {
    public static void main(String[]args){
        int chicles=0;//chicles iniciales
        int oferta=0;//chicles para que se cumpla la oferta
        int chicles_oferta=0;//chicles que da la oferta
        int chicles1=0;//Chicles comidos
        int envoltorios=0;//envoltorios actuales

        Scanner num1=new Scanner(System.in);
        Scanner num2=new Scanner(System.in);
        Scanner num3=new Scanner(System.in);
        System.out.println("Dime los chicles que se compran inicialmente y de cuanto es la oferta (por cada x chicles te llevas x gratis)");

        chicles= num1.nextInt();
        oferta= num2.nextInt();
        chicles_oferta= num3.nextInt();

        while (chicles<=0&&oferta<=0&&chicles_oferta<=0){//si los 3 valores son 0 o negativo
            System.out.println("Uno de los valores introducidos es negativo, vuelva a introducirlos");
            chicles= num1.nextInt();
            oferta= num2.nextInt();
            chicles_oferta= num3.nextInt();
        }
        
        if (oferta<=chicles_oferta){//Bancarrota
            System.out.print("BANCARROTA");
        }

        else{
            chicles1=chicles;
            envoltorios=chicles;
            while (envoltorios>=oferta){
                int chicles2 =(envoltorios/oferta)*chicles_oferta;//chicles actuales
                int envoltorios1=envoltorios%oferta;//envoltorios restantes
                chicles1+=chicles2;
                envoltorios=chicles2+envoltorios1;
            }
            
            System.out.println(chicles1+" "+envoltorios);
        }
    }
}
