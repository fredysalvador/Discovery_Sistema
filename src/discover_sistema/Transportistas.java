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
public class Transportistas extends Personas{
    
    private double yearexperiencia;
    private String Apodo;
    
    
    public Transportistas(){
        super();
    }    

    public Transportistas(double yearexperiencia, String Apodo, String identidad, String nombre, Date fechanac) {
        super(identidad, nombre, fechanac);
        this.yearexperiencia = yearexperiencia;
        this.Apodo = Apodo;
    }

    public double getYearexperiencia() {
        return yearexperiencia;
    }

    public void setYearexperiencia(double yearexperiencia) {
        this.yearexperiencia = yearexperiencia;
    }

    public String getApodo() {
        return Apodo;
    }

    public void setApodo(String Apodo) {
        this.Apodo = Apodo;
    }
    
    
    
    
    
}
