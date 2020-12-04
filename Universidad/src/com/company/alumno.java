package com.company;

import java.util.ArrayList;

public class alumno {
    private String nombre;
    private int edad;
    private double estatura;
    private String cuenta;
    private String telefono;
    ArrayList<String> Nombres;

    public alumno(String cuenta)
    {
        this.cuenta = cuenta;
        System.out.println("Soy un constructor de datos");
    }
    public alumno() { System.out.println("Soy un constructor sin parametros"); }

    public String getNombre() {
        final String nombre = this.nombre;
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public java.lang.String toString() {
        return "alumno{" +
                "nombre=" + nombre +
                ", edad=" + edad +
                ", estatura=" + estatura +
                ", cuenta=" + cuenta +
                ", telefono=" + telefono +
                '}';
    }
}
