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
public class Catedratico {
    private static int contadorCatedraticos = 0;
    private int codigoCatedratico;
    private String nombre;
    private String direccion;
    private String telefono;   
    private String profesion;

    // Constructor
    public Catedratico(String nombre, String direccion, String telefono, String profesion) {
        this.codigoCatedratico = ++contadorCatedraticos;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.profesion = profesion;
    }

    // Método para imprimir los datos del Catedrático
    public void imprimirDatos() {
        System.out.println("Código: " + codigoCatedratico);
        System.out.println("Nombre: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Profesión: " + profesion);
    }
}
