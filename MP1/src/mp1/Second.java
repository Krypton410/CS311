/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp1;

import java.awt.event.KeyEvent;

/**
 *
 * @author Maxwell
 */
public class Second extends javax.swing.JFrame {

    /**
     * Creates new form Second
     */
    public Second() {
        initComponents();
        setVisible(true);
        setTitle("Getting Information");
        setSize(480,480);
        setResizable(false);
        persons.setVisible(false);
    }
    
    
    public  void getName(String b, String g){
    welcome.setText("Welcome " + b + " & " + g);
    thebride.setVisible(false);
    thegroom.setVisible(false);
    thebride.setText(b);
    thegroom.setText(g);
    
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        persons = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        welcome = new javax.swing.JLabel();
        thegroom = new javax.swing.JLabel();
        thebride = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        guest = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        persons.setText("jLabel4");
        getContentPane().add(persons);
        persons.setBounds(350, 170, 34, 14);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("<html>\n<body>\n<p>Discounts </p>\n<p> 250 - 300 Persons | 5% off</p>\n<p> 300 - 550 Persons | 20% off </p>\n<p> 550 - 1000 Person | 25% off </p>\n<p> 1000 - 1200 Persons | 30 % off</p>\n<p> 1200 - 1500 Persons | 50 % off</p>\n\n</body>\n</html>");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 170, 200, 150);

        welcome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        welcome.setText("Welcome");
        getContentPane().add(welcome);
        welcome.setBounds(40, 40, 300, 40);

        thegroom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        thegroom.setText("Groom");
        getContentPane().add(thegroom);
        thegroom.setBounds(350, 90, 90, 20);

        thebride.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        thebride.setText("Bride");
        getContentPane().add(thebride);
        thebride.setBounds(350, 60, 70, 22);

        jLabel3.setText("P 1000 per person");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 310, 140, 14);

        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(350, 400, 55, 23);

        guest.setBackground(new java.awt.Color(204, 204, 204));
        guest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guestActionPerformed(evt);
            }
        });
        guest.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                guestKeyTyped(evt);
            }
        });
        getContentPane().add(guest);
        guest.setBounds(260, 330, 40, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("How many guest are we having?");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 340, 230, 17);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp1/wedding Bcgrnd.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-760, -50, 1290, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String guestNumber = guest.getText();
        int conv = Integer.parseInt(guestNumber);
        third t = new third();
        persons.setText(guestNumber);
        String thePersons = persons.getText();
        String bride = thebride.getText();
        String groom = thegroom.getText();
        t.setVisible(true);
        
        t.getName2(bride, groom, thePersons);
        t.getVals(conv);
        t.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void guestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guestActionPerformed

    private void guestKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_guestKeyTyped
        // TODO add your handling code here:
                char c = evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE))){
            evt.consume();
           
        }
    }//GEN-LAST:event_guestKeyTyped

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Second.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Second.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Second.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Second.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Second().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField guest;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel persons;
    private javax.swing.JLabel thebride;
    private javax.swing.JLabel thegroom;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
