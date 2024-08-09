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
public class Main {
    
    public static void main(String[] args) {
        // Crear Catedráticos
        Catedratico catedratico1 = new Catedratico("Erik Hernandez", "4av. 4-56 zona 7 Colonia Landivar Guatemala", "5845 7845", "Ingeniero");
        Catedratico catedratico2 = new Catedratico("Carlos Salguero", "8av. 8-48 zona 21 Colonia Justo Rufino Barrios", "4578 6521", "Matemático");
        Catedratico catedratico3 = new Catedratico("Kevin Letona", "5ta. calle 4-52 zona 5 de Mixco Colonia Primero de Julio", "3512 4587", "Físico");

        // Crear Cursos
        Curso curso1 = new Curso("Matemáticas", 2, 5, catedratico1);
        Curso curso2 = new Curso("Física", 5, 4, catedratico2);
        Curso curso3 = new Curso("Programación", 5, 6, catedratico3);

        // Crear Alumnos
        Alumno alumno1 = new Alumno("Fernando Sánchez", "5av. 4-56 zona 4 de Mixco Colonia Bosques de San Nicolas", "3378 5645", 20);
        Alumno alumno2 = new Alumno("Karla Figueroa ", "9av. 5-34 zona 6 de Mixco Colonia San Francisco", "444555666", 21);
        Alumno alumno3 = new Alumno("Rigoberto Martínez", "Apartamentos CANTO zona 10 de Mixco Colonia La Comunidad", "5489 2145", 22);

        // Asignar Cursos a Alumnos
        Asignacion asignacion1 = new Asignacion(alumno1);
        asignacion1.addCurso(curso1);
        asignacion1.addCurso(curso2);

        Asignacion asignacion2 = new Asignacion(alumno2);
        asignacion2.addCurso(curso2);
        asignacion2.addCurso(curso3);

        Asignacion asignacion3 = new Asignacion(alumno3);
        asignacion3.addCurso(curso1);
        asignacion3.addCurso(curso3);

        // Imprimir datos de los Catedráticos, Alumnos y Cursos
        catedratico1.imprimirDatos();
        alumno1.imprimirDatos();
    }
    
}
