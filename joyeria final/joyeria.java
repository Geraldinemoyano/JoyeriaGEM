
/**
 * Write a description of class joyeria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class joyeria

{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vk = 92000;
        int tk = 1700000;
        int nl = 90000;

        int A, C, D, E, vkilates, tkilates, nplata;
        String B;
        double sumajoyeria, prototal;

        System.out.println("Ingrese el nombre de la joya:");
        B = scanner.nextLine();
        System.out.println("Ingrese codigo de la joya:");
        A = scanner.nextInt();
        
        System.out.println("Las joyas que se ofrecen tienen los siguientes rangos en precios:");
        System.out.println("Joyas de oro 24 kilates 920000");
        System.out.println("Joyas de oro 30 kilates 1700000");
        System.out.println("Joyas plata de ley 925 90000");
        System.out.println(" ");
        System.out.println("¿Cuantas Joyas de 24 Kilates se vendieron en la semana?");
        C = scanner.nextInt();
        vkilates = vk*C;
        System.out.println("El resultado es: " + vkilates);
        System.out.println("");
        System.out.println("¿Cuantas Joyas de 30 Kilates se vendieron en la semana?");
        D = scanner.nextInt();
        tkilates = tk*D;
        System.out.println("El resultado es:" + tkilates);
        System.out.println("");
        System.out.println("¿Cuantas Joyas de plata ley 925 se vendieron en la semana?");
        E = scanner.nextInt();
        nplata = nl*E;
        System.out.println("El resultado es:" + nplata);

        sumajoyeria = C+D+E;
        prototal= vkilates+tkilates+nplata;
        

        System.out.println("El total de joyas vendidas es: " + sumajoyeria);
        //System.out.println( B + " nombre de la joya");
        System.out.println("promedio total de joyas vendidas semanalmente");
        System.out.println(C+ "Joyas de oro 24 kilates 920000");
        System.out.println(D+ "Joyas de oro 30 kilates 1700000");
        System.out.println(E+ "Joyas plata de ley 925 90000");
        System.out.println("");
        System.out.println("El promedio en joyas vendidas es de: " +prototal);
        System.out.println(vkilates+ "En Joyas de oro 24 kilates");
        System.out.println(tkilates+ "EnJoyas de oro 30 kilates");
        System.out.println(nplata+ "En Joyas de plata ley 925");
        

     
    
    }
}

