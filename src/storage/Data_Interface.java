package storage;

import java.util.ArrayList;

/**
 * Created by noah on 07.06.17.
 */
public interface Data_Interface {
    void addobject(Produkt neuesprodukt);
    void removeobject(int id);
    ArrayList<Produkt> getAll();
}
