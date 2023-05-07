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
public class Rapiditos extends Transportes {

    private int numSillas;
    private int numAlumn;

    public Rapiditos() {
        super();
    }

    public Rapiditos(int numSillas, int numAlumn, String Placa, Color Color, String Transportista, String Estacion) {

        super(Placa, Color, Transportista, Estacion);
        this.numSillas = numSillas;
        this.numAlumn = numAlumn;

    }

    public int getnumSillas(){
    return numSillas;
    }
    
    public void setnumSillas(int numSillas){
    this.numSillas = numSillas;
    }
    
    public int getnumAlumn(){
    return numAlumn;
    }
    
    public void setnumAlumn(int numAlumn){
    this.numAlumn = numAlumn;
    }
    
    
}
