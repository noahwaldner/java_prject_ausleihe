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
    private JTextField titeltext;
    private JTextField herstellertext;
    private JTextField textField_2;
    private JTextField textField_3;
    private JButton bttn_addgerät;
    ProdManagement prodmanagement;



    public addproduct() {


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

        JLabel label = new JLabel("Titel:");

        textField_2 = new JTextField();
        textField_2.setToolTipText("Titel des Produktes");
        textField_2.setColumns(10);

        JCheckBox checkBox = new JCheckBox("Mobile Device ?");

        JLabel label_1 = new JLabel("Herrsteller:");

        textField_3 = new JTextField();
        textField_3.setColumns(10);

        JLabel label_2 = new JLabel("Beschreibung:");

        JTextArea textArea_1 = new JTextArea();
        textArea_1.setBorder(UIManager.getBorder("TextField.border"));

        JButton button_1 = new JButton("add");
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
                gl_panel.createParallelGroup(Alignment.TRAILING)
                        .addGroup(gl_panel.createSequentialGroup()
                                .addGap(14)
                                .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addComponent(label, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                                .addGap(56)
                                                .addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addComponent(label_1, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                                                .addGap(18)
                                                .addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 373, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(checkBox, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addComponent(label_2, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
                                                .addGap(6)
                                                .addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 366, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(92, Short.MAX_VALUE))
                        .addGroup(gl_panel.createSequentialGroup()
                                .addContainerGap(359, Short.MAX_VALUE)
                                .addComponent(button_1, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        gl_panel.setVerticalGroup(
                gl_panel.createParallelGroup(Alignment.TRAILING)
                        .addGroup(gl_panel.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addGap(5)
                                                .addComponent(label))
                                        .addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18)
                                .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addGap(5)
                                                .addComponent(label_1))
                                        .addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(33)
                                .addComponent(checkBox)
                                .addGap(38)
                                .addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
                                        .addComponent(label_2)
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addGap(8)
                                                .addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)))
                                .addGap(132)
                                .addComponent(button_1, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                                .addGap(56))
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

        JButton bttn_addgerät = new JButton("add");
        bttn_addgerät.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        GroupLayout gl_panel_1 = new GroupLayout(panel_1);
        gl_panel_1.setHorizontalGroup(
                gl_panel_1.createParallelGroup(Alignment.TRAILING)
                        .addGroup(gl_panel_1.createSequentialGroup()
                                .addGap(36)
                                .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                                        .addComponent(chckbxMobileDevice)
                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                .addComponent(lblBeschreibung)
                                                .addPreferredGap(ComponentPlacement.RELATED)
                                                .addComponent(textArea, GroupLayout.PREFERRED_SIZE, 366, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                                                        .addComponent(lblhersteller)
                                                        .addComponent(lbltitle))
                                                .addGap(18)
                                                .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                                                        .addComponent(titeltext, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(herstellertext, GroupLayout.PREFERRED_SIZE, 373, GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(gl_panel_1.createSequentialGroup()
                                .addContainerGap(361, Short.MAX_VALUE)
                                .addComponent(bttn_addgerät, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
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
                                .addGap(33)
                                .addComponent(chckbxMobileDevice)
                                .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                .addGap(38)
                                                .addComponent(lblBeschreibung))
                                        .addGroup(gl_panel_1.createSequentialGroup()
                                                .addGap(46)
                                                .addComponent(textArea, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                                .addComponent(bttn_addgerät, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
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

    }


}
