package storage;

import dto.Geraet;
import dto.Produkt;

import java.util.ArrayList;

/**
 * Implementiert eine Arralist in welcher die Objekte gespeichert werden.
 * Die Klasse ist ein Singleton
 * @author Noah Waldner
 * @version 1.0
 */
public class List {
    ArrayList<Produkt> storage = new ArrayList<Produkt>();

    private static List ourInstance = new List();

    public static List getInstance() {
        return ourInstance;
    }

    /**
     * Baut Arraylist zusammen und fügt Beispieleintrag hinzu
     */
    private List() {
        Geraet prd1 = new Geraet();
        prd1.setName("Name1");
        prd1.setDescription("Desc1");
        storage.add(prd1);
    }

    /**
     * Fügt neues Objekt zur Arraylist hinzu
     * @param neuesprodukt
     */
    public void addobject(Produkt neuesprodukt) {
        storage.add(neuesprodukt);
        System.out.println("added");
    };

    /**
     * Löscht Objekt aus Arraylist
     * @param object
     */
    public void removeobject(Produkt object) {
        storage.remove(object);
        System.out.println("Removed");
    };

    /**
     * gibt die ganze Arraylist zurück
     * @return
     */
    public ArrayList<Produkt> getAll() {return storage;};
}
