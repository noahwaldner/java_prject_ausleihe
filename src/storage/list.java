package storage;

import java.util.ArrayList;

/**
 * Created by Noah Waldner on 19.05.2017.
 */
public class list {
    ArrayList<produkt> storage = new ArrayList<produkt>();

    public void addobject(produkt neuesprodukt) {
        storage.add(neuesprodukt);
    }

}




