package com.company;

import java.lang.String;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner rd = new Scanner(System.in);
        alumno al = new alumno("202010020044");
        al.setNombre("Axel");

        String info[]=new String[5];
        info[0]="nombre,edad,sexo,cuenta,carreras";

        alumno alumnos[];
        alumnos=new alumno[5];

        alumnos[0]=al;
        alumnos[0].getNombre();
        System.out.println(alumnos[0].toString());
       Imprimirinfor(al);


       Asignaturas asg = new Asignaturas();
       asg.setCodigoasignatura("POO01");
       asg.setNombreasignatura("Programacion Orientada a Objetos");
       asg.setCapacidad(25);
       asg.setHorario(21:00);

       Catedratico Cat= new Catedratico();
       Cat.imprimirCatedratico();

        }

   public static void Imprimirinfor(alumno al){
        System.out.println("Cuenta:\t"+al.getCuenta()+"Nombre:\t"+al.getNombre());


   }
}

