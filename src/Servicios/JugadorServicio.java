/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Juego;
import Entidades.Jugador;

/**
 *
 * @author Jime
 */
public class JugadorServicio {
    public Jugador crearJugador (Juego juego, int i){
        Jugador j = new Jugador ();
        j.setID(i);
        j.setNombre("Jugador " + String.valueOf(j.getID()));
        return j;
    }
}
