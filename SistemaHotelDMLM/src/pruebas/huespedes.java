
package pruebas;

import java.sql.Date;

public class huespedes {
    private String nombre;
    private String tipohab;
    private int numhab;
    private String ciudad;
    private int numpersonas;
    private Date fechaentrada;
    private int totdias;
    private String fechasalida;

    public huespedes() {
    }

    public huespedes(String nombre, String tipohab, int numhab, String ciudad, int numpersonas, Date fechaentrada, int totdias, String fechasalida) {
        this.nombre = nombre;
        this.tipohab = tipohab;
        this.numhab = numhab;
        this.ciudad = ciudad;
        this.numpersonas = numpersonas;
        this.fechaentrada = fechaentrada;
        this.totdias = totdias;
        this.fechasalida = fechasalida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipohab() {
        return tipohab;
    }

    public void setTipohab(String tipohab) {
        this.tipohab = tipohab;
    }

    public int getNumhab() {
        return numhab;
    }

    public void setNumhab(int numhab) {
        this.numhab = numhab;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getNumpersonas() {
        return numpersonas;
    }

    public void setNumpersonas(int numpersonas) {
        this.numpersonas = numpersonas;
    }

    public Date getFechaentrada() {
        return fechaentrada;
    }

    public void setFechaentrada(Date fechaentrada) {
        this.fechaentrada = fechaentrada;
    }

    public int getTotdias() {
        return totdias;
    }

    public void setTotdias(int totdias) {
        this.totdias = totdias;
    }

    public String getFechasalida() {
        return fechasalida;
    }

    public void setFechasalida(String fechasalida) {
        this.fechasalida = fechasalida;
    }
    
    
}
