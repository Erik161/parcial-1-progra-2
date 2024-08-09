/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcial;

/**
 *
 * @author Asus Tuf
 */
public class Alumno {
    private static int contadorAlumnos = 0;
    private int carnet;
    private String nombre;
    private String direccion;
    private String telefono;
    private int edad;

    // Constructor
    public Alumno(String nombre, String direccion, String telefono, int edad) {
        this.carnet = ++contadorAlumnos;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
    }

    // Método para imprimir los datos del Alumno
    public void imprimirDatos() {
        System.out.println("Carnet: " + carnet);
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Edad: " + edad);
    }
    
}
