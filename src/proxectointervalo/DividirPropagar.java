
package proxectointervalo;

import javax.swing.JOptionPane;

/**
 *
 * @author dfernandezguerreiro
 */
public class DividirPropagar {
    private int numerador;
    private int denominador;

    public DividirPropagar() {
    }
    
    public void dividirPropagaExcepcion() throws ArithmeticException,PropioExcepcion{
        numerador=Integer.parseInt(JOptionPane.showInputDialog("teclea numerador : "));
        denominador=Integer.parseInt(JOptionPane.showInputDialog("teclea denominador : "));
        
        if(numerador>20 && numerador<100)
            throw new PropioExcepcion("... añadir un numero entre 20 y 100 ...");

            
        if(denominador==0)
            throw new ArithmeticException("***** non dividas entre 0 *****");
        System.out.println("resultado = "+numerador/denominador);
    }
}
