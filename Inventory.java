/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc340project;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Observable;
import java.util.Observer;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

/**
 *
 * @author Michael
 */
public class Inventory extends JFrame implements Observer {

    private JTable table;
    private Button back = new Button("Back");

    public Inventory() {

        String[] titles = {"Item", "Quantity", "Price", "Order Price"};
        Object[][] data = {
            {"Helmet1", new Integer(1), new Integer(1), new Integer(1)},
            {"Helmet2", new Integer(1), new Integer(1), new Integer(1)},
            {"Helmet3", new Integer(1), new Integer(1), new Integer(1)},
            {"Helmet4", new Integer(1), new Integer(1), new Integer(1)},
            {"Helmet5", new Integer(1), new Integer(1), new Integer(1)},
            {"Body1", new Integer(1), new Integer(1), new Integer(1)},
            {"Body2", new Integer(1), new Integer(1), new Integer(1)},
            {"Body3", new Integer(1), new Integer(1), new Integer(1)},
            {"Body4", new Integer(1), new Integer(1), new Integer(1)},
            {"Body5", new Integer(1), new Integer(1), new Integer(1)},
            {"Legs1", new Integer(1), new Integer(1), new Integer(1)},
            {"Legs2", new Integer(1), new Integer(1), new Integer(1)},
            {"Legs3", new Integer(1), new Integer(1), new Integer(1)},
            {"Legs4", new Integer(1), new Integer(1), new Integer(1)},
            {"Legs5", new Integer(1), new Integer(1), new Integer(1)},
            {"Shield1", new Integer(1), new Integer(1), new Integer(1)},
            {"Shield2", new Integer(1), new Integer(1), new Integer(1)},
            {"Shield3", new Integer(1), new Integer(1), new Integer(1)},
            {"Shield4", new Integer(1), new Integer(1), new Integer(1)},
            {"Shield5", new Integer(1), new Integer(1), new Integer(1)},
            {"Sword1", new Integer(1), new Integer(1), new Integer(1)},
            {"Sword2", new Integer(1), new Integer(1), new Integer(1)},
            {"Sword3", new Integer(1), new Integer(1), new Integer(1)},
            {"Sword4", new Integer(1), new Integer(1), new Integer(1)},
            {"Sword5", new Integer(1), new Integer(1), new Integer(1)},};
        
        setTitle("Inventory");
        SpringLayout layout = new SpringLayout();
        Container pane = getContentPane();
        pane.setLayout(layout);

        Panel bottom = new Panel();
        add(bottom, BorderLayout.SOUTH);
        bottom.setLayout(new GridLayout());
        bottom.add(this.back);

        DefaultTableModel model = new DefaultTableModel(data, titles) {

            public Class getColumnClass(int column) {
                return getValueAt(0, column).getClass();
            }

            public boolean isCellEditable(int row, int column) {
                int modelcolumn = table.convertColumnIndexToModel(column);
                return (modelcolumn == 3) ? false : true;
            }
        };

        table = new JTable(model);
        table.setPreferredScrollableViewportSize(table.getPreferredSize());
        JScrollPane scroll = new JScrollPane(table);
        add(scroll);
        pack();
        setVisible(true);
        setSize(600, 600);

        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
         }
        );

    }

    @Override
    public void update(Observable o, Object o1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
