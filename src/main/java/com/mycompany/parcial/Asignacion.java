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
public class Asignacion {
    private Alumno alumno;
    private Curso curso;

    // Constructor
    public Asignacion(Alumno alumno) {
        this.alumno = alumno;
    }

    // Método para agregar curso al alumno
    public void addCurso(Curso curso) {
        if (curso.verificaEspacio()) {
            curso.agregarAlumno(alumno);
        } else {
            System.out.println("No se puede asignar el curso. No hay espacio.");
        }
    }
    
}
