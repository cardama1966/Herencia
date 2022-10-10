
package Electros;


public class Lavadora extends Electrodomestico{
    private int carga;

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public Lavadora(int carga, double precio, String color, char energia, double peso) {
        super(precio, color, energia, peso);
        this.carga = carga;
    }

    public Lavadora() {
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
 
    public void CrearLavadora(){
        crearElectrodomestico();
        System.out.println("Ingrese el peso de carga de la Lavadora: ");
        carga=leer.nextInt();
        
             
    
    }
    
    @Override
    public double precioFinal(){
        if( carga > 30){
            precio=precio + 500;
        }
        
        return precio;
        
        
    }    
    
    
    
}
