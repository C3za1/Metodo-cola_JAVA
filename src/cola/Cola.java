
package cola;

import java.util.ArrayList;
import java.util.Scanner;

public class Cola {
    
     // crea objeto Scanner para obtener la entrada de la ventana de comandos 
    Scanner ca=new Scanner(System.in);
    String nombre;
    ArrayList  datos= new ArrayList();
    

    public Cola() {
        
    }

   public void Almacenar()
   {
       System.out.println("Capturar nombre");
       nombre=ca.next();
       datos.add(nombre);
   }
   
   

    
   public void Imprimir_datos()
   {
       //for es un siclo
       for (int i = 0; i <datos.size(); i++) 
            //es para mostrar el nombre
           System.out.println("el nombre es:"+datos.get(i)); 
       
       
   }
    
}
