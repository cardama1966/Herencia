
package Electros;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Scanner;


public class mainElectrodomestico {
    static ArrayList<Electrodomestico> electro=new ArrayList<Electrodomestico>();
    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
       carga();
       //Lavadora lav= new Electrodomestico();
       
       
       
        
        
    }
    public static void carga(){
        Lavadora lav= new Lavadora(0, 0, null, 0, 0);
        Televisor tv=new Televisor(0, true, 0, color, 0, 0);
       
        System.out.println("Ingrese la cantidad de Electrodomesticos a cargar: ");
        int op2=leer.nextInt();
        int opcion=0;
           for (int i = 0; i < op2; i++) {
               System.out.println("Ingrese tipo de Electrodomestico"
                       + "\n 1.- Lavadora"
                        +"\n 2.- Televisor");
               switch(opcion){
                   case 1:
                       lav.CrearLavadora();
                       electro.add(lav);
                       break;
                   case 2:
                       tv.CrearTelevisor();
                       electro.add(tv);
                       break;
                       
               }
               
        }
    }
    public static void MostrarArray(){
        for (Electrodomestico ele : electro) {
            System.out.println(ele.toString());
            
        }
    }
}
