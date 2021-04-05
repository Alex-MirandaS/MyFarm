/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CasillasGUI;

import Casillas.Agua;
import Casillas.Casilla;
import Controladores.ControladorCasillas;
import Controladores.ControladorConstantes;
import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author alex
 */
public class AguaGUI extends javax.swing.JPanel {

    boolean prepararDesbloqueo;

    public AguaGUI(int i) {
        initComponents();
//        this.prepararDesbloqueo = prepararDesbloqueo;
        indice.setText("Agua " + i);
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

        setBackground(new java.awt.Color(51, 51, 255));
        setForeground(new java.awt.Color(0, 204, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(100, 100));
        setMinimumSize(new java.awt.Dimension(100, 100));
        setPreferredSize(new java.awt.Dimension(100, 100));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(indice, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(indice, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        if (this.isEnabled()) {

        }

        if (prepararDesbloqueo) {
            ControladorCasillas control = new ControladorCasillas();
            control.desbloquearCasillas(this,Color.BLUE);
        }
    }//GEN-LAST:event_formMouseClicked

    public void setIndice(JLabel indice) {
        this.indice = indice;
    }

    public boolean isPrepararDesbloqueo() {
        return prepararDesbloqueo;
    }

    public void setPrepararDesbloqueo(boolean prepararDesbloqueo) {
        this.prepararDesbloqueo = prepararDesbloqueo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel indice;
    // End of variables declaration//GEN-END:variables
}
