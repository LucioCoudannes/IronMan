
package Entidades;


public class Armadura {
    
    protected Casco casco;
    protected Bota botaIzq;
    protected Bota botaDer;
    protected Guante guanteIzq;
    protected Guante guanteDer;
    protected Bateria bateria;

    public Armadura() {
    }

    public Armadura(Casco casco, Bota botaIzq, Bota botaDer, Guante guanteIzq, Guante guanteDer, Bateria bateria) {
        this.casco = casco;
        this.botaIzq = botaIzq;
        this.botaDer = botaDer;
        this.guanteIzq = guanteIzq;
        this.guanteDer = guanteDer;
        this.bateria = bateria;
    }

    public Casco getCasco() {
        return casco;
    }

    public void setCasco(Casco casco) {
        this.casco = casco;
    }

    public Bota getBotaIzq() {
        return botaIzq;
    }

    public void setBotaIzq(Bota botaIzq) {
        this.botaIzq = botaIzq;
    }

    public Bota getBotaDer() {
        return botaDer;
    }

    public void setBotaDer(Bota botaDer) {
        this.botaDer = botaDer;
    }

    public Guante getGuanteIzq() {
        return guanteIzq;
    }

    public void setGuanteIzq(Guante guanteIzq) {
        this.guanteIzq = guanteIzq;
    }

    public Guante getGuanteDer() {
        return guanteDer;
    }

    public void setGuanteDer(Guante guanteDer) {
        this.guanteDer = guanteDer;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Armadura{");
        sb.append("casco=").append(casco);
        sb.append(", botaIzq=").append(botaIzq);
        sb.append(", botaDer=").append(botaDer);
        sb.append(", guanteIzq=").append(guanteIzq);
        sb.append(", guanteDer=").append(guanteDer);
        sb.append(", bateria=").append(bateria);
        sb.append('}');
        return sb.toString();
    }
    
    
  
    
   

} 