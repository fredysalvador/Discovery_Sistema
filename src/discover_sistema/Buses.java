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
public class Buses extends Transportes {
    private int lisAlumn;
    private int numSillas;
    private int capPersonasPie;
    private int capMaxima;

    public Buses(){
    super();
    }
    
    public Buses(int lisAlumn, int numSillas, int capPersonasPie, int capMaxima, String Placa, Color Color, String Transportista, String Estacion) {
        super(Placa, Color, Transportista, Estacion);
        this.lisAlumn = lisAlumn;
        this.numSillas = numSillas;
        this.capPersonasPie = capPersonasPie;
        this.capMaxima = capMaxima;
    }

    public int getLisAlumn() {
        return lisAlumn;
    }

    public void setLisAlumn(int lisAlumn) {
        this.lisAlumn = lisAlumn;
    }

    public int getNumSillas() {
        return numSillas;
    }

    public void setNumSillas(int numSillas) {
        this.numSillas = numSillas;
    }

    public int getCapPersonasPie() {
        return capPersonasPie;
    }

    public void setCapPersonasPie(int capPersonasPie) {
        this.capPersonasPie = capPersonasPie;
    }

    public int getCapMaxima() {
        return capMaxima;
    }

    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }
    
    
            
}
