/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasillasGUI;

import javax.swing.JLabel;

/**
 *
 * @author alex
 */
public class CasillaGUI extends javax.swing.JPanel {

    /**
     * Creates new form CasillaGUI
     */
    public CasillaGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        indice = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 0, 0));
        setBorder(javax.swing.BorderFactory.createCompoundBorder());
        setForeground(new java.awt.Color(0, 204, 153));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(384, Short.MAX_VALUE)
                .addComponent(indice)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(277, Short.MAX_VALUE)
                .addComponent(indice)
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel indice;
    // End of variables declaration//GEN-END:variables
}
