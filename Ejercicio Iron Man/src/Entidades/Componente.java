
package Entidades;


public abstract class Componente {
    
    private String nombreParte;
    private double salud=100;
    private double energia=100;
    private double consumoEnergia=0;
    private Boolean damage=false;

    public Componente() {
    }

    public Componente(String nombreParte, double salud, double energia, double consumoEnergia, Boolean damage) {
        this.nombreParte = nombreParte;
        this.salud = salud;
        this.energia = energia;
        this.consumoEnergia = consumoEnergia;
        this.damage = damage;
    }
    
    
    
}
