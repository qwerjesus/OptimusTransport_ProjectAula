package model;

import java.util.Date;

public class Horarios {

    public static Horarios[][] Horarios;
    public String ruta;
    public String nombreRuta;
    public int dia;
    public int mes;
    public int año;
    public int hora;
    public int minutos;
    public int fecha;
    
    public void GenerarFecha(){
        Date formato = new Date(año, mes, dia, hora, minutos);
        fecha = (int) formato.getTime();

    }
    
    
    public Horarios(String ruta, String nombreRuta, int dia, int mes, int año, int hora, int minutos) {
        this.ruta = ruta;
        this.nombreRuta = nombreRuta;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.hora = hora;
        this.minutos = minutos;
    }

    public Horarios() {
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getNombreRuta() {
        return nombreRuta;
    }

    public void setNombreRuta(String nombreRuta) {
        this.nombreRuta = nombreRuta;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }


}
