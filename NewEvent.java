/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inse_app;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class NewEvent extends javax.swing.JFrame {

    Mysql mysql = new Mysql("213.131.183.194", "insedb", "INSE", "INSE3B");
    String pictureRef = null;

    /**
     * Creates new form NewEvent
     */
    public NewEvent() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtDesc = new javax.swing.JTextField();
        TxtEmail = new javax.swing.JTextField();
        TxtDate = new javax.swing.JTextField();
        TxtStart = new javax.swing.JTextField();
        TxtEnd = new javax.swing.JTextField();
        TxtLoc = new javax.swing.JTextField();
        BtnCreate = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        LblImg = new javax.swing.JLabel();
        BtnMap = new javax.swing.JButton();
        BtnStv = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create New Calender Event");
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Email:");

        jLabel2.setText("Event Date:");

        jLabel3.setText("Start Time:");

        jLabel4.setText("End Time:");

        jLabel5.setText("Description:");

        jLabel6.setText("Location:");

        TxtDesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtDescKeyTyped(evt);
            }
        });

        TxtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtEmailKeyTyped(evt);
            }
        });

        TxtDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtDateKeyTyped(evt);
            }
        });

        TxtStart.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtStartKeyTyped(evt);
            }
        });

        TxtEnd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtEndKeyTyped(evt);
            }
        });

        TxtLoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtLocKeyTyped(evt);
            }
        });

        BtnCreate.setText("Create New Event");
        BtnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCreateActionPerformed(evt);
            }
        });

        jLabel7.setText("In the formart HH:MM e.g 11:27");

        jLabel8.setText("In the formart HH:MM e.g 12:27");

        jLabel9.setText("In the format YYYYMMDD e.g 20170206");

        jLabel10.setText("For pictures use a postcode");

        LblImg.setText("jLabel11");

        BtnMap.setText("Map");
        BtnMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMapActionPerformed(evt);
            }
        });

        BtnStv.setText("StreetView");
        BtnStv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnStvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TxtStart, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                                            .addComponent(TxtEnd))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxtDesc, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                                    .addComponent(TxtLoc))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnCreate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TxtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(154, 154, 154)
                                        .addComponent(BtnMap)
                                        .addGap(133, 133, 133)
                                        .addComponent(BtnStv)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LblImg)
                .addGap(117, 117, 117))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addGap(28, 28, 28)
                .addComponent(BtnCreate)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnStv)
                    .addComponent(BtnMap))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblImg)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void TxtDescKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtDescKeyTyped
        if (TxtDesc.getText().length() >= 500) {
            evt.consume();
        }
    }//GEN-LAST:event_TxtDescKeyTyped

    private void TxtLocKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtLocKeyTyped
        if (TxtLoc.getText().length() >= 500) {
            evt.consume();
        }
    }//GEN-LAST:event_TxtLocKeyTyped

    private void TxtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtEmailKeyTyped
        if (TxtEmail.getText().length() >= 100) {
            evt.consume();
        }
    }//GEN-LAST:event_TxtEmailKeyTyped

    private void TxtEndKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtEndKeyTyped
        if (TxtEnd.getText().length() >= 5) {
            evt.consume();
        }
    }//GEN-LAST:event_TxtEndKeyTyped

    private void TxtStartKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtStartKeyTyped
        if (TxtStart.getText().length() >= 5) {
            evt.consume();
        }
    }//GEN-LAST:event_TxtStartKeyTyped

    private void TxtDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtDateKeyTyped
        if (TxtDate.getText().length() >= 8) {
            evt.consume();
        }
    }//GEN-LAST:event_TxtDateKeyTyped

    private void BtnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCreateActionPerformed
        Pattern TimeVal = Pattern.compile("^(([0-9])|([0-1][0-9])|([2][0-3])):(([0-9])|([0-5][0-9]))$");
        Pattern EmailVal = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        if (EmailVal.matcher(TxtEmail.getText()).matches() == true) {
            if (pictureRef != null) {
                if (TimeVal.matcher(TxtStart.getText()).matches() == true && TimeVal.matcher(TxtEnd.getText()).matches() == true) {
                    ResultSet eventUpdate = mysql.insert(TxtEmail.getText(), TxtDate.getText(), TxtStart.getText(), TxtEnd.getText(), TxtDesc.getText(), TxtLoc.getText(), pictureRef, App.searchDate);
                    App.FillTable(eventUpdate);
                    this.dispose();
                } else {
                        JOptionPane.showMessageDialog(this, "Please enter a valid time", "Time Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please Choose a picture Type: Google StreetView or Google Maps", "Please Select a Picture Type", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "The entered Email address is invalid!", "Email Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnCreateActionPerformed

    private void BtnStvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnStvActionPerformed
        setPic(2, TxtLoc.getText());
    }//GEN-LAST:event_BtnStvActionPerformed

    private void BtnMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMapActionPerformed
        setPic(1, TxtLoc.getText());
    }//GEN-LAST:event_BtnMapActionPerformed

    private void setPic(int imgType, String postcode) {
        URL picURL = null;
        try {
            switch (imgType) {
                case 1:
                    //static map
                    picURL = new URL("https://maps.googleapis.com/maps/api/staticmap?center=" + postcode + "&zoom=18&size=200x200&markers=" + postcode + "&key=AIzaSyClUql2PCm-KIxo2R6oHvsiSAGQy2H32ys");
                    pictureRef = ("https://maps.googleapis.com/maps/api/staticmap?center=" + postcode + "&zoom=18&size=200x200&markers=" + postcode + "&key=AIzaSyClUql2PCm-KIxo2R6oHvsiSAGQy2H32ys");
                    break;
                case 2:
                    //streetview
                    picURL = new URL("https://maps.googleapis.com/maps/api/streetview?size=200x200&location=" + postcode + "&pitch=0&fov=120&key=AIzaSyClUql2PCm-KIxo2R6oHvsiSAGQy2H32ys");
                    pictureRef = ("https://maps.googleapis.com/maps/api/streetview?size=200x200&location=" + postcode + "&pitch=0&fov=120&key=AIzaSyClUql2PCm-KIxo2R6oHvsiSAGQy2H32ys");
                    break;

            }

            LblImg.setIcon(new ImageIcon(ImageIO.read(picURL)));
        } catch (MalformedURLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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
            java.util.logging.Logger.getLogger(NewEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewEvent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCreate;
    private javax.swing.JButton BtnMap;
    private javax.swing.JButton BtnStv;
    private javax.swing.JLabel LblImg;
    private javax.swing.JTextField TxtDate;
    private javax.swing.JTextField TxtDesc;
    private javax.swing.JTextField TxtEmail;
    private javax.swing.JTextField TxtEnd;
    private javax.swing.JTextField TxtLoc;
    private javax.swing.JTextField TxtStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
