
package online_examination;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class UserLogin extends javax.swing.JFrame {


    public UserLogin() {
        initComponents();
        setSize(800, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        ImageIcon i1 = new ImageIcon("src/pictures/userIcon.png");
        Image img = i1.getImage().getScaledInstance(lbUser.getWidth(), lbUser.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i2 = new ImageIcon(img);
        lbUser.setIcon(i2);
        
        i1 = new ImageIcon("src/pictures/userLogin.jpg");
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
        lb4 = new javax.swing.JLabel();
        bt2 = new javax.swing.JButton();
        lbUser = new javax.swing.JLabel();
        lbBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lb1.setFont(new java.awt.Font("Liberation Sans Narrow", 3, 36)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 255, 255));
        lb1.setText("            User Login");
        getContentPane().add(lb1);
        lb1.setBounds(210, 10, 350, 60);

        lb2.setFont(new java.awt.Font("Liberation Sans", 3, 18)); // NOI18N
        lb2.setForeground(new java.awt.Color(255, 255, 255));
        lb2.setText("Username (Gmail)");
        getContentPane().add(lb2);
        lb2.setBounds(170, 280, 190, 30);

        tf1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        getContentPane().add(tf1);
        tf1.setBounds(400, 270, 170, 40);

        lb3.setFont(new java.awt.Font("Liberation Sans", 3, 18)); // NOI18N
        lb3.setForeground(new java.awt.Color(255, 255, 255));
        lb3.setText("Password");
        getContentPane().add(lb3);
        lb3.setBounds(170, 340, 140, 40);

        tf2.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        getContentPane().add(tf2);
        tf2.setBounds(400, 340, 170, 40);

        bt.setBackground(new java.awt.Color(0, 102, 255));
        bt.setFont(new java.awt.Font("Liberation Sans", 3, 18)); // NOI18N
        bt.setForeground(new java.awt.Color(255, 255, 255));
        bt.setText("Login");
        bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActionPerformed(evt);
            }
        });
        getContentPane().add(bt);
        bt.setBounds(290, 420, 90, 40);

        lb4.setFont(new java.awt.Font("Liberation Sans", 3, 18)); // NOI18N
        lb4.setForeground(new java.awt.Color(255, 255, 255));
        lb4.setText("Create New Account");
        getContentPane().add(lb4);
        lb4.setBounds(130, 520, 190, 40);

        bt2.setBackground(new java.awt.Color(0, 102, 255));
        bt2.setFont(new java.awt.Font("Liberation Sans", 3, 18)); // NOI18N
        bt2.setForeground(new java.awt.Color(255, 255, 255));
        bt2.setText("Sign Up");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        getContentPane().add(bt2);
        bt2.setBounds(360, 530, 120, 30);
        getContentPane().add(lbUser);
        lbUser.setBounds(280, 80, 180, 160);
        getContentPane().add(lbBack);
        lbBack.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActionPerformed
        
        String mail = tf1.getText();
        String pass = tf2.getText();
        
        try {
            HttpResponse<String> res = Unirest.get("http://localhost:8000/userlogin")
                                        .queryString("mail",mail)
                                        .queryString("pass", pass)
                                        .asString();
            
            if(res.getStatus()==200) {
                String ans = res.getBody();
                JOptionPane.showMessageDialog(this, ans);
                if( ans.equals("Logged in Successfully") ) {
                    Global.userName=mail;
                    UserHome obj = new UserHome();
                    dispose();
                    obj.setVisible(true);
                }               
            }
            else 
                JOptionPane.showMessageDialog(this, res.getStatusText());
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Server no Started");
        }
    }//GEN-LAST:event_btActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        UserSignUp obj = new UserSignUp();
        dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_bt2ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt;
    private javax.swing.JButton bt2;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lbBack;
    private javax.swing.JLabel lbUser;
    private javax.swing.JTextField tf1;
    private javax.swing.JPasswordField tf2;
    // End of variables declaration//GEN-END:variables
}
