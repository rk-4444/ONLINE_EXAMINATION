
package online_examination;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;
import javax.swing.ImageIcon;


public class StartTest extends javax.swing.JFrame {
    
    void go() {
        try {
            HttpResponse<String> res = Unirest.get("http://localhost:8000/getAllCategories").asString();
            
            if(res.getStatus()==200) {
                String ans = res.getBody();
                StringTokenizer st = new StringTokenizer(ans,"#");
                int n = st.countTokens();
                CategoryDesign arr[] = new CategoryDesign[n];
                int x = 10, y = 10, k = 0, i=0;
                
                while(st.hasMoreTokens()) {
                    k++;
                    
                    String row = st.nextToken();
                    StringTokenizer st1 = new StringTokenizer(row, "~");
                    String name = st1.nextToken();
                    String desc = st1.nextToken();
                    String photo = st1.nextToken();
                                        
                    arr[i] = new CategoryDesign();
                    arr[i].bt1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent ae) {
                            Instructions obj = new Instructions(name);
                            dispose();
                            obj.setVisible(true);
                        }                       
                    });
                    
                    ImageIcon img = new ImageIcon(photo);
                    Image im = img.getImage().getScaledInstance(arr[i].lbBack.getWidth(), arr[i].lbBack.getHeight(), Image.SCALE_SMOOTH );
                    ImageIcon icon = new ImageIcon(im);
                    
                    arr[i].lbBack.setIcon(icon);
                    arr[i].lb2.setText(name);
                    arr[i].setBounds(x,y,210,300);
                    
                    mainPanel.add(arr[i]);
                    x+=225;
                    repaint();
                    mainPanel.repaint();
                    arr[i].repaint();
                    ++i;
                }
                mainPanel.setPreferredSize(new Dimension(225 * k, 300));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public StartTest() {
        initComponents();
        setSize(800,600);
        setLocationRelativeTo(null);
        ImageIcon i1 = new ImageIcon("src/pictures/userLogin.jpg");
        Image img = i1.getImage().getScaledInstance(lbBack.getWidth(), lbBack.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i2 = new ImageIcon(img);
        lbBack.setIcon(i2);
        go();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb1 = new javax.swing.JLabel();
        jsp1 = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();
        btBack = new javax.swing.JButton();
        lbBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lb1.setFont(new java.awt.Font("Liberation Sans", 3, 36)); // NOI18N
        lb1.setForeground(new java.awt.Color(255, 255, 255));
        lb1.setText("Select Categories");
        getContentPane().add(lb1);
        lb1.setBounds(250, 10, 350, 50);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
        );

        jsp1.setViewportView(mainPanel);

        getContentPane().add(jsp1);
        jsp1.setBounds(100, 100, 620, 340);

        btBack.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        btBack.setText("Back");
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });
        getContentPane().add(btBack);
        btBack.setBounds(10, 10, 80, 30);
        getContentPane().add(lbBack);
        lbBack.setBounds(0, 0, 800, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        
        UserHome obj = new UserHome();
        dispose();
        obj.setVisible(true);
    }//GEN-LAST:event_btBackActionPerformed


    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JScrollPane jsp1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lbBack;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
