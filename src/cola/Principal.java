
package cola;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        // crea objeto Scanner para obtener la entrada de la ventana de comandos 
        Scanner c=new Scanner(System.in);
         //declaracion de variables
        String nombre;
        int resp;
        Cola c1=new Cola();
        do{ 
        
        c1.Almacenar();
        
        //es para mostrar si decea continuar o no
        System.out.println("Desea continuar presione 1 o 2 para salir");
        resp=c.nextInt();
        
        }while(resp==1);
        c1.Imprimir_datos();
 }}
