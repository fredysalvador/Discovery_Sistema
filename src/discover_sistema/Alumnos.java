/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package discover_sistema;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Fredy Salvador
 */
public class Alumnos extends Personas{
    private String idenEstudiante;
    private List<String> listClas;
    
    
    public Alumnos(){
    super();
    }

    public Alumnos(String idenEstudiante, String listClas, String identidad, String nombre, Date fechanac) {
        super(identidad, nombre, fechanac);
        this.idenEstudiante = idenEstudiante;
        this.listClas = new ArrayList<>();
    }

    public String getIdenEstudiante() {
        return idenEstudiante;
    }

    public void setIdenEstudiante(String idenEstudiante) {
        this.idenEstudiante = idenEstudiante;
    }

    public List<String> getListClas() {
        return listClas;
    }

    public void setListClas(String listCla) {
        listClas.add(listCla);
    }

/*    @Override
    public String toString() {
        return "Alumnos{" + "idenEstudiante=" + idenEstudiante + ", listClas=" + listClas + '}';
        
    }
*/
       @Override
    public String toString() {
        return "Personas{" + "identidad=" + identidad + ", nombre=" + nombre + ", fechanac=" + fechanac + "idenEstudiante=" + idenEstudiante + ", listClas=" + listClas;
                                      //", "idenEstudiante=" + idenEstudiante + ", listClas=" + listClas +
    }
}
