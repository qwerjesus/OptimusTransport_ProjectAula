package model;

import java.util.Date;

public class Tabla extends Horarios  {
    
    Date Formato = new Date(año, mes, dia, hora, minutos);

    public Tabla(String ruta, String nombreRuta, int dia, int mes, int año, int hora, int minutos) {
        super(ruta, nombreRuta, dia, mes, año, hora, minutos);
    }

    public Tabla() {
    }
    
    public int fecha_bus = (int) Formato.getTime();
    
    
    
    
}
