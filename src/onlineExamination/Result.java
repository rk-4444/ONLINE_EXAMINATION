package online_examination;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Result extends javax.swing.JFrame {
    
    int current = 0;
    int indArr[] = new int[15];
    
    void loadQuestion(int qNo) {
        lb4.setText((current+1)+"");
        
        ta.setText(Global.al.get(qNo).ques);
        lbA.setText(Global.al.get(qNo).optionA);
        lbB.setText(Global.al.get(qNo).optionB);
        lbC.setText(Global.al.get(qNo).optionC);
        lbD.setText(Global.al.get(qNo).optionD);
        
        rb1.setEnabled(false);
        rb2.setEnabled(false);
        rb3.setEnabled(false);
        rb4.setEnabled(false);
        
        if(Global.al.get(qNo).userAns.equals("")) {
            lbCheckAttempt.setVisible(true);
        }
        
        if(!Global.al.get(qNo).userAns.equals("")) {
            lbCheckAttempt.setVisible(false);
            
            if(Global.al.get(qNo).correctOpt.equals(rb1.getText())) {
                lbA.setOpaque(true);
                lbA.setBackground(Color.green);
            }
            if(Global.al.get(qNo).correctOpt.equals(rb2.getText())) {
                lbB.setOpaque(true);
                lbB.setBackground(Color.green);
            }
            if(Global.al.get(qNo).correctOpt.equals(rb3.getText())) {
                lbC.setOpaque(true);
                lbC.setBackground(Color.green);
            }
            if(Global.al.get(qNo).correctOpt.equals(rb4.getText())) {
                lbD.setOpaque(true);
                lbD.setBackground(Color.green);
            }
        }
        
        if(!Global.al.get(qNo).userAns.equals(Global.al.get(qNo).correctOpt)) {
            if(Global.al.get(qNo).userAns.equals(rb1.getText())) {
                lbA.setOpaque(true);
                lbA.setBackground(Color.red);
            }
            if(Global.al.get(qNo).userAns.equals(rb2.getText())) {
                lbB.setOpaque(true);
                lbB.setBackground(Color.red);
            }
            if(Global.al.get(qNo).userAns.equals(rb3.getText())) {
                lbC.setOpaque(true);
                lbC.setBackground(Color.red);
            }
            if(Global.al.get(qNo).userAns.equals(rb4.getText())) {
                lbD.setOpaque(true);
                lbD.setBackground(Color.red);
            }
        }
    }
    
    void upLoadResult() {
        try {
            HttpResponse<String> res = Unirest.get("http://localhost:8000/uploadResult")
                                        .queryString("user", Global.userName)
                                        .queryString("catname", Global.selectedCat)
                                        .queryString("marks", Global.marks)
                                        .asString();
            if(res.getStatus()==200) {
                String ans = res.getBody();
                System.out.println(ans);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    int Marks() {
        int ans=0;
        for(int i=0;i<15;++i) {
            if(Global.al.get(indArr[i]).userAns.equals(Global.al.get(indArr[i]).correctOpt)) ans+=2;
        }
        Global.marks=ans;
        return ans;
    }
    
    
    public Result(int arr[]) {
        initComponents();
        setSize(920,600);
        setVisible(true);
        setLocationRelativeTo(null);
        ImageIcon i1 = new ImageIcon("src/pictures/Result.jpg");
        Image img = i1.getImage().getScaledInstance(lbBack.getWidth(), lbBack.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i2 = new ImageIcon(img);
        lbBack.setIcon(i2);
        
        indArr=arr;
        Marks();       
        lbCheckAttempt.setVisible(false);
        ta.setEditable(false);
        btPrev.setEnabled(false);
        loadQuestion(indArr[current]);
        upLoadResult();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        rb2 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        rb4 = new javax.swing.JRadioButton();
        rb1 = new javax.swing.JRadioButton();
        lbB = new javax.swing.JLabel();
        lbC = new javax.swing.JLabel();
        lbD = new javax.swing.JLabel();
        lbA = new javax.swing.JLabel();
        btPrev = new javax.swing.JButton();
        btNext = new javax.swing.JButton();
        btViewScore = new javax.swing.JButton();
        lbCheckAttempt = new javax.swing.JLabel();
        btHome = new javax.swing.JButton();
        lbBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Result");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 20, 250, 50);

        lb4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lb4);
        lb4.setBounds(160, 150, 30, 30);

        ta.setColumns(20);
        ta.setRows(5);
        jScrollPane1.setViewportView(ta);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(270, 130, 370, 70);

        rb2.setBackground(new java.awt.Color(0, 0, 0));
        btGroup.add(rb2);
        rb2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rb2.setForeground(new java.awt.Color(255, 255, 255));
        rb2.setText("Option B");
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });
        getContentPane().add(rb2);
        rb2.setBounds(180, 280, 100, 19);

        rb3.setBackground(new java.awt.Color(0, 0, 0));
        btGroup.add(rb3);
        rb3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rb3.setForeground(new java.awt.Color(255, 255, 255));
        rb3.setText("Option C");
        rb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb3ActionPerformed(evt);
            }
        });
        getContentPane().add(rb3);
        rb3.setBounds(180, 320, 100, 19);

        rb4.setBackground(new java.awt.Color(0, 0, 0));
        btGroup.add(rb4);
        rb4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rb4.setForeground(new java.awt.Color(255, 255, 255));
        rb4.setText("Option D");
        rb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb4ActionPerformed(evt);
            }
        });
        getContentPane().add(rb4);
        rb4.setBounds(180, 360, 100, 19);

        rb1.setBackground(new java.awt.Color(0, 0, 0));
        btGroup.add(rb1);
        rb1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rb1.setForeground(new java.awt.Color(255, 255, 255));
        rb1.setText("Option A");
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });
        getContentPane().add(rb1);
        rb1.setBounds(180, 240, 110, 19);

        lbB.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(lbB);
        lbB.setBounds(320, 280, 220, 20);

        lbC.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(lbC);
        lbC.setBounds(320, 320, 220, 20);

        lbD.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(lbD);
        lbD.setBounds(320, 360, 220, 20);

        lbA.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(lbA);
        lbA.setBounds(320, 240, 220, 20);

        btPrev.setBackground(new java.awt.Color(204, 204, 204));
        btPrev.setForeground(new java.awt.Color(0, 0, 102));
        btPrev.setText("Previous");
        btPrev.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrevActionPerformed(evt);
            }
        });
        getContentPane().add(btPrev);
        btPrev.setBounds(290, 440, 110, 22);

        btNext.setBackground(new java.awt.Color(204, 204, 204));
        btNext.setForeground(new java.awt.Color(0, 0, 102));
        btNext.setText("Next");
        btNext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNextActionPerformed(evt);
            }
        });
        getContentPane().add(btNext);
        btNext.setBounds(440, 440, 90, 22);

        btViewScore.setBackground(new java.awt.Color(204, 204, 204));
        btViewScore.setForeground(new java.awt.Color(0, 0, 102));
        btViewScore.setText("View Score");
        btViewScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btViewScoreActionPerformed(evt);
            }
        });
        getContentPane().add(btViewScore);
        btViewScore.setBounds(350, 510, 120, 30);

        lbCheckAttempt.setText("(Unattempted)");
        getContentPane().add(lbCheckAttempt);
        lbCheckAttempt.setBounds(620, 300, 130, 30);

        btHome.setBackground(new java.awt.Color(204, 204, 204));
        btHome.setForeground(new java.awt.Color(0, 0, 102));
        btHome.setText("Goto Home");
        btHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHomeActionPerformed(evt);
            }
        });
        getContentPane().add(btHome);
        btHome.setBounds(770, 10, 120, 40);

        lbBack.setBackground(new java.awt.Color(0, 0, 0));
        lbBack.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbBack);
        lbBack.setBounds(0, 0, 920, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb2ActionPerformed

    private void rb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb3ActionPerformed

    private void rb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb4ActionPerformed

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb1ActionPerformed

    private void btPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrevActionPerformed
  
        lbA.setOpaque(true);
        lbA.setBackground(Color.white);
        lbB.setOpaque(true);
        lbB.setBackground(Color.white);
        lbC.setOpaque(true);
        lbC.setBackground(Color.white);
        lbD.setOpaque(true);
        lbD.setBackground(Color.white);
        
        if(current>0) {
            --current;
            loadQuestion(indArr[current]);
        }
        if(current==0) {
            btPrev.setEnabled(false);
        }
        btNext.setEnabled(true);
    }//GEN-LAST:event_btPrevActionPerformed

    private void btNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNextActionPerformed
               
        lbA.setOpaque(true);
        lbA.setBackground(Color.white);
        lbB.setOpaque(true);
        lbB.setBackground(Color.white);
        lbC.setOpaque(true);
        lbC.setBackground(Color.white);
        lbD.setOpaque(true);
        lbD.setBackground(Color.white);
        
        if(current<14) {
            ++current;
            loadQuestion(indArr[current]);
        }
        
        if(current==14) {
            btNext.setEnabled(false);
        }
        btPrev.setEnabled(true);
    }//GEN-LAST:event_btNextActionPerformed

    private void btViewScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btViewScoreActionPerformed
        
        Score obj = new Score(indArr);
        dispose();
        obj.setVisible(true);
        
    }//GEN-LAST:event_btViewScoreActionPerformed

    private void btHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHomeActionPerformed
        
        UserHome obj = new UserHome();
        dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_btHomeActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int arr[]={0,2};
                new Result(arr).setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btGroup;
    private javax.swing.JButton btHome;
    private javax.swing.JButton btNext;
    private javax.swing.JButton btPrev;
    private javax.swing.JButton btViewScore;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lbA;
    private javax.swing.JLabel lbB;
    private javax.swing.JLabel lbBack;
    private javax.swing.JLabel lbC;
    private javax.swing.JLabel lbCheckAttempt;
    private javax.swing.JLabel lbD;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JRadioButton rb4;
    private javax.swing.JTextArea ta;
    // End of variables declaration//GEN-END:variables

}
