package gui.Views;

import functions.TableModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Diese Klassse Zeigt die View um ein Produkt zu löschen an.
 * @author Noah Waldner
 * @version 1.0
 *
 */
public class RemoveProduct extends JPanel implements ActionListener{

    JButton btn_action;
    JTable table;


    /**
     * Der Konstruktor baut die View zusammen.
     */
    public RemoveProduct() {


        this.setBounds(244, 0, 656, 600);
        this.setLayout(new BorderLayout());



        table = new JTable();
        table.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(table);
        this.add(sp,BorderLayout.CENTER);
        table.setModel(new TableModel());




        btn_action = new JButton("Produkt löschen");
        this.add(btn_action, BorderLayout.SOUTH);
        btn_action.addActionListener(this);



    }


    public void actionPerformed(ActionEvent e){
        if (e.getSource() == btn_action){
            if (table.getSelectedRow() != -1){
                ((TableModel)table.getModel()).loeschenByIndex(table.getSelectedRow());
                System.out.println("Button Clicked");

            }

        }
    }









}
