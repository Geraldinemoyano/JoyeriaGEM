
/**
 * Write a description of class negocio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class negocio
{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numSemana;
        int vk = 92000;
        int tk = 1700000;
        int nl = 90000;
        
        ventaPOO = new ventaPOO[50];
        String B;
        int sumajoyeria, prototal;
        int A, C, D, E, vkilates, tkilates, nplata;
       
        System.out.println("Digíte el numero de semanas");
        numSemana = sc.nextInt();
        System.out.println("Ingrese el nombre de la joya:");
        B = sc.next();
        System.out.println("Ingrese el codigo de la joya");
        A = sc.nextInt();
        System.out.println("Las joyas que se ofrecen tienen los siguientes rangos en precios:");
        System.out.println("Joyas de oro 24 kilates 920000");
        System.out.println("Joyas de oro 30 kilates 1700000");
        System.out.println("Joyas plata de ley 925 90000");
        System.out.println(" ");
        System.out.println("¿Cuantas Joyas de 24 Kilates se vendieron en la semana?");
        C = sc.nextInt();
        vkilates = vk*C;
        System.out.println("El resultado es: " + vkilates);
        System.out.println("");
        System.out.println("¿Cuantas Joyas de 30 Kilates se vendieron en la semana?");
        D = sc.nextInt();
        tkilates = tk*D;
        System.out.println("El resultado es:" + tkilates);
        System.out.println("");
        System.out.println("¿Cuantas Joyas de plata ley 925 se vendieron en la semana?");
        E = sc.nextInt();
        nplata = nl*E;
        System.out.println("El resultado es:" + nplata);
        sumajoyeria = C+D+E;
        prototal= vkilates+tkilates+nplata;
        
        System.out.println("El total de joyas vendidas es: " + sumajoyeria);
        System.out.println( B+ " Nombre de la joya"+ A);
        System.out.println("Codigo de la joya " + B);
        System.out.println("El promedio en joyas vendidas es de:");
        System.out.println(C+ "Joyas de oro 24 kilates 920000");
        System.out.println(D+ "Joyas de oro 30 kilates 1700000");
        System.out.println(E+ "Joyas plata de ley 925 90000");
        System.out.println("");
        System.out.println(vkilates+ "En Joyas de oro 24 kilates");
        System.out.println(tkilates+ "EnJoyas de oro 30 kilates");
        System.out.println(nplata+ "En Joyas de plata ley 925");
        
            ventaPOO  = new ventaPOO();
        
           
        }
}