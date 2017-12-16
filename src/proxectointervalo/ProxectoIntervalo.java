
package proxectointervalo;

/**
 *
 * @author dfernandezguerreiro
 */
public class ProxectoIntervalo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DividirIntervalo obx1=new DividirIntervalo();
        //obx1.dividir();
        
        DividirPropagar obx2=new DividirPropagar();
        try{
            obx2.dividirPropagaExcepcion(); //Lanza la excepcion desde PropagarExcepcion
        }catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
