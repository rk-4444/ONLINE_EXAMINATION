
package online_examination;

import com.mashape.unirest.http.*;
import java.awt.Image;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;


public class ManageQuestions extends javax.swing.JFrame {
    
    ArrayList<Question> al= new ArrayList<>();
    myTableModel tm;
    
    void go() {
        try {
            HttpResponse<String> res = Unirest.get("http://localhost:8000/getCategoriesNames").asString();
            
            if(res.getStatus()==200) {
                String ans=res.getBody();
                StringTokenizer st = new StringTokenizer(ans,"~");
                StringTokenizer st1 = new StringTokenizer(ans,"~");
                cb1.removeAllItems();
                cb2.removeAllItems();
                int n=st.countTokens();
                int n1=n;
                
                while(n>0) {
                    cb1.addItem(st.nextToken());
                    --n;
                }
                
                while(n1>0) {
                    cb2.addItem(st1.nextToken());
                    --n1;
                }
                
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ManageQuestions() {
        initComponents();
        tm=new myTableModel();
        setSize(1000, 550);
        setResizable(false);
        setLocationRelativeTo(null);
        ImageIcon i1 = new ImageIcon("src/pictures/mngQues.jpg");
        Image img = i1.getImage().getScaledInstance(lbBack.getWidth(), lbBack.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i2 = new ImageIcon(img);
        lbBack.setIcon(i2);
        
        go();
        jt.setModel(tm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();
        lb4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        lb9 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        tf3 = new javax.swing.JTextField();
        tf4 = new javax.swing.JTextField();
        tf5 = new javax.swing.JTextField();
        lb5 = new javax.swing.JLabel();
        lb6 = new javax.swing.JLabel();
        lb7 = new javax.swing.JLabel();
        lb8 = new javax.swing.JLabel();
        bt1 = new javax.swing.JButton();
        cb2 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt = new javax.swing.JTable();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        btBack = new javax.swing.JButton();
        lbBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lb1.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 24)); // NOI18N
        lb1.setForeground(new java.awt.Color(204, 204, 255));
        lb1.setText("    Manage  Questions");
        getContentPane().add(lb1);
        lb1.setBounds(280, 0, 210, 40);

        lb2.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        lb2.setForeground(new java.awt.Color(204, 204, 255));
        lb2.setText("Add Questions");
        getContentPane().add(lb2);
        lb2.setBounds(100, 40, 110, 30);

        lb3.setForeground(new java.awt.Color(255, 255, 255));
        lb3.setText("Cetegory");
        getContentPane().add(lb3);
        lb3.setBounds(20, 90, 90, 30);

        cb1.setBackground(new java.awt.Color(0, 0, 0));
        cb1.setForeground(new java.awt.Color(204, 204, 255));
        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cb1);
        cb1.setBounds(160, 90, 120, 30);

        lb4.setForeground(new java.awt.Color(255, 255, 255));
        lb4.setText("Question");
        getContentPane().add(lb4);
        lb4.setBounds(20, 140, 80, 30);

        ta.setBackground(new java.awt.Color(0, 0, 0));
        ta.setColumns(20);
        ta.setForeground(new java.awt.Color(255, 255, 255));
        ta.setRows(5);
        jScrollPane1.setViewportView(ta);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(160, 140, 170, 60);

        lb9.setForeground(new java.awt.Color(51, 255, 51));
        lb9.setText("Correct Option");
        getContentPane().add(lb9);
        lb9.setBounds(20, 380, 110, 30);

        tf1.setBackground(new java.awt.Color(0, 0, 0));
        tf1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(tf1);
        tf1.setBounds(160, 220, 180, 30);

        tf2.setBackground(new java.awt.Color(0, 0, 0));
        tf2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(tf2);
        tf2.setBounds(160, 260, 180, 30);

        tf3.setBackground(new java.awt.Color(0, 0, 0));
        tf3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(tf3);
        tf3.setBounds(160, 300, 180, 30);

        tf4.setBackground(new java.awt.Color(0, 0, 0));
        tf4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(tf4);
        tf4.setBounds(160, 340, 180, 30);

        tf5.setBackground(new java.awt.Color(0, 0, 0));
        tf5.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(tf5);
        tf5.setBounds(160, 380, 180, 30);

        lb5.setForeground(new java.awt.Color(255, 255, 255));
        lb5.setText("Option A");
        getContentPane().add(lb5);
        lb5.setBounds(20, 220, 80, 30);

        lb6.setForeground(new java.awt.Color(255, 255, 255));
        lb6.setText("Option B");
        getContentPane().add(lb6);
        lb6.setBounds(20, 260, 80, 30);

        lb7.setForeground(new java.awt.Color(255, 255, 255));
        lb7.setText("Option C");
        getContentPane().add(lb7);
        lb7.setBounds(20, 300, 80, 30);

        lb8.setForeground(new java.awt.Color(255, 255, 255));
        lb8.setText("Option D");
        getContentPane().add(lb8);
        lb8.setBounds(20, 340, 80, 30);

        bt1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        bt1.setForeground(new java.awt.Color(0, 0, 255));
        bt1.setText("Submit");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1);
        bt1.setBounds(120, 450, 90, 30);

        cb2.setBackground(new java.awt.Color(0, 0, 0));
        cb2.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        cb2.setForeground(new java.awt.Color(204, 204, 255));
        cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });
        getContentPane().add(cb2);
        cb2.setBounds(690, 40, 130, 30);

        jt.setBackground(new java.awt.Color(0, 0, 0));
        jt.setForeground(new java.awt.Color(255, 255, 255));
        jt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jt);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(452, 80, 520, 370);

        bt2.setBackground(new java.awt.Color(0, 0, 0));
        bt2.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        bt2.setForeground(new java.awt.Color(204, 204, 255));
        bt2.setText("View");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        getContentPane().add(bt2);
        bt2.setBounds(850, 40, 72, 24);

        bt3.setBackground(new java.awt.Color(0, 0, 0));
        bt3.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        bt3.setForeground(new java.awt.Color(204, 204, 255));
        bt3.setText("Delete");
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });
        getContentPane().add(bt3);
        bt3.setBounds(500, 40, 83, 24);

        btBack.setBackground(new java.awt.Color(0, 0, 0));
        btBack.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        btBack.setForeground(new java.awt.Color(204, 204, 255));
        btBack.setText("Back");
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });
        getContentPane().add(btBack);
        btBack.setBounds(10, 10, 80, 24);
        getContentPane().add(lbBack);
        lbBack.setBounds(0, 0, 1000, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        String catname=(String) cb1.getSelectedItem();
        String quest = ta.getText();
        String optA = tf1.getText();
        String optB = tf2.getText();
        String optC = tf3.getText();
        String optD = tf4.getText();
        String correctOpt = tf5.getText();
        
        if(quest.equals("") || optA.equals("") || optB.equals("") || optC.equals("") || optD.equals("") || correctOpt.equals("")) {
            JOptionPane.showMessageDialog(this, "All Fields are Mandatory");
        }
        else {
            try {
                HttpResponse<String> res = Unirest.get("http://localhost:8000/addQuestion")
                                            .queryString("catname", catname)
                                            .queryString("quest", quest)
                                            .queryString("optA", optA)
                                            .queryString("optB", optB)
                                            .queryString("optC", optC)
                                            .queryString("optD", optD)
                                            .queryString("corr", correctOpt)
                                            .asString();

                if(res.getStatus()==200) {
                    String ans=res.getBody();
                    JOptionPane.showMessageDialog(this, ans);

                }
                else {
                    JOptionPane.showMessageDialog(this, res.getStatusText());
                }
                ta.setText("");
                tf1.setText("");
                tf2.setText("");
                tf3.setText("");
                tf4.setText("");
                tf5.setText("");
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_bt1ActionPerformed

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb2ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        
        String catname = (String) cb2.getSelectedItem();
        try {
            HttpResponse<String> res = Unirest.get("http://localhost:8000/getQuestions")
                                        .queryString("catname", catname).asString();
            
            if(res.getStatus()==200) {
                String ans=res.getBody();
                StringTokenizer st = new StringTokenizer(ans,"#");
                al.clear();
                while(st.hasMoreTokens()) {
                    String s = st.nextToken();
                    StringTokenizer singleSt = new StringTokenizer(s,"~");
                    
                    String x = singleSt.nextToken();
                    int id = Integer.parseInt(x);
                    System.out.println(id);
                    String quest=singleSt.nextToken();
                    String optA=singleSt.nextToken();
                    String optB=singleSt.nextToken();
                    String optC=singleSt.nextToken();
                    String optD=singleSt.nextToken();
                    String corrOpt=singleSt.nextToken();
                    al.add(new Question(id, quest, optA, optB, optC, optD, corrOpt));
                }
                tm.fireTableDataChanged();
            }
            else {
                JOptionPane.showMessageDialog(this, res.getStatusText());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
    
        int ind = jt.getSelectedRow();
        int id = al.get(ind).ID;
        int a = JOptionPane.showConfirmDialog(this, "Do you want to delete this Question ?", 
                "Delete Confirmation", JOptionPane.YES_NO_OPTION);
        if(a==0) {
            try {
                HttpResponse<String> res = Unirest.get("http://localhost:8000/deleteQuestion")
                                                        .queryString("id", id).asString();

                if(res.getStatus()==200) {
                    String ans= res.getBody();
                    JOptionPane.showMessageDialog(this, ans);
                }
                tm.fireTableDataChanged();
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_bt3ActionPerformed

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        AdminHome obj = new AdminHome();
        dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_btBackActionPerformed

    
    class Question {
        String quest,optA,optB,optC,optD,corrOpt;
        int ID;
        
        Question(int id,String q, String oA, String oB, String oC, String oD, String cOption) {
            ID =id;
            quest=q;
            optA=oA;
            optB=oB;
            optC=oC;
            optD=oD;
            corrOpt=cOption;
        }
    }
    
    class myTableModel extends AbstractTableModel {

        @Override
        public int getRowCount() {
            return al.size();
        }

        @Override
        public int getColumnCount() {
            return 7;
        }

        @Override
        public Object getValueAt(int i, int j) {
            Question obj = al.get(i);
            if(j==0) {
                return obj.ID;
            }
            else if(j==1) {
                return obj.quest;
            }
            if(j==2) {
                return obj.optA;
            }
            if(j==3) {
                return obj.optB;
            }
            if(j==4) {
                return obj.optC;
            }
            if(j==5) {
                return obj.optD;
            }
            else {
                return obj.corrOpt;
            }
        }
        
        @Override
        public String getColumnName(int i) {
            String arr[] = {"ID","Queston","optA","optB","optC","optD","correctOpt"};
            
            return arr[i];
        }
        
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageQuestions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton btBack;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jt;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JLabel lb8;
    private javax.swing.JLabel lb9;
    private javax.swing.JLabel lbBack;
    private javax.swing.JTextArea ta;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf5;
    // End of variables declaration//GEN-END:variables
}
