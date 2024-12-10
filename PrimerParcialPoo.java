
package primerparcialpoo;

/**
 *
 * aRCe
 */
import javax.swing.JOptionPane;
public class PrimerParcialPoo {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hola, bienvenido a mi restaurante tenemos 3 opciones en el menu. ");
        int npedidos = Integer.parseInt(JOptionPane.showInputDialog("Cuantos platos quiere? "));
        menu menu1[] = new menu[npedidos];
        int m;
        for(int i = 0;i< menu1.length;i++){
            m = Integer.parseInt(JOptionPane.showInputDialog("1. Chuleta valluna, valor: 30k \n 2. Pollo asado, valor: 20k \n 3. Sopa de mondongo, valor 15k"));           
            menu1[i] = new menu(m);    
        }
        JOptionPane.showMessageDialog(null, "Listo, ahora necesito tu información para generar una factura. ");
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        String cedula = JOptionPane.showInputDialog("Ingrese su cedula: ");
        Persona persona1 = new Persona(nombre,cedula);
        JOptionPane.showMessageDialog(null, "Factura: \n "+persona1.datos()+"\n El valor final es de: "+persona1.valorPagar(menu1));
    }
    
}
