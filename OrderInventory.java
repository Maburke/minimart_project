/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc340project;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Observable;
import java.util.Observer;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Michael
 */
public class OrderInventory extends JFrame implements Observer {

    private Button clear = new Button("Clear");
    private Button addcart = new Button("Add to order");
    private Button back = new Button("Back");
    private Button checkout = new Button("Confirm order");

    public OrderInventory() {

        super("Order Inventory:");
        setSize(600, 600);
        setVisible(true);
        setLayout(new BorderLayout(5, 5));

        Panel bottom = new Panel();
        add(bottom, BorderLayout.SOUTH);
        bottom.setLayout(new GridLayout(4, 2, 5, 5));

        //bottom.add(new Label(""));
        //bottom.add(new Label(""));

        bottom.add(this.addcart);        
        bottom.add(this.clear);
        bottom.add(this.checkout);       
        bottom.add(this.back);

        //allows you to press x to close the window 
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        }
        );

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainMenu().setVisible(true);

                setVisible(false);

            }
        });

    }

    @Override
    public void update(Observable o, Object o1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
