/**
 * Created by Etienne Roulet on 16.05.17.
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


        JButton btn_close = new JButton("Beenden");
        btn_close.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        JButton btn_inventar = new JButton("Inventar");
        btn_inventar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        JButton btn_ausleihe = new JButton("Ausleihen");
        JButton btn_info = new JButton("Info");
        btn_info.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        JButton btn_rueckgabe = new JButton("Rückgabe");
        btn_rueckgabe.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));


        btn_ausleihe.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                btn_ausleihe.setBackground(new Color(176, 196, 222));
                btn_rueckgabe.setBackground(new Color(119, 136, 153));
                btn_inventar.setBackground(new Color(119, 136, 153));
                btn_info.setBackground(new Color(119, 136, 153));
                btn_close.setBackground(new Color(119, 136, 153));



            }
        });


        btn_rueckgabe.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btn_ausleihe.setBackground(new Color(119, 136, 153));
                btn_rueckgabe.setBackground(new Color(176, 196, 222));
                btn_inventar.setBackground(new Color(119, 136, 153));
                btn_info.setBackground(new Color(119, 136, 153));
                btn_close.setBackground(new Color(119, 136, 153));
            }
        });


        btn_inventar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btn_ausleihe.setBackground(new Color(119, 136, 153));
                btn_rueckgabe.setBackground(new Color(119, 136, 153));
                btn_inventar.setBackground(new Color(176, 196, 222));
                btn_info.setBackground(new Color(119, 136, 153));
                btn_close.setBackground(new Color(119, 136, 153));
            }
        });


        btn_info.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btn_ausleihe.setBackground(new Color(119, 136, 153));
                btn_rueckgabe.setBackground(new Color(119, 136, 153));
                btn_inventar.setBackground(new Color(119, 136, 153));
                btn_info.setBackground(new Color(176, 196, 222));
                btn_close.setBackground(new Color(119, 136, 153));

            }
        });

        btn_close.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //testweise um mit button das programm zu beenden
                System.exit(1);
            }
        });


        btn_ausleihe.setFocusTraversalPolicyProvider(true);
        btn_ausleihe.setFocusable(false);
        btn_ausleihe.setFocusTraversalKeysEnabled(false);
        btn_ausleihe.setHorizontalAlignment(SwingConstants.LEFT);
        btn_ausleihe.setBorder(null);
        btn_ausleihe.setBackground(new Color(119, 136, 153));
        btn_ausleihe.setIcon(new ImageIcon("C:\\Users\\super\\Desktop\\Cloakroom_26px.png"));
        btn_ausleihe.setToolTipText("Hier kann die Technik an den Kunden verliehen werden.");

        btn_ausleihe.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_ausleihe.setFont(new Font("Tahoma", Font.BOLD, 14));
        btn_ausleihe.setForeground(Color.WHITE);

        JLabel lblTechverleih = new JLabel("Techverleih");
        lblTechverleih.setToolTipText("Willkommen im Techverleih bitte w\u00E4hlen Sie ihren Men\u00FC Punkt");
        lblTechverleih.setForeground(new Color(255, 255, 255));
        lblTechverleih.setFont(new Font("Tahoma", Font.BOLD, 24));
        lblTechverleih.setHorizontalAlignment(SwingConstants.LEFT);


        btn_rueckgabe.setToolTipText("Hier kann die Technik an den Kunden verliehen werden.");
        btn_rueckgabe.setHorizontalAlignment(SwingConstants.LEFT);
        btn_rueckgabe.setForeground(Color.WHITE);
        btn_rueckgabe.setFont(new Font("Tahoma", Font.BOLD, 14));
        btn_rueckgabe.setFocusable(false);
        btn_rueckgabe.setFocusTraversalPolicyProvider(true);
        btn_rueckgabe.setFocusTraversalKeysEnabled(false);
        btn_rueckgabe.setBorder(null);
        btn_rueckgabe.setBackground(new Color(119, 136, 153));


        btn_inventar.setToolTipText("Hier kann die Technik an den Kunden verliehen werden.");
        btn_inventar.setHorizontalAlignment(SwingConstants.LEFT);
        btn_inventar.setForeground(Color.WHITE);
        btn_inventar.setFont(new Font("Tahoma", Font.BOLD, 14));
        btn_inventar.setFocusable(false);
        btn_inventar.setFocusTraversalPolicyProvider(true);
        btn_inventar.setFocusTraversalKeysEnabled(false);
        btn_inventar.setBorder(null);
        btn_inventar.setBackground(new Color(119, 136, 153));


        btn_info.setToolTipText("Hier kann die Technik an den Kunden verliehen werden.");
        btn_info.setHorizontalAlignment(SwingConstants.LEFT);
        btn_info.setForeground(Color.WHITE);
        btn_info.setFont(new Font("Tahoma", Font.BOLD, 14));
        btn_info.setFocusable(false);
        btn_info.setFocusTraversalPolicyProvider(true);
        btn_info.setFocusTraversalKeysEnabled(false);
        btn_info.setBorder(null);
        btn_info.setBackground(new Color(119, 136, 153));

        btn_close.setToolTipText("Hier kann das Programm beendet werden.");
        btn_close.setHorizontalAlignment(SwingConstants.LEFT);
        btn_close.setForeground(Color.WHITE);
        btn_close.setFont(new Font("Tahoma", Font.BOLD, 14));
        btn_close.setFocusable(false);
        btn_close.setFocusTraversalPolicyProvider(true);
        btn_close.setFocusTraversalKeysEnabled(false);
        btn_close.setBorder(null);
        btn_close.setBackground(new Color(119, 136, 153));






        GroupLayout gl_Sidepanel = new GroupLayout(Sidepanel);
        gl_Sidepanel.setHorizontalGroup(
                gl_Sidepanel.createParallelGroup(Alignment.TRAILING)
                        .addGroup(gl_Sidepanel.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_Sidepanel.createParallelGroup(Alignment.LEADING)
                                        .addComponent(lblTechverleih, GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                        .addComponent(btn_ausleihe, GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                        .addComponent(btn_rueckgabe, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_inventar, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_info, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_close, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap()));


        gl_Sidepanel.setVerticalGroup(
                gl_Sidepanel.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_Sidepanel.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTechverleih, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
                                .addGap(115)
                                .addComponent(btn_ausleihe, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                                .addGap(19)
                                .addComponent(btn_rueckgabe, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(btn_inventar, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(btn_info, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addGap(18)
                                .addComponent(btn_close, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
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
