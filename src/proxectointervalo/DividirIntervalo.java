
package proxectointervalo;

import javax.swing.JOptionPane;

/**
 *
 * @author dfernandezguerreiro
 */
public class DividirIntervalo {
    private int numerador;
    private int denominador;

    public DividirIntervalo() {
    }
    
    public void dividir(){
        numerador=Integer.parseInt(JOptionPane.showInputDialog("teclea numerador : "));
        denominador=Integer.parseInt(JOptionPane.showInputDialog("teclea denominador : "));
        
        try{
            if(numerador>20 && numerador<100){
                int resultado=numerador/denominador;
                System.out.println(numerador+"/"+denominador+" = "+resultado);
            }else{
                System.out.println("Añadir un número entre 20 y 100");
            }
        }catch(ArithmeticException e){
            System.out.println("Non se pode dividir entre 0");
        }
    }
}
