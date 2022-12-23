
package ejercicio.iron.man;

import Entidades.Armadura;
import Entidades.Bateria;
import Entidades.Bota;
import Entidades.Casco;
import Entidades.Consola;
import Entidades.Guante;
import Entidades.Sintetizador;


public class EjercicioIronMan {

    
    public static void main(String[] args) {
        
       Bateria bat = new Bateria();
       Casco casco = new Casco(new Sintetizador(), new Consola());
       Bota botaIzq = new Bota("Bota Izquierda", 100, 100, 0, Boolean.FALSE);
       Bota botaDer = new Bota("Bota Derecha", 100, 100, 0, Boolean.FALSE);
       Guante guanteDer = new Guante("Guante Derecho", 100, 100, 0, Boolean.FALSE);
       Guante guanteIzq = new Guante("Guante Izquierdo", 100, 100, 0, Boolean.FALSE);
        
      Armadura armadura = new Armadura(casco, botaIzq, botaDer, guanteIzq, guanteDer, bat);
      
      
      
    }
    
}
