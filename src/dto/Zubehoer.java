package dto;

/**
 * Diese Klasse erbt von "Produkt.java" und implementiert zusätzlich die Funktionen welche nur auf Zubehör und nicht auf Geräte zutrifft.
 * @author Noah Waldner
 * @version 1.0
 */


public class Zubehoer extends Produkt {

    private String zugehörig;

    public String getZugehoerig() {
        return zugehörig;
    }

    public void setZugehörig(String zugehörig) {
        this.zugehörig = zugehörig;
    }
}
