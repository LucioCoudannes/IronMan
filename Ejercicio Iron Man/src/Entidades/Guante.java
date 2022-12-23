/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author A288808
 */
public class Guante extends Componente{

    public Guante() {
    }

    public Guante(String nombreParte, double salud, double energia, double consumoEnergia, Boolean damage) {
        super(nombreParte, salud, energia, consumoEnergia, damage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Guante{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
