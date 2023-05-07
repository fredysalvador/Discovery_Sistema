/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package discover_sistema;

import java.awt.Color;

/**
 *
 * @author Fredy Salvador
 */
public class Mototaxis extends Transportes{
    private int capAlumn;

    public Mototaxis() {
    super();
    }

    public Mototaxis(int capAlumn, String Placa, Color Color, String Transportista, String Estacion) {
        super(Placa, Color, Transportista, Estacion);
        this.capAlumn = capAlumn;
    }

    public int getCapAlumn() {
        return capAlumn;
    }

    public void setCapAlumn(int capAlumn) {
        this.capAlumn = 2;
    }
   
    
    
}
