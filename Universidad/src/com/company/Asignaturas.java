package com.company;

public class Asignaturas{
    private String codigoasignatura;
    private String nombreasignatura;
    private String horario;
    private int Capacidad;


    public Asignaturas() {

    }

    public String getCodigoasignatura() {
        return codigoasignatura;
    }

    public void setCodigoasignatura(String codigoasignatura) {
        this.codigoasignatura = codigoasignatura;
    }

    public String getNombreasignatura() {
        return nombreasignatura;
    }

    public void setNombreasignatura(String nombreasignatura) {
        this.nombreasignatura = nombreasignatura;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int capacidad) {
        Capacidad = capacidad;
    }

    @Override
    public java.lang.String toString() {
        return "Asignaturas{" +
                "codigoasignatura=" + codigoasignatura +
                ", nombreasignatura=" + nombreasignatura +
                ", horario=" + horario +
                ", Capacidad=" + Capacidad +
                '}';
    }
}
