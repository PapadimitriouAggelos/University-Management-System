package university;

import java.awt.Choice;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

public class TeacherDetails extends javax.swing.JFrame 
{
    Choice crollno;

    //constructor
    public TeacherDetails() 
    {
        initComponents();
        
        crollno=new Choice(); //δημιουργώ ένα αντικείμενο της κλάσης Choice
        crollno.setBounds(220, 51, 170, 20);
        add(crollno);
        
        /*
        Δημιουργώ ένα αντικείμενο con τύπου Conn και ζητάει από την βάση να μου δώσει τα πάντα από το table student
        Στην συνέχεια μέχρι να τελειώσουν οι εγγραφές από την βάση, γεμίζω το crollno με ότι περιέχεται στην στήλη rollno
        */
        try
        {
            Conn con=new Conn();
            ResultSet rs=con.s.executeQuery("select * from teacher");
            
            while(rs.next())
            {
                crollno.add(rs.getString("rollno"));
            }
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
        //νέο try catch έτσι ώστε σε κάθε γραμμή της λίστας να μπει η εγγραφή από την βάση δεδομένων
        try
        {
            Conn c=new Conn();
            ResultSet rs= c.s.executeQuery("select * from teacher");
            tableteacher.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
        
        setLocation(200, 70);
        
        setVisible(true);
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblsearchbyemployee = new javax.swing.JLabel();
        btsearch = new javax.swing.JButton();
        btadd = new javax.swing.JButton();
        btupdate = new javax.swing.JButton();
        btcancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableteacher = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Teacher Details");

        lblsearchbyemployee.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblsearchbyemployee.setText("Search by Employee ID");

        btsearch.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btsearch.setText("Search");
        btsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsearchActionPerformed(evt);
            }
        });

        btadd.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btadd.setText("Add");
        btadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaddActionPerformed(evt);
            }
        });

        btupdate.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btupdate.setText("Update");
        btupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btupdateActionPerformed(evt);
            }
        });

        btcancel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btcancel.setText("Cancel");
        btcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelActionPerformed(evt);
            }
        });

        tableteacher.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Surname", "Employee ID", "Date of Birthday", "Address", "Phone", "Email", "Class X", "Class XP", "Aadhar", "Qualification", "Department"
            }
        ));
        tableteacher.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tableteacher.setRowHeight(25);
        jScrollPane1.setViewportView(tableteacher);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(lblsearchbyemployee))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(btsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btadd, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 389, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lblsearchbyemployee)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsearch)
                    .addComponent(btadd)
                    .addComponent(btupdate)
                    .addComponent(btcancel))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelActionPerformed
        // Cancel Button code
        setVisible(false);
    }//GEN-LAST:event_btcancelActionPerformed

    private void btaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaddActionPerformed
        // Add Button code
        setVisible(false);
        new AddTeacher();
    }//GEN-LAST:event_btaddActionPerformed

    private void btsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsearchActionPerformed
        // Search button code
        String query = "select * from teacher where rollno = '"+crollno.getSelectedItem()+"'";
        
        try
        {
            Conn connection=new Conn();
            ResultSet rs=connection.s.executeQuery(query);
            tableteacher.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btsearchActionPerformed

    private void btupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btupdateActionPerformed
        // Update button code
        setVisible(false);
        new UpdateTeacher();
    }//GEN-LAST:event_btupdateActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btadd;
    private javax.swing.JButton btcancel;
    private javax.swing.JButton btsearch;
    private javax.swing.JButton btupdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblsearchbyemployee;
    private javax.swing.JTable tableteacher;
    // End of variables declaration//GEN-END:variables
}
