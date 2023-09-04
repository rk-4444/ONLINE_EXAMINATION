
package online_examination;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import java.awt.Image;
import java.util.StringTokenizer;
import javax.swing.ImageIcon;

public class Instructions extends javax.swing.JFrame {

    
    void go(String catname) {
        try {
            HttpResponse<String> res = Unirest.get("http://localhost:8000/getQuestions")
                                                        .queryString("catname", catname)
                                                        .asString();
            
            if(res.getStatus()==200) {
                Global.selectedCat = catname;
                String ans = res.getBody();
                StringTokenizer st = new StringTokenizer(ans,"#");
                Global.al.clear();
                while(st.hasMoreTokens()) {
                    String s = st.nextToken();
                    StringTokenizer row = new StringTokenizer(s,"~");
                    String x = row.nextToken();
                    int id= Integer.parseInt(x);
                    String ques = row.nextToken();
                    String optA = row.nextToken();
                    String optB = row.nextToken();
                    String optC = row.nextToken();
                    String optD = row.nextToken();
                    String corrOpt = row.nextToken();
                    Global.al.add(new Question(id, ques, optA, optB, optC, optD, corrOpt));
                }
            }
            tf1.setText("1. Read all the questions Successfull.\n" + 
                    "2. Read the questions carefully once twice & then again to make sure you know what you are being asked to do.\n" + 
                    "\n" +
                    "Common mistakes to avoid:\n" +
                    "1. Not basing each question on a student learning outcome.\n" + 
                    "2. Only testing recall of facts, not higher- level thinking\n" + 
                    "3. Not highlighting important words\n" + "4. Not using the active voice.\n");
            tf1.setEditable(false);
                    
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Instructions(String catname) {
        initComponents();
        setSize(800,600);
        go(catname);
        setLocationRelativeTo(null);
        ImageIcon i1 = new ImageIcon("src/pictures/userSignup.jpg");
        Image img = i1.getImage().getScaledInstance(lbBack.getWidth(), lbBack.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i2 = new ImageIcon(img);
        lbBack.setIcon(i2);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb1 = new javax.swing.JLabel();
        bt = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tf1 = new javax.swing.JTextArea();
        lbBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lb1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lb1.setForeground(new java.awt.Color(0, 51, 51));
        lb1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb1.setText("Instructions");
        getContentPane().add(lb1);
        lb1.setBounds(220, 10, 330, 60);

        bt.setBackground(new java.awt.Color(0, 255, 204));
        bt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt.setForeground(new java.awt.Color(0, 51, 51));
        bt.setText("Start Test");
        bt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActionPerformed(evt);
            }
        });
        getContentPane().add(bt);
        bt.setBounds(320, 450, 100, 40);

        tf1.setColumns(20);
        tf1.setRows(5);
        tf1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane2.setViewportView(tf1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(150, 100, 490, 270);
        getContentPane().add(lbBack);
        lbBack.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActionPerformed
        
       Test obj = new Test();
        dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_btActionPerformed
  
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Instructions("abc").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lbBack;
    private javax.swing.JTextArea tf1;
    // End of variables declaration//GEN-END:variables
}
