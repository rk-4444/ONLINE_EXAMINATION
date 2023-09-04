package online_examination;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Test extends javax.swing.JFrame {
    
    Thread t1 = new Thread(new time());
    int current = 0;
    int indArr[] = new int[15];
    
    void isSubmitted() {       
        if(!Global.al.get(indArr[current]).userAns.equals("")) {
                rb1.setEnabled(false);
                rb2.setEnabled(false);
                rb3.setEnabled(false);
                rb4.setEnabled(false);
                btSubmit.setEnabled(false);
        }
        else {
            rb1.setEnabled(true);
            rb2.setEnabled(true);
            rb3.setEnabled(true);
            rb4.setEnabled(true);
            btSubmit.setEnabled(true);
        }
    }
    
    void loadQuestion(int qNo) {
        lb4.setText((current+1)+"");
        
        ta.setText(Global.al.get(qNo).ques);
        lbA.setText(Global.al.get(qNo).optionA);
        lbB.setText(Global.al.get(qNo).optionB);
        lbC.setText(Global.al.get(qNo).optionC);
        lbD.setText(Global.al.get(qNo).optionD);
        
            
    }
    
    void go() {
        int x=10,y=10;
        JButton arr[] = new JButton[15];
        
        for(int i=0;i<arr.length;++i) {
            arr[i] = new JButton((i+1)+"");
            arr[i].setBounds(x, y, 40, 40);
            jp1.add(arr[i]);
            x+=50;
            jp1.repaint();
            int k=i;
            arr[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    current=k;
                    isSubmitted();
                    if(k>0) btPrev.setEnabled(true);
                    if(k==0) btPrev.setEnabled(false);
                    if(k<14) btNext.setEnabled(true);     
                    if(k==14) btNext.setEnabled(false);
                    loadQuestion(indArr[current]);
                }
            });
        }
        
        int sz = Global.al.size();
        System.out.println(sz);
        int ind = (int)  (Math.random()*1000);
        try {
            ind = ind%sz;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Division by zero error");
        }
        
        int i=0,l=ind,r=ind+1;
        while(i<15) {
            if(l>=0) {
                indArr[i] = l;
                --l;
                ++i;
            }
            if(i<15 && r < sz) {
                indArr[i] = r;
                ++r;
                ++i;
            }
            
        }
    }
    
    public Test() {
        initComponents();
        setSize(920,600);
        setVisible(true);
        ta.setEditable(false);
        
        setLocationRelativeTo(null);
        ImageIcon i1 = new ImageIcon("src/pictures/userSignup.jpg");
        Image img = i1.getImage().getScaledInstance(lbBack.getWidth(), lbBack.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i2 = new ImageIcon(img);
        lbBack.setIcon(i2);
        
        t1.start();
        go();
        
        btPrev.setEnabled(false);
        loadQuestion(indArr[current]);
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btGroup = new javax.swing.ButtonGroup();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        btSubmit = new javax.swing.JButton();
        rb2 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        rb4 = new javax.swing.JRadioButton();
        rb1 = new javax.swing.JRadioButton();
        lbB = new javax.swing.JLabel();
        lbC = new javax.swing.JLabel();
        lbD = new javax.swing.JLabel();
        lbA = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jp1 = new javax.swing.JPanel();
        btPrev = new javax.swing.JButton();
        btNext = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lbBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lb1.setFont(new java.awt.Font("Liberation Sans", 3, 18)); // NOI18N
        lb1.setText("Test Ends in:");
        getContentPane().add(lb1);
        lb1.setBounds(20, 10, 130, 40);

        lb2.setBackground(new java.awt.Color(255, 204, 51));
        lb2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lb2.setForeground(new java.awt.Color(255, 0, 0));
        lb2.setText("time");
        getContentPane().add(lb2);
        lb2.setBounds(160, 10, 100, 40);

        lb3.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lb3.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(lb3);
        lb3.setBounds(330, 60, 190, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Test");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(370, 10, 240, 40);

        lb4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lb4);
        lb4.setBounds(140, 130, 30, 30);

        ta.setColumns(20);
        ta.setRows(5);
        jScrollPane1.setViewportView(ta);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(250, 110, 370, 70);

        btSubmit.setBackground(new java.awt.Color(216, 168, 75));
        btSubmit.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btSubmit.setText("Submit");
        btSubmit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubmitActionPerformed(evt);
            }
        });
        getContentPane().add(btSubmit);
        btSubmit.setBounds(350, 510, 140, 40);

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
        rb2.setBounds(120, 260, 100, 19);

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
        rb3.setBounds(120, 300, 100, 19);

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
        rb4.setBounds(120, 340, 100, 19);

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
        rb1.setBounds(120, 220, 100, 19);

        lbB.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(lbB);
        lbB.setBounds(290, 260, 220, 20);

        lbC.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(lbC);
        lbC.setBounds(290, 300, 220, 20);

        lbD.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(lbD);
        lbD.setBounds(290, 340, 220, 20);

        lbA.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(lbA);
        lbA.setBounds(290, 220, 220, 20);

        jp1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane2.setViewportView(jp1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(270, 390, 360, 60);

        btPrev.setBackground(new java.awt.Color(216, 168, 75));
        btPrev.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btPrev.setText("Previous");
        btPrev.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrevActionPerformed(evt);
            }
        });
        getContentPane().add(btPrev);
        btPrev.setBounds(90, 410, 120, 30);

        btNext.setBackground(new java.awt.Color(216, 168, 75));
        btNext.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        btNext.setText("Next");
        btNext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNextActionPerformed(evt);
            }
        });
        getContentPane().add(btNext);
        btNext.setBounds(670, 410, 90, 30);

        jButton3.setBackground(new java.awt.Color(216, 168, 75));
        jButton3.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jButton3.setText("End Test");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(750, 510, 120, 40);
        getContentPane().add(lbBack);
        lbBack.setBounds(0, 0, 920, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubmitActionPerformed
            
        if(rb1.isSelected()) {
            Global.al.get(indArr[current]).userAns = rb1.getText();

        }
        else if(rb2.isSelected()) {
            Global.al.get(indArr[current]).userAns = rb2.getText();
        }
        else if(rb3.isSelected()) {
            Global.al.get(indArr[current]).userAns = rb3.getText();
        }
        else if(rb4.isSelected()) {
            Global.al.get(indArr[current]).userAns = rb4.getText();
        }
        rb1.setEnabled(false);
        rb2.setEnabled(false);
        rb3.setEnabled(false);
        rb4.setEnabled(false);
        btSubmit.setEnabled(false);
    }//GEN-LAST:event_btSubmitActionPerformed

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
  
        if(current>0) {
            --current;
            isSubmitted();
            loadQuestion(indArr[current]);
        }
        if(current==0) {
            isSubmitted();
            btPrev.setEnabled(false);
        }
        btNext.setEnabled(true);
    }//GEN-LAST:event_btPrevActionPerformed

    private void btNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNextActionPerformed
               
        if(current<14) {
            ++current;
            isSubmitted();
            loadQuestion(indArr[current]);
        }
        
        if(current==14) {
            isSubmitted();
            btNext.setEnabled(false);
        }
        btPrev.setEnabled(true);
    }//GEN-LAST:event_btNextActionPerformed

    void openResult() {
        JOptionPane.showMessageDialog(this, "Test Ended");
        Result obj = new Result(indArr);
        dispose();
        obj.setVisible(true);
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        t1.stop();
        openResult();
    }//GEN-LAST:event_jButton3ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btGroup;
    private javax.swing.JButton btNext;
    private javax.swing.JButton btPrev;
    private javax.swing.JButton btSubmit;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jp1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lbA;
    private javax.swing.JLabel lbB;
    private javax.swing.JLabel lbBack;
    private javax.swing.JLabel lbC;
    private javax.swing.JLabel lbD;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JRadioButton rb4;
    private javax.swing.JTextArea ta;
    // End of variables declaration//GEN-END:variables

    
    class time implements Runnable{
        @Override
        public void run() {
            int min = 3, sec = 45;
            try {
                
                while(true){
                    if(min == 0 && sec == 0){
                        lb3.setText("...Times Up...");
                        openResult();
                        break;
                    }
                    else if(sec == 0){                      
                        min--;
                        sec = 59;
                    }
                    else if(min==0 && sec<=20){
                        if(sec%2==0) lb3.setText("Hurry few seconds left...");
                        else lb3.setText("");
                    }
                    sec--;
                    Thread.sleep(1000);
                    lb2.setText(min +" : " + sec);   
                }
                     
            } 
 
            catch (Exception e) {
                e.printStackTrace();
            }
            
        }
    }
}
