package gui.Views;

import functions.ProdManagement;
import storage.Geraet;
import storage.ProductList;
import storage.Zubehoer;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * Created by Noah Waldner on 19.05.2017.
 */

public class AddProduct extends JPanel implements ActionListener{

/*Geräte erstellung*/
    private JTextField input_geraetTitel;
    private JTextField Input_geraetHersteller;
    private JCheckBox checkBox_geraetMobileDevice;
    private JLabel lbl_geraetHersteller;
    private JLabel lbl_geraetTitel;
    private JLabel lbl_geraetBeschreibung;
    private JTextArea input_geraetBeschreibung;
    private JButton bttn_addgeraet;



/*Zubehörerstellung*/
    private JTextField input_zubehoerZugehörigkeit;
    private JTextField input_zubehoerHerrsteller;
    private JLabel lbl_zubehoerBeschreibung;
    private JTextArea input_zubehoerBeschreibung;
    private JLabel lbl_hersteller;
    private JTextField input_zubehoerHersteller;
    private JLabel lbl_zubehoerTitel;
    private JLabel lbl_zubehoerZugehoerigkeit;
    private JButton bttn_addzubehoer;





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

        lbl_zubehoerZugehoerigkeit = new JLabel("Zugehörigkeit:");

        input_zubehoerZugehörigkeit = new JTextField();
        input_zubehoerZugehörigkeit.setToolTipText("Titel des Produktes");
        input_zubehoerZugehörigkeit.setColumns(10);


        lbl_zubehoerTitel = new JLabel("Herrsteller:");

        input_zubehoerHerrsteller = new JTextField();
        input_zubehoerHerrsteller.setColumns(10);

        lbl_zubehoerBeschreibung = new JLabel("Beschreibung:");

        input_zubehoerBeschreibung = new JTextArea();
        input_zubehoerBeschreibung.setBorder(UIManager.getBorder("TextField.border"));

        bttn_addzubehoer = new JButton("add Zubehör");
        bttn_addzubehoer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button add Zubehör hinzugefügt");
                Zubehoer neuesZubehoer = new Zubehoer();
                neuesZubehoer.setZugehörig(input_zubehoerZugehörigkeit.getText());
                neuesZubehoer.setAnschaffungsdatum(new Date());
                neuesZubehoer.setDescription(input_zubehoerBeschreibung.getText());
                neuesZubehoer.setHersteller(input_zubehoerHersteller.getText());
                neuesZubehoer.setName(input_zubehoerHerrsteller.getText());

            }
        });


        /*Hier wird das Panel fürs Zubehör erstellt*/

        input_zubehoerHersteller = new JTextField();
        input_zubehoerHersteller.setColumns(10);

        lbl_hersteller = new JLabel("Hersteller:");
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
                gl_panel.createParallelGroup(Alignment.TRAILING)
                        .addGroup(gl_panel.createSequentialGroup()
                                .addGap(14)
                                .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addComponent(lbl_zubehoerTitel, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                                                        .addGroup(gl_panel.createSequentialGroup()
                                                                .addComponent(lbl_zubehoerBeschreibung, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                                .addComponent(input_zubehoerBeschreibung, GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE))
                                                        .addGroup(gl_panel.createSequentialGroup()
                                                                .addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
                                                                        .addGroup(gl_panel.createSequentialGroup()
                                                                                .addComponent(lbl_hersteller, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(28))
                                                                        .addGroup(gl_panel.createSequentialGroup()
                                                                                .addComponent(lbl_zubehoerZugehoerigkeit)
                                                                                .addPreferredGap(ComponentPlacement.RELATED)))
                                                                .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                                                                        .addComponent(input_zubehoerHersteller, GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                                                                        .addComponent(input_zubehoerHerrsteller, GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                                                                        .addGroup(gl_panel.createSequentialGroup()
                                                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                                                .addComponent(input_zubehoerZugehörigkeit, GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)))))
                                                .addContainerGap(72, GroupLayout.PREFERRED_SIZE))))
                        .addGroup(gl_panel.createSequentialGroup()
                                .addContainerGap(359, Short.MAX_VALUE)
                                .addComponent(bttn_addzubehoer, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        gl_panel.setVerticalGroup(
                gl_panel.createParallelGroup(Alignment.TRAILING)
                        .addGroup(gl_panel.createSequentialGroup()
                                .addGap(37)
                                .addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addComponent(lbl_zubehoerZugehoerigkeit)
                                                .addGap(18))
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addComponent(input_zubehoerZugehörigkeit, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(ComponentPlacement.RELATED)))
                                .addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lbl_zubehoerTitel)
                                        .addComponent(input_zubehoerHerrsteller, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(input_zubehoerHersteller, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl_hersteller))
                                .addGap(18)
                                .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                                        .addComponent(lbl_zubehoerBeschreibung)
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addGap(8)
                                                .addComponent(input_zubehoerBeschreibung, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)))
                                .addGap(145)
                                .addComponent(bttn_addzubehoer, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                .addGap(43))
        );
        panel.setLayout(gl_panel);

        JPanel panel_1 = new JPanel();
        tabbedPane.addTab("Gerät", null, panel_1, null);

        lbl_geraetTitel = new JLabel("Titel:");

        input_geraetTitel = new JTextField();
        input_geraetTitel.setToolTipText("Titel des Produktes");
        input_geraetTitel.setColumns(10);

        checkBox_geraetMobileDevice = new JCheckBox("Mobile Device?");

        lbl_geraetHersteller = new JLabel("Hersteller:");

        Input_geraetHersteller = new JTextField();
        Input_geraetHersteller.setColumns(10);

        lbl_geraetBeschreibung = new JLabel("Beschreibung:");

        input_geraetBeschreibung = new JTextArea();
        input_geraetBeschreibung.setBorder(UIManager.getBorder("TextField.border"));

        bttn_addgeraet = new JButton("add");
        bttn_addgeraet.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Gerät hinzufügen");
                Geraet neuesGeraet = new Geraet();
                neuesGeraet.setAnschaffungsdatum(new Date());
                neuesGeraet.setDescription(input_geraetBeschreibung.getText());
                neuesGeraet.setHersteller(Input_geraetHersteller.getText());
                neuesGeraet.setName(input_geraetTitel.getText());
                neuesGeraet.setis_prod();
                prodmanagement.addObject(neuesGeraet);


            }
        });








/*Hier wird das Panel für das Gerät erstellt*/
        GroupLayout gl_panel_1 = new GroupLayout(panel_1);
        gl_panel_1.setHorizontalGroup(
                gl_panel_1.createParallelGroup(Alignment.TRAILING)
                        .addGroup(gl_panel_1.createSequentialGroup()
                                .addContainerGap(359, Short.MAX_VALUE)
                                .addComponent(bttn_addgeraet, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
                                .addGap(24)
                                .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
                                        .addComponent(checkBox_geraetMobileDevice)
                                        .addComponent(lbl_geraetBeschreibung)
                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                                                        .addComponent(lbl_geraetHersteller)
                                                        .addComponent(lbl_geraetTitel))
                                                .addGap(54)
                                                .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
                                                        .addComponent(input_geraetTitel)
                                                        .addComponent(Input_geraetHersteller, GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)))
                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                .addGap(105)
                                                .addComponent(input_geraetBeschreibung)))
                                .addContainerGap(51, Short.MAX_VALUE))
        );
        gl_panel_1.setVerticalGroup(
                gl_panel_1.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel_1.createSequentialGroup()
                                .addGap(32)
                                .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lbl_geraetTitel)
                                        .addComponent(input_geraetTitel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
                                        .addComponent(lbl_geraetHersteller)
                                        .addComponent(Input_geraetHersteller, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addComponent(checkBox_geraetMobileDevice)
                                .addGap(18)
                                .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                                        .addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
                                                .addGap(46)
                                                .addComponent(input_geraetBeschreibung, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                                                .addComponent(bttn_addgeraet, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                .addGap(38)
                                                .addComponent(lbl_geraetBeschreibung)))
                                .addContainerGap())
        );
        panel_1.setLayout(gl_panel_1);
        this.setLayout(gl_panel_home);

    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == bttn_addgeraet){
            //Geraet neuesGeraet = new Geraet();
            //neuesGeraet.setMobile(true);
            //neuesGeraet.setName("new Added");
            //prodmanagement.addObject(neuesGeraet);
            System.out.println("button psdgressed");

        }




    }


}
