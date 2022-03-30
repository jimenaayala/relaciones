/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Perro;
import java.util.Scanner;

/**
 *
 * @author Jime
 */
public class PerroServicio {

    public Perro crearPerro() {
        Perro p = new Perro();
        Scanner read = new Scanner(System.in).useDelimiter("\\n");
        System.out.println("Ingrese los datos del PERRO nombre, raza, tamaño (grande, mediano,chio), edad");
        p.setNombre(read.nextLine());
        p.setRaza(read.nextLine());
        p.setTamanio(read.nextLine());
        p.setEdad(read.nextInt());
        
        return p;
    }
}
