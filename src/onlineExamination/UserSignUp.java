
package online_examination;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class UserSignUp extends javax.swing.JFrame {

    Captcha obj = new Captcha();
    
    public UserSignUp() {
        initComponents();
        setSize(800, 600);
        setLocationRelativeTo(null);
        ImageIcon i1 = new ImageIcon("src/pictures/userSignup.jpg");
        Image img = i1.getImage().getScaledInstance(lbBack.getWidth(), lbBack.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i2 = new ImageIcon(img);
        lbBack.setIcon(i2);
        tf6.setText(obj.generateCaptcha());
        tf6.setEditable(false);
    }
    
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        lb3 = new javax.swing.JLabel();
        tf2 = new javax.swing.JTextField();
        lb4 = new javax.swing.JLabel();
        tf3 = new javax.swing.JTextField();
        lb5 = new javax.swing.JLabel();
        tf4 = new javax.swing.JPasswordField();
        lb6 = new javax.swing.JLabel();
        tf5 = new javax.swing.JPasswordField();
        bt1 = new javax.swing.JButton();
        lb7 = new javax.swing.JLabel();
        tf6 = new javax.swing.JTextField();
        bt3 = new javax.swing.JButton();
        tf7 = new javax.swing.JTextField();
        lb8 = new javax.swing.JLabel();
        lbBack = new javax.swing.JLabel();
        btBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lb1.setFont(new java.awt.Font("Liberation Sans", 3, 36)); // NOI18N
        lb1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb1.setText("User  Sign Up ");
        getContentPane().add(lb1);
        lb1.setBounds(240, 10, 300, 50);

        lb2.setFont(new java.awt.Font("Liberation Sans", 3, 18)); // NOI18N
        lb2.setText("Name");
        getContentPane().add(lb2);
        lb2.setBounds(180, 100, 110, 30);

        tf1.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        getContentPane().add(tf1);
        tf1.setBounds(380, 100, 170, 30);

        lb3.setFont(new java.awt.Font("Liberation Sans", 3, 18)); // NOI18N
        lb3.setText("Contact No.");
        getContentPane().add(lb3);
        lb3.setBounds(180, 150, 120, 30);

        tf2.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        tf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf2ActionPerformed(evt);
            }
        });
        getContentPane().add(tf2);
        tf2.setBounds(380, 150, 170, 30);

        lb4.setFont(new java.awt.Font("Liberation Sans", 3, 18)); // NOI18N
        lb4.setText("Gmail");
        getContentPane().add(lb4);
        lb4.setBounds(180, 200, 90, 20);

        tf3.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        getContentPane().add(tf3);
        tf3.setBounds(380, 200, 170, 30);

        lb5.setFont(new java.awt.Font("Liberation Sans", 3, 18)); // NOI18N
        lb5.setText("Set Password");
        getContentPane().add(lb5);
        lb5.setBounds(180, 240, 140, 40);

        tf4.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        getContentPane().add(tf4);
        tf4.setBounds(380, 250, 170, 30);

        lb6.setFont(new java.awt.Font("Liberation Sans", 3, 18)); // NOI18N
        lb6.setText("Confirm Password");
        getContentPane().add(lb6);
        lb6.setBounds(180, 300, 170, 30);

        tf5.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        getContentPane().add(tf5);
        tf5.setBounds(380, 300, 170, 30);

        bt1.setFont(new java.awt.Font("Liberation Sans", 3, 18)); // NOI18N
        bt1.setText("Sign Up");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1);
        bt1.setBounds(270, 490, 130, 40);

        lb7.setFont(new java.awt.Font("Liberation Sans", 3, 18)); // NOI18N
        lb7.setText("Captcha");
        getContentPane().add(lb7);
        lb7.setBounds(200, 350, 80, 30);

        tf6.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        tf6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf6ActionPerformed(evt);
            }
        });
        getContentPane().add(tf6);
        tf6.setBounds(380, 350, 110, 30);

        bt3.setFont(new java.awt.Font("Liberation Sans", 3, 14)); // NOI18N
        bt3.setText("Reload");
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });
        getContentPane().add(bt3);
        bt3.setBounds(520, 350, 90, 30);

        tf7.setFont(new java.awt.Font("Liberation Sans", 0, 15)); // NOI18N
        getContentPane().add(tf7);
        tf7.setBounds(380, 410, 110, 30);

        lb8.setFont(new java.awt.Font("Liberation Sans", 3, 18)); // NOI18N
        lb8.setText("Enter Here");
        getContentPane().add(lb8);
        lb8.setBounds(200, 410, 110, 30);
        getContentPane().add(lbBack);
        lbBack.setBounds(0, 0, 800, 600);

        btBack.setFont(new java.awt.Font("Liberation Sans", 3, 18)); // NOI18N
        btBack.setText("Back");
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });
        getContentPane().add(btBack);
        btBack.setBounds(10, 10, 80, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        
        String name = tf1.getText();
        String cont = tf2.getText();
        String mail = tf3.getText();
        String pass1 = tf4.getText();
        String pass2 = tf5.getText();
        String c1 = tf6.getText();
        String c2 = tf7.getText();
        
        if(!pass1.equals(pass2)) {
            JOptionPane.showMessageDialog(this, "Password Not Matches !!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else if(! c1.equals(c2)) {
            JOptionPane.showMessageDialog(this, "Invalid Captcha !!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else if(pass1.equals("") || pass2.equals("") || name.equals("") || mail.equals("") || cont.equals("")) {
            JOptionPane.showMessageDialog(this, "All Fields are Mandatory !!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else {
            try {
                HttpResponse<String> res = Unirest.get("http://localhost:8000/signUp")
                                            .queryString("name", name)
                                            .queryString("cont", cont)
                                            .queryString("mail", mail)
                                            .queryString("pass", pass1)
                                            .asString();
                
                if(res.getStatus()==200) {
                    JOptionPane.showMessageDialog(this, res.getBody());
                    
                }
                else {
                    JOptionPane.showMessageDialog(this, res.getStatusText());
                }
            }
            catch (Exception e) {
                System.out.println("Server not Started!!");
            }
        }
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        
        tf6.setText(obj.generateCaptcha());
    }//GEN-LAST:event_bt3ActionPerformed

    private void tf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf2ActionPerformed

    private void tf6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf6ActionPerformed

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        UserLogin obj = new UserLogin();
        dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_btBackActionPerformed

  
    public static void main(String args[]) {
       
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserSignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt3;
    private javax.swing.JButton btBack;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JLabel lb8;
    private javax.swing.JLabel lbBack;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JPasswordField tf4;
    private javax.swing.JPasswordField tf5;
    private javax.swing.JTextField tf6;
    private javax.swing.JTextField tf7;
    // End of variables declaration//GEN-END:variables
}
