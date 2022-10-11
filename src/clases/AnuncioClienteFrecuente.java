
package clases;


public class AnuncioClienteFrecuente extends Anuncio{
    
    //Atributos
    double descuentoUsuario; //determinado por el usuario y se aplica antes del IVA
    double costoDescuento;
    double costoDescuentoIva;
    
    
    public AnuncioClienteFrecuente(){
        super();
    
    }
    
    
    
    //setters y getters
    
    //numero que el usuario definió para el descuento
    public double getDescuentoUsuario() {
        return descuentoUsuario;
    }

    public void setDescuentoUsuario(double descuentoUsuario) {
        this.descuentoUsuario = descuentoUsuario;
    }

    //---------------------------------------------
    
    
    
    //valores que el usuario debe 'pagar' por el anuncio
    @Override
    public double getCosto() {
        return costoDescuento;
    }

    @Override
    public void setCosto(double costoDescuento) {
        this.costoDescuento = costoDescuento;
    }
    
  
    @Override
    public double getCostoIva() {
        return costoDescuentoIva;
    }

    @Override
    public void setCostoIva(double costoDescuentoIva) {
        this.costoDescuentoIva = costoDescuentoIva;
    }
    
    
    
    
    
    
    //métodos de costo
    public double costo(double costo, double descuentoUsuario) { 
        
        //aplica descuento deseado
        costoDescuento  = costo - (costo/100) * descuentoUsuario;
       

        return costoDescuento;
    }
    
    

    
    public double costoIva(double costo, double costoDescuento) {

        
        costoDescuentoIva = costoDescuento +  (costoDescuento * 0.13);
        
        
        return costoDescuentoIva;
    }


  
    
    
    
    
    
    
}
