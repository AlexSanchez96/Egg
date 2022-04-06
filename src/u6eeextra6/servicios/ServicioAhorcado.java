package u6eeextra6.servicios;

import java.util.Scanner;
import u6eeextra6.entidades.Ahorcado;


public class ServicioAhorcado {
    Scanner leer = new Scanner(System.in);
    
    public Ahorcado crearJuego(){
        System.out.println("Escribe una palabra: ");
        String palabra = leer.next();
        System.out.println("Define la cantidad de jugadas Máximas");
        int cantjugmax = leer.nextInt();
        
        return new Ahorcado(palabra, cantjugmax);
    }
}
