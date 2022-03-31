/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Revolver;
import java.util.Scanner;

/**
 *
 * @author Jime
 */
public class JuegoServicio {
    public Juego crearJuego (){
        Scanner read = new Scanner (System.in);
        RevolverServicio rs = new RevolverServicio();
        JugadorServicio jugadorServicio = new JugadorServicio();
        Juego juego = new Juego();
        System.out.println("Ingrese numeo de Jugadores");
        juego.setNumJugadores(read.nextInt());
        for (int i = 1; i <= juego.getNumJugadores(); i++) {
            juego.setJugadores(jugadorServicio.crearJugador(juego, i));            
        }
        juego.setRevolver(rs.llenarRevolver());
        return juego;        
    }
    public void ronda(Juego juego){
        RevolverServicio rs = new RevolverServicio();
        for (Jugador jugador : juego.getJugadores()) {
            if(rs.disparo(juego.getRevolver())){
                jugador.setMojado(true);
                System.out.println("GAME OVER, el juego el jugador " + jugador.toString() +" se mojó");
                break;
            } 
        }
    }
}
