/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasipenyewaanstudiomgrproud;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import aplikasipenyewaanstudiomgrproud.koneksi;
import javax.swing.JOptionPane;
import java.awt.event.*;
import java.awt.*;
import java.awt.Container;
import java.io.File;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
/**
 *
 * @author aryos
 */
public class menuutama extends javax.swing.JFrame {
    JasperReport JasRep;
    JasperPrint JasPri;
    JasperDesign JasDes;
    private Connection conn = new aplikasipenyewaanstudiomgrproud.koneksi().connect();
    private DefaultTableModel tabmode;
    /**
     * Creates new form menuutama
     */
    public menuutama() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        dataop = new javax.swing.JMenuItem();
        datapel = new javax.swing.JMenuItem();
        booking = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        penyewaan = new javax.swing.JMenuItem();
        paketan = new javax.swing.JMenuItem();
        laporandatapkt = new javax.swing.JMenu();
        laporandataplg = new javax.swing.JMenuItem();
        laporandatbkg = new javax.swing.JMenuItem();
        laporandataps = new javax.swing.JMenuItem();
        laporandatapaketan = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/logomenu.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Perpetua", 1, 30)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MGR PROUD");

        jLabel3.setFont(new java.awt.Font("Perpetua", 1, 30)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("APLIKASI PENYEWAAN STUDIO ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4))
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(34, 34, 34)
                .addComponent(jLabel4))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/daftar.jpg"))); // NOI18N
        jMenu1.setText("Master");
        jMenu1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N

        dataop.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        dataop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/operator.png"))); // NOI18N
        dataop.setText("Data Operator");
        dataop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataopActionPerformed(evt);
            }
        });
        jMenu1.add(dataop);

        datapel.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        datapel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/pelanggan.png"))); // NOI18N
        datapel.setText("Data Pelanggan");
        datapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datapelActionPerformed(evt);
            }
        });
        jMenu1.add(datapel);

        booking.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        booking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/booking.png"))); // NOI18N
        booking.setText("Booking Studio");
        booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingActionPerformed(evt);
            }
        });
        jMenu1.add(booking);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(255, 255, 255));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/tunggakan.png"))); // NOI18N
        jMenu2.setText("Transaksi");
        jMenu2.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N

        penyewaan.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        penyewaan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/penyewaan.png"))); // NOI18N
        penyewaan.setText("Penyewaan Studio");
        penyewaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penyewaanActionPerformed(evt);
            }
        });
        jMenu2.add(penyewaan);

        paketan.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        paketan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/paket.jpg"))); // NOI18N
        paketan.setText("Paketan Studio");
        paketan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paketanActionPerformed(evt);
            }
        });
        jMenu2.add(paketan);

        jMenuBar1.add(jMenu2);

        laporandatapkt.setBackground(new java.awt.Color(255, 255, 255));
        laporandatapkt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/laporan.png"))); // NOI18N
        laporandatapkt.setText("Laporan");
        laporandatapkt.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        laporandatapkt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporandatapktActionPerformed(evt);
            }
        });

        laporandataplg.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        laporandataplg.setText("Laporan Data Pelanggan");
        laporandataplg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporandataplgActionPerformed(evt);
            }
        });
        laporandatapkt.add(laporandataplg);

        laporandatbkg.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        laporandatbkg.setText("Laporan Data Booking Studio");
        laporandatbkg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporandatbkgActionPerformed(evt);
            }
        });
        laporandatapkt.add(laporandatbkg);

        laporandataps.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        laporandataps.setText("Laporan Data Penyewaan Studio");
        laporandataps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporandatapsActionPerformed(evt);
            }
        });
        laporandatapkt.add(laporandataps);

        laporandatapaketan.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        laporandatapaketan.setText("Laporan Data Paketan Studio");
        laporandatapaketan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporandatapaketanActionPerformed(evt);
            }
        });
        laporandatapkt.add(laporandatapaketan);

        jMenuBar1.add(laporandatapkt);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void laporandataplgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporandataplgActionPerformed
        // TODO add your handling code here:
          try {
            String namaFile = "src/report/laporandatapelanggan.jasper";
            Connection conn = new koneksi().connect();
            String logo = "gambar/";
            HashMap parameter = new HashMap();
            parameter.put("logo",logo);
            File report_file = new File(namaFile);
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(report_file.getPath());
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameter, conn);
            JasperViewer.viewReport(jasperPrint, false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_laporandataplgActionPerformed

    private void bookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingActionPerformed
        // TODO add your handling code here:
        new BookingStudio().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bookingActionPerformed

    private void laporandatapsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporandatapsActionPerformed
        // TODO add your handling code here:
       try {
            String namaFile = "src/report/laporandatapenyewaanstudio.jasper";
            Connection conn = new koneksi().connect();
            String logo = "gambar/";
            HashMap parameter = new HashMap();
            parameter.put("logo",logo);
            File report_file = new File(namaFile);
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(report_file.getPath());
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameter, conn);
            JasperViewer.viewReport(jasperPrint, false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_laporandatapsActionPerformed

    private void laporandatbkgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporandatbkgActionPerformed
        // TODO add your handling code here:
         try {
            String namaFile = "src/report/laporandatabookingstudio.jasper";
            Connection conn = new koneksi().connect();
            String logo = "gambar/";
            HashMap parameter = new HashMap();
            parameter.put("logo",logo);
            File report_file = new File(namaFile);
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(report_file.getPath());
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameter, conn);
            JasperViewer.viewReport(jasperPrint, false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_laporandatbkgActionPerformed

    private void laporandatapktActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporandatapktActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_laporandatapktActionPerformed

    private void laporandatapaketanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporandatapaketanActionPerformed
        // TODO add your handling code here:
         try {
            String namaFile = "src/report/laporandatapaketanstudio.jasper";
            Connection conn = new koneksi().connect();
            String logo = "gambar/";
            HashMap parameter = new HashMap();
            parameter.put("logo",logo);
            File report_file = new File(namaFile);
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(report_file.getPath());
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameter, conn);
            JasperViewer.viewReport(jasperPrint, false);
            JasperViewer.setDefaultLookAndFeelDecorated(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_laporandatapaketanActionPerformed

    private void dataopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataopActionPerformed
        // TODO add your handling code here:
        new DataOperator().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dataopActionPerformed

    private void datapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datapelActionPerformed
        // TODO add your handling code here:
        new DataPelanggan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_datapelActionPerformed

    private void penyewaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penyewaanActionPerformed
        // TODO add your handling code here:
        new PenyewaanStudio().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_penyewaanActionPerformed

    private void paketanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paketanActionPerformed
        // TODO add your handling code here:
        new PaketanStudio().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_paketanActionPerformed

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
            java.util.logging.Logger.getLogger(menuutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuutama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuutama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem booking;
    private javax.swing.JMenuItem dataop;
    private javax.swing.JMenuItem datapel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem laporandatapaketan;
    private javax.swing.JMenu laporandatapkt;
    private javax.swing.JMenuItem laporandataplg;
    private javax.swing.JMenuItem laporandataps;
    private javax.swing.JMenuItem laporandatbkg;
    private javax.swing.JMenuItem paketan;
    private javax.swing.JMenuItem penyewaan;
    // End of variables declaration//GEN-END:variables
}
