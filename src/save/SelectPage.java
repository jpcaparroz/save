package save;

public class SelectPage extends javax.swing.JFrame {
    Save save = new Save();
    
    public SelectPage() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        saveLogoMini = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();
        minimizeButton = new javax.swing.JButton();
        filmesButton = new javax.swing.JButton();
        gamesButton = new javax.swing.JButton();
        seriesButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        saveLogoMini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SelectPage/saveLogoMini.png"))); // NOI18N
        jPanel1.add(saveLogoMini, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 15, -1, -1));

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AppPage/closeButton.png"))); // NOI18N
        closeButton.setBorder(null);
        closeButton.setBorderPainted(false);
        closeButton.setContentAreaFilled(false);
        closeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AppPage/closeButtonPressed.png"))); // NOI18N
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(991, 15, -1, -1));

        minimizeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AppPage/minimizeButton.png"))); // NOI18N
        minimizeButton.setBorder(null);
        minimizeButton.setBorderPainted(false);
        minimizeButton.setContentAreaFilled(false);
        minimizeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizeButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AppPage/minimizeButtonPressed.png"))); // NOI18N
        minimizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(minimizeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(958, 15, -1, -1));

        filmesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SelectPage/filmeIcon.png"))); // NOI18N
        filmesButton.setBorder(null);
        filmesButton.setBorderPainted(false);
        filmesButton.setContentAreaFilled(false);
        filmesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        filmesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filmesButtonActionPerformed(evt);
            }
        });
        jPanel1.add(filmesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, -1, -1));

        gamesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SelectPage/gameIcon.png"))); // NOI18N
        gamesButton.setBorder(null);
        gamesButton.setBorderPainted(false);
        gamesButton.setContentAreaFilled(false);
        gamesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(gamesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 280, -1, -1));

        seriesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/SelectPage/serieIcon.png"))); // NOI18N
        seriesButton.setBorder(null);
        seriesButton.setBorderPainted(false);
        seriesButton.setContentAreaFilled(false);
        seriesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(seriesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(715, 277, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void minimizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeButtonActionPerformed
        setState(SelectPage.ICONIFIED);
    }//GEN-LAST:event_minimizeButtonActionPerformed

    private void filmesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filmesButtonActionPerformed
        save.getMoviePage();
        this.setVisible(false);
    }//GEN-LAST:event_filmesButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JButton filmesButton;
    private javax.swing.JButton gamesButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton minimizeButton;
    private javax.swing.JLabel saveLogoMini;
    private javax.swing.JButton seriesButton;
    // End of variables declaration//GEN-END:variables
}
