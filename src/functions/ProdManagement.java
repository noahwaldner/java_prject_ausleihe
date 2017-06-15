package functions;


import storage.List;
import storage.Produkt;

import javax.swing.*;

import storage.Produkt;


/**
 * Created by noah on 24.05.17.
 */
public class ProdManagement {


    List list = List.getInstance();



    public void addObject(Produkt new_product) {list.addobject(new_product); System.out.println("redirected");};

    public void removeObject(Produkt object){
        if (object.getAusgeliehen()){
            JOptionPane.showMessageDialog(null, "Ein ausgeliehenes Produkt kann nicht gelöscht werden!","Warnung",JOptionPane.ERROR_MESSAGE);
        }else{
            list.removeobject(object);
            System.out.println("Passed Management");
        }

    };

    public void ausleihen(int id){};





}
