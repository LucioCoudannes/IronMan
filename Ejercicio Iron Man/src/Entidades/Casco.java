
package Entidades;

public class Casco {
    
    private Sintetizador sinte ;
    private Consola consola ;

    public Casco() {
    }

    public Casco(Sintetizador sinte, Consola consola) {
        this.sinte = sinte;
        this.consola = consola;
    }

    public Sintetizador getSinte() {
        return sinte;
    }

    public void setSinte(Sintetizador sinte) {
        this.sinte = sinte;
    }

    public Consola getConsola() {
        return consola;
    }

    public void setConsola(Consola consola) {
        this.consola = consola;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Casco{");
        sb.append("sinte=").append(sinte);
        sb.append(", consola=").append(consola);
        sb.append('}');
        return sb.toString();
    }

    

    
    
    
    
    
    
    
    
  
    
    
    
    
  
    
    
    
    
    
}
