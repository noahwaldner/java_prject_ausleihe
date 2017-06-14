package storage;

import java.util.ArrayList;

/**
 * Created by noah on 14.06.17.
 */
public class List {
    ArrayList<Produkt> storage = new ArrayList<Produkt>();

    private static List ourInstance = new List();

    public static List getInstance() {
        return ourInstance;
    }

    private List() {
        Geraet prd1 = new Geraet();
        prd1.setName("Name1");
        prd1.setDescription("Desc1");
        storage.add(prd1);
    }

    public void addobject(Produkt neuesprodukt) {
        storage.add(neuesprodukt);
        System.out.println("added");
    };
    public void removeobject(Produkt object) {
        storage.remove(object);
        System.out.println("Removed");
    };
    public ArrayList<Produkt> getAll() {return storage;};
}
