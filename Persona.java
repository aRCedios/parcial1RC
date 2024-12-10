
package primerparcialpoo;

/**
 *
 * aRCe
 */
public class Persona {
    private String nombre;
    private String cedula;
    private int valorPagar;

    public Persona(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }
    public String datos(){
        return "Nombre: "+nombre+" \n Cedula: "+cedula;
    }
    public int valorPagar(menu menu1[]){
        for(int i = 0;i<menu1.length;i++){
            valorPagar+= menu1[i].getPrecio();
            
        }
        return valorPagar;
    }
}
