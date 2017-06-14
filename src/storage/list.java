package storage;

import java.util.ArrayList;

/**
 * Created by Noah Waldner on 19.05.2017.
 */
public class list {
    ArrayList<produkt> storage = new ArrayList<produkt>();

    public list() {
        Geraet prd1 = new Geraet();
        prd1.setName("Name1");
        prd1.setDescription("Desc1");
        storage.add(prd1);
    };

    public void addobject(produkt neuesprodukt) {
        storage.add(neuesprodukt);
    };
    public void removeobject(int id) {/*To Do*/};
    public ArrayList<produkt> getAll() {return storage;};

}




