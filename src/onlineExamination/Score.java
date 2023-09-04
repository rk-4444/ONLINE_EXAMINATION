
package online_examination;

import java.awt.Image;
import javax.swing.ImageIcon;


public class Score extends javax.swing.JFrame {
    
    int indArr[] = new int[15]; 
    
    int totalAttempt() {
        int ans=0;
        for(int i=0;i<15;++i) {
            if(!Global.al.get(indArr[i]).userAns.equals("")) ++ans;
        }
        return ans;
    }

    public Score(int arr[]) {
        initComponents();
        setSize(800, 600);
        
        setLocationRelativeTo(null);
        ImageIcon i1 = new ImageIcon("src/pictures/score.jpg");
        Image img = i1.getImage().getScaledInstance(lbBack.getWidth(), lbBack.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i2 = new ImageIcon(img);
        lbBack.setIcon(i2);
        
        try {
            indArr = arr;
        lb6.setText("15");
        lb7.setText(totalAttempt()+"");
        lb8.setText(Global.marks+"/30");
        jPBar.setStringPainted(true);
        jPBar.setValue(Global.marks*100/30);
        } catch (Exception e) {
            System.out.println("exception");
        }
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        lb6 = new javax.swing.JLabel();
        lb7 = new javax.swing.JLabel();
        lb8 = new javax.swing.JLabel();
        jPBar = new javax.swing.JProgressBar();
        bt = new javax.swing.JButton();
        btHome = new javax.swing.JButton();
        lbBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lb1.setFont(new java.awt.Font("Liberation Sans", 3, 36)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 255, 255));
        lb1.setText("Score");
        getContentPane().add(lb1);
        lb1.setBounds(340, 20, 150, 50);

        lb2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lb2.setForeground(new java.awt.Color(255, 255, 255));
        lb2.setText("Total Questions");
        getContentPane().add(lb2);
        lb2.setBounds(200, 160, 170, 30);

        lb3.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lb3.setForeground(new java.awt.Color(255, 255, 255));
        lb3.setText("Total Attempt");
        getContentPane().add(lb3);
        lb3.setBounds(200, 220, 150, 30);

        lb4.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lb4.setForeground(new java.awt.Color(255, 255, 255));
        lb4.setText("Marks");
        getContentPane().add(lb4);
        lb4.setBounds(200, 280, 110, 30);

        lb5.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lb5.setForeground(new java.awt.Color(255, 255, 255));
        lb5.setText("Percentage");
        getContentPane().add(lb5);
        lb5.setBounds(200, 340, 100, 30);

        lb6.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lb6.setForeground(new java.awt.Color(255, 255, 255));
        lb6.setText("1");
        getContentPane().add(lb6);
        lb6.setBounds(540, 160, 120, 30);

        lb7.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lb7.setForeground(new java.awt.Color(255, 255, 255));
        lb7.setText("jLabel1");
        getContentPane().add(lb7);
        lb7.setBounds(540, 220, 110, 30);

        lb8.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lb8.setForeground(new java.awt.Color(255, 255, 255));
        lb8.setText("jLabel1");
        getContentPane().add(lb8);
        lb8.setBounds(540, 280, 100, 30);

        jPBar.setBackground(new java.awt.Color(255, 255, 255));
        jPBar.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jPBar.setForeground(new java.awt.Color(0, 204, 204));
        getContentPane().add(jPBar);
        jPBar.setBounds(500, 340, 170, 30);

        bt.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        bt.setText("Exit");
        bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActionPerformed(evt);
            }
        });
        getContentPane().add(bt);
        bt.setBounds(350, 450, 100, 40);

        btHome.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        btHome.setText("Goto Home");
        btHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHomeActionPerformed(evt);
            }
        });
        getContentPane().add(btHome);
        btHome.setBounds(660, 10, 130, 30);
        getContentPane().add(lbBack);
        lbBack.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHomeActionPerformed
        UserHome obj = new UserHome();
        dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_btHomeActionPerformed

    private void btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActionPerformed
        UserHome obj = new UserHome();
        dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_btActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int arr[]={0,2};
                new Score(arr).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt;
    private javax.swing.JButton btHome;
    private javax.swing.JProgressBar jPBar;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JLabel lb8;
    private javax.swing.JLabel lbBack;
    // End of variables declaration//GEN-END:variables
}
