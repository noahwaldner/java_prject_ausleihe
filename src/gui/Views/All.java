package gui.Views;

import functions.TableModel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Noah Waldner on 19.05.2017.
 */
public class All extends JPanel {

    JTable table;
    JLabel titel;

    public All() {


        this.setBounds(244, 0, 656, 600);
        this.setLayout(new BorderLayout());

        titel = new JLabel();
        titel.setText("Alle Produkte");

        this. add(titel, BorderLayout.NORTH);



        table = new JTable();
        table.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(table);
        this.add(sp,BorderLayout.CENTER);
        table.setModel(new TableModel());







    }
}
