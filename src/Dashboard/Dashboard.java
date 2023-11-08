/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Dashboard;


import java.awt.Frame;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.JPanel;


/**
 *
 * @author User
 */
public class Dashboard extends javax.swing.JFrame {

    private final Timer timer;

    /**
     * Creates new form Dashboard
     */
    
    
    
    public Dashboard() {
        initComponents();
        
        
        timer = new Timer(1000, new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               showDate();
           }
        });
        
        timer.start();
    }
    
    public JPanel getContentPanel() {
        return new Settings(); // Ganti dengan panel Settings yang sesuai
    }
    
    public void gantiPanel(JPanel panel) {
        content.removeAll();
        content.add(panel);
        content.revalidate();
        content.repaint();
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_sidebar = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbNama = new javax.swing.JLabel();
        btnDashboard = new javax.swing.JButton();
        btnData = new javax.swing.JButton();
        btnLaporan = new javax.swing.JButton();
        lbTanggal = new javax.swing.JLabel();
        lbIcon = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Gambar/polri2.png")).getImage());
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setSize(new java.awt.Dimension(1920, 1080));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pn_sidebar.setBackground(new java.awt.Color(178, 111, 96));
        pn_sidebar.setPreferredSize(new java.awt.Dimension(250, 387));

        jPanel1.setBackground(new java.awt.Color(178, 111, 96));

        lbNama.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbNama.setForeground(new java.awt.Color(255, 255, 255));
        lbNama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNama.setText("-----");
        lbNama.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbNama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNamaMouseClicked(evt);
            }
        });

        btnDashboard.setBackground(new java.awt.Color(178, 111, 96));
        btnDashboard.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/house-solid.png"))); // NOI18N
        btnDashboard.setText("Dashboard");
        btnDashboard.setBorder(null);
        btnDashboard.setBorderPainted(false);
        btnDashboard.setContentAreaFilled(false);
        btnDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDashboard.setIconTextGap(10);
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });

        btnData.setBackground(new java.awt.Color(178, 111, 96));
        btnData.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnData.setForeground(new java.awt.Color(255, 255, 255));
        btnData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Asset 90.png"))); // NOI18N
        btnData.setText("Data Anggota");
        btnData.setAlignmentY(0.0F);
        btnData.setBorder(null);
        btnData.setBorderPainted(false);
        btnData.setContentAreaFilled(false);
        btnData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnData.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnData.setIconTextGap(10);
        btnData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataActionPerformed(evt);
            }
        });

        btnLaporan.setBackground(new java.awt.Color(178, 111, 96));
        btnLaporan.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnLaporan.setForeground(new java.awt.Color(255, 255, 255));
        btnLaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/flag-solid.png"))); // NOI18N
        btnLaporan.setText("Laporan");
        btnLaporan.setAlignmentY(0.0F);
        btnLaporan.setBorder(null);
        btnLaporan.setBorderPainted(false);
        btnLaporan.setContentAreaFilled(false);
        btnLaporan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLaporan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLaporan.setIconTextGap(10);
        btnLaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaporanActionPerformed(evt);
            }
        });

        lbTanggal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbTanggal.setForeground(new java.awt.Color(255, 255, 255));
        lbTanggal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTanggal.setText("-- -- --");

        lbIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/user-solid.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLaporan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                            .addComponent(btnDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTanggal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnData, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(178, 111, 96));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pn_sidebarLayout = new javax.swing.GroupLayout(pn_sidebar);
        pn_sidebar.setLayout(pn_sidebarLayout);
        pn_sidebarLayout.setHorizontalGroup(
            pn_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pn_sidebarLayout.setVerticalGroup(
            pn_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_sidebarLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        getContentPane().add(pn_sidebar, java.awt.BorderLayout.LINE_START);

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setLayout(new javax.swing.BoxLayout(content, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(content, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(746, 501));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        setExtendedState(Frame.MAXIMIZED_BOTH);
        PanelDashboard PD;
        PD = new PanelDashboard();
        content.removeAll();
        content.add(PD);
        content.revalidate();
        content.repaint();
        PD.setVisible(true);
    }//GEN-LAST:event_formWindowOpened

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        // TODO add your handling code here:
        PanelDashboard PD;
        PD = new PanelDashboard();
        content.removeAll();
        content.add(PD);
        content.revalidate();
        content.repaint();

        PD.setVisible(true);
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataActionPerformed
        // TODO add your handling code here:
        PanelData PDA;
        PDA = new PanelData();
        content.removeAll();
        content.add(PDA);
        content.revalidate();
        content.repaint();

        PDA.setVisible(true);
    }//GEN-LAST:event_btnDataActionPerformed

    private void btnLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaporanActionPerformed
        // TODO add your handling code here:
        Laporan LA;
        LA = new Laporan();
        content.removeAll();
        content.add(LA);
        content.revalidate();
        content.repaint();
        
        LA.setVisible(true);
    }//GEN-LAST:event_btnLaporanActionPerformed

    private void lbNamaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNamaMouseClicked
        // TODO add your handling code here:
        GantiPw dialog = new GantiPw(new javax.swing.JFrame(), true, this);
        
        Point p = lbNama.getLocationOnScreen();
        int x = p.x + lbNama.getWidth()- dialog.getWidth();
        int y = p.y + lbNama.getHeight();
        dialog.setLocation(x,y);
        dialog.setVisible(true);
    }//GEN-LAST:event_lbNamaMouseClicked
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
               /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnData;
    private javax.swing.JButton btnLaporan;
    private javax.swing.JPanel content;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbNama;
    private javax.swing.JLabel lbTanggal;
    private javax.swing.JPanel pn_sidebar;
    // End of variables declaration//GEN-END:variables

    
    
    private void showDate(){
        Calendar calendar = Calendar.getInstance();
        Date date = new Date();
        SimpleDateFormat formatHari = new SimpleDateFormat("EEEE", new Locale("in"));
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String Hari = formatHari.format(calendar.getTime());
        String dateTime = dateFormat.format(date);
        lbTanggal.setText(Hari+", "+dateTime);
    }
    
    
    public void updateNamaLabel(String username) {
        lbNama.setText(username);
    }

}
