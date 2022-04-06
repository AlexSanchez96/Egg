package u6eeextra6.entidades;


public class Ahorcado {
    //actributos
    private String palabra;
    private int cantltrencon;
    private int cantjugmax;
    public char frase[];
    private int restantes;
    private int encontradas;
    
    //constructores
    public Ahorcado() {
    }

    public Ahorcado(String palabra, int cantjugmax) {
        this.palabra = palabra;
        this.cantjugmax = cantjugmax;
        this.frase = new char[palabra.length()];
    }
    
    //setters
    
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public void setCantltrencon(int cantltrencon) {
        this.cantltrencon = cantltrencon;
    }

    public void setCantjugmax(int cantjugmax) {
        this.cantjugmax = cantjugmax;
    }
    
    //getters

    public String getPalabra() {
        return palabra;
    }

    public int getCantltrencon() {
        return cantltrencon;
    }

    public int getCantjugmax() {
        return cantjugmax;
    }

    public int getRestantes() {
        return restantes;
    }
    
    
    //metodos
    
    public void rellenarVector(){
        
        for (int i = 0; i < frase.length; i++){
            frase[i] = palabra.charAt(i);
            //System.out.print(frase[i]+".");
        }
        
        System.out.println("Longitud de la palabra: "+frase.length);
        
    }
    
    
    public boolean buscar(char letra){
        boolean valid = false;
        
        
        
        for (int i = 0; i < frase.length; i++){
            if (frase[i] == letra) {
                valid = true;
                encontradas = encontradas + 1;
                restantes = frase.length - encontradas;
            }else{
                restantes = frase.length;
            }   
        }
        
        if (valid == true) {
            System.out.println("Mensaje: La letra pertenece a la palabra");
        }else{
            System.out.println("Mensaje: La letra no pertenece a la palabra"); 
        }
        
        System.out.println("Número de letras (encontradas: "+encontradas+", faltantes: "+restantes+")");
        
        return valid;
        
    }
    
    public void ganaste(){
    
        System.out.println("GANASTE!");
        for (int i = 0; i < frase.length; i++){
            System.out.print(frase[i]+".");
        }
    
    }
    
    
    
}
