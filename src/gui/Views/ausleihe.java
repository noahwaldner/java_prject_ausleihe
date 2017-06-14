package gui.Views;

import functions.TableModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;

/**
 * Created by Noah Waldner on 19.05.2017.
 */
public class ausleihe extends JPanel implements ActionListener{

    JButton btn_action, btn_update;
    JTable table;



    public ausleihe() {


        this.setBounds(244, 0, 656, 600);
        this.setLayout(new BorderLayout());



        table = new JTable();
        table.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(table);
        this.add(sp,BorderLayout.CENTER);
        table.setModel(new TableModel());




        btn_action = new JButton("Ausleihen / Rückgeben");
        this.add(btn_action, BorderLayout.SOUTH);
        btn_action.addActionListener(this);



    }


        public void actionPerformed(ActionEvent e){
            if (e.getSource() == btn_action){
                if (table.getSelectedRow() != -1){
                    ((TableModel)table.getModel()).getObjectbyIndex(table.getSelectedRow());

                }

            }
        }











}
