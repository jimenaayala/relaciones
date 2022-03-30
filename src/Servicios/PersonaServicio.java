/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Perro;
import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author Jime
 */
public class PersonaServicio {
    
    public Persona crearPersona(){
        Persona p = new Persona();
        Scanner read = new Scanner (System.in);
        System.out.println("Ingrese datos de la PERSONA: nombre, apellido, edad, documento");
        p.setNombre(read.nextLine()); 
        p.setApellido(read.nextLine());
        p.setEdad(read.nextInt());
        p.setDoc(read.nextInt());
        return p;
    }
    public void adoptar (Perro perro, Persona persona){
        persona.setPerro(perro);
    }
    public void mostrarPersonaconMascota (Persona p){
        System.out.println("LA PERSONA "+ p.getNombre().toUpperCase()+ " POSEE LA SIGUIENTE MASCOTA");
        System.out.println("_______________________________________________________________________");
        System.out.println("PERRITO DE NOMBRE "+ p.getPerro().getNombre().toUpperCase()+" Y RAZA "+ p.getPerro().getRaza().toUpperCase());
    }
}
