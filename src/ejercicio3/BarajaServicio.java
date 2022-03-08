package ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class BarajaServicio {

    Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    private ArrayList<Carta> mazo = new ArrayList();
    private ArrayList<Carta> mazoAux = new ArrayList<>();

    private Carta carta;

    public void crearBaraja() {

        for (int i = 0; i < 13; i++) {
            if (i > 0 && i < 8 || i > 9 && i < 13) {
                for (Palo enum1 : EnumSet.range(Palo.Oro, Palo.Copas)) {
                    carta = new Carta(i, enum1);
                    mazo.add(carta);
                }
            }
        }
        System.out.println(mazo);
    }

    public void mezclarCartas() {
        System.out.println("Cartas mezcladas");
        Collections.shuffle(mazo);

    }

    public void siguienteCarta() {
        if (!mazo.isEmpty()) {
            Iterator<Carta> iterator = mazo.iterator();
            Carta sacar = iterator.next();
            System.out.println("La carta sacada es " + sacar);
            mazoAux.add(sacar);
            iterator.remove();
        } else {
            System.out.println("El mazo no tiene mas cartas");
        }
    }

    public void darCartas(int nScar) {
        if (!mazo.isEmpty()) {
            if (nScar <= mazo.size()) {
                Iterator<Carta> iterator = mazo.iterator();
                for (int i = 0; i < nScar; i++) {
                    Carta sacar = iterator.next();
                    System.out.println("Su carta es" + sacar);
                    mazoAux.add(sacar);
                    iterator.remove();
                }

            } else {
                System.out.println("La cantidad que quiere sacar es mayor a la cantidad que hay en el mazo");
            }
        } else {
            System.out.println("El mazo esta vacio");
        }
    }

    public void cartasDisponibles() {
        System.out.printf("La cantidad de cartas restantes en el mazo es %d\n", mazo.size());
        System.out.printf("La cantidad de carats sacadas del mazo fueron %d\n", mazoAux.size());

    }

    public void cartasMonton() {
        System.out.println("Las cartas extraidas son: ");
        if (!mazoAux.isEmpty()) {
            for (Carta carta : mazoAux) {
                System.out.println(carta);
            }
        } else {
            System.out.println("No se ha extraido ninguna");

        }

    }

    public void mostrarBaraja() {
        System.out.println("Las cartas en el mazo son: ");
        if (!mazo.isEmpty()) {
            for (Carta carta : mazo) {
                System.out.println(carta);
            }
        } else {
            System.out.println("El maso esta vacio");

        }

    }

    public void menu() {
        int opc, nSacar;
        boolean band = false;
        do {
            System.out.println("------MENU-----");
            System.out.println("1) Crear Baraja");
            System.out.println("2) Mezclar cartas");
            System.out.println("3) Sacar carta");
            System.out.println("4) Repartir cartas");
            System.out.println("5) Ver cantidad de cartas disponibles en el mazo");
            System.out.println("6) Ver cartas que ya salieron");
            System.out.println("7) Mostrar baraja");
            System.out.println("8) Salir");
            System.out.print("Ingrese una opcion: ");
            opc = read.nextInt();
            System.out.println();
            switch (opc) {
                case 1:
                    mazo.clear();
                    mazoAux.clear();
                    band = true;
                    System.out.println("Baraja creada!");
                    crearBaraja();
                    break;
                case 2:
                    if (band) {
                        mezclarCartas();
                    } else {
                        System.out.println("Cree el mazo primero");
                    }

                    break;
                case 3:
                    if (band) {
                        siguienteCarta();
                    } else {

                        System.out.println("Cree el mazo primero");
                    }

                    break;
                case 4:
                    if (band) {
                        System.out.println("Ingrese numero de cartas a sacar");
                        nSacar = read.nextInt();
                        darCartas(nSacar);
                    } else {
                        System.out.println("Cree el mazo primero");
                    }

                    break;
                case 5:
                    if (band) {
                        cartasDisponibles();
                    } else {
                        System.out.println("Cree el mazo primero");
                    }

                    break;
                case 6:
                    if (band) {
                        cartasMonton();
                    } else {
                        System.out.println("Cree el mazo primero");
                    }

                    break;
                case 7:
                    if (band) {
                        mostrarBaraja();
                    } else {
                        System.out.println("Cree el mazo primero");
                    }

                    break;
                case 8:
                    System.out.println("Cerrando...");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
            }
        } while (opc != 8);
    }
}
