package gui.Views;

import functions.FullTableModel;
import functions.TableModel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Noah Waldner
 * Die Klasse ist die Anzeige von Allen Produkten in der Arraylist.
 *
 */
public class All extends JPanel {

    JTable table;
    JLabel titel;


    //Im Konstruktor wird die View zusammengebaut.
    public All() {

        //Set Panel Setting
        this.setBounds(244, 0, 656, 600);
        this.setLayout(new BorderLayout());

        //New Label for Title
        titel = new JLabel();
        titel.setText("Alle Produkte");
        //Add Title to Panel
        this. add(titel, BorderLayout.NORTH);


        //JTable von einem Model in einem ScrolPane generieren und zum Panel hinzufügen.
        table = new JTable();
        table.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(table);
        this.add(sp,BorderLayout.CENTER);
        table.setModel(new FullTableModel());







    }
}
