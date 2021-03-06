/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thjava.helloworld.view;

import com.thjava.helloworld.model.Model;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class View extends javax.swing.JFrame {

    private int xMouse;
    private int yMouse;
    private int width;
    private int height;

    public View() {
        initComponents();
        position();
    }

    public void position() {
        width = (Toolkit.getDefaultToolkit().getScreenSize().width / 2) - 185;
        height = Toolkit.getDefaultToolkit().getScreenSize().height - 500;
        this.setLocation(width, height);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblX = new javax.swing.JLabel();
        lblTextTitle = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblResult = new javax.swing.JLabel();
        btnEnter = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblX.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblX.setForeground(new java.awt.Color(193, 0, 50));
        lblX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblX.setText("x");
        lblX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblXMouseClicked(evt);
            }
        });
        jPanel1.add(lblX, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 20, -1));

        lblTextTitle.setForeground(new java.awt.Color(104, 30, 126));
        lblTextTitle.setText("Enter your name:");
        jPanel1.add(lblTextTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 260, -1));

        txtName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(0, 117, 58));
        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtName.setBorder(null);
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 260, 40));

        lblResult.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblResult.setForeground(new java.awt.Color(0, 101, 68));
        jPanel1.add(lblResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 250, 30));

        btnEnter.setBackground(new java.awt.Color(177, 231, 223));
        btnEnter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEnter.setForeground(new java.awt.Color(0, 101, 68));
        btnEnter.setText("Enter");
        btnEnter.setBorder(null);
        btnEnter.setFocusPainted(false);
        jPanel1.add(btnEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 80, 40));

        btnClear.setBackground(new java.awt.Color(254, 197, 222));
        btnClear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(193, 0, 50));
        btnClear.setText("Clear");
        btnClear.setBorder(null);
        btnClear.setFocusPainted(false);
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 80, 40));

        lblBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/thjava/helloworld/img/bg.png"))); // NOI18N
        lblBg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblBgMouseDragged(evt);
            }
        });
        lblBg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBgMousePressed(evt);
            }
        });
        jPanel1.add(lblBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBgMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBgMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_lblBgMouseDragged

    private void lblBgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBgMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_lblBgMousePressed

    private void lblXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblXMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblXMouseClicked

    // Getters  
    
    public JButton getBtnClear() {
        return btnClear;
    }

    public JButton getBtnEnter() {
        return btnEnter;
    }

    public JLabel getLblResult() {
        return lblResult;
    }

    public JTextField getTxtName() {
        return txtName;
    }
    
    // สร้างเมธอดแสดงผลลัพธ์
    public void showResult(Model m) {
        lblResult.setText("Hello! " + m.getName()); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnEnter;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBg;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblTextTitle;
    private javax.swing.JLabel lblX;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
