package ejercicio3;

public class Carta {
////////////////////////////Atributos/////////////////////////////////////////
    private int numCarta;

    private Palo palo;
///////////////////////////Constructores/////////////////////////////////////
    public Carta() {
    }

    public Carta(int numCarta, Palo palo) {
        this.numCarta = numCarta;
        this.palo = palo;
    }
/////////////////////////Getters an Setters////////////////////////////////////
    public int getNumCarta() {
        return numCarta;
    }

    public void setNumCarta(int numCarta) {
        this.numCarta = numCarta;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }
///////////////////////////////Metodos//////////////////////////////////////
    @Override
    public String toString() {
        return "Numero de carta: " + numCarta + ", Palo: " + palo + "\n";
    }

}
