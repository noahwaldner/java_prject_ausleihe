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

public class AddProduct extends JPanel implements ActionListener{
    private JTextField titeltext;
    private JTextField herstellertext;
    private JTextField textField_2;
    private JTextField textField_3;
    private JButton bttn_addgerät;
    private JButton bttn_addzubehoer;
    private JTextField textField;


    ProdManagement prodmanagement;



    public AddProduct() {


        this.setBounds(244, 0, 600, 621);

        JLabel lblNewLabel_2 = new JLabel("New label");

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        GroupLayout gl_panel_home = new GroupLayout(this);
        gl_panel_home.setHorizontalGroup(
                gl_panel_home.createParallelGroup(Alignment.LEADING)
                        .addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                        .addGroup(gl_panel_home.createSequentialGroup()
                                .addGap(6)
                                .addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 588, GroupLayout.PREFERRED_SIZE)
                                .addGap(6))
        );
        gl_panel_home.setVerticalGroup(
                gl_panel_home.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel_home.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED)
                                .addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 543, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(48, Short.MAX_VALUE))
        );

        JPanel panel = new JPanel();
        tabbedPane.addTab("Zubeh\u00f6r", null, panel, null);

        JLabel lbl_zugehoer = new JLabel("Zugehörigkeit:");

        textField_2 = new JTextField();
        textField_2.setToolTipText("Titel des Produktes");
        textField_2.setColumns(10);


        JLabel lbl_titel = new JLabel("Herrsteller:");

        textField_3 = new JTextField();
        textField_3.setColumns(10);

        JLabel label_2 = new JLabel("Beschreibung:");

        JTextArea textArea_1 = new JTextArea();
        textArea_1.setBorder(UIManager.getBorder("TextField.border"));

        bttn_addzubehoer = new JButton("add");
        bttn_addzubehoer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });


        /*Hier wird das Panel fürs Zubehör erstellt*/

        textField = new JTextField();
        textField.setColumns(10);

        JLabel lbl_hersteller = new JLabel("Hersteller:");
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
                gl_panel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel.createSequentialGroup()
                                .addGap(14)
                                .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addComponent(lbl_titel, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                                                        .addGroup(gl_panel.createSequentialGroup()
                                                                .addComponent(label_2, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                                .addComponent(textArea_1, GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE))
                                                        .addGroup(gl_panel.createSequentialGroup()
                                                                .addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
                                                                        .addGroup(gl_panel.createSequentialGroup()
                                                                                .addComponent(lbl_hersteller, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(28))
                                                                        .addGroup(gl_panel.createSequentialGroup()
                                                                                .addComponent(lbl_zugehoer)
                                                                                .addPreferredGap(ComponentPlacement.RELATED)))
                                                                .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                                                                        .addComponent(textField, GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                                                                        .addComponent(textField_2, GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                                                                        .addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE))))
                                                .addContainerGap(72, GroupLayout.PREFERRED_SIZE))))
                        .addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
                                .addContainerGap(359, Short.MAX_VALUE)
                                .addComponent(bttn_addzubehoer, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        gl_panel.setVerticalGroup(
                gl_panel.createParallelGroup(Alignment.TRAILING)
                        .addGroup(gl_panel.createSequentialGroup()
                                .addGap(32)
                                .addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl_zugehoer))
                                .addGap(18)
                                .addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lbl_titel)
                                        .addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl_hersteller))
                                .addGap(18)
                                .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                                        .addComponent(label_2)
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addGap(8)
                                                .addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)))
                                .addGap(145)
                                .addComponent(bttn_addzubehoer, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                .addGap(43))
        );
        panel.setLayout(gl_panel);

        JPanel panel_1 = new JPanel();
        tabbedPane.addTab("Gerät", null, panel_1, null);

        JLabel lbltitle = new JLabel("Titel:");

        titeltext = new JTextField();
        titeltext.setToolTipText("Titel des Produktes");
        titeltext.setColumns(10);

        JCheckBox chckbxMobileDevice = new JCheckBox("Mobile Device ?");

        JLabel lblhersteller = new JLabel("Hersteller:");

        herstellertext = new JTextField();
        herstellertext.setColumns(10);

        JLabel lblBeschreibung = new JLabel("Beschreibung:");

        JTextArea textArea = new JTextArea();
        textArea.setBorder(UIManager.getBorder("TextField.border"));

        bttn_addgerät = new JButton("add");
        bttn_addgerät.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });




/*Hier wird das Panel für das Gerät erstellt*/
        GroupLayout gl_panel_1 = new GroupLayout(panel_1);
        gl_panel_1.setHorizontalGroup(
                gl_panel_1.createParallelGroup(Alignment.TRAILING)
                        .addGroup(gl_panel_1.createSequentialGroup()
                                .addContainerGap(359, Short.MAX_VALUE)
                                .addComponent(bttn_addgerät, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
                                .addGap(24)
                                .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
                                        .addComponent(chckbxMobileDevice)
                                        .addComponent(lblBeschreibung)
                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                                                        .addComponent(lblhersteller)
                                                        .addComponent(lbltitle))
                                                .addGap(54)
                                                .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
                                                        .addComponent(titeltext)
                                                        .addComponent(herstellertext, GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)))
                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                .addGap(105)
                                                .addComponent(textArea)))
                                .addContainerGap(51, Short.MAX_VALUE))
        );
        gl_panel_1.setVerticalGroup(
                gl_panel_1.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel_1.createSequentialGroup()
                                .addGap(32)
                                .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lbltitle)
                                        .addComponent(titeltext, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lblhersteller)
                                        .addComponent(herstellertext, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addComponent(chckbxMobileDevice)
                                .addGap(18)
                                .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                                        .addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
                                                .addGap(46)
                                                .addComponent(textArea, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                                                .addComponent(bttn_addgerät, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                .addGap(38)
                                                .addComponent(lblBeschreibung)))
                                .addContainerGap())
        );
        panel_1.setLayout(gl_panel_1);
        this.setLayout(gl_panel_home);

    }
    public void actionPerformed(ActionEvent e){
            if (e.getSource() == bttn_addgerät){
                Geraet neuesGeraet = new Geraet();
                neuesGeraet.setMobile(true);
                neuesGeraet.setName("new Added");
                prodmanagement.addObject(neuesGeraet);
                System.out.println("button pressed");

            }
        if (e.getSource() == bttn_addzubehoer){
            Geraet neuesGeraet = new Geraet();
            neuesGeraet.setMobile(true);
            neuesGeraet.setName("new Added");
            prodmanagement.addObject(neuesGeraet);
            System.out.println("button pressed");




    }


}
}