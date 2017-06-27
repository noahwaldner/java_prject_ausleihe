package gui.Views;

import javax.swing.*;

/**
 * Die Startview Zeigt ein Bild an.
 * @Author Etienne Roulet
 */
public class Home extends JPanel {



    public Home() {


        this.setBounds(244, 0, 656, 600);


        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("Bilder/Technick.jpg"));
        this.add(lblNewLabel);
        GroupLayout gl_panel_home = new GroupLayout(this);
        gl_panel_home.setHorizontalGroup(
                gl_panel_home.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 656, GroupLayout.PREFERRED_SIZE)
        );
        gl_panel_home.setVerticalGroup(
                gl_panel_home.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(lblNewLabel)
        );
        this.setLayout(gl_panel_home);





    }
}
