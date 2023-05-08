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
public class Transportes {
    private String Placa;
    private Color Color;
    private String Transportista;
    private String Estacion;
   //Recordar ponerlas publicas 
    public Transportes(){
    
    }
    
    public Transportes(String Placa, Color Color, String Transportista,String Estacion){
       this.Placa = Placa;
       this.Color = Color;
       this.Transportista = Transportista;
       this.Estacion = Estacion;
    }
    
    public String getPlaca(){
    return Placa;
    }
    
    public void setPlaca(String Placa){
    this.Placa = Placa;
    }
    
    public Color getColor(){
    return Color;
    }
    
    public void setColor(Color Color){
    this.Color = Color;
    }
    
    public String getTransportista(){
    return Transportista;
    }
   
    public void setTransportista(String Transportista){
    this.Transportista = Transportista;
    }
    
    public String getEstacion(){
    return Estacion;
    }
    
    public void setEstacion(String Estacion){
    this.Estacion = Estacion;
    }
    
}
