/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import static javaapplication2.Login.uid;
import javax.swing.JOptionPane;

/**
 *
 * @author rajan
 */
public class add extends javax.swing.JFrame {

    /**
     * Creates new form add
     */
    public add() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSFotoCircle1 = new rojerusan.RSFotoCircle();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rSLabelImage1 = new rojerusan.RSLabelImage();
        jLabel1 = new javax.swing.JLabel();
        b = new app.bolivia.swing.JCTextField();
        question = new app.bolivia.swing.JCTextField();
        c = new app.bolivia.swing.JCTextField();
        d = new app.bolivia.swing.JCTextField();
        a = new app.bolivia.swing.JCTextField();
        rSMaterialButtonRectangle2 = new rojerusan.RSMaterialButtonRectangle();
        jLabel2 = new javax.swing.JLabel();
        ra = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rSMaterialButtonRectangle1 = new rojerusan.RSMaterialButtonRectangle();
        n = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 204));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 51));
        jLabel4.setText("Delete Question");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 200, 30));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSLabelImage1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ROHIT MAURYA\\Downloads\\problem.png")); // NOI18N
        jPanel1.add(rSLabelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 80, 70));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, 20, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 80));

        b.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 0, 0)), "2", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI Emoji", 1, 18), new java.awt.Color(0, 102, 102))); // NOI18N
        b.setCaretColor(new java.awt.Color(0, 102, 102));
        b.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, 370, 40));

        question.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 0)), "QUESTION ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI Emoji", 1, 18), new java.awt.Color(204, 0, 51))); // NOI18N
        question.setCaretColor(new java.awt.Color(0, 102, 102));
        question.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        question.setPhColor(new java.awt.Color(102, 0, 0));
        question.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionActionPerformed(evt);
            }
        });
        getContentPane().add(question, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 910, 90));

        c.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 0, 0)), "3", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI Emoji", 1, 18), new java.awt.Color(0, 102, 102))); // NOI18N
        c.setCaretColor(new java.awt.Color(0, 102, 102));
        c.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 380, 40));

        d.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 0, 0)), "4", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI Emoji", 1, 18), new java.awt.Color(0, 102, 102))); // NOI18N
        d.setCaretColor(new java.awt.Color(0, 102, 102));
        d.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });
        getContentPane().add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 370, 40));

        a.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 0, 0)), "1", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI Emoji", 1, 18), new java.awt.Color(0, 102, 102))); // NOI18N
        a.setCaretColor(new java.awt.Color(0, 102, 102));
        a.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        getContentPane().add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 380, 40));

        rSMaterialButtonRectangle2.setBackground(new java.awt.Color(0, 102, 102));
        rSMaterialButtonRectangle2.setText("CLEAR");
        rSMaterialButtonRectangle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle2ActionPerformed(evt);
            }
        });
        getContentPane().add(rSMaterialButtonRectangle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 140, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Right Answer..");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 120, 30));

        ra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raActionPerformed(evt);
            }
        });
        getContentPane().add(ra, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 500, 40, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Question No. ->");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        rSMaterialButtonRectangle1.setBackground(new java.awt.Color(0, 102, 102));
        rSMaterialButtonRectangle1.setText("MODIFY");
        rSMaterialButtonRectangle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonRectangle1ActionPerformed(evt);
            }
        });
        getContentPane().add(rSMaterialButtonRectangle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 540, 140, 40));

        n.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nFocusLost(evt);
            }
        });
        n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nActionPerformed(evt);
            }
        });
        getContentPane().add(n, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 60, -1));

        setSize(new java.awt.Dimension(988, 623));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void questionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_questionActionPerformed

    private void rSMaterialButtonRectangle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle1ActionPerformed
        // TODO add your handling code here:
         String jj1,jj2,jj3,jj4,jj5,jj6,jj7;
        jj1=n.getText();
        jj2=question.getText();
        jj3=a.getText();
        jj4=b.getText();
        jj5=c.getText();
        jj6=d.getText();
        jj7=ra.getText();
        if(jj1.equals("")==false && jj2.equals("")==false && jj3.equals("")==false && jj4.equals("")==false && jj5.equals("")==false && jj6.equals("")==false&& jj7.equals("")==false)
        {
            try{
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_ac","root","");

                    Statement stmt=con.createStatement();
                    stmt.executeUpdate("insert into addquestions values('"+n.getText()+"','"+question.getText()+"','"+a.getText()+"','"+b.getText()+"','"+c.getText()+"','"+d.getText()+"','"+ra.getText()+"')");
                    JOptionPane.showMessageDialog(this,"Question Added succesfully");
                    stmt.close();
                    con.close();
                   

                    throw new SQLIntegrityConstraintViolationException ("Duplicate entry");

                }
                catch(SQLIntegrityConstraintViolationException e)
                {

                }
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_ac","root","");

                String sql="select * from addquestions where No=?";
                PreparedStatement prstm=con.prepareStatement(sql);
                prstm.setString(1,n.getText());

                ResultSet rst=prstm.executeQuery();

                if(rst.next())
                {

                    prstm.executeUpdate("update addquestions set Question='"+jj2+"' , Answer1='"+jj3+"' , Answer2='"+jj4+"' , Answer3='"+jj5+"', Answer4='"+jj6+"', correctanswer='"+jj7+"' where No='"+n.getText()+"'");

                    JOptionPane.showMessageDialog(this,"Question Added succesfully");
                }

                con.close();
                prstm.close();
                
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, e);
            }
            
        }
        else
        JOptionPane.showMessageDialog(this,"Fill all details");
        
        admin ad=new admin();
        ad.show();
        dispose();
    }//GEN-LAST:event_rSMaterialButtonRectangle1ActionPerformed

    private void rSMaterialButtonRectangle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle2ActionPerformed
        // TODO add your handling code here:
        question.setText("");
                a.setText("");
                b.setText("");
                c.setText("");
                d.setText("");
                ra.setText("");
    }//GEN-LAST:event_rSMaterialButtonRectangle2ActionPerformed

    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dActionPerformed

    private void nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nActionPerformed

    private void nFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nFocusLost
        // TODO add your handling code here:
     try
      {
       Class.forName("com.mysql.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_ac","root","");
       
       String sql="select * from addquestions where No=?";
       PreparedStatement prstm=con.prepareStatement(sql);
       prstm.setString(1,n.getText());
       
       
       ResultSet rs=prstm.executeQuery();
       
       if(rs.next())
       {
           
           
            question.setText(rs.getString("question"));
            a.setText(rs.getString("Answer1"));
            b.setText(rs.getString("Answer2"));
            c.setText(rs.getString("Answer3"));
            d.setText(rs.getString("Answer4"));
            ra.setText(rs.getString("correctanswer"));
           
       }
       else
       {
           
           n.setText("");
           
       }
       con.close();
       prstm.close();
       
      }
      catch(Exception e)
      {
          
      }

    }//GEN-LAST:event_nFocusLost

    private void raActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_raActionPerformed

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
            java.util.logging.Logger.getLogger(add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private app.bolivia.swing.JCTextField a;
    private app.bolivia.swing.JCTextField b;
    private app.bolivia.swing.JCTextField c;
    private app.bolivia.swing.JCTextField d;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField n;
    private app.bolivia.swing.JCTextField question;
    private rojerusan.RSFotoCircle rSFotoCircle1;
    private rojerusan.RSLabelImage rSLabelImage1;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle1;
    private rojerusan.RSMaterialButtonRectangle rSMaterialButtonRectangle2;
    private javax.swing.JTextField ra;
    // End of variables declaration//GEN-END:variables
}
