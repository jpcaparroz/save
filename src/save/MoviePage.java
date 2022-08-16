package save;

import connectors.Http;
import java.util.logging.Level;
import java.util.logging.Logger;
import parsers.SearchParser;

public class MoviePage extends javax.swing.JFrame {
    
    Save save = new Save();
    int lista = 0;
    
    public MoviePage() {
        initComponents();
        searchBox.hide();
        searchMovie.hide();
    }
    
    public void buscarFilme(){
        SearchParser parser = new SearchParser();

        try {
            jLabel1.setText(parser.parsear(searchMovie.getText()).get(lista).getTitle());
        } catch (Exception ex) {
            Logger.getLogger(MoviePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        saveLogoMini = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();
        minimizeButton = new javax.swing.JButton();
        movieIconMini = new javax.swing.JButton();
        suggestionButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        searchMovie = new javax.swing.JTextField();
        searchBox = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        movieIconMini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MoviePage/movieIconMini.png"))); // NOI18N
        movieIconMini.setBorder(null);
        movieIconMini.setBorderPainted(false);
        movieIconMini.setContentAreaFilled(false);
        movieIconMini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        movieIconMini.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MoviePage/backIcon.png"))); // NOI18N
        movieIconMini.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MoviePage/backIcon.png"))); // NOI18N
        movieIconMini.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MoviePage/backIcon.png"))); // NOI18N
        movieIconMini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movieIconMiniActionPerformed(evt);
            }
        });
        jPanel1.add(movieIconMini, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 15, -1, -1));

        suggestionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MoviePage/suggestionButton .png"))); // NOI18N
        suggestionButton.setBorder(null);
        suggestionButton.setBorderPainted(false);
        suggestionButton.setContentAreaFilled(false);
        suggestionButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        suggestionButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MoviePage/suggestionButtonPressed.png"))); // NOI18N
        suggestionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suggestionButtonActionPerformed(evt);
            }
        });
        jPanel1.add(suggestionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 323, -1, -1));

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MoviePage/searchButton.png"))); // NOI18N
        searchButton.setBorder(null);
        searchButton.setBorderPainted(false);
        searchButton.setContentAreaFilled(false);
        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MoviePage/searchButtonPressed.png"))); // NOI18N
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        jPanel1.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 323, -1, -1));

        searchMovie.setBackground(new java.awt.Color(255, 255, 255));
        searchMovie.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        searchMovie.setForeground(new java.awt.Color(0, 0, 0));
        searchMovie.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        searchMovie.setBorder(null);
        searchMovie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchMovieMouseExited(evt);
            }
        });
        jPanel1.add(searchMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 369, 350, -1));

        searchBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MoviePage/searchBox.png"))); // NOI18N
        jPanel1.add(searchBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, -1, -1));

        jLabel1.setFont(new java.awt.Font("JetBrains Mono", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 560, -1, -1));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 480, -1, -1));

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
        setState(MoviePage.ICONIFIED);
    }//GEN-LAST:event_minimizeButtonActionPerformed

    private void movieIconMiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movieIconMiniActionPerformed
        save.getSelectPage();
        this.setVisible(false);
    }//GEN-LAST:event_movieIconMiniActionPerformed

    private void suggestionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suggestionButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suggestionButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        searchButton.hide();
        suggestionButton.hide();
        
        searchBox.show();
        searchMovie.show();
    }//GEN-LAST:event_searchButtonActionPerformed

    private void searchMovieMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMovieMouseExited
        buscarFilme();
        
    }//GEN-LAST:event_searchMovieMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        lista++;
        buscarFilme();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MoviePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton minimizeButton;
    private javax.swing.JButton movieIconMini;
    private javax.swing.JLabel saveLogoMini;
    private javax.swing.JLabel searchBox;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchMovie;
    private javax.swing.JButton suggestionButton;
    // End of variables declaration//GEN-END:variables
}
