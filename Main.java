package Nombres_y_apllidos;
import java.util.Scanner;
/**
 *
 * @author Jesus Cruz
 */
public class Main {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [][] nombresyedad=new String[2][2];
        
        System.out.println("Ingresa nu nombre: " );
        nombresyedad[0][0]= in.nextLine();
        System.out.println("Ingresa su edad: ");
        nombresyedad[0][1]= in.nextLine();
        System.out.println("Ingresa nu nombre: " );
        nombresyedad[1][0]= in.nextLine();
        System.out.println("Ingresa su edad: ");
        nombresyedad[1][1]= in.nextLine();         
           
        System.out.println("");
        
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print("\t\t"+nombresyedad[i][j]);
            }
            System.out.println("");
        }
    }
}
