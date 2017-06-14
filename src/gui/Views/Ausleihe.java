package gui.Views;

import functions.TableModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;

/**
 * Created by Noah Waldner on 19.05.2017.
 * Die Klasse Stellt eine Liste mit allen Produkten dar. Es gibt einen Button mit welchen das gewählte Produkt Ausgeleiht oder zurückgegeben werden kann.
 */
public class Ausleihe extends JPanel implements ActionListener{

    JButton btn_action;
    JTable table;


    //Im Konstruktor wird die View zusammengebaut.
    public Ausleihe() {

        //Panel Settings
        this.setBounds(244, 0, 656, 600);
        this.setLayout(new BorderLayout());


        //JTable von einem Model in einem ScrolPane generieren und zum Panel hinzufügen.

        table = new JTable();
        table.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(table);
        this.add(sp,BorderLayout.CENTER);
        table.setModel(new TableModel());



        //Button zum ausleihen und zurückgeben generieren und zum Panel hinzufügen.
        btn_action = new JButton("Ausleihen / Rückgeben");
        this.add(btn_action, BorderLayout.SOUTH);
        btn_action.addActionListener(this);



    }

        //Ein actionlistener warted auf eine Interkation mit dem Button.
        public void actionPerformed(ActionEvent e){
            if (e.getSource() == btn_action){
                //Es wird geprüft ob etwas ausgewählt ist.
                if (table.getSelectedRow() != -1){
                    //Es wird das Model des JTable geholt und die Methode AusleiheByIndex darin aufgerufen. Es wird der Index der ausgewählten Reihe mitgegeben.
                    ((TableModel)table.getModel()).ausleiheByIndex(table.getSelectedRow());

                }

            }
        }











}
