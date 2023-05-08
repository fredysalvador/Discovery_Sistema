/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package discover_sistema;

/**
 *
 * @author Fredy Salvador
 */
public class Estaciones {
    private String Nombre;
    private int Coordenadx;
    private int Coordenady;

    public Estaciones(){
    
    }
    
    public Estaciones(String Nombre, int Coordenadx, int Coordenady) {
        this.Nombre = Nombre;
        this.Coordenadx = Coordenadx;
        this.Coordenady = Coordenady;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCoordenadx() {
        return Coordenadx;
    }

    public void setCoordenadx(int Coordenadx) {
        this.Coordenadx = Coordenadx;
    }

    public int getCoordenady() {
        return Coordenady;
    }

    public void setCoordenady(int Coordenady) {
        this.Coordenady = Coordenady;
    }

    @Override
    public String toString() {
        return "Estaciones{" + "Nombre=" + Nombre + ", Coordenadx=" + Coordenadx + ", Coordenady=" + Coordenady + '}';
    }
    
    

}
