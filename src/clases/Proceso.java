
package clases;

public class Proceso extends Thread{
    
    public Proceso(String NombreHilo){
        super(NombreHilo);
        
    }
        
    int num_int;
    @Override
    public void run(){
        for (int i = 0; i <= num_int; i ++){
            System.out.println(" + "+i + this.getName());
        }
        System.out.println("");
    }
    
    public void valorDeCondicion(int valor){
        this.num_int = valor;
    }
}
