
package primerparcialpoo;

/**
 *
 * aRCe
 */
public class menu {
    private int menu;
    private int precio;
    

    public menu(int menu) {
        this.menu = menu;
        if(menu == 1){
            precio = 30000;
        }
        else if(menu ==2){
            precio = 20000;
        }
        else{
            precio = 15000;
        }
    }

    public int getPrecio() {
        return precio;
    }

    
    
    
    
}
