
package proxectointervalo;

/**
 *
 * @author dfernandezguerreiro
 */
public class PropioExcepcion extends Exception{
    
    public PropioExcepcion(){
        super(" información da excepción ");
    }
    public PropioExcepcion(String mensaxePropio){
        super(mensaxePropio);
    }
}
