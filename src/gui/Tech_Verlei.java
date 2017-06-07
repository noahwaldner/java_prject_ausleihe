package gui; /**
 * Created by Etienne Roulet on 16.05.17.
 * Edited by Noah Waldner on 17.05.17.
 */

import gui.Views.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import java.awt.Font;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tech_Verlei extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JPanel ruckgabe, home, removeproduct, add, ausleihe;

    private JButton btn_close, btn_inventar, btn_ausleihe, btn_info, btn_rueckgabe;

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


        removeproduct = new removeproduct();
        add = new addproduct();
        ausleihe = new ausleihe();
        ruckgabe = new ruckgabe();
        home = new home();


        contentPane.add(home);


        btn_close = new JButton("Beenden");
        btn_close.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_inventar = new JButton("Inventar");
        btn_inventar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_ausleihe = new JButton("Ausleihen");
        btn_info = new JButton("Info");
        btn_info.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_rueckgabe = new JButton("Rückgabe");
        btn_rueckgabe.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));


        btn_ausleihe.addActionListener(this);

        btn_rueckgabe.addActionListener(this);

        btn_inventar.addActionListener(this);

        btn_info.addActionListener(this);

        btn_close.addActionListener(this);


        btn_ausleihe.setFocusTraversalPolicyProvider(true);
        btn_ausleihe.setFocusable(false);
        btn_ausleihe.setFocusTraversalKeysEnabled(false);
        btn_ausleihe.setHorizontalAlignment(SwingConstants.LEFT);
        btn_ausleihe.setBorder(null);
        btn_ausleihe.setBackground(new Color(119, 136, 153));
        btn_ausleihe.setIcon(new ImageIcon("Bilder/icons8-buy.png"));
        btn_ausleihe.setToolTipText("Hier kann die Technik an den Kunden verliehen werden.");

        btn_ausleihe.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn_ausleihe.setFont(new Font("Tahoma", Font.BOLD, 14));
        btn_ausleihe.setForeground(Color.LIGHT_GRAY);

        JLabel lblTechverleih = new JLabel("Techverleih");
        lblTechverleih.setToolTipText("Willkommen im Techverleih bitte w\u00E4hlen Sie ihren Men\u00FC Punkt");
        lblTechverleih.setForeground(new Color(255, 255, 255));
        lblTechverleih.setFont(new Font("Tahoma", Font.BOLD, 24));
        lblTechverleih.setHorizontalAlignment(SwingConstants.LEFT);


        btn_rueckgabe.setToolTipText("Hier kann die Technik an den Kunden verliehen werden.");
        btn_rueckgabe.setHorizontalAlignment(SwingConstants.LEFT);
        btn_rueckgabe.setForeground(Color.LIGHT_GRAY);
        btn_rueckgabe.setFont(new Font("Tahoma", Font.BOLD, 14));
        btn_rueckgabe.setFocusable(false);
        btn_rueckgabe.setFocusTraversalPolicyProvider(true);
        btn_rueckgabe.setFocusTraversalKeysEnabled(false);
        btn_rueckgabe.setBorder(null);
        btn_rueckgabe.setBackground(new Color(119, 136, 153));
        btn_rueckgabe.setIcon(new ImageIcon("Bilder/icons8-clear_shopping_cart.png"));


        btn_inventar.setToolTipText("Hier kann die Technik an den Kunden verliehen werden.");
        btn_inventar.setHorizontalAlignment(SwingConstants.LEFT);
        btn_inventar.setForeground(Color.LIGHT_GRAY);
        btn_inventar.setFont(new Font("Tahoma", Font.BOLD, 14));
        btn_inventar.setFocusable(false);
        btn_inventar.setFocusTraversalPolicyProvider(true);
        btn_inventar.setFocusTraversalKeysEnabled(false);
        btn_inventar.setBorder(null);
        btn_inventar.setBackground(new Color(119, 136, 153));
        btn_inventar.setIcon(new ImageIcon("Bilder/icons8-return_purchase.png"));

        btn_info.setToolTipText("Hier kann die Technik an den Kunden verliehen werden.");
        btn_info.setHorizontalAlignment(SwingConstants.LEFT);
        btn_info.setForeground(Color.lightGray);
        btn_info.setFont(new Font("Tahoma", Font.BOLD, 14));
        btn_info.setFocusable(false);
        btn_info.setFocusTraversalPolicyProvider(true);
        btn_info.setFocusTraversalKeysEnabled(false);
        btn_info.setBorder(null);
        btn_info.setBackground(new Color(119, 136, 153));
        btn_info.setIcon(new ImageIcon("Bilder/icons8-info.png"));


        btn_close.setToolTipText("Hier kann das Programm beendet werden.");
        btn_close.setHorizontalAlignment(SwingConstants.LEFT);
        btn_close.setForeground(Color.LIGHT_GRAY);
        btn_close.setFont(new Font("Tahoma", Font.BOLD, 14));
        btn_close.setFocusable(false);
        btn_close.setFocusTraversalPolicyProvider(true);
        btn_close.setFocusTraversalKeysEnabled(false);
        btn_close.setIcon(new ImageIcon("Bilder/icons8-cancel.png"));

        GroupLayout gl_Sidepanel = new GroupLayout(Sidepanel);
        gl_Sidepanel.setHorizontalGroup(
                gl_Sidepanel.createParallelGroup(Alignment.TRAILING)
                        .addGroup(gl_Sidepanel.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gl_Sidepanel.createParallelGroup(Alignment.LEADING)
                                        .addComponent(lblTechverleih, GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                        .addComponent(btn_ausleihe, GroupLayout.PREFERRED_SIZE, 227, GroupLayout.PREFERRED_SIZE)
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
                                .addGap(70)
                                .addComponent(btn_ausleihe, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(btn_rueckgabe, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(btn_inventar, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(btn_info, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addGap(170)
                                .addComponent(btn_close, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(184, Short.MAX_VALUE))

        );
        Sidepanel.setLayout(gl_Sidepanel);


        setUndecorated(true);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();

        if (src == btn_close) {
            //testweise um mit button das programm zu beenden
            setVisible(false);
            System.exit(0);
        }
        if (src == btn_info) {

            contentPane.remove(home);
            contentPane.remove(ausleihe);
            contentPane.remove(removeproduct);
            contentPane.remove(add);
            contentPane.remove(ruckgabe);
            contentPane.add(removeproduct);
            contentPane.validate();
            contentPane.repaint();
        }
        if (src == btn_inventar) {
            contentPane.remove(home);
            contentPane.remove(ausleihe);
            contentPane.remove(removeproduct);
            contentPane.remove(ruckgabe);
            contentPane.add(add);
            contentPane.validate();
            contentPane.repaint();
        }
        if (src == btn_rueckgabe) {
            contentPane.remove(home);
            contentPane.remove(ausleihe);
            contentPane.remove(add);
            contentPane.remove(removeproduct);
            contentPane.add(ruckgabe);
            contentPane.validate();
            contentPane.repaint();

        }
        if (src == btn_ausleihe) {
            contentPane.remove(home);
            contentPane.remove(ruckgabe);
            contentPane.remove(add);
            contentPane.remove(removeproduct);
            contentPane.add(ausleihe);
            contentPane.validate();
            contentPane.repaint();

        }

    }

}


//HELLO