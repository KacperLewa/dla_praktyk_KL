/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.kolorywyklad;

import java.awt.Color;

/**
 *
 * @author lewandowskikacper
 */
public class KoloryWyklad extends javax.swing.JFrame {

    /**
     * Creates new form KoloryWyklad
     */
    public KoloryWyklad() {
        initComponents();
        jPColor.setBackground(getColourRGB(jSRed.getValue(), jSGreen.getValue(), jSBlue.getValue()));
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
        jL8 = new javax.swing.JLabel();
        jL1 = new javax.swing.JLabel();
        jL2 = new javax.swing.JLabel();
        jL3 = new javax.swing.JLabel();
        jSGreen = new javax.swing.JSlider();
        jSBlue = new javax.swing.JSlider();
        jL4 = new javax.swing.JLabel();
        jL5 = new javax.swing.JLabel();
        jL6 = new javax.swing.JLabel();
        jLRed = new javax.swing.JLabel();
        jLGreen = new javax.swing.JLabel();
        jLBlue = new javax.swing.JLabel();
        jSRed = new javax.swing.JSlider();
        jPColor = new javax.swing.JPanel();
        jLChangeColor = new javax.swing.JLabel();
        jL7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jBMajtkowy = new javax.swing.JButton();
        jBKawowy = new javax.swing.JButton();
        jBSpizowy = new javax.swing.JButton();
        jBBlenkitParyski = new javax.swing.JButton();
        jBFiolkowy = new javax.swing.JButton();
        jBLimonkowy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N

        jL8.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N
        jL8.setText("Program do wybierania kolorów");

        jL1.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N
        jL1.setText("Red");

        jL2.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N
        jL2.setText("Green");

        jL3.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N
        jL3.setText("Blue");

        jSGreen.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N
        jSGreen.setMajorTickSpacing(25);
        jSGreen.setMaximum(225);
        jSGreen.setMinorTickSpacing(1);
        jSGreen.setPaintTicks(true);
        jSGreen.setSnapToTicks(true);
        jSGreen.setValue(100);
        jSGreen.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSGreenStateChanged(evt);
            }
        });

        jSBlue.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N
        jSBlue.setMajorTickSpacing(25);
        jSBlue.setMaximum(225);
        jSBlue.setMinorTickSpacing(1);
        jSBlue.setPaintTicks(true);
        jSBlue.setSnapToTicks(true);
        jSBlue.setValue(100);
        jSBlue.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSBlueStateChanged(evt);
            }
        });

        jL4.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N
        jL4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL4.setText("RED");

        jL5.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N
        jL5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL5.setText("GREEN");

        jL6.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N
        jL6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL6.setText("BLUE");

        jLRed.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N
        jLRed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLRed.setText("0");

        jLGreen.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N
        jLGreen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLGreen.setText("0");

        jLBlue.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N
        jLBlue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLBlue.setText("0");

        jSRed.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N
        jSRed.setMajorTickSpacing(25);
        jSRed.setMaximum(225);
        jSRed.setMinorTickSpacing(1);
        jSRed.setPaintTicks(true);
        jSRed.setSnapToTicks(true);
        jSRed.setValue(100);
        jSRed.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSRedStateChanged(evt);
            }
        });

        jPColor.setBackground(new java.awt.Color(255, 255, 51));

        jLChangeColor.setFont(new java.awt.Font("sansserif", 2, 24)); // NOI18N
        jLChangeColor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPColorLayout = new javax.swing.GroupLayout(jPColor);
        jPColor.setLayout(jPColorLayout);
        jPColorLayout.setHorizontalGroup(
            jPColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLChangeColor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPColorLayout.setVerticalGroup(
            jPColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPColorLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLChangeColor)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jL7.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N
        jL7.setText("HTML");

        jTextField1.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("0");

        jBMajtkowy.setBackground(new java.awt.Color(228, 190, 207));
        jBMajtkowy.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N
        jBMajtkowy.setText("Majtkowy");
        jBMajtkowy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMajtkowyActionPerformed(evt);
            }
        });

        jBKawowy.setBackground(new java.awt.Color(44, 27, 1));
        jBKawowy.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N
        jBKawowy.setForeground(new java.awt.Color(204, 204, 204));
        jBKawowy.setText("Kawowy");
        jBKawowy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBKawowyActionPerformed(evt);
            }
        });

        jBSpizowy.setBackground(new java.awt.Color(205, 127, 50));
        jBSpizowy.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N
        jBSpizowy.setText("Spiżowy");
        jBSpizowy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSpizowyActionPerformed(evt);
            }
        });

        jBBlenkitParyski.setBackground(new java.awt.Color(0, 39, 194));
        jBBlenkitParyski.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N
        jBBlenkitParyski.setForeground(new java.awt.Color(204, 204, 204));
        jBBlenkitParyski.setText("Błękit paryski");
        jBBlenkitParyski.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBlenkitParyskiActionPerformed(evt);
            }
        });

        jBFiolkowy.setBackground(new java.awt.Color(238, 130, 238));
        jBFiolkowy.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N
        jBFiolkowy.setText("Fiołkowy");
        jBFiolkowy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFiolkowyActionPerformed(evt);
            }
        });

        jBLimonkowy.setBackground(new java.awt.Color(147, 246, 0));
        jBLimonkowy.setFont(new java.awt.Font("sansserif", 2, 13)); // NOI18N
        jBLimonkowy.setText("Limonkowy");
        jBLimonkowy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimonkowyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(jL8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jL1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jL3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jL2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSGreen, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
                    .addComponent(jSBlue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSRed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPColor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLRed, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jL4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jL5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jL6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jL7)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jBFiolkowy, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jBSpizowy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jBKawowy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jBMajtkowy, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addComponent(jBBlenkitParyski))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jBLimonkowy, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jL8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL1)
                    .addComponent(jSRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL2)
                    .addComponent(jSGreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL3)
                    .addComponent(jSBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL4)
                    .addComponent(jL5)
                    .addComponent(jL6)
                    .addComponent(jL7)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLRed)
                    .addComponent(jLGreen)
                    .addComponent(jLBlue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBMajtkowy)
                            .addComponent(jBBlenkitParyski))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBKawowy)
                            .addComponent(jBFiolkowy))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBSpizowy)
                            .addComponent(jBLimonkowy))))
                .addContainerGap(50, Short.MAX_VALUE))
        );

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

    private void jSRedStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSRedStateChanged
        jPColor.setBackground(getColourRGB(jSRed.getValue(), jSGreen.getValue(), jSBlue.getValue()));
    }//GEN-LAST:event_jSRedStateChanged

    private void jSGreenStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSGreenStateChanged
        jPColor.setBackground(getColourRGB(jSRed.getValue(), jSGreen.getValue(), jSBlue.getValue()));
    }//GEN-LAST:event_jSGreenStateChanged

    private void jSBlueStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSBlueStateChanged
        jPColor.setBackground(getColourRGB(jSRed.getValue(), jSGreen.getValue(), jSBlue.getValue()));
    }//GEN-LAST:event_jSBlueStateChanged

    private void jBMajtkowyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMajtkowyActionPerformed
        int rt = 228;
        int gt = 190;
        int bt = 207;
        setColorAfterButton(rt, gt, bt);
    }//GEN-LAST:event_jBMajtkowyActionPerformed

    private void jBSpizowyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSpizowyActionPerformed
        int rt = 205;
        int gt = 127;
        int bt = 50;
        setColorAfterButton(rt, gt, bt);
    }//GEN-LAST:event_jBSpizowyActionPerformed

    private void jBKawowyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBKawowyActionPerformed
        int rt = 44;
        int gt = 27;
        int bt = 1;
        setColorAfterButton(rt, gt, bt);
    }//GEN-LAST:event_jBKawowyActionPerformed

    private void jBBlenkitParyskiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBlenkitParyskiActionPerformed
        int rt = 0;
        int gt = 39;
        int bt = 194;
        setColorAfterButton(rt, gt, bt);
    }//GEN-LAST:event_jBBlenkitParyskiActionPerformed

    private void jBFiolkowyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFiolkowyActionPerformed
        int rt = 238;
        int gt = 130;
        int bt = 238;
        setColorAfterButton(rt, gt, bt);
    }//GEN-LAST:event_jBFiolkowyActionPerformed

    private void jBLimonkowyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimonkowyActionPerformed
        int rt = 147;
        int gt = 246;
        int bt = 0;
        setColorAfterButton(rt, gt, bt);
    }//GEN-LAST:event_jBLimonkowyActionPerformed
    private void setColorAfterButton(int rt, int gt, int bt){
        jPColor.setBackground(getColourRGB(rt, gt, bt));
        jSRed.setValue(rt);
        jSGreen.setValue(gt);
        jSBlue.setValue(bt);
    }
    private Color getColourRGB(int r, int g, int b){
        this.r = r;
        this.g = g;
        this.b = b;
        setNumberRGB();
        setHexToLabel();
        jLChangeColor.setForeground(setTextColor());
        return new Color(r,g,b);
    }
    private void setNumberRGB(){
        jLRed.setText(""+r);
        jLGreen.setText(""+g);
        jLBlue.setText(""+b);
    }
    private void setHexToLabel(){
        jTextField1.setText("#"+Integer.toHexString(r)+Integer.toHexString(g)+Integer.toHexString(b));
        jLChangeColor.setText("#"+Integer.toHexString(r)+Integer.toHexString(g)+Integer.toHexString(b));
    }
    
    private Color setTextColor(){
        int r1 = 255-r;
        int g1 = 255-g;
        int b1 = 255-b;
        if(r > 90 && r < 130){
            r1 = r1+80;
        }
        if(g > 90 && g < 130){
            g1 = g1+80;
        }
        if(b > 90 && b < 130){
            b1 = b1+80;
        }
        
        return new Color(r1,g1,b1);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KoloryWyklad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KoloryWyklad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KoloryWyklad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KoloryWyklad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KoloryWyklad().setVisible(true);
            }
        });
    }
    int r,g,b;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBlenkitParyski;
    private javax.swing.JButton jBFiolkowy;
    private javax.swing.JButton jBKawowy;
    private javax.swing.JButton jBLimonkowy;
    private javax.swing.JButton jBMajtkowy;
    private javax.swing.JButton jBSpizowy;
    private javax.swing.JLabel jL1;
    private javax.swing.JLabel jL2;
    private javax.swing.JLabel jL3;
    private javax.swing.JLabel jL4;
    private javax.swing.JLabel jL5;
    private javax.swing.JLabel jL6;
    private javax.swing.JLabel jL7;
    private javax.swing.JLabel jL8;
    private javax.swing.JLabel jLBlue;
    private javax.swing.JLabel jLChangeColor;
    private javax.swing.JLabel jLGreen;
    private javax.swing.JLabel jLRed;
    private javax.swing.JPanel jPColor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSBlue;
    private javax.swing.JSlider jSGreen;
    private javax.swing.JSlider jSRed;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}