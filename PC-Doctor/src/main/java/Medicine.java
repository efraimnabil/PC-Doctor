/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
//package com.mycompany.medicine;
//import static com.mycompany.medicine.Main.get_string;
//import static com.mycompany.medicine.Main.correctans;
//import static com.mycompany.medicine.Main.map;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.Timer;


/**
 *
 * @author PC-Doctor
 */
public class Medicine extends javax.swing.JFrame {

    /**
     * Creates new form Medicine
     */
    public Medicine() {
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

        jPanel6 = new javax.swing.JPanel();
        jMedicationrating‏ = new javax.swing.JLabel();
        jDrugDosage = new javax.swing.JLabel();
        jIndications = new javax.swing.JLabel();
        jSideEffects = new javax.swing.JLabel();
        jname5 = new javax.swing.JLabel();
        jtxtname1 = new javax.swing.JTextField();
        jtxtmedicationrating = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextindications = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextdrugdosage = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextside2 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbtnLogo = new javax.swing.JButton();
        jbtnPC_Doctor = new javax.swing.JButton();
        jMedicines = new javax.swing.JButton();
        jBandAid = new javax.swing.JButton();
        jFoods = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jfood = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jsearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(Color.WHITE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(170, 80));
        setResizable(false);
        setSize(new java.awt.Dimension(1352, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jMedicationrating‏.setBackground(new java.awt.Color(204, 204, 204));
        jMedicationrating‏.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMedicationrating‏.setForeground(new java.awt.Color(0, 0, 0));
        jMedicationrating‏.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMedicationrating‏.setText("Medication Rating:");
        jMedicationrating‏.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jMedicationrating‏.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMedicationrating‏.setOpaque(true);
        jPanel6.add(jMedicationrating‏, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 270, 45));

        jDrugDosage.setBackground(new java.awt.Color(204, 204, 204));
        jDrugDosage.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jDrugDosage.setForeground(new java.awt.Color(0, 0, 0));
        jDrugDosage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jDrugDosage.setText("Drug Dosage:");
        jDrugDosage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jDrugDosage.setOpaque(true);
        jPanel6.add(jDrugDosage, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 60, 250, 45));

        jIndications.setBackground(new java.awt.Color(204, 204, 204));
        jIndications.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jIndications.setForeground(new java.awt.Color(0, 0, 0));
        jIndications.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jIndications.setText("  Indications:");
        jIndications.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jIndications.setOpaque(true);
        jPanel6.add(jIndications, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 210, 45));

        jSideEffects.setBackground(new java.awt.Color(204, 204, 204));
        jSideEffects.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jSideEffects.setForeground(new java.awt.Color(0, 0, 0));
        jSideEffects.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSideEffects.setText("  Side Effects:");
        jSideEffects.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jSideEffects.setOpaque(true);
        jPanel6.add(jSideEffects, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 210, 45));

        jname5.setBackground(new java.awt.Color(204, 204, 204));
        jname5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jname5.setForeground(new java.awt.Color(0, 0, 0));
        jname5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jname5.setText("Name: ");
        jname5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jname5.setOpaque(true);
        jPanel6.add(jname5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 140, 45));

        jtxtname1.setEditable(false);
        jtxtname1.setBackground(new java.awt.Color(204, 204, 204));
        jtxtname1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jtxtname1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtname1.setText("    ");
        jtxtname1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jtxtname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtname1ActionPerformed(evt);
            }
        });
        jPanel6.add(jtxtname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 250, 45));

        jtxtmedicationrating.setEditable(false);
        jtxtmedicationrating.setBackground(new java.awt.Color(204, 204, 204));
        jtxtmedicationrating.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jtxtmedicationrating.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtmedicationrating.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel6.add(jtxtmedicationrating, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 380, 45));

        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTextindications.setEditable(false);
        jTextindications.setBackground(new java.awt.Color(204, 204, 204));
        jTextindications.setColumns(20);
        jTextindications.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextindications.setForeground(new java.awt.Color(0, 0, 0));
        jTextindications.setRows(5);
        jScrollPane1.setViewportView(jTextindications);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 320, 330));

        jScrollPane2.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTextdrugdosage.setEditable(false);
        jTextdrugdosage.setBackground(new java.awt.Color(204, 204, 204));
        jTextdrugdosage.setColumns(20);
        jTextdrugdosage.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextdrugdosage.setForeground(new java.awt.Color(0, 0, 0));
        jTextdrugdosage.setRows(5);
        jScrollPane2.setViewportView(jTextdrugdosage);

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 340, 390));

        jScrollPane3.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTextside2.setEditable(false);
        jTextside2.setBackground(new java.awt.Color(204, 204, 204));
        jTextside2.setColumns(20);
        jTextside2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextside2.setForeground(new java.awt.Color(0, 0, 0));
        jTextside2.setRows(5);
        jScrollPane3.setViewportView(jTextside2);

        jPanel6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 320, 330));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 1140, 740));

        jPanel3.setBackground(new java.awt.Color(189, 52, 72));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 113, -1, -1));
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 57, 102, -1));

        jbtnLogo.setBackground(new java.awt.Color(254, 254, 254));
        jbtnLogo.setIcon(new javax.swing.ImageIcon("/home/anwar/NetBeansProjects/PC-Doctor/PC-Doctor/src/main/java/images/Logo.jpg")); // NOI18N
        jbtnLogo.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jbtnLogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLogoActionPerformed(evt);
            }
        });
        jPanel5.add(jbtnLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 110, 90));

        jbtnPC_Doctor.setBackground(new java.awt.Color(255, 255, 255));
        jbtnPC_Doctor.setFont(new java.awt.Font("Chilanka", 1, 30)); // NOI18N
        jbtnPC_Doctor.setForeground(new java.awt.Color(0, 0, 0));
        jbtnPC_Doctor.setText("PC Doctor");
        jbtnPC_Doctor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jbtnPC_Doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPC_DoctorActionPerformed(evt);
            }
        });
        jPanel5.add(jbtnPC_Doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 170, 50));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 230, 180));

        jMedicines.setBackground(new java.awt.Color(255, 255, 255));
        jMedicines.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMedicines.setForeground(new java.awt.Color(0, 0, 0));
        jMedicines.setIcon(new javax.swing.ImageIcon("/home/anwar/NetBeansProjects/PC-Doctor/PC-Doctor/src/main/java/images/Medicines.png")); // NOI18N
        jMedicines.setText("  Medicines");
        jMedicines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMedicinesActionPerformed(evt);
            }
        });
        jPanel3.add(jMedicines, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 270, 52));

        jBandAid.setBackground(new java.awt.Color(246, 249, 254));
        jBandAid.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jBandAid.setForeground(new java.awt.Color(0, 0, 0));
        jBandAid.setIcon(new javax.swing.ImageIcon("/home/anwar/NetBeansProjects/PC-Doctor/PC-Doctor/src/main/java/images/BandAid.png")); // NOI18N
        jBandAid.setText("   Band Aid ");
        jBandAid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBandAidActionPerformed(evt);
            }
        });
        jPanel3.add(jBandAid, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 270, 49));

        jFoods.setBackground(new java.awt.Color(255, 255, 255));
        jFoods.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jFoods.setForeground(new java.awt.Color(0, 0, 0));
        jFoods.setIcon(new javax.swing.ImageIcon("/home/anwar/NetBeansProjects/PC-Doctor/PC-Doctor/src/main/java/images/Food.png")); // NOI18N
        jFoods.setText("    Foods      ");
        jFoods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFoodsActionPerformed(evt);
            }
        });
        jPanel3.add(jFoods, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 270, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 324, 800));

        jPanel1.setBackground(new java.awt.Color(189, 52, 72));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jfood.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jfood.setForeground(new java.awt.Color(255, 255, 255));
        jfood.setText("Medicines");
        jPanel1.add(jfood, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 170, 40));

        jsearch.setBackground(new java.awt.Color(16, 18, 23));
        jsearch.setIcon(new javax.swing.ImageIcon("/home/anwar/NetBeansProjects/PC-Doctor/PC-Doctor/src/main/java/images/search.jpg")); // NOI18N
        jsearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsearchActionPerformed(evt);
            }
        });
        jPanel2.add(jsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 230, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 1140, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents
              
    private void jtxtname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtname1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtname1ActionPerformed

    private void jbtnLogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLogoActionPerformed
        // TODO add your handling code here:
        MainWindow obj = new MainWindow();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbtnLogoActionPerformed

    private void jbtnPC_DoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPC_DoctorActionPerformed
        // TODO add your handling code here:
        jbtnLogo.doClick();
    }//GEN-LAST:event_jbtnPC_DoctorActionPerformed

    private void jMedicinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMedicinesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMedicinesActionPerformed

    private void jBandAidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBandAidActionPerformed
        // TODO add your handling code here:
        BandAid obj = new BandAid();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jBandAidActionPerformed

    private void jFoodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFoodsActionPerformed
        // TODO add your handling code here:
        Foods obj = new Foods();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jFoodsActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        jsearch.doClick();
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsearchActionPerformed
        // TODO add your handling code here:
        if(map.containsKey(jTextField1.getText()))
        {
            String ans = jTextField1.getText() ;

            jtxtname1.setText( "    " + jTextField1.getText() ) ;
            jtxtmedicationrating.setText(map.get(ans)[0]) ;
            jTextindications.setText(map.get(ans)[3]) ;
            jTextside2.setText(map.get(ans)[2]) ;
            jTextdrugdosage.setText(map.get(ans)[1]) ;

        }
        else {

            JFrame frame = new JFrame();
            String message = "This is not available medicine , DO you mean :"+ correctans(jTextField1.getText()) ;
            int answer = JOptionPane.showConfirmDialog(frame, message);
            if (answer == JOptionPane.YES_OPTION) {
                String ans =  correctans(jTextField1.getText() );

                jtxtname1.setText ( "     "+ans)  ;
                jtxtmedicationrating.setText(map.get(ans)[0]) ;
                jTextindications.setText(map.get(ans)[3]) ;
                jTextside2.setText(map.get(ans)[2]) ;
                jTextdrugdosage.setText(map.get(ans)[1]) ;

            } else if (answer == JOptionPane.NO_OPTION) {

                JFrame frame2 = new JFrame();
                String message2=  "Please ,write medicine correctly..." ;
                int answer2 = JOptionPane.showConfirmDialog(frame2, message2);
                if (answer2 == JOptionPane.YES_OPTION)
                {
                    frame2.setVisible(false);

                }
                else if (answer2 == JOptionPane.NO_OPTION)
                {
                    System.exit(0);
                }
            }

        }
    }//GEN-LAST:event_jsearchActionPerformed

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
            java.util.logging.Logger.getLogger(Medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Medicine().setVisible(true); 
            }
        });
    }
        
      public static Map< String , String[]> map = new HashMap<>();
   // public static String ll = new String() ;
    static {
              String rating = "", drug = "" , effects = "" , indc = "";
              // first drug : 

              rating = "Antibacterial";

              drug = "For Adults: \n " +
                      "500-750 mg 3 times a day for 7-10 days\n" +
                      "For chilldren:\n " +
                      "15-50 mg/kg/day\n";

              effects = "Insomnia.\n" +
                      "indigestion.\n" +
                      "Metallic taste in the mouth.\n" +
                      "Drowsiness.\n" +
                      "Skin rash.\n" +
                      "dark urine.\n" +
                      "Headache.\n";

              indc = "Blood poisoning treatment\n" +
                      "Amoeba disease .\n" +
                      "Bacterial colitis caused by Clostridium difficile.\n" +
                      "Helicobacter pylori infection.\n" +
                      "Trichomoniasis.\n" +
                      "Giardia infection in the gastrointestinal tract.\n";

              map.put("Flagyl" ,new String[]{rating , drug , effects , indc}); 
              
                 // secind drug 
              rating = "A drug for diabetes";
              drug = "\n⁕Initial dose: 100 mg orally once a day" +
                       "\n⁕May increase to 300 mg orally once a day "
                       + "\nfor additional glycemic control in patients who have"
                       + "\ntolerated therapy "+
                       "\nand who have an eGFR of 60 mL/min/1.73 m2 nor greater" + 
                        "\n⁕Maximum dose: 300 mg/day";
              
              effects = "Most common side effets : "  + 
                      "\n⁕Bladder pain" +
                       "\n⁕Bloating" +
                     "\n⁕Bloody or cloudy urine" +
                   "\n⁕Decreased frequency or amount of urine" +
                    "\n⁕Difficult, burning, or painful urination" +
                     "\n⁕Discharge with a strong odor from the penis" +
                    "\n⁕Frequent urge to urinate" +
                    "\n⁕Increased thirst" +
                     "\n ⁕Increased urge to urinate during the night";
              
              indc = "⁕Indicated as an adjunct to diet "
                      + "\nand exercise to improve glycemic control" +
                    "\n⁕Also indicated to reduce risk of" +
                      "\n major adverse cardiovascular events in adults" +
                          "\n⁕Indicated to reduce the risk of end-stage kidney disease (ESKD)"
                      +"\nDoubling of serum creatinine " +
                      "\ncardiovascular (CV) death ";
              map.put("Canagliflozin" ,new String[]{rating , drug , effects , indc}); 
              
               // thired drug 
              rating = "A nonsteroidal anti-inflammatory drug";
              
              drug = "⁕Children under 12 years:  "+
                        "\n10-15 mg/kg orally once every 4 hours,"
                        + "up to 60-80 mg/kg/day " +
                         "\n⁕Children 12 years and older:  " +
                            "\n325-650 mg orally/rectally once"
                           + " every 4-6 hours as needed";
              
              effects = "⁕An upset stomach"+ 
                      "\n⁕More significant side effects include stomach ulcers"
                      + "\n⁕Stomach bleeding " + "\n⁕Worsening asthma" + 
                      "\n⁕Bleeding risk is greater among those who are older" 
                       + "\n⁕Drink alcohol";
              
              indc = "⁕Used to reduce : "+
                      "\n⁕pain"+""
                      + " \n⁕Fever" 
                      + "\n⁕Inflammation "
                      + "\n⁕As an antithrombotic."
                      + "\n⁕Treat include Kawasaki disease"
                      + "\n⁕pericarditis";
              map.put("Aspirin" ,new String[]{rating , drug , effects , indc});
               
               // fourth drug 
               rating = "Bicyclic phthalene derivative and selective serotonin reuptake inhibitor";
              drug = " Recommended dose:\n" +
                        "\n⁕ Depression: " + 
                          "\n" +
                          "  • Initial dose: 20 mg orally every other day." +
                            "\n  • Increase to 40 mg/day after one week based on your doctor's recommendations." +
                             "\n⁕ Alcoholism: " +
                              "\n  • From 20: 40 mg each day ." +
                              "\n⁕ Binge eating disorder: " +
                               "\n  • From 20: 60 mg orally each day." +
                               "\n⁕ Generalized anxiety disorder:" +
                                "\n  • Initial dose: 10 mg orally daily." +
                                 "\n  • It may increase to 40 mg orally daily." +
                                 "\n⁕ Panic disorder: " +
                                  "\n  • First dose: 20 mg orally daily." +
                                  "\n   • Increase after one week to 40 mg/day if needed";
              
              effects = "⁕Drowsiness" +
                        "\n⁕ Decreased or increased sexual desire or ability" +
                             "\n⁕ Excessive sweating" +
                                  "\n⁕ Nausea" +
                                  "\n⁕ Dryness in the mouth" +
                                   "\n⁕ Weight loss";
              
              indc = "Is uesd for treat : " 
                      + "\n⁕ Depression" +
                      "\n⁕ alcoholism"  + 
                      "\n⁕ Binge eating disorder" + 
                      "\n⁕ Generalized anxiety disorder"
                      + "\n⁕ Panic disorder" +
                      "\n ⁕ Obsessive-compulsive disorde";
              map.put("Citalopram" ,new String[]{rating , drug , effects , indc});


        }
     public static   String correctans(String medc ) 
      {
          String word = medc.toLowerCase();
           // pw.print("do you mean \" ");
            int[] arrmedc = new int[26];
            for(int i =0 ; i < word.length() ; i++){
              arrmedc[ (int) ( word.charAt(i) - 'a')]++;
            }
            int key = 2000000000;
            String outword = medc;
            for (String mk: map.keySet()) {
                String s = mk.toLowerCase();
                int[] arr = new int[26];
                for(int i =0 ; i < s.length() ; i++){
                    arr[ (int) ( s.charAt(i) - 'a')]++;
                }
                int comp = 0;
                for(int i =0 ; i < 26 ; i++){
                    comp += Math.abs(arr[i] - arrmedc[i]);
                }
                if(comp < key){
                    key = comp;
                    word = s;
                    outword = mk;
                }
            }
             return outword ;
           // pw.println(word + "\" ?");
           // String ok = sc.next();
            //if(ok.equals("true")){
              //  pw.println(map.get(outword)[0]); // بطبع التصنيف
               // pw.println(map.get(outword)[1]); // بطبع الجرعه
                //pw.println(map.get(outword)[2]); // بطبع الاعراض الجانبيه
                //pw.println(map.get(outword)[3]); // بطبع دواعي الاستعمال
            //else
              //  pw.println("Please ,write medicine correctly...");
      
}

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(FileReader r) {
            br = new BufferedReader(r);
        }

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }

        public int[] nextIntArr(int n) throws IOException {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public String nextLine() throws IOException {
            return br.readLine();
        }

        public double nextDouble() throws IOException {
            String x = next();
            StringBuilder sb = new StringBuilder("0");
            double res = 0, f = 1;
            boolean dec = false, neg = false;
            int start = 0;
            if (x.charAt(0) == '-') {
                neg = true;
                start++;
            }
            for (int i = start; i < x.length(); i++)
                if (x.charAt(i) == '.') {
                    res = Long.parseLong(sb.toString());
                    sb = new StringBuilder("0");
                    dec = true;
                } else {
                    sb.append(x.charAt(i));
                    if (dec)
                        f *= 10;
                }
            res += Long.parseLong(sb.toString()) / f;
            return res * (neg ? -1 : 1);
        }

        public boolean ready() throws IOException {
            return br.ready();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBandAid;
    private javax.swing.JLabel jDrugDosage;
    private javax.swing.JButton jFoods;
    private javax.swing.JLabel jIndications;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jMedicationrating‏;
    private javax.swing.JButton jMedicines;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel jSideEffects;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea jTextdrugdosage;
    private javax.swing.JTextArea jTextindications;
    private javax.swing.JTextArea jTextside2;
    private javax.swing.JButton jbtnLogo;
    private javax.swing.JButton jbtnPC_Doctor;
    private javax.swing.JLabel jfood;
    private javax.swing.JLabel jname5;
    private javax.swing.JButton jsearch;
    private javax.swing.JTextField jtxtmedicationrating;
    private javax.swing.JTextField jtxtname1;
    // End of variables declaration//GEN-END:variables
}
