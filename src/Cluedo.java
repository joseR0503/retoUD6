import java.util.ArrayList;
import java.util.List;

public class Cluedo {

    public static void main(String[] args) {
        
        String [] personajes = {"Amapola", "Celeste", "Prado", "Mora", "Rubio", "Blanco"};
        String [] armas = {"bate", "pistola", "candelabro","cuchillo", "cuerda", "hacha", "peso", "veneno", "trofeo"};
        String [] habitaciones = {"casa de invitados" , "teatro" , "spa", "observatorio", "comedor", "terraza", "salón", "cocina", "vestíbulo"};

        Jugador jugador = new Jugador();
        jugador.setNombre(personajes[1]);
        jugador.setArma(armas[1]);
        jugador.setHabitacion(habitaciones[6]);
        jugador.setHoraPartida();
        System.out.println(jugador);


        ArrayList<Jugador> listaEstados = new ArrayList<Jugador>();
        listaEstados.add(jugador);
        System.out.println(listaEstados.get(0));
        
        for(int i=0; i<5; i++){
            jugador = new Jugador();
            jugador.setNombre(personajes[i]);
        jugador.setArma(armas[i]);
        jugador.setHabitacion(habitaciones[i]);
        jugador.setHoraPartida();
        listaEstados.add(jugador);

        }
        
        for(int i=0; i<listaEstados.size(); i++){
            System.out.println(listaEstados.get(i));
        }
    }

    
    
}
