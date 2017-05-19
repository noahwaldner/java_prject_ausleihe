package storage;

import java.util.Date;

/**
 * Created by Noah Waldner on 19.05.2017.
 */
public class produkt {


    private String name;
    private String hersteller;
    private Date anschaffungsdatum;
    private String description;
    private boolean is_prod;
    private int quantity;



    public void setName(String name) {
        this.name = name;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public void setAnschaffungsdatum(Date anschaffungsdatum) {
        this.anschaffungsdatum = anschaffungsdatum;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void getis_prod (boolean is_prod) { this.is_prod = is_prod;}

    public void setQuantity(int quantity) { this.quantity = quantity; }





    public String getName() {
        return name;
    }

    public String getHersteller() {
        return hersteller;
    }

    public Date getAnschaffungsdatum() {
        return anschaffungsdatum;
    }

    public String getDescription() {
        return description;
    }

    public boolean setis_prod() { return is_prod;}

    public int getQuantity() { return quantity; }
}
