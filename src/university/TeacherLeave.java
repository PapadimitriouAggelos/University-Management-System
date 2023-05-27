package university;

import com.toedter.calendar.JDateChooser;
import java.awt.Choice;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TeacherLeave extends javax.swing.JFrame 
{
    /*
    Διαφορά ComboBox με Choice
    Το ComboBox επιτρέπει στους χρήστες να επιλέξουν μια επιλογή από μια προκαθορισμένη λίστα επιλογών 
    ή να πληκτρολογήσουν μια άλλη τιμή εάν καμία από τις προκαθορισμένες επιλογές δεν ταιριάζει με αυτό που 
    θέλει να επιλέξει ο χρήστης. Το ChoiceBox επιτρέπει στους χρήστες να επιλέξουν μια επιλογή μόνο από μια 
    προκαθορισμένη λίστα επιλογών.
    */
    Choice crollno;
    
    JDateChooser date;
    
    //constructor
    public TeacherLeave() 
    {
        initComponents();
        
        setLocation(300, 200);
        
        crollno=new Choice(); //δημιουργώ ένα αντικείμενο της κλάσης Choice
        crollno.setBounds(30, 150, 170, 20);
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
        
        
        //με τις 3 επόμενες εντολές δημιουργούμε ένα αντικείμενο date της κλάσης JDateChooser έτσι ώστε να 
        //δημιουργήσουμε ένα ημερολόγιο κάνω import το jar file jcalendar-tz και το προσθέτουμε στο παράθυρο
        date=new JDateChooser();
        date.setBounds(30, 250, 170, 30);
        add(date);
        
        String[] times={"Half Day", "Full day"};
        cbtimeduration.setModel(new javax.swing.DefaultComboBoxModel<>(times));
        
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblapplyleaveteacher = new javax.swing.JLabel();
        lblsearchbyemployeeid = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        lbltimeduration = new javax.swing.JLabel();
        cbtimeduration = new javax.swing.JComboBox<>();
        btsubmit = new javax.swing.JButton();
        btcancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Apply Leave Teacher");

        lblapplyleaveteacher.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblapplyleaveteacher.setText("Apply Leave (Teacher)");

        lblsearchbyemployeeid.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblsearchbyemployeeid.setText("Search by Employee ID");

        lbldate.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lbldate.setText("Date");

        lbltimeduration.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lbltimeduration.setText("Time Duration");

        cbtimeduration.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btsubmit.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btsubmit.setText("Submit");
        btsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsubmitActionPerformed(evt);
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
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbltimeduration)
                    .addComponent(lbldate)
                    .addComponent(lblsearchbyemployeeid)
                    .addComponent(lblapplyleaveteacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbtimeduration, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btsubmit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblapplyleaveteacher)
                .addGap(42, 42, 42)
                .addComponent(lblsearchbyemployeeid)
                .addGap(91, 91, 91)
                .addComponent(lbldate)
                .addGap(100, 100, 100)
                .addComponent(lbltimeduration)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbtimeduration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsubmit)
                    .addComponent(btcancel))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelActionPerformed
        // Cancel button code
        setVisible(false);
    }//GEN-LAST:event_btcancelActionPerformed

    private void btsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsubmitActionPerformed
        // Submit button code
        String rollno=crollno.getSelectedItem();
        String d=((JTextField) date.getDateEditor().getUiComponent()).getText();
        String duration=(String)cbtimeduration.getSelectedItem();
        
        String query="insert into teacherleave values ('"+rollno+"', '"+d+"', '"+duration+"')";
        
        try
        {
            Conn c=new Conn();
            c.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Leave Confirmed");
            setVisible(false);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btsubmitActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new TeacherLeave().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcancel;
    private javax.swing.JButton btsubmit;
    private javax.swing.JComboBox<String> cbtimeduration;
    private javax.swing.JLabel lblapplyleaveteacher;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lblsearchbyemployeeid;
    private javax.swing.JLabel lbltimeduration;
    // End of variables declaration//GEN-END:variables
}
