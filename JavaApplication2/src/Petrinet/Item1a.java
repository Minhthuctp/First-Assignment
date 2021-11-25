/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Petrinet;
import java.awt.*;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author Minh Thuc
 */

public class Item1a extends JFrame {
    
    int free,busy,docu;
    Auto t;
    public Item1a() {
        initComponents();
        this.setLocationRelativeTo(null);
        free=0;
        busy=0;
        docu=0;
        t=null;
        Place1.setText(String.valueOf(free));
        Place2.setText(String.valueOf(busy));
        Place3.setText(String.valueOf(docu));
        text4.setText("");
        String s = "[" + String.valueOf(free) + ".free,"+ String.valueOf(busy) + ".busy,"+ String.valueOf(docu) + ".docu]";
        text5.setText(s);
        this.setTitle("Item 1a - Specialist");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Place1 = new javax.swing.JLabel();
        Place2 = new javax.swing.JLabel();
        Place3 = new javax.swing.JLabel();
        Docu = new javax.swing.JLabel();
        Start = new javax.swing.JLabel();
        tt5 = new javax.swing.JLabel();
        End = new javax.swing.JLabel();
        Free = new javax.swing.JLabel();
        tt1 = new javax.swing.JLabel();
        Busy = new javax.swing.JLabel();
        Change = new javax.swing.JLabel();
        tt2 = new javax.swing.JLabel();
        tt3 = new javax.swing.JLabel();
        tt4 = new javax.swing.JLabel();
        tt6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        text1 = new javax.swing.JTextField();
        Name1 = new javax.swing.JLabel();
        text2 = new javax.swing.JTextField();
        Name2 = new javax.swing.JLabel();
        text3 = new javax.swing.JTextField();
        Name3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        text4 = new javax.swing.JTextField();
        Name4 = new javax.swing.JLabel();
        text5 = new javax.swing.JTextField();
        Name5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setMinimumSize(new java.awt.Dimension(580, 460));
        getContentPane().setLayout(null);

        Place1.setText(" ");
        getContentPane().add(Place1);
        Place1.setBounds(70, 50, 30, 14);

        Place2.setText(" ");
        getContentPane().add(Place2);
        Place2.setBounds(270, 210, 30, 14);

        Place3.setText(" ");
        getContentPane().add(Place3);
        Place3.setBounds(470, 50, 30, 14);

        Docu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Docu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Petrinet/place.png"))); // NOI18N
        Docu.setText("Docu");
        Docu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Docu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Docu.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(Docu);
        Docu.setBounds(450, 10, 79, 80);

        Start.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Petrinet/transition.png"))); // NOI18N
        Start.setText("Start");
        Start.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Start.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Start.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StartMouseClicked(evt);
            }
        });
        getContentPane().add(Start);
        Start.setBounds(50, 190, 79, 80);

        tt5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tt5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Petrinet/TT.png"))); // NOI18N
        tt5.setAutoscrolls(true);
        tt5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tt5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tt5.setVerifyInputWhenFocusTarget(false);
        tt5.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(tt5);
        tt5.setBounds(110, 210, 140, 20);

        End.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        End.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Petrinet/transition.png"))); // NOI18N
        End.setText("End");
        End.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        End.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        End.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        End.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EndMouseClicked(evt);
            }
        });
        getContentPane().add(End);
        End.setBounds(250, 10, 73, 80);

        Free.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Free.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Petrinet/place.png"))); // NOI18N
        Free.setText("Free");
        Free.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Free.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Free.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(Free);
        Free.setBounds(50, 10, 77, 80);
        ;

        tt1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Petrinet/TT1.png"))); // NOI18N
        tt1.setAutoscrolls(true);
        tt1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tt1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tt1.setVerifyInputWhenFocusTarget(false);
        tt1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(tt1);
        tt1.setBounds(100, 50, 140, 20);

        Busy.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Busy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Petrinet/place.png"))); // NOI18N
        Busy.setText("Busy");
        Busy.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Busy.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Busy.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Busy);
        Busy.setBounds(250, 190, 78, 80);

        Change.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Change.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Petrinet/transition.png"))); // NOI18N
        Change.setText("Change");
        Change.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Change.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Change.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Change.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangeMouseClicked(evt);
            }
        });
        getContentPane().add(Change);
        Change.setBounds(450, 190, 92, 80);

        tt2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Petrinet/TT1.png"))); // NOI18N
        tt2.setAutoscrolls(true);
        tt2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tt2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tt2.setVerifyInputWhenFocusTarget(false);
        tt2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(tt2);
        tt2.setBounds(310, 50, 140, 20);

        tt3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Petrinet/TT3.png"))); // NOI18N
        tt3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tt3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tt3.setVerifyInputWhenFocusTarget(false);
        tt3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(tt3);
        tt3.setBounds(460, 90, 30, 100);

        tt4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tt4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Petrinet/TT.png"))); // NOI18N
        tt4.setAutoscrolls(true);
        tt4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tt4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tt4.setVerifyInputWhenFocusTarget(false);
        tt4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(tt4);
        tt4.setBounds(310, 210, 140, 20);

        tt6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tt6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Petrinet/TT2.png"))); // NOI18N
        tt6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tt6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tt6.setVerifyInputWhenFocusTarget(false);
        tt6.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(tt6);
        tt6.setBounds(60, 90, 30, 100);

        jButton1.setText("Set token");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 360, 90, 23);

        jButton2.setText("Auto Fire");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(160, 360, 90, 23);

        text1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(text1);
        text1.setBounds(90, 320, 60, 20);

        Name1.setText("Free");
        getContentPane().add(Name1);
        Name1.setBounds(60, 320, 40, 20);

        text2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(text2);
        text2.setBounds(240, 320, 60, 20);

        Name2.setText("Busy");
        getContentPane().add(Name2);
        Name2.setBounds(210, 320, 40, 20);

        text3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(text3);
        text3.setBounds(390, 320, 60, 20);

        Name3.setText("Docu");
        getContentPane().add(Name3);
        Name3.setBounds(360, 320, 40, 20);

        jButton3.setText("Stop Auto");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(300, 360, 90, 23);

        text4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(text4);
        text4.setBounds(130, 280, 60, 20);

        Name4.setText("Firing");
        getContentPane().add(Name4);
        Name4.setBounds(90, 280, 40, 20);

        text5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(text5);
        text5.setBounds(270, 280, 150, 20);

        Name5.setText("Marking");
        getContentPane().add(Name5);
        Name5.setBounds(220, 280, 50, 20);

        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(440, 360, 90, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EndMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EndMouseClicked
        // TODO add your handling code here:
        if (docu!=0)
        {
            docu--;
            free++;
            Place1.setText(String.valueOf(free));
            Place3.setText(String.valueOf(docu));
            text4.setText("end");
            String s = "[" + String.valueOf(free) + ".free,"+ String.valueOf(busy) + ".busy,"+ String.valueOf(docu) + ".docu]";
            text5.setText(s);
        }
    }//GEN-LAST:event_EndMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        free=Integer.parseInt(text1.getText());
        busy=Integer.parseInt(text2.getText());
        docu=Integer.parseInt(text3.getText());
        Place1.setText(String.valueOf(free));
        Place2.setText(String.valueOf(busy));
        Place3.setText(String.valueOf(docu));
        text4.setText("");
        String s = "[" + String.valueOf(free) + ".free,"+ String.valueOf(busy) + ".busy,"+ String.valueOf(docu) + ".docu]";
        text5.setText(s);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void StartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartMouseClicked
        // TODO add your handling code here:
        if (free!=0)
        {
            free--;
            busy++;
            Place1.setText(String.valueOf(free));
            Place2.setText(String.valueOf(busy));
            text4.setText("start");
            String s = "[" + String.valueOf(free) + ".free,"+ String.valueOf(busy) + ".busy,"+ String.valueOf(docu) + ".docu]";
            text5.setText(s);
        }
    }//GEN-LAST:event_StartMouseClicked

    private void ChangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangeMouseClicked
        // TODO add your handling code here:
        if (busy!=0) 
        {
            busy--;
            docu++;
            Place2.setText(String.valueOf(busy));
            Place3.setText(String.valueOf(docu));
            text4.setText("change");
            String s = "[" + String.valueOf(free) + ".free,"+ String.valueOf(busy) + ".busy,"+ String.valueOf(docu) + ".docu]";
            text5.setText(s);
        }
    }//GEN-LAST:event_ChangeMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        (t=new Auto()).execute();
        jButton2.setEnabled(false);
        jButton3.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (t!=null)
        {
            t.cancel(true);
            t=null;
            jButton2.setEnabled(true);
            jButton3.setEnabled(false);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        free=0;
        busy=0;
        docu=0;
        Place1.setText(String.valueOf(free));
        Place3.setText(String.valueOf(busy));
        Place2.setText(String.valueOf(docu));
        text4.setText("");
        String s = "[" + String.valueOf(free) + ".free,"+ String.valueOf(busy) + ".busy,"+ String.valueOf(docu) + ".docu]";
        text5.setText(s);
    }//GEN-LAST:event_jButton4ActionPerformed

    private class Auto extends SwingWorker<Void, String>
    {

        @Override
        protected Void doInBackground() throws Exception {
            while (!isCancelled())
            {
                while (busy!=0)
                {
                    busy--;
                    docu++;
                    Place2.setText(String.valueOf(busy));
                    Place3.setText(String.valueOf(docu));
                    text4.setText("change");
                    String s = "[" + String.valueOf(free) + ".free,"+ String.valueOf(busy) + ".busy,"+ String.valueOf(docu) + ".docu]";
                    text5.setText(s);
                    Thread.sleep(1000);
                }
                while (docu!=0)
                {
                    docu--;
                    free++;
                    Place1.setText(String.valueOf(free));
                    Place3.setText(String.valueOf(docu));
                    text4.setText("end");
                    String s = "[" + String.valueOf(free) + ".free,"+ String.valueOf(busy) + ".busy,"+ String.valueOf(docu) + ".docu]";
                    text5.setText(s);
                    Thread.sleep(1000);
                }
                while (free!=0)
                {
                    free--;
                    busy++;
                    Place1.setText(String.valueOf(free));
                    Place2.setText(String.valueOf(busy));
                    text4.setText("start");
                    String s = "[" + String.valueOf(free) + ".free,"+ String.valueOf(busy) + ".busy,"+ String.valueOf(docu) + ".docu]";
                    text5.setText(s);
                    Thread.sleep(1000);
                }
            }
            Thread.sleep(1000);
            return null;
        }
            
        @Override
        protected void done()
        {
            
        } 
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Item1a().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Busy;
    private javax.swing.JLabel Change;
    private javax.swing.JLabel Docu;
    private javax.swing.JLabel End;
    private javax.swing.JLabel Free;
    private javax.swing.JLabel Name1;
    private javax.swing.JLabel Name2;
    private javax.swing.JLabel Name3;
    private javax.swing.JLabel Name4;
    private javax.swing.JLabel Name5;
    private javax.swing.JLabel Place1;
    private javax.swing.JLabel Place2;
    private javax.swing.JLabel Place3;
    private javax.swing.JLabel Start;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JTextField text1;
    private javax.swing.JTextField text2;
    private javax.swing.JTextField text3;
    private javax.swing.JTextField text4;
    private javax.swing.JTextField text5;
    private javax.swing.JLabel tt1;
    private javax.swing.JLabel tt2;
    private javax.swing.JLabel tt3;
    private javax.swing.JLabel tt4;
    private javax.swing.JLabel tt5;
    private javax.swing.JLabel tt6;
    // End of variables declaration//GEN-END:variables
}
