/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Cart.Cart;
import Business.Location.LocationArea;
import Business.Menu.Dish;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Alex
 */
public class DishesContainerJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private ArrayList<Dish> dishList;
    private Cart cart;

    /**
     * Creates new form RestaurantContainerJPanel
     */
    public DishesContainerJPanel(JPanel userProcessContainer, ArrayList<Dish> dishList, Cart cart, String restaurantName) {
        initComponents();
        this.dishList = dishList;
        this.cart = cart;
        this.userProcessContainer = userProcessContainer;
        this.lbName.setText(restaurantName);

        generate();
    }

    public LocationArea.LocationAreaType getLocationArea() {
        return dishList.get(0).getRestaurant().getLocationArea();
    }

    private void generate() {
        ImageIcon icon;
        Dimension dimensionDish = new Dimension(300, 200);
        Dimension dimensionPanel = new Dimension(300, 240);

        int count = 0;
        for (Dish dish : dishList) {
            JPanel panelTemp = new JPanel();
            panelTemp.setBackground(Color.white);
            panelTemp.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER));
            panelTemp.setPreferredSize(dimensionPanel);
            icon = new ImageIcon(dish.getImagePath());
            JButton button = new JButton(icon);
            button.setPreferredSize(dimensionDish);
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    DishDetailJPanel panel = new DishDetailJPanel(userProcessContainer, dish, cart);
                    userProcessContainer.add("DishDetailJPanel", panel);
                    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                    layout.next(userProcessContainer);
                }
            });

            panelTemp.add(button);

            JLabel lbDishPrice = new JLabel(String.valueOf(dish.getPrice()) + "$");
            lbDishPrice.setForeground(Color.blue);
            panelTemp.add(lbDishPrice);

            JLabel lbCalorie = new JLabel(String.valueOf(dish.getCalorieBalance()) + " Cal");
            lbCalorie.setForeground(Color.red);
            panelTemp.add(lbCalorie);

            JLabel lbDishName = new JLabel(dish.getName());
            lbDishName.setFont(new java.awt.Font("Tahoma", 1, 11));
            panelTemp.add(lbDishName);

            panelMain.add(panelTemp);
            count++;
        }
        Dimension dimensionMain;
        if (count > 4) {
            dimensionMain = new Dimension(300 * count + 200, 240);
        } else {
            dimensionMain = new Dimension(300, 240);
        }
        panelMain.setPreferredSize(dimensionMain);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane = new javax.swing.JScrollPane();
        panelMain = new javax.swing.JPanel();
        lbName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        setMinimumSize(new java.awt.Dimension(800, 230));
        setPreferredSize(new java.awt.Dimension(1600, 300));
        setLayout(new java.awt.BorderLayout());

        scrollPane.setMinimumSize(new java.awt.Dimension(1000, 150));
        scrollPane.setPreferredSize(new java.awt.Dimension(1000, 150));

        panelMain.setBackground(new java.awt.Color(255, 255, 255));
        panelMain.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 5));
        scrollPane.setViewportView(panelMain);

        add(scrollPane, java.awt.BorderLayout.CENTER);

        lbName.setBackground(new java.awt.Color(255, 255, 255));
        lbName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbName.setPreferredSize(new java.awt.Dimension(300, 20));
        add(lbName, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbName;
    private javax.swing.JPanel panelMain;
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables
}