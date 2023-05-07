/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package discover_sistema;

import java.util.Date;

/**
 *
 * @author Fredy Salvador
 */
public class Alumnos extends Personas{
    private String idenEstudiante;
    private String listClas;
    
    
    public Alumnos(){
    super();
    }

    public Alumnos(String idenEstudiante, String listClas, String identidad, String nombre, Date fechanac) {
        super(identidad, nombre, fechanac);
        this.idenEstudiante = idenEstudiante;
        this.listClas = listClas;
    }

    public String getIdenEstudiante() {
        return idenEstudiante;
    }

    public void setIdenEstudiante(String idenEstudiante) {
        this.idenEstudiante = idenEstudiante;
    }

    public String getListClas() {
        return listClas;
    }

    public void setListClas(String listClas) {
        this.listClas = listClas;
    }
    
    
    
    
}
