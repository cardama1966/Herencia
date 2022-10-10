package Electros;

import sun.font.TrueTypeFont;

public class Televisor extends Electrodomestico {

    private int pulgadas;
    private boolean tdt = false;

    public Televisor() {
    }

    public Televisor(int pulgadas, boolean tdt) {
        this.pulgadas = pulgadas;
        this.tdt = tdt;
    }

    public Televisor(int pulgadas, boolean tdt, double precio, String color, char energia, double peso) {
        super( precio, color, energia, peso);
        this.pulgadas = pulgadas;
        this.tdt = tdt;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    public void CrearTelevisor() {
        crearElectrodomestico();
        System.out.println("De cuantas pulgadas es el Televisor?: ");
        pulgadas = leer.nextInt();
        System.out.println("Tiene conexion TDT?: Y/N");
        String opc = leer.next();
        if (opc == "Y") {
            tdt = true;

        }

    }

    @Override
    public double precioFinal() {
        if(pulgadas>40){
            precio=precio*1.30;
        }
        if(tdt){
            precio=precio+500;
            
        }
        return precio;
    }

}
