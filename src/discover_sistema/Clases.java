/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package discover_sistema;

/**
 *
 * @author Fredy Salvador
 */
public class Clases {
    private String nombreClas;
    private String codClas;
    
    public Clases(){
    }

    public Clases(String nombreClas, String codClas) {
        this.nombreClas = nombreClas;
        this.codClas = codClas;
    }

    public String getNombreClas() {
        return nombreClas;
    }

    public void setNombreClas(String nombreClas) {
        this.nombreClas = nombreClas;
    }

    public String getCodClas() {
        return codClas;
    }

    public void setCodClas(String codClas) {
        this.codClas = codClas;
    }

    @Override
    public String toString() {
        return "Clases{" + "nombreClas=" + nombreClas + ", codClas=" + codClas + '}';
    }
    
    
}
