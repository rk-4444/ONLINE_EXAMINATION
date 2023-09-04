
package online_examination;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public class ManageCategories extends javax.swing.JFrame {
    
    ArrayList<Categories> al = new ArrayList<>();
    tableModel tm;
    JFileChooser jfc;
    String path;
 
    public ManageCategories() {
        initComponents();
        setSize(1000,550);
        setResizable(false);
        setLocationRelativeTo(null);
        ImageIcon i1 = new ImageIcon("src/pictures/mngCat.jpeg");
        Image img = i1.getImage().getScaledInstance(lbBack.getWidth(), lbBack.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i2 = new ImageIcon(img);
        lbBack.setIcon(i2);
        tm = new tableModel();
        jt.setModel(tm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        lb4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tfa = new javax.swing.JTextArea();
        lb5 = new javax.swing.JLabel();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt = new javax.swing.JTable();
        btBack = new javax.swing.JButton();
        lbBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lb1.setFont(new java.awt.Font("Liberation Sans Narrow", 1, 36)); // NOI18N
        lb1.setForeground(new java.awt.Color(102, 255, 255));
        lb1.setText("  Manage   Categories");
        getContentPane().add(lb1);
        lb1.setBounds(300, 0, 310, 60);

        lb2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lb2.setForeground(new java.awt.Color(102, 255, 255));
        lb2.setText("Add Category");
        getContentPane().add(lb2);
        lb2.setBounds(130, 60, 150, 30);

        lb3.setForeground(new java.awt.Color(102, 255, 255));
        lb3.setText("Category Name");
        getContentPane().add(lb3);
        lb3.setBounds(40, 120, 130, 30);

        tf1.setBackground(new java.awt.Color(0, 0, 0));
        tf1.setForeground(new java.awt.Color(51, 255, 255));
        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });
        getContentPane().add(tf1);
        tf1.setBounds(160, 120, 210, 40);

        lb4.setForeground(new java.awt.Color(102, 255, 255));
        lb4.setText("Description");
        getContentPane().add(lb4);
        lb4.setBounds(40, 190, 100, 30);

        tfa.setBackground(new java.awt.Color(0, 0, 0));
        tfa.setColumns(20);
        tfa.setForeground(new java.awt.Color(51, 255, 255));
        tfa.setRows(5);
        jScrollPane1.setViewportView(tfa);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(160, 170, 250, 80);

        lb5.setForeground(new java.awt.Color(102, 255, 255));
        lb5.setText("Image");
        getContentPane().add(lb5);
        lb5.setBounds(40, 300, 110, 60);

        bt1.setBackground(new java.awt.Color(0, 0, 0));
        bt1.setForeground(new java.awt.Color(51, 255, 255));
        bt1.setText("Choose Image");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        getContentPane().add(bt1);
        bt1.setBounds(170, 310, 180, 30);

        bt2.setBackground(new java.awt.Color(0, 0, 0));
        bt2.setForeground(new java.awt.Color(51, 255, 255));
        bt2.setText("Submit");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        getContentPane().add(bt2);
        bt2.setBounds(150, 380, 100, 40);

        bt3.setBackground(new java.awt.Color(0, 0, 0));
        bt3.setForeground(new java.awt.Color(51, 255, 255));
        bt3.setText("View Categories");
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });
        getContentPane().add(bt3);
        bt3.setBounds(630, 50, 150, 40);

        jt.setBackground(new java.awt.Color(0, 0, 0));
        jt.setForeground(new java.awt.Color(51, 255, 255));
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
        jScrollPane2.setBounds(460, 100, 452, 330);

        btBack.setBackground(new java.awt.Color(0, 0, 0));
        btBack.setForeground(new java.awt.Color(51, 255, 255));
        btBack.setText("Back");
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });
        getContentPane().add(btBack);
        btBack.setBounds(10, 10, 72, 24);

        lbBack.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(lbBack);
        lbBack.setBounds(0, 0, 1000, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf1ActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        
        jfc = new JFileChooser();
        jfc.showOpenDialog(null);
        if(jfc.getSelectedFile()!=null) {
            File f = jfc.getSelectedFile();
            path = f.getPath();

            ImageIcon img = new ImageIcon(path);
            Image im = img.getImage().getScaledInstance(lb5.getHeight(), lb5.getWidth(), Image.SCALE_SMOOTH );
            ImageIcon icon=new ImageIcon(im);
            lb5.setIcon(icon);
        }
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        
        try {
            String catname = tf1.getText();
            String desc = tfa.getText();
            if(catname.equals("") || desc.equals("") || path.equals("")) {
                JOptionPane.showMessageDialog(this, "Fill all the Fields");
            }
            else {
                HttpResponse<String> res = Unirest.post("http://localhost:8000/addCategory")
                                            .queryString("catname",catname)
                                            .queryString("desc",desc)
                                            .field("path", new File(path))
                                            .asString();

                if(res.getStatus()==200) {
                    JOptionPane.showMessageDialog(this, res.getBody());
                    tf1.setText("");
                    tfa.setText("");
                    lb5.setIcon(null);
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

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        try {
            HttpResponse<String> res = Unirest.get("http://localhost:8000/getAllCategories").asString();
            
            if(res.getStatus()==200) {
                String ans = res.getBody();
                StringTokenizer st = new StringTokenizer(ans,"#");
                
                al.clear();
                while(st.hasMoreTokens()) {
                    String s= st.nextToken();
                    StringTokenizer singleSt = new StringTokenizer(s,"~");
                    
                    String catname = singleSt.nextToken();
                    String desc = singleSt.nextToken();
                    String imgPath = singleSt.nextToken();
                    
                    al.add(new Categories(catname, desc, imgPath));
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
    }//GEN-LAST:event_bt3ActionPerformed

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        AdminHome obj = new AdminHome();
        dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_btBackActionPerformed

    class Categories {
        String catname,desc,imgPath;
        Categories(String name, String des, String path) {
            catname=name;
            desc=des;
            imgPath=path;
        }
        
    }
    
    class tableModel extends AbstractTableModel
    {

        @Override
        public int getRowCount() {
            return al.size();
        }

        @Override
        public int getColumnCount() {
            return 3;
        }

        @Override
        public Object getValueAt(int i, int j) {
            Categories obj = al.get(i);
            if(j==0) {
                return obj.catname;
            }
            else if(j==1) {
                return obj.desc;
            }
            else {
                return obj.imgPath;
            }
        }
        
        @Override
        public String getColumnName(int i) {
            String arr[] = {"Category", "Description", "ImgPath"};
            return arr[i];
        }
        
    }    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageCategories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageCategories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageCategories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageCategories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageCategories().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton btBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jt;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lbBack;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextArea tfa;
    // End of variables declaration//GEN-END:variables
}
