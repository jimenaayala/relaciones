/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import Entidades.Perro;
import Entidades.Persona;
import Servicios.PerroServicio;
import Servicios.PersonaServicio;
import java.util.Scanner;

/**
 *
 * @author Jime
 */
public class MascotaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner (System.in);
        Persona persona = new Persona();
        PersonaServicio personaServicio = new PersonaServicio();
        Perro perro = new Perro();
        PerroServicio perroServicio = new PerroServicio();
        
        
        persona = personaServicio.crearPersona();
        perro = perroServicio.crearPerro();
        System.out.println("desea que la persona "+ persona.getNombre()+ " adopte el perro " + perro.getNombre()+"?");
        if (read.next().equalsIgnoreCase("si")){
            personaServicio.adoptar(perro, persona);
            personaServicio.mostrarPersonaconMascota(persona);
        }
    }
    
}
