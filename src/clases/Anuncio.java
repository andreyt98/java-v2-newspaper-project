package clases;
import javax.swing.JComboBox;

public class Anuncio {

    //Atributos
    protected String seccion;
    protected String titulo;
    protected String fecha;
    protected String descripcion;
    protected double costo;
    protected double costoIva;
   
    //constructores
    public Anuncio() { }

    public Anuncio(String seccion, String titulo, String fecha, String descripcion, double costo, double costoIva) {
        this.seccion = seccion;
        this.titulo = titulo;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.costo = costo;
        this.costoIva = costoIva;
    }
   
    //Setters y Getters
    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getCostoIva() {
        return costoIva;
    }

    public void setCostoIva(double costoIva) {
        this.costoIva = costoIva;
    }
   
    //métodos de costo
    public double costo(JComboBox<String> combo) {

        //test this code on netbeans 8.2
        int extra = 0;

        switch(combo.getSelectedItem().toString()){
            case "Nacionales": extra = 80;
            break;
            case "Internacionales": extra = 70;
            break;
            case "Deportes": extra = 90;
            break;
            case "Culturales": extra = 85;
            break;
            case "Económicos": extra = 50;
            break;
        }

        costo = (extra * titulo.length()) + (extra * descripcion.length());
        
        return costo;

                        //---OLD---
        // if (combo.getSelectedItem() == "Nacionales") {
        //     costo = (80 * titulo.length()) + (80 * descripcion.length());

        // } else if (combo.getSelectedItem() == "Internacionales") {
        //     costo = (70 * titulo.length()) + (70 * descripcion.length());

        // } else if (combo.getSelectedItem() == "Deportes") {
        //     costo = (90 * titulo.length()) + (90 * descripcion.length());

        // } else if (combo.getSelectedItem() == "Culturales") {
        //     costo = (85 * titulo.length()) + (85 * descripcion.length());

        // } else if (combo.getSelectedItem() == "Económicos") {
        //     costo = (50 * titulo.length()) + (50 * descripcion.length());
        // }
    }

    public double costoIva(JComboBox combo2) {      
        costoIva = (float) (costo + (costo * 0.13));    
        return costoIva;
    } 
}
