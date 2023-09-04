package online_examination;

public class CategoryDesign extends javax.swing.JPanel {

    public CategoryDesign() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb2 = new javax.swing.JLabel();
        bt1 = new javax.swing.JButton();
        lbBack = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(null);

        lb2.setBackground(new java.awt.Color(0, 0, 0));
        lb2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb2.setForeground(new java.awt.Color(255, 255, 255));
        lb2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb2.setText("name");
        add(lb2);
        lb2.setBounds(0, 0, 210, 30);

        bt1.setBackground(new java.awt.Color(51, 255, 255));
        bt1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bt1.setForeground(new java.awt.Color(0, 51, 255));
        bt1.setText("Go");
        bt1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        add(bt1);
        bt1.setBounds(50, 260, 100, 30);
        add(lbBack);
        lbBack.setBounds(0, 30, 210, 270);
    }// </editor-fold>//GEN-END:initComponents

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed

    }//GEN-LAST:event_bt1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton bt1;
    public javax.swing.JLabel lb2;
    public javax.swing.JLabel lbBack;
    // End of variables declaration//GEN-END:variables
}
