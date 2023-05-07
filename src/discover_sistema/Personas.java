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
public class Personas {
    private String identidad;
    private String nombre;
    private Date fechanac;
    
    public Personas(){
    
    }

    public Personas(String identidad, String nombre, Date fechanac) {
        this.identidad = identidad;
        this.nombre = nombre;
        this.fechanac = fechanac;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechanac() {
        return fechanac;
    }

    public void setFechanac(Date fechanac) {
        this.fechanac = fechanac;
    }
    
    
    
}
