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
public class Taxis extends Transportes{
    private int numAlumn;
    private int numTaxi;
    
    public Taxis() {
    super();
    }
    
    public Taxis(int numAlumn, int numTaxi, String Placa, Color Color, String Transportista, String Estacion){
    super(Placa,Color,Transportista,Estacion);
    this.numAlumn = numAlumn;
    this.numTaxi = numTaxi;
    }
    
    public int getnumAlumn(){
    return numAlumn;
    }
    
    public void setnumAlumn(int numAlumn){
    this.numAlumn = numAlumn;
    }
    
    public int getnumTaxi(){
    return numTaxi;
    }
    
    public void setnumTaxi(int numTaxi){
    this.numTaxi = numTaxi;
    }

    
    
}
