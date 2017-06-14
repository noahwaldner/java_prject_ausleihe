package gui.Views;

import javax.swing.*;

/**
 * Created by noah on 24.05.17.
 */
public class removeproduct extends JPanel {

    public removeproduct() {
        this.setBounds(244, 0, 656, 600);


        JLabel lblNewLabel = new JLabel("löschen");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\super\\Desktop\\2.jpg"));
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
