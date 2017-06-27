import dto.Produkt;
import functions.ProdManagement;
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


import javax.swing.*;
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
        Produkt testProdukt = new Produkt();
        testProdukt.setAnschaffungsdatum(anschDate);
        testProdukt.setDescription("hallo");
        testProdukt.setHersteller("good one");
        testProdukt.setis_prod(true);
        testProdukt.setName("Testname");
        assertEquals(testProdukt.getAnschaffungsdatum(), anschDate);
        assertEquals(testProdukt.getHersteller(),"good one");
        ProdManagement management = new ProdManagement();
        management.addObject(testProdukt);




    }
    //Check dass nicht der Artikel ein Null wert besitzt sondern gefüllt ist.
    @Test
    public void Testfall_II(){
        Date anschDate = new Date();
        Produkt testProdukt = new Produkt();
        testProdukt.setAnschaffungsdatum(anschDate);
        testProdukt.setName("Testname");
        testProdukt.setDescription("hallo");
        testProdukt.setHersteller("good one");
        testProdukt.setis_prod(true);
        Assert.assertThat(testProdukt.getHersteller(), IsNot.not(IsEqual.equalTo("")));
        ProdManagement management = new ProdManagement();
        management.addObject(testProdukt);
        assertEquals(testProdukt.getAusgeliehen(), false );

    }

    @Test
    public void Testfall_III(){
        Produkt testProdukt = new Produkt();
        testProdukt.ausleiheRuckgabe();
        assertEquals(testProdukt.getAusgeliehen(), true);
        testProdukt.ausleiheRuckgabe();
        assertEquals(testProdukt.getAusgeliehen(), false);
    }

    @Test
    public void Testfall_IV(){
        Produkt testProdukt = new Produkt();
        testProdukt.ausleiheRuckgabe();
        Assert.assertThat(testProdukt.getAusgeliehen(), IsNot.not(IsEqual.equalTo(false)));
        testProdukt.ausleiheRuckgabe();
        Assert.assertThat(testProdukt.getAusgeliehen(), IsNot.not(IsEqual.equalTo(true)));
    }



}