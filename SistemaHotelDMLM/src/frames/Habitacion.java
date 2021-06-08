/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

/**
 *
 * @author MONICA
 */
public class Habitacion {
    String Habitacion;
    int numeroHab;
    boolean ocupado;

    public Habitacion() {
    }

    public Habitacion(String Habitacion, int numeroHab, boolean ocupado) {
        this.Habitacion = Habitacion;
        this.numeroHab = numeroHab;
        this.ocupado = ocupado;
    }

    public String getHabitacion() {
        return Habitacion;
    }

    public void setHabitacion(String Habitacion) {
        this.Habitacion = Habitacion;
    }

    public int getNumeroHab() {
        return numeroHab;
    }

    public void setNumeroHab(int numeroHab) {
        this.numeroHab = numeroHab;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    

    

    @Override
    public String toString() {
        return "Habitacion: " + Habitacion + ", Numero de Habitacion: " + numeroHab  + ", Habitacion ocupada: " + ocupado;
    }
    
}
