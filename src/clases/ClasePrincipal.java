
package clases;

public class ClasePrincipal{
    
    int num_int;
    
    public static void main(String[] args){
        
        System.out.println(12|3);
        
        Proceso hilo1 = new Proceso(" Hilo1");
        Proceso hilo2 = new Proceso(" Hilo2");
        Proceso hilo3 = new Proceso(" Hilo3");
        
        hilo1.valorDeCondicion(5);
        hilo2.valorDeCondicion(10);
        hilo3.valorDeCondicion(2);
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }

    
}
