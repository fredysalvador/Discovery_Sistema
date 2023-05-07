/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package discover_sistema;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Fredy Salvador
 */
public class Discover_Sistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Personas> personas = new ArrayList();
        ArrayList<Transportes> transportes = new ArrayList();
        ArrayList Clases = new ArrayList();
        
        
        
        int opcion = -1;
        
         while (opcion != 0) {
         
         opcion = Integer.parseInt(JOptionPane.showInputDialog("Discovery System \n0-Salir\n1-Crear Clase\n2-Crear Ruta\n3-Crear Alumno\n4-Agregar Clase a Alumno\n5-Crear Transportista\n6-Crear Transporte\n7-Simulacion\n8-Listar Clases\n9-Listar Rutas\n10-Listar Alumnos\n11-Listar Transportista\n12-Listar Transportes"));
         
         
         if(opcion == 0){
             
         JOptionPane.showMessageDialog(null, "Gracias por utilizar el Sistema");
             
         }else if(opcion == 1){
             
         
             
         }else if (opcion == 3){
             
             
             
         }else if (opcion == 4){
             
             
             
         }else if (opcion == 5){
             
             
             
         }else if (opcion == 6){
             
             
             
         }else if (opcion == 7){
         //Comienzo While
         int opcion2 = -1;
         
         while (opcion2 != 0) {
                  opcion2 = Integer.parseInt(JOptionPane.showInputDialog("Discovery System \n0-Salir\n1-Subir Alumnos Transporte\n2-Bajar Alumnos Transporte\n3-Listar Alumnos del Transporte\n4-Escoger Transportista\n5-Quitar Transporte\n6-Añadir Ruta\n7-Quitar Ruta\n8-Imprimir Transporte\n9-Comenzar"));
         }
         
         //Fin While    
         }else if (opcion == 8){
             
             
             
         }else if (opcion == 9){
             
             
             
         }else if (opcion == 10){
             
             
             
         }else if (opcion == 11){
             
             
             
         }else if (opcion == 12){
             
             
             
         }
         
         
         
         }
         
         
        
    }
    
}
