
package u6eeextra6;

import java.util.Scanner;
import u6eeextra6.entidades.Ahorcado;
import u6eeextra6.servicios.ServicioAhorcado;


public class U6EEextra6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        ServicioAhorcado sa = new ServicioAhorcado();
        Ahorcado a1 = sa.crearJuego();
        a1.rellenarVector();
        
        while(a1.getCantjugmax()> 0){
            
            int cont = a1.getCantjugmax();
            System.out.println("Ingrese una letra");
            char letra = leer.next().charAt(0);
            boolean valid = a1.buscar(letra);
 
            if (valid == false) {
                cont = cont -1;
                a1.setCantjugmax(cont);
            }
            
            System.out.println("Cantidad de jugadas "+a1.getCantjugmax());
            
            if (a1.getRestantes() <= 0) {
                a1.setCantjugmax(0);
                a1.ganaste();
            }
            
            
            
        }
    }
    
}
