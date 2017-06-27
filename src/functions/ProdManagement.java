package functions;


import storage.List;
import dto.Produkt;

import javax.swing.*;


/**
 * Diese Klasse führt wenn nötig berechnungen oder Abfragen aus.
 * @author Noah Waldner
 * @version 1.0
 */
public class ProdManagement {


    List list = List.getInstance();


    /**
     * übergibt das eingegebene Objekt an die methode "addobject" in der Datenschicht.
     * @param new_product neuesProdukt
     */
    public void addObject(Produkt new_product) {list.addobject(new_product); System.out.println("redirected");};

    /**
     * Die methode überprüft ob das eingegebene Objekt Ausgeliehen ist.
     * Falls Ja gibt es eine Fehlermeldung aus.
     * Falls Nein wird das Objekt an die methode "removeobject" in der Datenschicht weitergegeben.
     * @param object zuloeschendesProdukt
     */
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
