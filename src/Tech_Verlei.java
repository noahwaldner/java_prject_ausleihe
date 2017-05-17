/**
 * Created by noah on 17.05.17.
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.FlowLayout;
import javax.swing.SpringLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import java.awt.Font;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tech_Verlei extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Tech_Verlei frame = new Tech_Verlei();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Tech_Verlei() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 900, 600);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel Sidepanel = new JPanel();
        Sidepanel.setBounds(0, 0, 247, 600);
        contentPane.add(Sidepanel);

        Sidepanel.setBackground(new Color(119, 136, 153));
        JPanel panel_home = new JPanel();




        JButton bttn_inventar = new JButton("Inventar");
        bttn_inventar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        JButton bttn_ausleihe = new JButton("Ausleihen");
        JButton bttn_info = new JButton("Info");
        bttn_info.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        JButton bttn_rueckgabe = new JButton("Rückgabe");
        bttn_rueckgabe.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        bttn_ausleihe.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                bttn_ausleihe.setBackground(new Color(176, 196, 222));
                bttn_rueckgabe.setBackground(new Color(119, 136, 153));
                bttn_inventar.setBackground(new Color(119, 136, 153));
                bttn_info .setBackground(new Color(119, 136, 153));



            }
        });



        bttn_rueckgabe.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bttn_ausleihe.setBackground(new Color(119, 136, 153));
                bttn_rueckgabe.setBackground(new Color(176, 196, 222));
                bttn_inventar.setBackground(new Color(119, 136, 153));
                bttn_info .setBackground(new Color(119, 136, 153));
            }
        });


        bttn_inventar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bttn_ausleihe.setBackground(new Color(119, 136, 153));
                bttn_rueckgabe.setBackground(new Color(119, 136, 153));
                bttn_inventar.setBackground(new Color(176, 196, 222));
                bttn_info .setBackground(new Color(119, 136, 153));
            }
        });


        bttn_info.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bttn_ausleihe.setBackground(new Color(119, 136, 153));
                bttn_rueckgabe.setBackground(new Color(119, 136, 153));
                bttn_inventar.setBackground(new Color(119, 136, 153));
                bttn_info .setBackground(new Color(176, 196, 222));
            }
        });






        bttn_ausleihe.setFocusTraversalPolicyProvider(true);
        bttn_ausleihe.setFocusable(false);
        bttn_ausleihe.setFocusTraversalKeysEnabled(false);
        bttn_ausleihe.setHorizontalAlignment(SwingConstants.LEFT);
        bttn_ausleihe.setBorder(null);
        bttn_ausleihe.setBackground(new Color(119, 136, 153));
        bttn_ausleihe.setIcon(new ImageIcon("C:\\Users\\super\\Desktop\\Cloakroom_26px.png"));
        bttn_ausleihe.setToolTipText("Hier kann die Technik an den Kunden verliehen werden.");

        bttn_ausleihe.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        bttn_ausleihe.setFont(new Font("Tahoma", Font.BOLD, 14));
        bttn_ausleihe.setForeground(Color.WHITE);

        JLabel lblTechverleih = new JLabel("Techverleih");
        lblTechverleih.setToolTipText("Willkommen im Techverleih bitte w\u00E4hlen Sie ihren Men\u00FC Punkt");
        lblTechverleih.setForeground(new Color(255, 255, 255));
        lblTechverleih.setFont(new Font("Tahoma", Font.BOLD, 24));
        lblTechverleih.setHorizontalAlignment(SwingConstants.LEFT);


        bttn_rueckgabe.setToolTipText("Hier kann die Technik an den Kunden verliehen werden.");
        bttn_rueckgabe.setHorizontalAlignment(SwingConstants.LEFT);
        bttn_rueckgabe.setForeground(Color.WHITE);
        bttn_rueckgabe.setFont(new Font("Tahoma", Font.BOLD, 14));
        bttn_rueckgabe.setFocusable(false);
        bttn_rueckgabe.setFocusTraversalPolicyProvider(true);
        bttn_rueckgabe.setFocusTraversalKeysEnabled(false);
        bttn_rueckgabe.setBorder(null);
        bttn_rueckgabe.setBackground(new Color(119, 136, 153));


        bttn_inventar.setToolTipText("Hier kann die Technik an den Kunden verliehen werden.");
        bttn_inventar.setHorizontalAlignment(SwingConstants.LEFT);
        bttn_inventar.setForeground(Color.WHITE);
        bttn_inventar.setFont(new Font("Tahoma", Font.BOLD, 14));
        bttn_inventar.setFocusable(false);
        bttn_inventar.setFocusTraversalPolicyProvider(true);
        bttn_inventar.setFocusTraversalKeysEnabled(false);
        bttn_inventar.setBorder(null);
        bttn_inventar.setBackground(new Color(119, 136, 153));


        bttn_info.setToolTipText("Hier kann die Technik an den Kunden verliehen werden.");
        bttn_info.setHorizontalAlignment(SwingConstants.LEFT);
        bttn_info.setForeground(Color.WHITE);
        bttn_info.setFont(new Font("Tahoma", Font.BOLD, 14));
        bttn_info.setFocusable(false);
        bttn_info.setFocusTraversalPolicyProvider(true);
        bttn_info.setFocusTraversalKeysEnabled(false);
        bttn_info.setBorder(null);
        bttn_info.setBackground(new Color(119, 136, 153));






        GroupLayout gl_Sidepanel = new GroupLayout(Sidepanel);
        gl_Sidepanel.setHorizontalGroup(
                gl_Sidepanel.createParallelGroup(Alignment.TRAILING)
                        .addGroup(gl_Sidepanel.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_Sidepanel.createParallelGroup(Alignment.LEADING)
                                        .addComponent(lblTechverleih, GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                        .addComponent(bttn_ausleihe, GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                        .addComponent(bttn_rueckgabe, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bttn_inventar, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bttn_info, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );
        gl_Sidepanel.setVerticalGroup(
                gl_Sidepanel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_Sidepanel.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTechverleih, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                                .addGap(115)
                                .addComponent(bttn_ausleihe, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                                .addGap(19)
                                .addComponent(bttn_rueckgabe, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(bttn_inventar, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(bttn_info, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(184, Short.MAX_VALUE))
        );
        Sidepanel.setLayout(gl_Sidepanel);

        panel_home.setBounds(244, 0, 656, 600);
        contentPane.add(panel_home);

        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\super\\Desktop\\2.jpg"));
        GroupLayout gl_panel_home = new GroupLayout(panel_home);
        gl_panel_home.setHorizontalGroup(
                gl_panel_home.createParallelGroup(Alignment.LEADING)
                        .addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 656, GroupLayout.PREFERRED_SIZE)
        );
        gl_panel_home.setVerticalGroup(
                gl_panel_home.createParallelGroup(Alignment.LEADING)
                        .addComponent(lblNewLabel)
        );
        panel_home.setLayout(gl_panel_home);
        setUndecorated(true);
    }
}
