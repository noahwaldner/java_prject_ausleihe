package storage;

import java.util.ArrayList;

/**
 * Created by noah on 14.06.17.
 */
public class List {
    ArrayList<produkt> storage = new ArrayList<produkt>();

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

    public void addobject(produkt neuesprodukt) {
        storage.add(neuesprodukt);
        System.out.println("added");
    };
    public void removeobject(produkt object) {
        storage.remove(object);
        System.out.println("Removed");
    };
    public ArrayList<produkt> getAll() {return storage;};
}
