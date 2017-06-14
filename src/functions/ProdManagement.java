package functions;

import storage.List;
import storage.produkt;

import java.util.ArrayList;

/**
 * Created by noah on 24.05.17.
 */
public class ProdManagement {

    List list = List.getInstance();

    public void ausleihen(int id){};
    public void addObject(storage.produkt new_product) {list.addobject(new_product); System.out.println("redirected");};
    public void removeObject(produkt object){list.removeobject(object);System.out.println("Passed Management");};


}
