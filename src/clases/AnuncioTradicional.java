package clases;


public class AnuncioTradicional extends Anuncio{

    
    //Atributos
    boolean descuento = false;
    double costoDescuento;//costo con descuento y sin iva
    double costoIvaDescuento; // costo con descuento y con iva


    
    public AnuncioTradicional(){
        super();
    
    }
    
   
   
    //setters y getters
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
        return costoIvaDescuento;
    }

    @Override
    public void setCostoIva(double costoIvaDescuento) {
        this.costoIvaDescuento = costoIvaDescuento;
    }
    
    
    
    //métodos de costo
    public double costo(double costo, String descripcion) {
        
        //costo con descuento segun cant. letras
        
        if(descripcion.trim().length() >=15 && descripcion.trim().length()<= 19.9){
            costoDescuento = costo - (costo/100) * 3;
            
        
        }else if(descripcion.trim().length() >=20 && descripcion.trim().length()<= 24.9){
            costoDescuento = costo - (costo /100) * 6;
        
        }else if(descripcion.trim().length() >=25 && descripcion.trim().length()<= 29.9){
            costoDescuento = costo - (costo /100) * 9;
        
        }else if(descripcion.trim().length() >=30 && descripcion.trim().length()<= 34.9){
            costoDescuento = costo - (costo /100) * 12;
        
        }else if(descripcion.trim().length() >=35 && descripcion.trim().length()<= 39.9){
            costoDescuento = costo - (costo /100) * 15;
        
        }else if(descripcion.trim().length() >=40 && descripcion.trim().length()<= 44.9){
            costoDescuento = costo - (costo /100) * 18;
        
        }else if(descripcion.trim().length() >=45 && descripcion.trim().length()<= 49.9){
            costoDescuento = costo - (costo /100) * 21;
        
        }else if(descripcion.trim().length() >50 ) {
            costoDescuento = costo - (costo /100) * 24;
 
        }
   
        return costoDescuento;
    }
    
    
    
   
    public double costoIva(){
    
        costoIvaDescuento = (costoDescuento + (costoDescuento * 0.13)) ; 
        
        return costoIvaDescuento;
    }

   
      
   }
    

   
    
    
    
    
    

