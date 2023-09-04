
package online_examination;

import java.awt.Image;
import javax.swing.ImageIcon;


public class AdminHome extends javax.swing.JFrame {

    public AdminHome() {
        initComponents();
        setSize(800, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        ImageIcon i1 = new ImageIcon("src/pictures/simpleBlue.jpg");
        Image img = i1.getImage().getScaledInstance(lbBack.getWidth(), lbBack.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i2 = new ImageIcon(img);
        lbBack.setIcon(i2);
        
        i1 = new ImageIcon("src/pictures/admHome.png");
        img = i1.getImage().getScaledInstance(lbAdm.getWidth(), lbAdm.getHeight(), Image.SCALE_SMOOTH);
        i2 = new ImageIcon(img);
        lbAdm.setIcon(i2);
        lb1.setText("Welcome "+Global.userName );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb1 = new javax.swing.JLabel();
        bt2 = new javax.swing.JButton();
        bt1 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        btLogout = new javax.swing.JButton();
        lb = new javax.swing.JLabel();
        lbBack = new javax.swing.JLabel();
        lbAdm = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lb1.setFont(new java.awt.Font("Monospaced", 3, 36)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 255, 255));
        lb1.setText(" Admin  Home");
        lb1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lb1PropertyChange(evt);
            }
        });
        getContentPane().add(lb1);
        lb1.setBounds(440, 20, 340, 370);

        bt2.setBackground(new java.awt.Color(0, 0, 0));
        bt2.setFont(new java.awt.Font("Liberation Sans", 3, 18)); // NOI18N
        bt2.setForeground(new java.awt.Color(255, 255, 255));
        bt2.setText("Manage Questions");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        getContentPane().add(bt2);
        bt2.setBounds(70, 280, 210, 60);

        bt1.setBackground(new java.awt.Color(0, 0, 0));
        bt1.setFont(new java.awt.Font("Liberation Sans", 3, 18)); // NOI18N
        bt1.setForeground(new java.awt.Color(255, 255, 255));
        bt1.setText("Manage Category");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1);
        bt1.setBounds(70, 200, 210, 60);

        bt3.setBackground(new java.awt.Color(0, 0, 0));
        bt3.setFont(new java.awt.Font("Liberation Sans", 3, 18)); // NOI18N
        bt3.setForeground(new java.awt.Color(255, 255, 255));
        bt3.setText("Change Password");
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });
        getContentPane().add(bt3);
        bt3.setBounds(70, 360, 210, 60);

        btLogout.setBackground(new java.awt.Color(0, 0, 0));
        btLogout.setFont(new java.awt.Font("Liberation Sans", 3, 18)); // NOI18N
        btLogout.setForeground(new java.awt.Color(255, 255, 255));
        btLogout.setText("Logout");
        btLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btLogout);
        btLogout.setBounds(70, 440, 210, 50);

        lb.setFont(new java.awt.Font("Liberation Sans", 3, 36)); // NOI18N
        lb.setForeground(new java.awt.Color(255, 255, 255));
        lb.setText("ADMIN OPTIONS");
        getContentPane().add(lb);
        lb.setBounds(60, 60, 310, 70);
        getContentPane().add(lbBack);
        lbBack.setBounds(0, 0, 410, 600);
        getContentPane().add(lbAdm);
        lbAdm.setBounds(410, 0, 390, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        dispose();
        ManageQuestions obj = new ManageQuestions();
        obj.setVisible(true);
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        dispose();
        ManageCategories obj = new ManageCategories();
        obj.setVisible(true);
                       
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        
        ChangePasswordAdmin obj = new ChangePasswordAdmin();
        dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_bt3ActionPerformed

    private void lb1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lb1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_lb1PropertyChange

    private void btLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogoutActionPerformed
        
        AdminLogin obj = new AdminLogin();
        Global.userName="";
        dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_btLogoutActionPerformed


    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHome().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton btLogout;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lbAdm;
    private javax.swing.JLabel lbBack;
    // End of variables declaration//GEN-END:variables
}
