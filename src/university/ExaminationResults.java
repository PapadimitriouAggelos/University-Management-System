package university;

import java.awt.Choice;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class ExaminationResults extends javax.swing.JFrame 
{
    
    Choice crollno;
    

    //constructor
    public ExaminationResults() 
    {
        initComponents();
        
        setLocation(200,150);
        
        JTable table=new JTable();
        table.setFont(new Font("Tahoma", Font.PLAIN, 16));
        
        JScrollPane jsp=new JScrollPane(table);
        jsp.setBounds(0, 130, 1000, 300);
        add(jsp);
        
        try
        {
            Conn con=new Conn();
            ResultSet rs= con.s.executeQuery("select * from student");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me)
            {
                int row=table.getSelectedRow();
                tfsearch.setText(table.getModel().getValueAt(row, 2).toString());
            }
        });
        
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblcheckresult = new javax.swing.JLabel();
        tfsearch = new javax.swing.JTextField();
        btresult = new javax.swing.JButton();
        btcancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Examination Results");

        lblcheckresult.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblcheckresult.setText("Check Result");

        btresult.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btresult.setText("Result");
        btresult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btresultActionPerformed(evt);
            }
        });

        btcancel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btcancel.setText("Cancel");
        btcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcheckresult)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btresult, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(407, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblcheckresult)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btresult)
                    .addComponent(btcancel))
                .addContainerGap(387, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelActionPerformed
        // Cancel button code
        setVisible(false);
    }//GEN-LAST:event_btcancelActionPerformed

    private void btresultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btresultActionPerformed
        // Result button code
        setVisible(false);
        new Marks(tfsearch.getText());
    }//GEN-LAST:event_btresultActionPerformed

    
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new ExaminationResults().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcancel;
    private javax.swing.JButton btresult;
    private javax.swing.JLabel lblcheckresult;
    private javax.swing.JTextField tfsearch;
    // End of variables declaration//GEN-END:variables
}
