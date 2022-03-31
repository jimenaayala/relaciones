/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Revolver;

/**
 *
 * @author Jime
 */
public class RevolverServicio {

    //llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los
    //valores deben ser aleatorios.
    public Revolver llenarRevolver() {
        Revolver r = new Revolver();
        r.setPosicionActual((int) (Math.random() * 10));
        r.setPosicionAgua((int) (Math.random() * 10));
        return r;
    }

    //mojar(): devuelve true si la posición del agua coincide con la posición actual
    public boolean mojar(Revolver r) {
        return r.getPosicionActual() == r.getPosicionAgua();
    }

    //siguienteChorro(): cambia a la siguiente posición del tambor
    public void cambiarPosTambor(Revolver r) {
        r.setPosicionActual(r.getPosicionActual() + 1);
    }

    //toString(): muestra información del revolver (posición actual y donde está el agua)
    public void InfoDelRevolver(Revolver r) {
        System.out.println("Posicion actual: " + r.getPosicionActual() + " | Posición del Agua: " + r.getPosicionAgua());
    }
//disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
//mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
//revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
//devuelve true, sino false.

    public boolean disparo(Revolver r) {
        if (mojar(r)) {
            //System.out.println("Murio");
            return true;
        } else {
            cambiarPosTambor(r);
            return false;
        }
    }

}
