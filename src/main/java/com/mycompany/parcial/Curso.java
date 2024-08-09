

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcial;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Asus Tuf
 */
public class Curso {
    private static int contadorCursos = 0;
    private int id;
    private String titulo;
    private int numMaxAlumnos;
    private int creditos;
    private Catedratico catedratico;
    private List<Alumno> alumnosAsignados;

    // Constructor
    public Curso(String titulo, int numMaxAlumnos, int creditos, Catedratico catedratico) {
        this.id = ++contadorCursos;
        this.titulo = titulo;
        this.numMaxAlumnos = numMaxAlumnos;
        this.creditos = creditos;
        this.catedratico = catedratico;
        this.alumnosAsignados = new ArrayList<>();
    }

    // Métodos set y get
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    

    // Método para verificar si hay espacio
    public boolean verificaEspacio() {
        return alumnosAsignados.size() < numMaxAlumnos;
    }

    // Método para agregar un alumno al curso
    public void agregarAlumno(Alumno alumno) {
        if (verificaEspacio()) {
            alumnosAsignados.add(alumno);
        } else {
            System.out.println("No hay espacio en el curso " + titulo);
        }
    }
}
