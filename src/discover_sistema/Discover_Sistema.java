/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package discover_sistema;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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

            if (opcion == 0) {

                JOptionPane.showMessageDialog(null, "Gracias por utilizar el Sistema");

            } else if (opcion == 1) {

                Clases c = new Clases(JOptionPane.showInputDialog("Ingrese el Nombre de la Clase"),
                        JOptionPane.showInputDialog("Ingrese el Codigo de la Clase"));

                Clases.add(c);

            } else if (opcion == 2) {

            } else if (opcion == 3) {

                Date Fecha_Seteada = null;

                String Codigo_Estudiante = JOptionPane.showInputDialog("Ingrese la el Numero de Codigo del Estudiante");
                String Identidad_Estudiante = JOptionPane.showInputDialog("Ingrese el Numero de Identidad del Estudiante");
                String Nombre_Estudiante = JOptionPane.showInputDialog("Ingrese el Nombre del Estudiante");
                String Fecha_Nacimiento = JOptionPane.showInputDialog("Ingrese la Fecha de Nacimiento");

                try {
                    // Creamos una instancia del formato de fecha deseado
                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

                    // Convertimos la cadena de texto a un objeto Date
                    Fecha_Seteada = formato.parse(Fecha_Nacimiento);

                    // Hacemos algo con la fecha...
                    //   System.out.println("La fecha de nacimiento es: " + Fecha_Seteada);
                    Alumnos a = new Alumnos(Codigo_Estudiante, null, Identidad_Estudiante, Nombre_Estudiante, Fecha_Seteada);

                    personas.add(a);

                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(null, "Error al ingresar la fecha de nacimiento");
                }

            } else if (opcion == 4) {
                

                
             // String Nombre_Clase = JOptionPane.showInputDialog("Ingrese el Nombre de la Clase");

            } else if (opcion == 5) {

                 Date Fecha_Seteada = null;

                String An_Experiencia = JOptionPane.showInputDialog("Ingrese cuantos Años de Experiencia Tiene");
                String Identidad_Transportista = JOptionPane.showInputDialog("Ingrese el Numero de Identidad del Transportista");
                String Nombre_Transportista = JOptionPane.showInputDialog("Ingrese el Nombre del Transportista");
                String Apod_Transportista = JOptionPane.showInputDialog("Ingrese el Apodo del Transportista");
                String Fecha_Transportista = JOptionPane.showInputDialog("Ingrese la Fecha de Nacimiento");

               /* try {
                    // Creamos una instancia del formato de fecha deseado
                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

                    // Convertimos la cadena de texto a un objeto Date
                    Fecha_Seteada = formato.parse(Fecha_Nacimiento);

                    // Hacemos algo con la fecha...
                    //   System.out.println("La fecha de nacimiento es: " + Fecha_Seteada);
                    Alumnos a = new Alumnos(Codigo_Estudiante, null, Identidad_Estudiante, Nombre_Estudiante, Fecha_Seteada);

                    personas.add(a);

                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(null, "Error al ingresar la fecha de nacimiento");
                }
                */
                
            } else if (opcion == 6) {

            } else if (opcion == 7) {
                //Comienzo While
                int opcion2 = -1;
                while (opcion2 != 0) {
                    opcion2 = Integer.parseInt(JOptionPane.showInputDialog("Discovery System \n0-Salir\n1-Subir Alumnos Transporte\n2-Bajar Alumnos Transporte\n3-Listar Alumnos del Transporte\n4-Escoger Transportista\n5-Quitar Transporte\n6-Añadir Ruta\n7-Quitar Ruta\n8-Imprimir Transporte\n9-Comenzar"));
                }

                //Fin While    
            } else if (opcion == 8) {
              
              String mensaje = "Lista de Clases:\n";

             for (Object clase : Clases) {
            // System.out.println(clase);
              mensaje += clase + "\n";
             }
             JOptionPane.showMessageDialog(null, mensaje);

            } else if (opcion == 9) {

            } else if (opcion == 10) {
                String mensaje = "Lista de Alumnos:\n";

                for (Personas t : personas) {
                    //System.out.println(t);
                    mensaje += t + "\n";
                    //JOptionPane.showMessageDialog(null,"Lista de Alumnos"+(t));
                }
                JOptionPane.showMessageDialog(null, mensaje);

            } else if (opcion == 11) {

            } else if (opcion == 12) {

            }

        }

    }

}
