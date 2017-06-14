package gui.Views;

import functions.ProdManagement;
import storage.Geraet;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Noah Waldner on 19.05.2017.
 */
public class addproduct extends JPanel implements ActionListener{
    private JTextField textField;
    private JTextField textField_1;
    private JButton button;

    ProdManagement prodmanagement;



    public addproduct() {

        prodmanagement = new ProdManagement();


        this.setBounds(244, 0, 656, 600);

        textField = new JTextField();
        textField.setToolTipText("Titel des Produktes");
        textField.setColumns(10);

        JLabel lblNewLabel = new JLabel("Titel:");

        JLabel lblNewLabel_1 = new JLabel("Herrsteller:");

        textField_1 = new JTextField();
        textField_1.setColumns(10);

        JTextArea textArea = new JTextArea();
        textArea.setBorder(UIManager.getBorder("TextField.border"));

        JLabel lblBeschreibung = new JLabel("Beschreibung:");

        JLabel lblNewLabel_2 = new JLabel("New label");

        button = new JButton("add");

        GroupLayout gl_panel_home = new GroupLayout(this);
        gl_panel_home.setHorizontalGroup(
                gl_panel_home.createParallelGroup(Alignment.LEADING)
                        .addComponent(lblNewLabel_2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                        .addGroup(gl_panel_home.createSequentialGroup()
                                .addGap(37)
                                .addGroup(gl_panel_home.createParallelGroup(Alignment.LEADING)
                                        .addComponent(lblNewLabel)
                                        .addComponent(lblBeschreibung)
                                        .addComponent(lblNewLabel_1))
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addGroup(gl_panel_home.createParallelGroup(Alignment.LEADING, false)
                                        .addComponent(textArea, GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                                        .addComponent(textField)
                                        .addComponent(textField_1))
                                .addContainerGap(222, Short.MAX_VALUE))
                        .addGroup(Alignment.TRAILING, gl_panel_home.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(button, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE))
        );
        gl_panel_home.setVerticalGroup(
                gl_panel_home.createParallelGroup(Alignment.LEADING)
                        .addGroup(Alignment.TRAILING, gl_panel_home.createSequentialGroup()
                                .addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                .addGap(41)
                                .addGroup(gl_panel_home.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblNewLabel)
                                        .addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(gl_panel_home.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblNewLabel_1))
                                .addGap(55)
                                .addGroup(gl_panel_home.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblBeschreibung)
                                        .addComponent(textArea, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
                                .addGap(187)
                                .addComponent(button)
                                .addGap(47))
        );
        this.setLayout(gl_panel_home);



    }

        public void actionPerformed(ActionEvent e){
            if (e.getSource() == button){
                Geraet neuesGeraet = new Geraet();
                neuesGeraet.setMobile(true);
                neuesGeraet.setName("new Added");

            }

    }


}
