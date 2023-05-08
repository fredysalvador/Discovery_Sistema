/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package discover_sistema;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JColorChooser;
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
        ArrayList Estaciones = new ArrayList();

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
                
                Estaciones E = new Estaciones(JOptionPane.showInputDialog("Ingrese el Nombre de la Estacion"),
                        Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Numero de la Cordenada X")),
                        Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Numero de la Cordenada Y")));

                Estaciones.add(E);

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

                int PosAlumn = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione la posicion del alumno a agregar clase\n" + mensaje));

                ////Separación de codigos
                int f = 0;

                String mensaje2 = "Lista de Clases:\n";

                for (Object clase : Clases) {
                    // System.out.println(clase);
                    mensaje2 += "Posicion-" + f + " - " + clase + "\n";

                    f++;
                }
                String PosClas = JOptionPane.showInputDialog(null, "Seleccione la Posiccion de la Clase a Agregar\n" + mensaje2);

                //String Clasename;
                /*         for(Object clase : Clases){
                      
                       Clases.get(PosClas).;
                 }
                 */
                //String nombreClase = Clases.get(PosClas).getNombreClas();
                //Falta Agregar la seccion de traer el valor del listado de clases
                if (PosAlumn >= 0 && PosAlumn < personas.size()) {
                    if (personas.get(PosAlumn) instanceof Alumnos) {
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

                int opcion3 = -1;
                //Inicio While
                while (opcion3 != 0) {
                    opcion3 = Integer.parseInt(JOptionPane.showInputDialog("Transportes Agregar\n0-Salir\n1-Buses\n2-Rapiditos\n3-Taxis\n4-MotoTaxis"));
                    if (opcion3 == 1) {

                        String Placa = JOptionPane.showInputDialog("Ingrese el nombre de la placa");
                        Color Color2 = JColorChooser.showDialog(null, "Seleccione el Color", Color.yellow);
                        String Transportista = JOptionPane.showInputDialog("Ingrese el Nombre del Transportista");
                        String Estacion = JOptionPane.showInputDialog("Ingrese la Estacion");
                        int lisAlum = Integer.parseInt(JOptionPane.showInputDialog("Agregue una lista de alumnos"));
                        int numsillas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numeros de sillas"));
                        int cappersonaspie = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad de personas de pie"));
                        int capmaxima = numsillas + cappersonaspie;

                        Buses b = new Buses(lisAlum, numsillas, cappersonaspie, capmaxima, Placa, Color2, Transportista, Estacion);

                        transportes.add(b);

                    } else if (opcion3 == 2) {

                        String Placa = JOptionPane.showInputDialog("Ingrese el nombre de la placa");
                        Color Color2 = JColorChooser.showDialog(null, "Seleccione el Color", Color.yellow);
                        String Transportista = JOptionPane.showInputDialog("Ingrese el Nombre del Transportista");
                        String Estacion = JOptionPane.showInputDialog("Ingrese la Estacion");
                        int numsillas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numeros de sillas"));
                        int numAlumn = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numeros de de alumnos"));

                        Rapiditos r = new Rapiditos(numsillas, numAlumn, Placa, Color2, Transportista, Estacion);

                        transportes.add(r);

                    } else if (opcion3 == 3) {

                        String Placa = JOptionPane.showInputDialog("Ingrese el nombre de la placa");
                        Color Color2 = JColorChooser.showDialog(null, "Seleccione el Color", Color.yellow);
                        String Transportista = JOptionPane.showInputDialog("Ingrese el Nombre del Transportista");
                        String Estacion = JOptionPane.showInputDialog("Ingrese la Estacion");
                        int numTaxi = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numeros de Taxi"));

                        int numAlum;
                        do {
                            numAlum = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numeros de Alumnos"));
                            if (numAlum > 4) {
                                JOptionPane.showMessageDialog(null, "El número de alumnos no puede exceder de 4. Por favor, ingrese un número válido.");
                            }
                        } while (numAlum > 4);

                        Taxis t = new Taxis(numAlum, numTaxi, Placa, Color2, Transportista, Estacion);
                        transportes.add(t);

                    } else if (opcion3 == 4) {

                        String Placa = JOptionPane.showInputDialog("Ingrese el nombre de la placa");
                        Color Color2 = JColorChooser.showDialog(null, "Seleccione el Color", Color.yellow);
                        String Transportista = JOptionPane.showInputDialog("Ingrese el Nombre del Transportista");
                        String Estacion = JOptionPane.showInputDialog("Ingrese la Estacion");

                        int numAlumno;
                        do {
                            numAlumno = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Cantidad Alumnos"));
                            if (numAlumno > 2) {
                                JOptionPane.showMessageDialog(null, "La cantidad de alumnos no puede exceder de 2. Por favor, ingrese un número válido.");
                            }
                        } while (numAlumno > 2);
                        
                        Mototaxis m = new Mototaxis(numAlumno, Placa, Color2, Transportista, Estacion);
                        transportes.add(m);
                        

                    }

                }
                //Fin While

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
                
                String mensaje = "Lista de Rutas:\n";

                 for (Object t : Estaciones) {
               
                     mensaje += t + "\n";
               
                }
               
                JOptionPane.showMessageDialog(null, mensaje);
                

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
                
                String mensaje = "Lista de Transportes:\n";

                 for (Transportes t : transportes) {
               
                     mensaje += t + "\n";
               
                }
               
                JOptionPane.showMessageDialog(null, mensaje);

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
