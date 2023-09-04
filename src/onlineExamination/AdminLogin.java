
package online_examination;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import java.awt.*;
import javax.swing.*;

public class AdminLogin extends javax.swing.JFrame {


  
    public AdminLogin() {
        
        initComponents();
        setSize(800, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        
        ImageIcon i1 = new ImageIcon("src/pictures/icon.png");
        Image img = i1.getImage().getScaledInstance(lb.getWidth(), lb.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i2 = new ImageIcon(img);
        lb.setIcon(i2);
        
        i1 = new ImageIcon("src/pictures/adminLogin.jpeg");
        img = i1.getImage().getScaledInstance(lbBack.getWidth(), lbBack.getHeight(), Image.SCALE_SMOOTH);
        i2 = new ImageIcon(img);
        lbBack.setIcon(i2);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        lb3 = new javax.swing.JLabel();
        tf2 = new javax.swing.JPasswordField();
        bt = new javax.swing.JButton();
        lb = new javax.swing.JLabel();
        lbBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lb1.setFont(new java.awt.Font("Liberation Sans", 3, 36)); // NOI18N
        lb1.setForeground(new java.awt.Color(0, 153, 51));
        lb1.setText("Admin Login");
        getContentPane().add(lb1);
        lb1.setBounds(250, 10, 230, 50);

        lb2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        lb2.setForeground(new java.awt.Color(255, 255, 255));
        lb2.setText("Username");
        getContentPane().add(lb2);
        lb2.setBounds(130, 330, 140, 40);
        getContentPane().add(tf1);
        tf1.setBounds(330, 330, 200, 40);

        lb3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        lb3.setForeground(new java.awt.Color(255, 255, 255));
        lb3.setText("Password");
        getContentPane().add(lb3);
        lb3.setBounds(130, 390, 140, 40);

        tf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf2ActionPerformed(evt);
            }
        });
        getContentPane().add(tf2);
        tf2.setBounds(330, 400, 200, 40);

        bt.setBackground(new java.awt.Color(204, 204, 204));
        bt.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        bt.setForeground(new java.awt.Color(0, 51, 153));
        bt.setText("Login");
        bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActionPerformed(evt);
            }
        });
        getContentPane().add(bt);
        bt.setBounds(240, 500, 110, 40);
        getContentPane().add(lb);
        lb.setBounds(170, 70, 250, 230);
        getContentPane().add(lbBack);
        lbBack.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf2ActionPerformed

    private void btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActionPerformed
        try {
            String user= tf1.getText();
            String pass= tf2.getText();
        
            if(user.equals("") || pass.equals("")) {
                JOptionPane.showMessageDialog(this, "All fields are mandatory");
            }
            else {
                HttpResponse<String> res = Unirest.get("http://localhost:8000/checklogin")
                                                    .queryString("username",user)
                                                    .queryString("password",pass)
                                                    .asString();
                
                if(res.getStatus()==200) {
                    Global.userName = user;
                    String ans=res.getBody();
                    JOptionPane.showMessageDialog(this, ans);
                    
                    if(ans.equals("logged in successfull !!!")) {
                        AdminHome obj = new AdminHome();
                        dispose();                       
                        obj.setVisible(true);
                    }
                }
                else JOptionPane.showMessageDialog(this, res.getStatusText());
            }
        }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(this, "Server no Started");
        }
    }//GEN-LAST:event_btActionPerformed

 
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lbBack;
    private javax.swing.JTextField tf1;
    private javax.swing.JPasswordField tf2;
    // End of variables declaration//GEN-END:variables
}
