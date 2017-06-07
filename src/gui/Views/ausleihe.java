package gui.Views;

import functions.OrderTableModel;

import javax.swing.*;

/**
 * Created by Noah Waldner on 19.05.2017.
 */
public class ausleihe extends JPanel {



    public ausleihe() {


        this.setBounds(244, 0, 656, 600);



        JTable table = new JTable();
        table.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(table);
        this.add(sp);
        table.setModel(new OrderTableModel());





    }
}
