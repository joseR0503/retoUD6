import java.time.LocalTime;

public class Jugador {

    private String nombre;
    private String arma;
    private String habitacion;
    private LocalTime horaPartida;

    public Jugador (){
        this.nombre = null;
        this.arma = null;
        this.habitacion = null;
        this.horaPartida = null;

    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArma() {
        return arma;
    }
    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getHabitacion() {
        return habitacion;
    }
    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public LocalTime getHoraPartida() {
        return horaPartida;
    }
    public void setHoraPartida() {
        this.horaPartida = LocalTime.now();
    }
 
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "[Nombre: "+ nombre + ", arma: "+ arma + ",habitacion: "+ habitacion+ "hora actual: "+ horaPartida + "]";
    }
    

}