import java.util.Random;
import java.sql.*;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.ImageIcon;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * reservation_3.java
 *
 * Created on Nov 9, 2017, 12:41:12 PM
 */
/**
 *
 * @author vsat25
 */
public class reservation_3 extends javax.swing.JFrame {

    /** Creates new form reservation_3 */
    public reservation_3() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jRadioButton3 = new javax.swing.JRadioButton();
        jTextField4 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jFrame2 = new javax.swing.JFrame();
        jTextField6 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jFrame3 = new javax.swing.JFrame();
        jTextField16 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jDialog1 = new javax.swing.JDialog();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jFrame4 = new javax.swing.JFrame();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jFrame1.setMinimumSize(new java.awt.Dimension(1000, 650));
        jFrame1.getContentPane().setLayout(null);

        jLabel5.setBackground(new java.awt.Color(153, 255, 255));
        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 0, 18));
        jLabel5.setOpaque(true);
        jFrame1.getContentPane().add(jLabel5);
        jLabel5.setBounds(380, 590, 110, 30);

        jLabel6.setBackground(new java.awt.Color(153, 255, 255));
        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 0, 18));
        jLabel6.setOpaque(true);
        jFrame1.getContentPane().add(jLabel6);
        jLabel6.setBounds(590, 590, 110, 30);

        jRadioButton1.setFont(new java.awt.Font("Baskerville Old Face", 1, 14));
        jRadioButton1.setText("Standard");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(770, 430, 100, 25);

        jRadioButton2.setFont(new java.awt.Font("Baskerville Old Face", 1, 14));
        jRadioButton2.setText("Executive");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(770, 470, 100, 30);

        jRadioButton4.setFont(new java.awt.Font("Baskerville Old Face", 1, 14));
        jRadioButton4.setText("Suite");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(770, 570, 100, 30);

        jTextField1.setFont(new java.awt.Font("Baskerville Old Face", 0, 14));
        jFrame1.getContentPane().add(jTextField1);
        jTextField1.setBounds(100, 400, 180, 30);

        jTextField2.setFont(new java.awt.Font("Baskerville Old Face", 0, 18));
        jFrame1.getContentPane().add(jTextField2);
        jTextField2.setBounds(170, 450, 110, 30);

        jTextField3.setFont(new java.awt.Font("Baskerville Old Face", 3, 18));
        jFrame1.getContentPane().add(jTextField3);
        jTextField3.setBounds(340, 390, 330, 60);

        jRadioButton3.setFont(new java.awt.Font("Baskerville Old Face", 1, 14));
        jRadioButton3.setText("Delux");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(770, 520, 100, 30);

        jTextField4.setBorder(null);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(jTextField4);
        jTextField4.setBounds(890, 470, 60, 16);

        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jFrame1.getContentPane().add(jLabel15);
        jLabel15.setBounds(950, 0, 50, 50);

        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jFrame1.getContentPane().add(jLabel7);
        jLabel7.setBounds(410, 0, 140, 50);
        jFrame1.getContentPane().add(jLabel8);
        jLabel8.setBounds(810, 0, 30, 40);
        jFrame1.getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(210, 512, 140, 30);
        jFrame1.getContentPane().add(jDateChooser2);
        jDateChooser2.setBounds(210, 562, 140, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\xiia\\abc\\project\\ip\\reservation_2.png")); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(1000, 650));
        jFrame1.getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1000, 650);

        jFrame2.setMinimumSize(new java.awt.Dimension(1000, 650));
        jFrame2.getContentPane().setLayout(null);

        jTextField6.setFont(new java.awt.Font("Baskerville Old Face", 0, 18));
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setFocusable(false);
        jTextField6.setOpaque(false);
        jFrame2.getContentPane().add(jTextField6);
        jTextField6.setBounds(190, 100, 160, 30);

        jTextField5.setFont(new java.awt.Font("Baskerville Old Face", 0, 18));
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setFocusable(false);
        jTextField5.setOpaque(false);
        jFrame2.getContentPane().add(jTextField5);
        jTextField5.setBounds(190, 50, 160, 30);

        jTextField11.setFont(new java.awt.Font("Baskerville Old Face", 0, 18));
        jTextField11.setForeground(new java.awt.Color(255, 255, 255));
        jTextField11.setFocusable(false);
        jTextField11.setOpaque(false);
        jFrame2.getContentPane().add(jTextField11);
        jTextField11.setBounds(860, 190, 90, 30);

        jTextField10.setFont(new java.awt.Font("Baskerville Old Face", 0, 18));
        jTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jTextField10.setFocusable(false);
        jTextField10.setOpaque(false);
        jFrame2.getContentPane().add(jTextField10);
        jTextField10.setBounds(670, 150, 130, 30);

        jTextField9.setFont(new java.awt.Font("Baskerville Old Face", 0, 18));
        jTextField9.setForeground(new java.awt.Color(255, 255, 255));
        jTextField9.setFocusable(false);
        jTextField9.setOpaque(false);
        jFrame2.getContentPane().add(jTextField9);
        jTextField9.setBounds(670, 100, 130, 30);

        jTextField7.setFont(new java.awt.Font("Baskerville Old Face", 0, 18));
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setFocusable(false);
        jTextField7.setOpaque(false);
        jFrame2.getContentPane().add(jTextField7);
        jTextField7.setBounds(190, 150, 160, 30);

        jTextField8.setFont(new java.awt.Font("Baskerville Old Face", 0, 18));
        jTextField8.setForeground(new java.awt.Color(255, 255, 255));
        jTextField8.setFocusable(false);
        jTextField8.setOpaque(false);
        jFrame2.getContentPane().add(jTextField8);
        jTextField8.setBounds(670, 50, 130, 30);

        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jFrame2.getContentPane().add(jLabel16);
        jLabel16.setBounds(400, 4, 170, 40);

        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jFrame2.getContentPane().add(jLabel23);
        jLabel23.setBounds(950, 0, 50, 50);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book button.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        jFrame2.getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 1000, 650);

        jFrame3.setMinimumSize(new java.awt.Dimension(1000, 650));
        jFrame3.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                jFrame3WindowOpened(evt);
            }
        });
        jFrame3.getContentPane().setLayout(null);

        jTextField16.setFont(new java.awt.Font("Baskerville Old Face", 0, 18));
        jFrame3.getContentPane().add(jTextField16);
        jTextField16.setBounds(200, 460, 120, 25);

        jTextField15.setFont(new java.awt.Font("Baskerville Old Face", 0, 18));
        jFrame3.getContentPane().add(jTextField15);
        jTextField15.setBounds(200, 400, 130, 25);

        jTextField13.setFont(new java.awt.Font("Baskerville Old Face", 0, 18));
        jFrame3.getContentPane().add(jTextField13);
        jTextField13.setBounds(200, 290, 130, 25);

        jTextField12.setFont(new java.awt.Font("Baskerville Old Face", 0, 18));
        jFrame3.getContentPane().add(jTextField12);
        jTextField12.setBounds(200, 230, 130, 25);

        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jFrame3.getContentPane().add(jLabel12);
        jLabel12.setBounds(370, 4, 230, 40);

        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jFrame3.getContentPane().add(jLabel17);
        jLabel17.setBounds(950, 0, 50, 50);

        jLabel18.setBackground(new java.awt.Color(153, 255, 255));
        jLabel18.setFont(new java.awt.Font("Baskerville Old Face", 0, 18));
        jLabel18.setOpaque(true);
        jFrame3.getContentPane().add(jLabel18);
        jLabel18.setBounds(420, 450, 140, 30);

        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jFrame3.getContentPane().add(jLabel22);
        jLabel22.setBounds(330, 450, 50, 40);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payment button.png"))); // NOI18N
        jFrame3.getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 1000, 650);

        jDialog1.getContentPane().setLayout(null);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jButton1);
        jButton1.setBounds(100, 190, 79, 25);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enjoy.jpg"))); // NOI18N
        jDialog1.getContentPane().add(jLabel13);
        jLabel13.setBounds(30, 20, 240, 140);

        jLabel14.setBackground(new java.awt.Color(102, 153, 255));
        jLabel14.setOpaque(true);
        jDialog1.getContentPane().add(jLabel14);
        jLabel14.setBounds(0, 0, 290, 240);

        jFrame4.setMinimumSize(new java.awt.Dimension(1000, 650));
        jFrame4.getContentPane().setLayout(null);

        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jFrame4.getContentPane().add(jLabel19);
        jLabel19.setBounds(10, 0, 50, 50);

        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jFrame4.getContentPane().add(jLabel20);
        jLabel20.setBounds(960, 0, 40, 50);

        jLabel21.setIcon(new javax.swing.ImageIcon("D:\\xiia\\abc\\project\\ip\\last.png")); // NOI18N
        jFrame4.getContentPane().add(jLabel21);
        jLabel21.setBounds(0, 0, 1000, 650);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 650));
        getContentPane().setLayout(null);

        jComboBox1.setFont(new java.awt.Font("Baskerville Old Face", 0, 18));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select destination", "Delhi", "Mumbai", "Kolkata", "Chennai", "Amritsar", "Panaji", "Bengaluru", "Hydrabad" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(150, 10, 200, 30);

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(774, 50, 220, 600);

        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10);
        jLabel10.setBounds(950, 0, 50, 40);

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 50, 990, 580);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reservation.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-6, -6, 1010, 660);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1016)/2, (screenSize.height-688)/2, 1016, 688);
    }// </editor-fold>//GEN-END:initComponents
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    String msg = "";
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        int a = jComboBox1.getSelectedIndex();
        if (a == 1) {
            jLabel2.setIcon(new ImageIcon("D:\\cs\\java\\Hotel Reservation\\Images\\Delhi\\New Picture (6).png"));
        } else if (a == 2) {
            jLabel2.setIcon(new ImageIcon("D:\\cs\\java\\Hotel Reservation\\Images\\Mumbai\\New Picture (8).png"));
        } else if (a == 3) {
            jLabel2.setIcon(new ImageIcon("D:\\cs\\java\\Hotel Reservation\\Images\\Kolkata\\New Picture (12).png"));
        } else if (a == 4) {
            jLabel2.setIcon(new ImageIcon("D:\\cs\\java\\Hotel Reservation\\Images\\Chennai\\New Picture (10).png"));
        } else if (a == 5) {
            jLabel2.setIcon(new ImageIcon("D:\\cs\\java\\Hotel Reservation\\Images\\Amritsar\\New Picture (14).png"));
        } else if (a == 6) {
            jLabel2.setIcon(new ImageIcon("D:\\cs\\java\\Hotel Reservation\\Images\\Panaji\\New Picture (16).png"));
        } else if (a == 7) {
            jLabel2.setIcon(new ImageIcon("D:\\cs\\java\\Hotel Reservation\\Images\\Bengaluru\\New Picture (18).png"));
        } else if (a == 8) {
            jLabel2.setIcon(new ImageIcon("D:\\cs\\java\\Hotel Reservation\\Images\\Hydrabad\\New Picture (20).png"));
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        // new reservation_2().setVisible(true);
        int a = evt.getY();
        //System.out.println(a);
        int b = jComboBox1.getSelectedIndex();
        if ((b == 1) && (a >= 29) && (a <= 147)) //Delhi
        {
            jFrame1.setVisible(true);
            jTextField3.setText("Hotel Paras International");

        } else if ((b == 1) && (a >= 228) && (a <= 347)) {
            jTextField3.setText("The Park New Delhi");
            jFrame1.setVisible(true);
        } else if ((b == 1) && (a >= 432) && (a <= 557)) {
            jTextField3.setText("The Surya New Delhi");
            jFrame1.setVisible(true);
        } else if ((b == 2) && (a >= 29) && (a <= 147)) //mumbai
        {
            jTextField3.setText("Trident Bandra Kurla Mumbai");
            jFrame1.setVisible(true);
        } else if ((b == 2) && (a >= 228) && (a <= 347)) {
            jTextField3.setText("Sai Palace Hotel");
            jFrame1.setVisible(true);
        } else if ((b == 2) && (a >= 432) && (a <= 557)) {
            jTextField3.setText("VITS Mumbai");
            jFrame1.setVisible(true);
        } else if ((b == 3) && (a >= 29) && (a <= 147))//kolkata
        {
            jTextField3.setText("Swissotel Kolkata");
            jFrame1.setVisible(true);
        } else if ((b == 3) && (a >= 228) && (a <= 347)) {
            jTextField3.setText("Treebo Ivy Suits");
            jFrame1.setVisible(true);
        } else if ((b == 3) && (a >= 432) && (a <= 557)) {
            jTextField3.setText("Treebo Green View");
            jFrame1.setVisible(true);
        } else if ((b == 4) && (a >= 29) && (a <= 147)) //chennai
        {
            jTextField3.setText("Treebo Mount Kailash Suits");
            jFrame1.setVisible(true);

        } else if ((b == 4) && (a >= 228) && (a <= 347)) {
            jTextField3.setText("Fab Hotel");
            jFrame1.setVisible(true);
        } else if ((b == 4) && (a >= 432) && (a <= 557)) {
            jTextField3.setText("Brownstar Boutique Hotel");
            jFrame1.setVisible(true);
        } else if ((b == 5) && (a >= 29) && (a <= 147))//amritsar
        {
            jTextField3.setText("Hyaat Amritsar");
            jFrame1.setVisible(true);
        } else if ((b == 5) && (a >= 228) && (a <= 347)) {
            jTextField3.setText("Fab Hotel");
            jFrame1.setVisible(true);
        } else if ((b == 5) && (a >= 432) && (a <= 557)) {
            jTextField3.setText("Treebo Downtown Suits");
            jFrame1.setVisible(true);
        } else if ((b == 6) && (a >= 29) && (a <= 147))//panaji
        {
            jTextField3.setText("Treebo Mayfair");
            jFrame1.setVisible(true);
        } else if ((b == 6) && (a >= 228) && (a <= 347)) {
            jTextField3.setText("Welcome Heritage Panjim Inn");
            jFrame1.setVisible(true);
        } else if ((b == 6) && (a >= 432) && (a <= 557)) {
            jTextField3.setText("La Maison Fontainhas");
            jFrame1.setVisible(true);
        } else if ((b == 7) && (a >= 29) && (a <= 147))//bengaluru
        {
            jTextField3.setText("Treebo Golden Tranquility");
            jFrame1.setVisible(true);
        } else if ((b == 7) && (a >= 228) && (a <= 347)) {
            jTextField3.setText("Fab Hotel Tech Park");
            jFrame1.setVisible(true);
        } else if ((b == 7) && (a >= 432) && (a <= 557)) {
            jTextField3.setText("OYO Tech Park");
            jFrame1.setVisible(true);
        } else if ((b == 7) && (a >= 29) && (a <= 147))//hydrabad
        {
            jTextField3.setText("Mandakini Jaya International");
            jFrame1.setVisible(true);
        } else if ((b == 7) && (a >= 228) && (a <= 347)) {
            jTextField3.setText("Hotel Vaishnaol");
            jFrame1.setVisible(true);
        } else if ((b == 7) && (a >= 432) && (a <= 557)) {
            jTextField3.setText("Hotel Geetanjali");
            jFrame1.setVisible(true);
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        if (jRadioButton3.isSelected() == true) {
            int a = Integer.parseInt(jTextField2.getText());
            long d = jDateChooser1.getDate().getTime();
            long e = jDateChooser2.getDate().getTime();
            long diff = e - d;
            int did = (int) (diff / 1000 / 60 / 60 / 24);
            int c = (a * did) * 5000;
            jLabel6.setText("" + c);
            jLabel5.setText("5000");
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        if (jRadioButton1.isSelected() == true) {
            int a = Integer.parseInt(jTextField2.getText());
            long d = jDateChooser1.getDate().getTime();
            long e = jDateChooser2.getDate().getTime();
            long diff = e - d;
            int did = (int) (diff / 1000 / 60 / 60 / 24);
            int c = (a * did) * 2500;
            jLabel6.setText("" + c);
            jLabel5.setText("2500");
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        if (jRadioButton2.isSelected() == true) {
            int a = Integer.parseInt(jTextField2.getText());
            long d = jDateChooser1.getDate().getTime();
            long e = jDateChooser2.getDate().getTime();
            long diff = e - d;
            int did = (int) (diff / 1000 / 60 / 60 / 24);
            int c = (a * did) * 10000;
            jLabel6.setText("" + c);
            jLabel5.setText("10000");
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
        if (jRadioButton4.isSelected() == true) {
            int a = Integer.parseInt(jTextField2.getText());
            long d = jDateChooser1.getDate().getTime();
            long e = jDateChooser2.getDate().getTime();
            long diff = e - d;
            int did = (int) (diff / 1000 / 60 / 60 / 24);
            int c = (a * did) * 50000;
            jLabel6.setText("" + c);
            jLabel5.setText("50000");
        }
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        String b = jTextField1.getText();
        long d = jDateChooser1.getDate().getTime();
        long e = jDateChooser2.getDate().getTime();
        long diff = e - d;
        int did = (int) (diff / 1000 / 60 / 60 / 24);
        int a = Integer.parseInt(jTextField2.getText());
        int c;
        if (jRadioButton1.isSelected() == true) {
            c = 2500 * a * did;
            jLabel6.setText("" + c);
        } else if (jRadioButton2.isSelected() == true) {
            c = 10000 * a * did;
            jLabel6.setText("" + c);
        } else if (jRadioButton3.isSelected() == true) {
            c = 5000 * a * did;
            jLabel6.setText("" + c);
        } else if (jRadioButton4.isSelected() == true) {
            c = 50000 * a * did;
            jLabel6.setText("" + c);
        }
        if (jRadioButton1.isSelected() == true) {
            jTextField4.setText("Executive");
        } else if (jRadioButton2.isSelected() == true) {
            jTextField4.setText("Delux");
        } else if (jRadioButton3.isSelected() == true) {
            jTextField4.setText("Standard");
        } else if (jRadioButton4.isSelected() == true) {
            jTextField4.setText("Suite");
        }
        String z = jTextField4.getText();
        this.dispose();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
        String f = sdf.format(jDateChooser1.getDate());
        jTextField6.setText("" + f);
        String g = sdf.format(jDateChooser2.getDate());
        jTextField7.setText("" + g);
        String Name = jTextField1.getText();
        String noRoom = jTextField2.getText();
        String i = jLabel6.getText();
        jTextField5.setText("" + Name);
        jTextField9.setText("" + noRoom);
        jTextField10.setText("" + did);
        jTextField11.setText("" + i);
        jTextField8.setText("" + z);
        this.dispose();
        jFrame2.setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        this.dispose();
        new ivory().setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
       
        //jDialog1.setVisible(true);
        if (jTextField1.getText().equals(jLabel8.getText()))

            JOptionPane.showMessageDialog(null, "payment successful");
            this.dispose();
        jFrame4.setVisible(true);
        
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        this.dispose();
        new reservation_3().setVisible(true);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
       String z=jTextField11.getText();
        long d = jDateChooser1.getDate().getTime();
        long e = jDateChooser2.getDate().getTime();
        long diff = e - d;
        int did = (int) (diff / 1000 / 60 / 60 / 24);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
        String f = sdf.format(jDateChooser1.getDate());
        String g = sdf.format(jDateChooser2.getDate());
        int ans = JOptionPane.showConfirmDialog(null, "WANT TO INSERT");
        if (ans == JOptionPane.YES_OPTION) {
            try {
                Class.forName("java.sql.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/ivory", "root", "Ayush@123");
                stmt = con.createStatement();
                String query = "insert into pay(name,type_of_room,no_of_room,date_of_ci,date_of_co,no_of_days,amount) " +
                        "values('" + jTextField5.getText() + "','" + jTextField8.getText() + "'," + jTextField9.getText() + ",'" + f + "','" + g + "'," + did + "," + jTextField11.getText() + ");";
                System.out.print(query);
                stmt.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Record Inserted");
                 this.dispose();
                 jTextField15.setText(""+z);
        jFrame3.setVisible(true);
            } catch (Exception x) {
                x.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error In Insertions");
            }
        }
       // this.dispose();
       // jFrame2.setVisible(true);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:

        this.dispose();
        new ivory().setVisible(true);
}//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        System.exit(0);
}//GEN-LAST:event_jLabel20MouseClicked

    private void jFrame3WindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame3WindowOpened
        // TODO add your handling code here:
          Random a = new Random();
        int b = a.nextInt((999999 - 111111) + 1 - 111111);
        jLabel18.setText("" + b);
    }//GEN-LAST:event_jFrame3WindowOpened

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
          Random a = new Random();
        int b = a.nextInt((999999 - 111111) + 1 - 111111);
        jLabel18.setText("" + b);
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
        this.dispose();
         jFrame1.setVisible(true);
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
           this.dispose();
        jFrame1.setVisible(true);
    }//GEN-LAST:event_jLabel17MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new reservation_3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
