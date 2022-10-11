package clases;

public class AnuncioImagen extends Anuncio{
    
    //Atributos
    double milimetroCuadrado;
    double costoConMilimetro;
    double costoConMilimetroIva;
    
    public AnuncioImagen(){
        super();    
    }

    //setters y getters
    
    //cantidad de milimetros de la imagen
    public void setMilimetros(double milimetroCuadrado){    
        
        this.milimetroCuadrado = milimetroCuadrado;
    }
    
    public double getMilimetros(){
        
        return milimetroCuadrado;        
    }

    @Override
    public double getCosto() {
        return costoConMilimetro;
    }

    @Override
    public void setCosto(double costoConMilimetro) {
        this.costoConMilimetro = costoConMilimetro;
    }
   
    @Override
    public double getCostoIva() {
        return costoConMilimetroIva;
    }

    @Override
    public void setCostoIva(double costoConMilimetroIva) {
        this.costoConMilimetroIva = costoConMilimetroIva;
    }
   
    //métodos de costo

    public double costo(double costo, double milimetroCuadrado) {

        costoConMilimetro = costo + (25*milimetroCuadrado);

        return costoConMilimetro;
    }
    
    public double costoIva(double costoConMilimetro, double milimetroCuadrado) {

        costoConMilimetroIva = costoConMilimetro + (costoConMilimetro*0.13);

        return costoConMilimetroIva;
    }
  
}
