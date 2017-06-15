package storage;

import java.util.ArrayList;

/**
 * Created by Noah Waldner on 19.05.2017.
 */
public final class ProductList {

    private static ProductList centralProductList;

    public static ProductList getCentralProductList() {
        if (centralProductList == null) {
            centralProductList = new ProductList();
        }
        return centralProductList;
    }

    private ArrayList<Produkt> storage;

    private ProductList() {
        storage = new ArrayList<Produkt>();
        Geraet prd1 = new Geraet();
        prd1.setName("Name1");
        prd1.setDescription("Desc1");
        storage.add(prd1);
    };

    public void addobject(Produkt neuesprodukt) {
        storage.add(neuesprodukt);
    };
    public void removeobject(int id) {/*To Do*/};
    public ArrayList<Produkt> getAll() {return storage;};

}




