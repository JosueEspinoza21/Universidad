package com.company;

public class Catedratico {
        private String nombres, apellidos,titulo;
        private int edad;

        Catedratico(String nombres, String apellidos, String titulo, int edad){
            setNombres(nombres);
            setApellidos(apellidos);
            setTitulo(titulo);
            setEdad(edad);
        }

        public void setNombres(String n){
            nombres = n;
        }
        public void setApellidos(String a){
            apellidos = a;
        }
        public void setTitulo(String c){
            titulo = c;
        }
        public void setEdad(int e){
            edad = e;
        }

        public String getNombres(){
            return nombres;
        }
        public String getApellidos(){
            return apellidos;
        }
        public String getTitulo(){
            return titulo;
        }
        public int getEdad(){
            return edad;
        }

        public void imprimirCatedratico(){
            System.out.println("\nNombres: "+getNombres()+"\nApellidos: "+getApellidos()+"\nTitulo: "+getTitulo()+
                    "\nEdad: "+getEdad());
        }
    }

