
package Entidades;


public class Bateria extends Componente{

    public Bateria() {
    }

    public Bateria(String nombreParte, double salud, double energia, double consumoEnergia, Boolean damage) {
        super(nombreParte, salud, energia, consumoEnergia, damage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Bateria{");
        sb.append(super.toString());
        sb.append('}');
       
        
        return sb.toString();
    }
    
    
    
}
