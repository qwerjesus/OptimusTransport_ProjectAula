package control;

import model.Horarios;

public class MetodosHorarios extends Horarios{

    public MetodosHorarios(String ruta, String nombreRuta, int dia, int mes, int año, int hora, int minutos) {
        this.ruta = ruta;
        this.nombreRuta = nombreRuta;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.hora = hora;
        this.minutos = minutos;
    }
    
    public MetodosHorarios() {
    }

    public int contador_horarios = 0;

    public static Horarios[] horarioTemporal = new Horarios[7];

    public void AgregarHorario(Horarios fecha) {
        if (contador_horarios < horarioTemporal.length) {
            horarioTemporal[(int) contador_horarios] = fecha;
            contador_horarios++;
        } else {
            System.out.println("Lo sentimos ya no se pueden ingresar mas elementos.");
        }
    
    }
    
    public void EliminarHorario(int indice) {
        if (indice>=0 && indice<contador_horarios) {
            for (int i = indice; i < contador_horarios-1; i++) {
                horarioTemporal[i]=horarioTemporal[i+1];
            }
            horarioTemporal[contador_horarios-1]=null;
            contador_horarios--;
        }else{
            System.out.println("Por favor ingrese un numero detro del rango (de 0 a 6)");
        }
    }
}
    

