
package online_examination;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class ChangePasswordAdmin extends javax.swing.JFrame {

    Captcha obj = new Captcha();

    public ChangePasswordAdmin() {
        initComponents();
        setSize(800, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        ImageIcon i1 = new ImageIcon("src/pictures/simpleBlue.jpg");
        Image img = i1.getImage().getScaledInstance(lbBack.getWidth(), lbBack.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i2 = new ImageIcon(img);
        lbBack.setIcon(i2);
        
        i1 = new ImageIcon("src/pictures/im.png");
        img = i1.getImage().getScaledInstance(lb.getWidth(), lb.getHeight(), Image.SCALE_SMOOTH);
        i2 = new ImageIcon(img);
        lb.setIcon(i2);
        
        tf3.setText(obj.generateCaptcha());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        tf2 = new javax.swing.JTextField();
        tf1 = new javax.swing.JPasswordField();
        lb3 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        tf3 = new javax.swing.JTextField();
        lb5 = new javax.swing.JLabel();
        tf4 = new javax.swing.JTextField();
        bt1 = new javax.swing.JButton();
        reloadCatpcha = new javax.swing.JButton();
        btBack = new javax.swing.JButton();
        lb = new javax.swing.JLabel();
        lbBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lb1.setFont(new java.awt.Font("Liberation Sans Narrow", 3, 36)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 255, 255));
        lb1.setText("Reset Password");
        lb1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lb1PropertyChange(evt);
            }
        });
        getContentPane().add(lb1);
        lb1.setBounds(460, 10, 300, 50);

        lb2.setFont(new java.awt.Font("Liberation Sans Narrow", 3, 18)); // NOI18N
        lb2.setForeground(new java.awt.Color(255, 255, 255));
        lb2.setText("New Password");
        getContentPane().add(lb2);
        lb2.setBounds(510, 80, 130, 30);

        tf2.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(tf2);
        tf2.setBounds(510, 230, 230, 40);

        tf1.setBackground(new java.awt.Color(204, 204, 204));
        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });
        getContentPane().add(tf1);
        tf1.setBounds(510, 120, 220, 40);

        lb3.setFont(new java.awt.Font("Liberation Sans Narrow", 3, 18)); // NOI18N
        lb3.setForeground(new java.awt.Color(255, 255, 255));
        lb3.setText("Confirm Password");
        getContentPane().add(lb3);
        lb3.setBounds(510, 180, 160, 40);

        lb4.setFont(new java.awt.Font("Liberation Sans Narrow", 3, 18)); // NOI18N
        lb4.setForeground(new java.awt.Color(255, 255, 255));
        lb4.setText("Captcha");
        getContentPane().add(lb4);
        lb4.setBounds(400, 290, 100, 30);

        tf3.setBackground(new java.awt.Color(204, 204, 204));
        tf3.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        getContentPane().add(tf3);
        tf3.setBounds(510, 290, 140, 30);

        lb5.setFont(new java.awt.Font("Liberation Sans Narrow", 3, 18)); // NOI18N
        lb5.setForeground(new java.awt.Color(255, 255, 255));
        lb5.setText("Enter Here");
        getContentPane().add(lb5);
        lb5.setBounds(400, 340, 90, 30);

        tf4.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(tf4);
        tf4.setBounds(510, 340, 140, 30);

        bt1.setBackground(new java.awt.Color(0, 0, 0));
        bt1.setFont(new java.awt.Font("Liberation Sans Narrow", 3, 18)); // NOI18N
        bt1.setForeground(new java.awt.Color(255, 255, 255));
        bt1.setText("Change Password");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1);
        bt1.setBounds(510, 430, 180, 40);

        reloadCatpcha.setBackground(new java.awt.Color(0, 0, 0));
        reloadCatpcha.setFont(new java.awt.Font("Liberation Sans Narrow", 3, 18)); // NOI18N
        reloadCatpcha.setForeground(new java.awt.Color(255, 255, 255));
        reloadCatpcha.setText("Reload");
        reloadCatpcha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reloadCatpchaActionPerformed(evt);
            }
        });
        getContentPane().add(reloadCatpcha);
        reloadCatpcha.setBounds(670, 290, 110, 27);

        btBack.setBackground(new java.awt.Color(0, 0, 0));
        btBack.setFont(new java.awt.Font("Liberation Sans", 3, 18)); // NOI18N
        btBack.setForeground(new java.awt.Color(255, 255, 255));
        btBack.setText("Back");
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });
        getContentPane().add(btBack);
        btBack.setBounds(10, 10, 80, 30);
        getContentPane().add(lb);
        lb.setBounds(0, 120, 270, 280);
        getContentPane().add(lbBack);
        lbBack.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lb1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lb1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_lb1PropertyChange

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf1ActionPerformed

    private void reloadCatpchaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reloadCatpchaActionPerformed
        tf3.setText(obj.generateCaptcha());
    }//GEN-LAST:event_reloadCatpchaActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        
        String p1= tf1.getText();
        String p2=tf2.getText();
        String c1=tf3.getText();
        String c2=tf4.getText();
        
        if(!p1.equals(p2)) {
            JOptionPane.showMessageDialog(this, "Password Not Matches");
        }
        else if(!c1.equals(c2)) {
            JOptionPane.showMessageDialog(this, "Invalid Captcha");
        }
        else {
            try {
                HttpResponse<String> res = Unirest.get("http://localhost:8000/changePassword")
                                                .queryString("username",Global.userName)
                                                .queryString("pass", p1)
                                                .asString();
                
                if(res.getStatus()==200) {
                    String ans=res.getBody();
                    JOptionPane.showMessageDialog(this, ans);
                }
                else {
                    JOptionPane.showMessageDialog(this, res.getStatusText());
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_bt1ActionPerformed

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        
        AdminHome obj = new AdminHome();
        dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_btBackActionPerformed


     public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePasswordAdmin().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton btBack;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lbBack;
    private javax.swing.JButton reloadCatpcha;
    private javax.swing.JPasswordField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    // End of variables declaration//GEN-END:variables
}
