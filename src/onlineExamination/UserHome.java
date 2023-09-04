package online_examination;

import java.awt.Image;
import javax.swing.ImageIcon;

public class UserHome extends javax.swing.JFrame {

    public UserHome() {
        initComponents();
        setSize(800, 600);
        setResizable(false);
        
        lb1.setText("Welcome  "+ Global.userName);
        
        setLocationRelativeTo(null);
        ImageIcon i1 = new ImageIcon("src/pictures/userHome.jpg");
        Image img = i1.getImage().getScaledInstance(lbBack.getWidth(), lbBack.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i2 = new ImageIcon(img);
        lbBack.setIcon(i2);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb1 = new javax.swing.JLabel();
        bt3 = new javax.swing.JButton();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        btLogout = new javax.swing.JButton();
        lbBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lb1.setBackground(new java.awt.Color(255, 255, 255));
        lb1.setFont(new java.awt.Font("Liberation Sans Narrow", 3, 36)); // NOI18N
        lb1.setText("      User Home");
        getContentPane().add(lb1);
        lb1.setBounds(310, 20, 310, 70);

        bt3.setBackground(new java.awt.Color(0, 255, 204));
        bt3.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        bt3.setText("Change Password");
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });
        getContentPane().add(bt3);
        bt3.setBounds(310, 340, 200, 40);

        bt1.setBackground(new java.awt.Color(0, 255, 204));
        bt1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        bt1.setText("Start Test");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1);
        bt1.setBounds(310, 200, 200, 40);

        bt2.setBackground(new java.awt.Color(0, 255, 204));
        bt2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        bt2.setText("View Results");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        getContentPane().add(bt2);
        bt2.setBounds(310, 270, 200, 40);

        btLogout.setBackground(new java.awt.Color(0, 255, 204));
        btLogout.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btLogout.setText("Logout");
        btLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btLogout);
        btLogout.setBounds(680, 10, 100, 30);
        getContentPane().add(lbBack);
        lbBack.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        
        StartTest obj = new StartTest();
        dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        ChangePasswordUser obj = new ChangePasswordUser();
        dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_bt3ActionPerformed

    private void btLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogoutActionPerformed
        
        UserLogin obj = new UserLogin();
        Global.userName = "";
        dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_btLogoutActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        ViewResult obj = new ViewResult();
        dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_bt2ActionPerformed

  
    public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton btLogout;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lbBack;
    // End of variables declaration//GEN-END:variables
}
