
package online_examination;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;

public class ViewResult extends javax.swing.JFrame {
    
    ArrayList<result> al = new ArrayList<>();
    tablemodel tm ;
    
    void go() {
        
        try {
            HttpResponse<String> res = Unirest.get("http://localhost:8000/viewResult")
                                        .queryString("user", Global.userName)
                                        .asString();
            
            if(res.getStatus()==200) {
                String ans = res.getBody();
                StringTokenizer st = new StringTokenizer(ans,"#");
                al.clear();
                while(st.hasMoreTokens()) {
                    String s = st.nextToken();
                    StringTokenizer singleSt = new StringTokenizer(s,"~");
                    
                    String name = singleSt.nextToken();
                    String x = singleSt.nextToken();
                    int tMarks = Integer.parseInt(x);
                    x = singleSt.nextToken();
                    int oMarks = Integer.parseInt(x);
                    String dt = singleSt.nextToken();
                    
                    al.add(new result(name, oMarks, tMarks, dt));
                }
                
                
                Collections.sort(al, new Comparator<result>() {
                    @Override
                    public int compare(result t, result t1) {
                        return (t1.oMarks-t.oMarks);
                    }  
                });
                for(int i=0;i<al.size();++i) {
                    System.out.println(al.get(i).oMarks);
                }
                
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ViewResult() {
        initComponents();
        tm = new tablemodel();
        setSize(800,600);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jt = new javax.swing.JTable();
        lb1 = new javax.swing.JLabel();
        btBack = new javax.swing.JButton();
        lbBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

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
        jScrollPane1.setViewportView(jt);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(120, 140, 580, 350);

        lb1.setFont(new java.awt.Font("Liberation Sans Narrow", 3, 36)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 255, 255));
        lb1.setText("Your Result");
        getContentPane().add(lb1);
        lb1.setBounds(330, 30, 210, 50);

        btBack.setText("Back");
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });
        getContentPane().add(btBack);
        btBack.setBounds(10, 10, 80, 30);
        getContentPane().add(lbBack);
        lbBack.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        
        UserHome obj = new UserHome();
        dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_btBackActionPerformed

//    public static void main(String args[]) {
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ViewResult().setVisible(true);
//            }
//        });
//    }
    
    class tablemodel extends AbstractTableModel {

        @Override
        public int getRowCount() {
            return al.size();
        }

        @Override
        public int getColumnCount() {
            return 4;
        }

        @Override
        public Object getValueAt(int i, int j) {
            result obj = al.get(i);
            
            if(j==0) {
                return al.get(i).catname;
            }
            else if(j==1) {
                return al.get(i).oMarks;
            }
            else if(j==2) {
                return al.get(i).tMarks;
            }
            else {
                return al.get(i).dateTime;
            }           
        }
        public String getColumnName(int i) {
            String []arr = {"Category","Obtained Marks","Total Marks","Date/Time"};
            return arr[i];
        }
        
    }

    class result {
        String catname,dateTime;
        int tMarks,oMarks;
        result(String name,int omarks,int tmarks,String dt) {
            catname = name;
            tMarks = tmarks;
            oMarks = omarks;
            dateTime = dt;
        }
        
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Global.userName = "ik@gmail.com";
                new ViewResult().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jt;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lbBack;
    // End of variables declaration//GEN-END:variables
}
