/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author A288808
 */
public class Bota extends Componente {

    public Bota(String nombreParte, double salud, double energia, double consumoEnergia, Boolean damage) {
        super(nombreParte, salud, energia, consumoEnergia, damage);
    }

    public Bota() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bota{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
