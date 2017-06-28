package dto;

import java.util.Date;

/**
 * Diese Klasse ist die Elternklasse von "Produkt.java" und "Zubehoer.java" und beinhaltet die Methone welche in beiden Klassen benötigt werden.
 * @author Noah Waldner
 * @version 1.0
 */
public abstract class Produkt {


    private String name;
    private String hersteller;
    private Date anschaffungsdatum;
    private String description;
    private boolean is_prod;
    private boolean ausgeliehen;



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



    public boolean getAusgeliehen() {
        return ausgeliehen;
    }


    /**
     * Invertiert den Boolean wert ausgeliehen
     */
    public void ausleiheRuckgabe() {
        if (ausgeliehen == false){
            ausgeliehen = true;
        }
        else {
            ausgeliehen = false;
        }
    }


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

    public boolean setis_prod(boolean is_prod) { return is_prod;}

}
