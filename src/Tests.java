import dto.Geraet;
import dto.Produkt;
import dto.Zubehoer;
import functions.ProdManagement;
import jdk.nashorn.internal.ir.IfNode;
import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNot;
import org.junit.Assert;
import org.junit.Test;
import functions.ProdManagement;
import functions.TableModel;
import gui.Tech_Verlei;
import gui.Views.AddProduct;
import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNot;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import storage.List;
import sun.tools.tree.IfStatement;


import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;

import static junit.framework.TestCase.assertEquals;

import java.util.Date;

/**
 * Created by etienneroulet on 27.06.17.
 */


/**
 * Created by Etienne998 on 21.06.2017.
 */

public class Tests {

    @Test
    public void Testfall_I(){
        Date anschDate = new Date();
        Geraet testProdukt = new Geraet();
        testProdukt.setAnschaffungsdatum(anschDate);
        testProdukt.setMobile(true);
        testProdukt.setDescription("hallo");
        testProdukt.setHersteller("good one");
        testProdukt.setis_prod(true);
        testProdukt.setName("Testname");
        assertEquals(testProdukt.getAnschaffungsdatum(), anschDate);
        assertEquals(testProdukt.getHersteller(),"good one");
        assertEquals(testProdukt.getMobile(),true);
        ProdManagement management = new ProdManagement();
        management.addObject(testProdukt);




    }
    //Check dass nicht der Artikel ein Null wert besitzt sondern gefüllt ist.
    @Test
    public void Testfall_II(){
        Date anschDate = new Date();
        Zubehoer testProdukt = new Zubehoer();
        testProdukt.setZugehörig("XXX");
        testProdukt.setAnschaffungsdatum(anschDate);
        testProdukt.setName("Testname");
        testProdukt.setDescription("hallo");
        testProdukt.setHersteller("good one");
        testProdukt.setis_prod(true);
        Assert.assertThat(testProdukt.getHersteller(), IsNot.not(IsEqual.equalTo("")));
        assertEquals(testProdukt.getZugehoerig(), "XXX");
        ProdManagement management = new ProdManagement();
        management.addObject(testProdukt);
        assertEquals(testProdukt.getAusgeliehen(), false );

    }
//Rückgabe eines Artikels wird überprüft
    @Test
    public void Testfall_III(){
        Geraet testProdukt = new Geraet();
        testProdukt.ausleiheRuckgabe();
        assertEquals(testProdukt.getAusgeliehen(), true);
        testProdukt.ausleiheRuckgabe();
        assertEquals(testProdukt.getAusgeliehen(), false);
    }
//Initialisierung des Geräts wird überprüft
    @Test
    public void Testfall_IV(){
        Geraet testProdukt = new Geraet();
        testProdukt.ausleiheRuckgabe();
        Assert.assertThat(testProdukt.getAusgeliehen(), IsNot.not(IsEqual.equalTo(false)));
        testProdukt.ausleiheRuckgabe();
        Assert.assertThat(testProdukt.getAusgeliehen(), IsNot.not(IsEqual.equalTo(true)));
    }
    //List test ob Prodkt removed werden kann. Und hinzugefügt
    @Test
    public void Testfall_V(){
        Geraet testProdukt = new Geraet();
        List list = List.getInstance();

        ArrayList<Produkt> storage= list.getAll();


        ProdManagement manage = new ProdManagement();
        manage.addObject(testProdukt);
        assertEquals(storage.contains(testProdukt), true);
        manage.removeObject(testProdukt);
        assertEquals(storage.contains(testProdukt), false);
    }




}