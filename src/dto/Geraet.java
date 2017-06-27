package dto;

/**
 * Diese Klasse erbt von Produk und implementiert alle Methoden welche nur auf Geräte und nicht auf Zubehoer zutreffen.
 * @author Noah Waldner
 * @version 1.0
 */

public class Geraet extends Produkt {


    private boolean mobile;

    /**
     * Die mehode gibt zurück ob das Gerät Mobil ist.
     * @return mobile Mobil
     */
    public boolean getMobile() {
        return mobile;
    }


    /**
     * Setzt den wert mobile
     * @param mobile Mobil
     */
    public void setMobile(boolean mobile) {
        this.mobile = mobile;
    }
}
