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
                String Fecha_Nacimiento = JOptionPane.showInputDialog("Ingrese la Fecha de Nacimiento\n Formato:DD/MM/YYYY");

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
                int i = 0;
                ///Muestra Datos del Estudiante
                String mensaje = "Lista de Alumnos:\n";

                for (Personas t : personas) {
                    if (t instanceof Alumnos) {
                        Alumnos alm = (Alumnos) t;
                        mensaje += "Posicion-" + i + " - " + alm + "\n";
                        
                    }
                    i++;
                }

               int PosAlumn = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione la posicion del alumno a agregar clase\n"+mensaje));
               
               ////Separación de codigos
               
                
               int f = 0;
               
               String mensaje2 = "Lista de Clases:\n";

                for (Object clase : Clases) {
                    // System.out.println(clase);
                    mensaje2 += "Posicion-" + f + " - " + clase + "\n";
                    
                    f++;
                }
                 String PosClas = JOptionPane.showInputDialog(null, "Seleccione la Posiccion de la Clase a Agregar\n"+mensaje2);
                
                 
                         
                          
                 //String Clasename;
                 /*         for(Object clase : Clases){
                      
                       Clases.get(PosClas).;
                 }
                 */
   
                 //String nombreClase = Clases.get(PosClas).getNombreClas();
                  

                   //Falta Agregar la seccion de traer el valor del listado de clases

                 if (PosAlumn >= 0 && PosAlumn < personas.size()) {
                    if (personas.get(PosAlumn) instanceof Alumnos){
                        ((Alumnos) personas.get(PosAlumn)).setListClas(PosClas);
                    }
                 } else {
                    JOptionPane.showMessageDialog(null, "No se ingreso ningun dato ya que la posicion ingresada no existe!!!");
                 }
                 //Fin Datos Estudiantes
                 // String Nombre_Clase = JOptionPane.showInputDialog("Ingrese el Nombre de la Clase");
            } else if (opcion == 5) {

                Date Fecha_Seteada = null;

                Double An_Experiencia = Double.valueOf(JOptionPane.showInputDialog("Ingrese cuantos Años de Experiencia Tiene"));
                String Identidad_Transportista = JOptionPane.showInputDialog("Ingrese el Numero de Identidad del Transportista");
                String Nombre_Transportista = JOptionPane.showInputDialog("Ingrese el Nombre del Transportista");
                String Apod_Transportista = JOptionPane.showInputDialog("Ingrese el Apodo del Transportista");
                String Fecha_Nacimiento = JOptionPane.showInputDialog("Ingrese la Fecha de Nacimiento");

                try {
                    // Creamos una instancia del formato de fecha deseado
                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

                    // Convertimos la cadena de texto a un objeto Date
                    Fecha_Seteada = formato.parse(Fecha_Nacimiento);

                    // Hacemos algo con la fecha...
                    //   System.out.println("La fecha de nacimiento es: " + Fecha_Seteada);
                    Transportistas t = new Transportistas(An_Experiencia, Apod_Transportista, Identidad_Transportista, Nombre_Transportista, Fecha_Seteada);

                    personas.add(t);

                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(null, "Error al ingresar la fecha de nacimiento");
                }

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
                    if (t instanceof Alumnos) {
                        Alumnos alm = (Alumnos) t;
                        mensaje += alm + "\n";
                    }
                }
                JOptionPane.showMessageDialog(null, mensaje);

            } else if (opcion == 11) {

                String mensaje = "Lista de Transportistas:\n";

                for (Personas t : personas) {
                    if (t instanceof Transportistas) {
                        Transportistas tra = (Transportistas) t;
                        mensaje += tra + "\n";
                    }
                }

                JOptionPane.showMessageDialog(null, mensaje);

            } else if (opcion == 12) {

            }

        }

    }

}
//Codigos los cuales me sirvieron de formato
/* 

                 /* for (Personas t : personas) {
                    //System.out.println(t);
                    mensaje += t + "\n";
                    //JOptionPane.showMessageDialog(null,"Lista de Alumnos"+(t));
                }
 */
