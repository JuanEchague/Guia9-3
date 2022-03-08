package ejercicio3;

import java.util.ArrayList;

public class Baraja {
////////////////////////////Atributos//////////////////////////////////////////
    private ArrayList<Carta> baraja;
    
//////////////////////////Constructores////////////////////////////////////////
    public Baraja() {
        this.baraja = new ArrayList<>();
    }
    
////////////////////////////Getters and Setters////////////////////////////////
    public ArrayList<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }
}
