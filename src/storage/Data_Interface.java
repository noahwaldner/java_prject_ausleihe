package storage;

import java.util.ArrayList;

/**
 * Created by noah on 07.06.17.
 */
public interface Data_Interface {
    void addobject(produkt neuesprodukt);
    void removeobject(int id);
    ArrayList<produkt> getAll();
}
