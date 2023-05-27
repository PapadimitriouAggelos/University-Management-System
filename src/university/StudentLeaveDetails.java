package university;

import java.awt.Choice;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

public class StudentLeaveDetails extends javax.swing.JFrame 
{
    /*
    Διαφορά ComboBox με Choice
    Το ComboBox επιτρέπει στους χρήστες να επιλέξουν μια επιλογή από μια προκαθορισμένη λίστα επιλογών 
    ή να πληκτρολογήσουν μια άλλη τιμή εάν καμία από τις προκαθορισμένες επιλογές δεν ταιριάζει με αυτό που 
    θέλει να επιλέξει ο χρήστης. Το ChoiceBox επιτρέπει στους χρήστες να επιλέξουν μια επιλογή μόνο από μια 
    προκαθορισμένη λίστα επιλογών.
    */
    Choice crollno;

    //constructor
    public StudentLeaveDetails() 
    {
        initComponents();
        
        crollno=new Choice(); //δημιουργώ ένα αντικείμενο της κλάσης Choice
        crollno.setBounds(220, 56, 170, 20);
        add(crollno);
        
        /*
        Δημιουργώ ένα αντικείμενο con τύπου Conn και ζητάει από την βάση να μου δώσει τα πάντα από το table student
        Στην συνέχεια μέχρι να τελειώσουν οι εγγραφές από την βάση, γεμίζω το crollno με ότι περιέχεται στην στήλη rollno
        */
        try
        {
            Conn con=new Conn();
            ResultSet rs=con.s.executeQuery("select * from student");
            
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
            ResultSet rs= c.s.executeQuery("select * from studentleave");
            tablestudentleavedetails.setModel(DbUtils.resultSetToTableModel(rs));
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

        lblsearchbyrollnumber = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablestudentleavedetails = new javax.swing.JTable();
        btsearch = new javax.swing.JButton();
        btcancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Student Leave Details");

        lblsearchbyrollnumber.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblsearchbyrollnumber.setText("Search by Roll Number");

        tablestudentleavedetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Employee ID", "Date", "Duration"
            }
        ));
        tablestudentleavedetails.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tablestudentleavedetails.setRowHeight(25);
        jScrollPane1.setViewportView(tablestudentleavedetails);

        btsearch.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btsearch.setText("Search");
        btsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsearchActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 985, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lblsearchbyrollnumber)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(lblsearchbyrollnumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsearch)
                    .addComponent(btcancel))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsearchActionPerformed
        // Search button code
        String query = "select * from studentleave where rollno = '"+crollno.getSelectedItem()+"'";
        
        try
        {
            Conn connection=new Conn();
            ResultSet rs=connection.s.executeQuery(query);
            tablestudentleavedetails.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btsearchActionPerformed

    private void btcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelActionPerformed
        // Cancel button code
        setVisible(false);
    }//GEN-LAST:event_btcancelActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new StudentLeaveDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcancel;
    private javax.swing.JButton btsearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblsearchbyrollnumber;
    private javax.swing.JTable tablestudentleavedetails;
    // End of variables declaration//GEN-END:variables
}
