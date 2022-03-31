/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RuletaRusaApp;

import Entidades.Juego;
import Entidades.Jugador;
import Servicios.JuegoServicio;
import java.util.Iterator;

/**
 *
 * @author Jime
 */
public class RuletaRusaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //creo el juego y dejo todo listo para iniciar, todos los jugadores creados y el revolver cargado
        JuegoServicio juegoServicio = new JuegoServicio();
        Juego juego = juegoServicio.crearJuego();
        
        // Inicia el juego
        juegoServicio.ronda(juego);


    }

}
