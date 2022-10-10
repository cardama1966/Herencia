
package Electros;

import java.util.Scanner;


public abstract class Electrodomestico {
Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected String electrodomestico;
    protected double precio;
    protected String color=null;
    protected char energia;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico( double precio, String color, char energia, double peso) {
        //this.electrodomestico= electrodomestico;
        this.precio = precio;
        this.color = color;
        this.energia = energia;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getEnergia() {
        return energia;
    }

    public void setEnergia(char energia) {
        this.energia = energia;
    }

    public String getElectrodomestico() {
        return electrodomestico;
    }

    public void setElectrodomestico(String electrodomestico) {
        this.electrodomestico = electrodomestico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public static char comprobarConsumoEnergetico (char energia){
        String aux= String.valueOf(energia);
        if (aux != "A" || aux != "B" ||aux != "C" ||aux != "D" ||aux != "E" ){
            String com="F";
            energia = com.charAt(0);
        }
        return energia;
        
    }
         
        
    public static String comprobarColor(String color){
        String aux1 = color;
        if (aux1 != "Negro" || aux1 != "Rojo" || aux1 != "Azul" || aux1 != "Gris"){
         color="Blanco";
            
        }
        return color;
        
    }
        
    
    public void crearElectrodomestico(){
        
        System.out.println("Que Electrodomestico desea crear? ");
        electrodomestico=leer.next();
        precio=1000d;
        System.out.println("Que color? ");
        color=leer.next();
        comprobarColor(color);
         System.out.println("Indique consumo Energético: (A,B, C, D, E, F)");
        energia = leer.next().charAt(0);
        comprobarConsumoEnergetico(energia);
                System.out.println("Indique peso del electrodomestico: ");
        peso=leer.nextInt();
                   
        }
        
    
    
    public double precioFinal(){
        String aux2=String.valueOf(energia);
        
        switch(aux2){
            case "A":
                precio=precio+1000d;
                break;
            case "B":
                precio= precio + 800d;
                break;
            case "C":
                precio=precio+600d;
                break;
            case "D":
                precio=precio+500d;
                break;
            case "E":
                precio=precio+300d;
                break;
            case"F":
                precio=precio+100d;
                break;
                
        }
        if (peso >=1 && peso <20){
            precio=precio+100d;
            if(peso==20 && peso < 50){
                    precio=precio+500d;
                    if(peso==50 && peso<80){
                        precio=precio+800d;
                    }
             }
        }else{
        precio=precio+1000d;
              }
                
        return precio;
        
    }

    @Override
    public  String toString() {
        return  "\nelectrodomestico=" + electrodomestico + ", precio=" + precio + ", color=" + color + ", energia=" + energia + ", peso=" + peso + '}';
    }

  
    
    
}

