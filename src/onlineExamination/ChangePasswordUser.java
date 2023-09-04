
package online_examination;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ChangePasswordUser extends javax.swing.JFrame {
    
    Captcha obj = new Captcha();

    public ChangePasswordUser() {
        initComponents();
        setSize(800,600);
        setLocationRelativeTo(null);
        ImageIcon i1 = new ImageIcon("src/pictures/im.png");
        Image img = i1.getImage().getScaledInstance(lbBack.getWidth(), lbBack.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i2 = new ImageIcon(img);
        lbBack.setIcon(i2);
        
        i1 = new ImageIcon("src/pictures/simpleBlue.jpg");
        img = i1.getImage().getScaledInstance(lb.getWidth(), lb.getHeight(), Image.SCALE_SMOOTH);
        i2 = new ImageIcon(img);
        lb.setIcon(i2);
        tf1.setText(obj.generateCaptcha());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb1 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        pf1 = new javax.swing.JPasswordField();
        tf2 = new javax.swing.JTextField();
        pf2 = new javax.swing.JPasswordField();
        tf1 = new javax.swing.JTextField();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        btBack = new javax.swing.JButton();
        lbBack = new javax.swing.JLabel();
        lb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lb1.setFont(new java.awt.Font("Liberation Sans", 3, 36)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 255, 255));
        lb1.setText("Reset Password");
        getContentPane().add(lb1);
        lb1.setBounds(440, 10, 320, 60);

        lb5.setFont(new java.awt.Font("Liberation Sans", 3, 18)); // NOI18N
        lb5.setForeground(new java.awt.Color(255, 255, 255));
        lb5.setText("Enter Here");
        getContentPane().add(lb5);
        lb5.setBounds(380, 380, 110, 30);

        lb2.setFont(new java.awt.Font("Liberation Sans", 3, 18)); // NOI18N
        lb2.setForeground(new java.awt.Color(255, 255, 255));
        lb2.setText("New Password");
        getContentPane().add(lb2);
        lb2.setBounds(500, 130, 160, 30);

        lb3.setBackground(new java.awt.Color(255, 255, 255));
        lb3.setFont(new java.awt.Font("Liberation Sans", 3, 18)); // NOI18N
        lb3.setForeground(new java.awt.Color(255, 255, 255));
        lb3.setText("Confirm Password");
        getContentPane().add(lb3);
        lb3.setBounds(500, 230, 210, 30);

        lb4.setFont(new java.awt.Font("Liberation Sans", 3, 18)); // NOI18N
        lb4.setForeground(new java.awt.Color(255, 255, 255));
        lb4.setText("Captcha");
        getContentPane().add(lb4);
        lb4.setBounds(380, 330, 90, 30);

        pf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pf1ActionPerformed(evt);
            }
        });
        getContentPane().add(pf1);
        pf1.setBounds(500, 160, 220, 40);
        getContentPane().add(tf2);
        tf2.setBounds(500, 380, 140, 30);
        getContentPane().add(pf2);
        pf2.setBounds(500, 270, 220, 40);
        getContentPane().add(tf1);
        tf1.setBounds(500, 330, 140, 30);

        bt1.setFont(new java.awt.Font("Liberation Sans", 3, 18)); // NOI18N
        bt1.setText("Reload");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1);
        bt1.setBounds(650, 330, 130, 28);

        bt2.setFont(new java.awt.Font("Liberation Sans", 3, 18)); // NOI18N
        bt2.setText("Change Password");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        getContentPane().add(bt2);
        bt2.setBounds(500, 450, 210, 40);

        btBack.setText("Back");
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });
        getContentPane().add(btBack);
        btBack.setBounds(10, 10, 72, 24);
        getContentPane().add(lbBack);
        lbBack.setBounds(0, 120, 330, 270);

        lb.setBackground(new java.awt.Color(0, 102, 255));
        getContentPane().add(lb);
        lb.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pf1ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        
        String p1 = pf1.getText();
        String p2 = pf2.getText();
        String c1 = tf1.getText();
        String c2 = tf2.getText();
        
        try {
            if(!p1.equals(p2)) {
                JOptionPane.showMessageDialog(this, "Password Not Matches");
            }
            else if(!c1.equals(c2)) {
                JOptionPane.showMessageDialog(this, "Invalid Captcha");
            }
            else {
                HttpResponse<String> res = Unirest.get("http://localhost:8000/changePasswordUser")
                                                .queryString("username", Global.userName)
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
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        
        tf1.setText(obj.generateCaptcha());
    }//GEN-LAST:event_bt1ActionPerformed

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        
        UserHome obj = new UserHome();
        dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_btBackActionPerformed

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePasswordUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton btBack;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lbBack;
    private javax.swing.JPasswordField pf1;
    private javax.swing.JPasswordField pf2;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    // End of variables declaration//GEN-END:variables
}
