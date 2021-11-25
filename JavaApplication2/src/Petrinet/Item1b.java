/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Petrinet;

/**
 *
 * @author Minh Thuc
 */
public class Item1b extends javax.swing.JFrame {

    /**
     * Creates new form Item1b
     */
    int docu,free,busy;
    public Item1b() {
        this.setLocationRelativeTo(null);
        initComponents();
        this.setTitle("Item 1b - Transition system");
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        text1 = new javax.swing.JTextField();
        Name1 = new javax.swing.JLabel();
        text2 = new javax.swing.JTextField();
        Name2 = new javax.swing.JLabel();
        text3 = new javax.swing.JTextField();
        Name3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        text4 = new javax.swing.JTextField();
        Name4 = new javax.swing.JLabel();
        text5 = new javax.swing.JTextField();
        Name5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(580, 460));
        getContentPane().setLayout(null);

        Place1.setText(" ");
        getContentPane().add(Place1);
        Place1.setBounds(50, 50, 30, 14);

        Place2.setText(" ");
        getContentPane().add(Place2);
        Place2.setBounds(250, 210, 30, 14);

        Place3.setText(" ");
        getContentPane().add(Place3);
        Place3.setBounds(450, 50, 30, 14);

        Docu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Docu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Petrinet/place.png"))); // NOI18N
        Docu.setText("Docu");
        Docu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Docu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Docu.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(Docu);
        Docu.setBounds(430, 10, 79, 80);

        Start.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Petrinet/transition.png"))); // NOI18N
        Start.setText("Start");
        Start.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Start.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Start.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Start);
        Start.setBounds(30, 190, 79, 80);

        tt5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tt5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Petrinet/TT.png"))); // NOI18N
        tt5.setAutoscrolls(true);
        tt5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tt5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tt5.setVerifyInputWhenFocusTarget(false);
        tt5.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(tt5);
        tt5.setBounds(90, 210, 140, 20);

        End.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        End.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Petrinet/transition.png"))); // NOI18N
        End.setText("End");
        End.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        End.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        End.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(End);
        End.setBounds(230, 10, 73, 80);

        Free.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Free.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Petrinet/place.png"))); // NOI18N
        Free.setText("Free");
        Free.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Free.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Free.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(Free);
        Free.setBounds(30, 10, 77, 80);
        ;

        tt1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Petrinet/TT1.png"))); // NOI18N
        tt1.setAutoscrolls(true);
        tt1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tt1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tt1.setVerifyInputWhenFocusTarget(false);
        tt1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(tt1);
        tt1.setBounds(80, 50, 140, 20);

        Busy.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Busy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Petrinet/place.png"))); // NOI18N
        Busy.setText("Busy");
        Busy.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Busy.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Busy.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Busy);
        Busy.setBounds(230, 190, 78, 80);

        Change.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Change.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Petrinet/transition.png"))); // NOI18N
        Change.setText("Change");
        Change.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Change.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Change.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(Change);
        Change.setBounds(430, 190, 92, 80);

        tt2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Petrinet/TT1.png"))); // NOI18N
        tt2.setAutoscrolls(true);
        tt2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tt2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tt2.setVerifyInputWhenFocusTarget(false);
        tt2.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(tt2);
        tt2.setBounds(290, 50, 140, 20);

        tt3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tt3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Petrinet/TT3.png"))); // NOI18N
        tt3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tt3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tt3.setVerifyInputWhenFocusTarget(false);
        tt3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(tt3);
        tt3.setBounds(440, 90, 30, 100);

        tt4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tt4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Petrinet/TT.png"))); // NOI18N
        tt4.setAutoscrolls(true);
        tt4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tt4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tt4.setVerifyInputWhenFocusTarget(false);
        tt4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(tt4);
        tt4.setBounds(290, 210, 140, 20);

        tt6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        tt6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Petrinet/TT2.png"))); // NOI18N
        tt6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tt6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tt6.setVerifyInputWhenFocusTarget(false);
        tt6.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(tt6);
        tt6.setBounds(40, 90, 30, 100);

        text1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(text1);
        text1.setBounds(60, 280, 60, 20);

        Name1.setText("Free");
        getContentPane().add(Name1);
        Name1.setBounds(30, 280, 40, 20);

        text2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(text2);
        text2.setBounds(180, 280, 60, 20);

        Name2.setText("Busy");
        getContentPane().add(Name2);
        Name2.setBounds(150, 280, 40, 20);

        text3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(text3);
        text3.setBounds(310, 280, 60, 20);

        Name3.setText("Docu");
        getContentPane().add(Name3);
        Name3.setBounds(280, 280, 40, 20);

        jButton1.setText("Set token");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(420, 280, 90, 23);

        text4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(text4);
        text4.setBounds(320, 320, 80, 20);

        Name4.setText("Number of transition relation ");
        getContentPane().add(Name4);
        Name4.setBounds(130, 320, 180, 20);

        text5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(text5);
        text5.setBounds(320, 350, 80, 20);

        Name5.setText("Number of reachable marking");
        getContentPane().add(Name5);
        Name5.setBounds(130, 350, 180, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    static int factorial(int n)
    {
        int res=1;
        for (int i=1;i<=n;i++)
            res*=i;
        return res;
    }
    
    int Combination(int n,int k)
    {
        return factorial(n)/(factorial(n-k)*factorial(k));
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        free=Integer.parseInt(text1.getText());
        busy=Integer.parseInt(text2.getText());
        docu=Integer.parseInt(text3.getText());
        Place1.setText(String.valueOf(free));
        Place2.setText(String.valueOf(busy));
        Place3.setText(String.valueOf(docu));
        int n=free+busy+docu;
        if (n==1)
        {
            text4.setText("3");
            text5.setText("3");
        }
        else
        {
            if (n==2)
            {
                text4.setText("9");
                text5.setText("6");
            }
            else
            {
                int x=Combination(n+2,2);
                int tt=(x-3*(n-1)-3)*3+6*(n-1)+3;
                text4.setText(String.valueOf(tt));
                text5.setText(String.valueOf(x));
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Item1b.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Item1b.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Item1b.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Item1b.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Item1b().setVisible(true);
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