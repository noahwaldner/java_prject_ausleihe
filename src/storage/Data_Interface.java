package storage;

import dto.Produkt;

import java.util.ArrayList;

/**
 * Dieses Interface ist dafür da um alle Klassen welche fürs Speichern zuständig sind zu vereinheitlichen.
 * @author Noah Waldner
 * @version 1.0
 */
public interface Data_Interface {
    void addobject(Produkt neuesprodukt);
    void removeobject(Produkt produkt);
    ArrayList<Produkt> getAll();
}
