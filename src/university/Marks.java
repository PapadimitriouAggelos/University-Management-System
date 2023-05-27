package university;

import java.sql.ResultSet;

public class Marks extends javax.swing.JFrame 
{

    String rollno;
    
    //constructor
    public Marks(String rollno)
    {
        this.rollno=rollno;

        initComponents();
       
        
        setLocation(200,150);
        
        try
        {
            Conn con= new Conn();
            ResultSet rs1=con.s.executeQuery("select * from subject where rollno='"+rollno+"'");
            while(rs1.next())
            {
                lblsub1.setText(rs1.getString("subject1"));
                lblsub2.setText(rs1.getString("subject2"));
                lblsub3.setText(rs1.getString("subject3"));
                lblsub4.setText(rs1.getString("subject4"));
                lblsub5.setText(rs1.getString("subject5"));
            }
            
           ResultSet rs2=con.s.executeQuery("select * from marks where rollno='"+rollno+"'");
            while(rs2.next())
            {
                lblsub1.setText(lblsub1.getText()+"--------"+rs2.getString("marks1"));
                lblsub2.setText(lblsub2.getText()+"--------"+rs2.getString("marks2"));
                lblsub3.setText(lblsub3.getText()+"--------"+rs2.getString("marks3"));
                lblsub4.setText(lblsub4.getText()+"--------"+rs2.getString("marks4"));
                lblsub5.setText(lblsub5.getText()+"--------"+rs2.getString("marks5"));
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
        
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbluniversity = new javax.swing.JLabel();
        lblresultofexamination2023 = new javax.swing.JLabel();
        lblrollnumber = new javax.swing.JLabel();
        lblsub1 = new javax.swing.JLabel();
        lblsub2 = new javax.swing.JLabel();
        lblsub3 = new javax.swing.JLabel();
        lblsub4 = new javax.swing.JLabel();
        lblsub5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Marks");

        lbluniversity.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lbluniversity.setText("University");

        lblresultofexamination2023.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblresultofexamination2023.setText("Result of Examination 2023");

        lblrollnumber.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblrollnumber.setText("Roll Number "+rollno);

        lblsub1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        lblsub2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        lblsub3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        lblsub4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        lblsub5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(lbluniversity))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(lblresultofexamination2023))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblrollnumber))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblsub1, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                            .addComponent(lblsub2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblsub3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblsub4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblsub5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lbluniversity)
                .addGap(18, 18, 18)
                .addComponent(lblresultofexamination2023)
                .addGap(48, 48, 48)
                .addComponent(lblrollnumber)
                .addGap(51, 51, 51)
                .addComponent(lblsub1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblsub2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblsub3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblsub4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblsub5, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(300, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Marks("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblresultofexamination2023;
    private javax.swing.JLabel lblrollnumber;
    private javax.swing.JLabel lblsub1;
    private javax.swing.JLabel lblsub2;
    private javax.swing.JLabel lblsub3;
    private javax.swing.JLabel lblsub4;
    private javax.swing.JLabel lblsub5;
    private javax.swing.JLabel lbluniversity;
    // End of variables declaration//GEN-END:variables
}
