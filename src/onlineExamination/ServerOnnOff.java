
package online_examination;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ServerOnnOff extends javax.swing.JFrame {

    MyServer obj;
 
    public ServerOnnOff() {
        initComponents();
        setSize(800,600);
        setResizable(false);
        setLocationRelativeTo(null);
        ImageIcon i1 = new ImageIcon("src/pictures/server.png");
        Image img = i1.getImage().getScaledInstance(lbBack.getWidth(), lbBack.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i2 = new ImageIcon(img);
        lbBack.setIcon(i2);
        bt2.setEnabled(false);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        lbBack = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        bt1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        bt1.setText("START");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1);
        bt1.setBounds(310, 40, 102, 35);

        bt2.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        bt2.setText("STOP");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        getContentPane().add(bt2);
        bt2.setBounds(310, 120, 102, 32);
        getContentPane().add(lbBack);
        lbBack.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
       
        try {
            obj = new MyServer(8000);
            bt1.setEnabled(false);
            bt2.setEnabled(true);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        
        obj.shutdown();
        bt1.setEnabled(true);
        JOptionPane.showMessageDialog(this, "Server Stopped");
        bt2.setEnabled(false);
        
    }//GEN-LAST:event_bt2ActionPerformed

 
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServerOnnOff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lbBack;
    // End of variables declaration//GEN-END:variables
}
