/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javaapplication2.admin;
import static javaapplication2.Login.uid;
import javax.swing.JOptionPane;

/**
 *
 * @author ROHIT MAURYA
 */
public class uprofilr extends javax.swing.JFrame {

    /**
     * Creates new form uprofilr
     */
    public uprofilr() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        rSButtonHover1 = new rojerusan.RSButtonHover();
        rSButtonHover2 = new rojerusan.RSButtonHover();
        rSButtonHover3 = new rojerusan.RSButtonHover();
        rSButtonHover4 = new rojerusan.RSButtonHover();
        rSButtonHover5 = new rojerusan.RSButtonHover();
        rSButtonHover6 = new rojerusan.RSButtonHover();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        block = new app.bolivia.swing.JCTextField();
        name = new app.bolivia.swing.JCTextField();
        mo = new app.bolivia.swing.JCTextField();
        id = new app.bolivia.swing.JCTextField();
        email = new app.bolivia.swing.JCTextField();
        rSMaterialButtonCircle1 = new rojerusan.RSMaterialButtonCircle();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("  Dashboard");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 260, 30));

        rSButtonHover1.setBackground(new java.awt.Color(0, 102, 153));
        rSButtonHover1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 102, 153)));
        rSButtonHover1.setIcon(new javax.swing.ImageIcon("R:\\Drive D\\NetBeansProjects\\JavaApplication2\\src\\image\\home.png")); // NOI18N
        rSButtonHover1.setText("HOME");
        rSButtonHover1.setColorHover(new java.awt.Color(0, 102, 102));
        rSButtonHover1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        rSButtonHover1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        rSButtonHover1.setIconTextGap(35);
        rSButtonHover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover1ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonHover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 280, 60));

        rSButtonHover2.setBackground(new java.awt.Color(0, 102, 153));
        rSButtonHover2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 102, 153)));
        rSButtonHover2.setIcon(new javax.swing.ImageIcon("R:\\Drive D\\NetBeansProjects\\JavaApplication2\\src\\image\\logout.png")); // NOI18N
        rSButtonHover2.setText("LOGOUT");
        rSButtonHover2.setColorHover(new java.awt.Color(0, 102, 102));
        rSButtonHover2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        rSButtonHover2.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        rSButtonHover2.setIconTextGap(35);
        rSButtonHover2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonHover2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 280, 60));

        rSButtonHover3.setBackground(new java.awt.Color(0, 102, 153));
        rSButtonHover3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 102, 153)));
        rSButtonHover3.setIcon(new javax.swing.ImageIcon("R:\\Drive D\\NetBeansProjects\\JavaApplication2\\src\\image\\man.png")); // NOI18N
        rSButtonHover3.setText("PROFILE");
        rSButtonHover3.setColorHover(new java.awt.Color(0, 102, 102));
        rSButtonHover3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        rSButtonHover3.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        rSButtonHover3.setIconTextGap(35);
        rSButtonHover3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover3ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonHover3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 280, 60));

        rSButtonHover4.setBackground(new java.awt.Color(0, 102, 153));
        rSButtonHover4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 102, 153)));
        rSButtonHover4.setIcon(new javax.swing.ImageIcon("R:\\Drive D\\NetBeansProjects\\JavaApplication2\\src\\image\\exam (1).png")); // NOI18N
        rSButtonHover4.setText("EXAM");
        rSButtonHover4.setColorHover(new java.awt.Color(0, 102, 102));
        rSButtonHover4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        rSButtonHover4.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        rSButtonHover4.setIconTextGap(35);
        rSButtonHover4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover4ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonHover4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 280, 60));

        rSButtonHover5.setBackground(new java.awt.Color(0, 102, 153));
        rSButtonHover5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 102, 153)));
        rSButtonHover5.setIcon(new javax.swing.ImageIcon("R:\\Drive D\\NetBeansProjects\\JavaApplication2\\src\\image\\feedback.png")); // NOI18N
        rSButtonHover5.setText("FEEDBACK");
        rSButtonHover5.setColorHover(new java.awt.Color(0, 102, 102));
        rSButtonHover5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        rSButtonHover5.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        rSButtonHover5.setIconTextGap(35);
        rSButtonHover5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover5ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonHover5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 280, 60));

        rSButtonHover6.setBackground(new java.awt.Color(0, 102, 153));
        rSButtonHover6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(0, 102, 153)));
        rSButtonHover6.setIcon(new javax.swing.ImageIcon("R:\\Drive D\\NetBeansProjects\\JavaApplication2\\src\\image\\certification.png")); // NOI18N
        rSButtonHover6.setText("RESULT");
        rSButtonHover6.setColorHover(new java.awt.Color(0, 102, 102));
        rSButtonHover6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        rSButtonHover6.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        rSButtonHover6.setIconTextGap(35);
        rSButtonHover6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover6ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonHover6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 280, 60));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, 20, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 70));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("User Profile");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 120, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("NAME");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 90, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Mobile No.");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 120, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("User I'D");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 120, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Email I'D");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 120, 30));

        block.setEditable(false);
        block.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        jPanel4.add(block, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, -1, -1));

        name.setEditable(false);
        name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        jPanel4.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        mo.setEditable(false);
        mo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        jPanel4.add(mo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, -1, -1));

        id.setEditable(false);
        id.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        jPanel4.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, -1, -1));

        email.setEditable(false);
        email.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(102, 102, 102)));
        jPanel4.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, -1, -1));

        rSMaterialButtonCircle1.setBackground(new java.awt.Color(153, 0, 0));
        rSMaterialButtonCircle1.setText("EXIT");
        rSMaterialButtonCircle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle1ActionPerformed(evt);
            }
        });
        jPanel4.add(rSMaterialButtonCircle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 90, 60));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1030, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        setSize(new java.awt.Dimension(1340, 690));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonHover2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover2ActionPerformed
        // TODO add your handling code here:
        Login lg=new Login();
                lg.show();
                dispose();
    }//GEN-LAST:event_rSButtonHover2ActionPerformed

    private void rSButtonHover3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover3ActionPerformed

    private void rSButtonHover4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover4ActionPerformed
        // TODO add your handling code here:
       examon hm=new examon();
                  hm.show();
                  dispose();
    }//GEN-LAST:event_rSButtonHover4ActionPerformed

    private void rSButtonHover5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover5ActionPerformed

    private void rSButtonHover6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover6ActionPerformed
        // TODO add your handling code here:
                resullt res=new resullt();
        res.show();
        dispose();

    }//GEN-LAST:event_rSButtonHover6ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void rSMaterialButtonCircle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle1ActionPerformed
        // TODO add your handling code here:
        admin ad=new admin();
        ad.show();
        dispose();
    }//GEN-LAST:event_rSMaterialButtonCircle1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user_ac","root","");

            String sql="select * from signup where User_id=?";
            PreparedStatement prstm=con.prepareStatement(sql);
            prstm.setString(1,uid);

            ResultSet rs=prstm.executeQuery();

            if(rs.next())
            {
                int bb=0;

                name.setText(rs.getString("Name"));
                mo.setText(rs.getString("Mobile_no"));
                id.setText(rs.getString("User_id"));
                email.setText(rs.getString("Emai_id"));
                bb=Integer.parseInt(rs.getString("Profile"));
                if(bb==1)
                {
                    block.setText("Block");
                }
                else
                {
                    block.setText("Unblock");
                }

            }
            else
            {
                JOptionPane.showMessageDialog(this,"Login Unsucessfull,Please try again");
                name.setText("");

            }
            con.close();
            prstm.close();

        }
        catch(Exception e)
        {

        }
    }//GEN-LAST:event_formWindowActivated

    private void rSButtonHover1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover1ActionPerformed
        // TODO add your handling code here:
        homepage hmp=new homepage();
        hmp.show();
        dispose();

    }//GEN-LAST:event_rSButtonHover1ActionPerformed

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
            java.util.logging.Logger.getLogger(uprofilr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(uprofilr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(uprofilr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(uprofilr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new uprofilr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private app.bolivia.swing.JCTextField block;
    private app.bolivia.swing.JCTextField email;
    private app.bolivia.swing.JCTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private app.bolivia.swing.JCTextField mo;
    private app.bolivia.swing.JCTextField name;
    private rojerusan.RSButtonHover rSButtonHover1;
    private rojerusan.RSButtonHover rSButtonHover2;
    private rojerusan.RSButtonHover rSButtonHover3;
    private rojerusan.RSButtonHover rSButtonHover4;
    private rojerusan.RSButtonHover rSButtonHover5;
    private rojerusan.RSButtonHover rSButtonHover6;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle1;
    // End of variables declaration//GEN-END:variables
}
