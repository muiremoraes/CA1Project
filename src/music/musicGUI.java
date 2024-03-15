/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package music;

/**
 *
 * @author marym
 */
public class musicGUI extends javax.swing.JFrame {

    //public QueueInterface LikedStack;
    public StackPlaylist likedList;
    public LinkedListPlaylist playlist1;
    public LinkedListPlaylist playlist2;

    /**
     * Creates new form musicGUI
     */
    public musicGUI() {
        //LikedStack = new Queue();
        likedList = new StackPlaylist();
        playlist1 = new LinkedListPlaylist();
        playlist2 = new LinkedListPlaylist();
        initComponents();
        setResizable(false);

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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        songLBL = new javax.swing.JLabel();
        genreLBL = new javax.swing.JLabel();
        songTF = new javax.swing.JTextField();
        genreTF = new javax.swing.JTextField();
        addBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        musicTA = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        deleteBTN = new javax.swing.JButton();
        playlist1BTN1 = new javax.swing.JButton();
        playlist2BTN1 = new javax.swing.JButton();
        searchBTN = new javax.swing.JButton();
        playlist1to2BTN = new javax.swing.JButton();
        playlist2to1BTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Rockwell Nova", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MUSIC PLAYLIST MANAGER");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        songLBL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        songLBL.setText("Song: ");

        genreLBL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        genreLBL.setText("Genre:");

        addBTN.setText("Add To Liked ");
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });

        musicTA.setColumns(20);
        musicTA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        musicTA.setRows(5);
        musicTA.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jScrollPane1.setViewportView(musicTA);

        jLabel2.setFont(new java.awt.Font("Rockwell Nova", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Rockwell Nova", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SONG MANAGER DISPLAY");

        deleteBTN.setText("Delete");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });

        playlist1BTN1.setText("Add To Playlist 1");
        playlist1BTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playlist1BTN1ActionPerformed(evt);
            }
        });

        playlist2BTN1.setText("Add To Playlist 2");
        playlist2BTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playlist2BTN1ActionPerformed(evt);
            }
        });

        searchBTN.setText("Search In Playlist");
        searchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTNActionPerformed(evt);
            }
        });

        playlist1to2BTN.setText("Move from pl1 to pl2");
        playlist1to2BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playlist1to2BTNActionPerformed(evt);
            }
        });

        playlist2to1BTN.setText("Move from pl2 to pl1");
        playlist2to1BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playlist2to1BTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(playlist1to2BTN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(playlist2to1BTN))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(genreLBL, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                                    .addComponent(songLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(songTF)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(addBTN)
                                                .addGap(111, 111, 111)
                                                .addComponent(deleteBTN)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(searchBTN))
                                            .addComponent(genreTF, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(playlist1BTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(playlist2BTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(songTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(songLBL))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genreTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genreLBL))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBTN)
                    .addComponent(deleteBTN)
                    .addComponent(searchBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(playlist1BTN1)
                            .addComponent(playlist2BTN1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playlist1to2BTN)
                    .addComponent(playlist2to1BTN))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTNActionPerformed
        // TODO add your handling code here:
        String newLikedSong = songTF.getText();
        String newLikedGenre = genreTF.getText();

        Song newSong = new Song();
        newSong.setName(newLikedSong);
        newSong.setGenre(newLikedGenre);

        if (newLikedSong.equalsIgnoreCase("") || newLikedGenre.equalsIgnoreCase("")) {
            musicTA.append("Name Or/And Genre Have Been Left Empty. Please Try Again.\n");
            songTF.setText("");
            genreTF.setText("");
        } else {
            likedList.addSong(newSong);
            musicTA.append("The Song: " + newLikedSong + " Has Been Added To Your Liked.\n" + "You Have " + likedList.songCount() + " Liked Songs.\n");
            musicTA.append("Click To Add " + newLikedSong + " To A Playlist.\n");
            songTF.setText("");
            genreTF.setText("");
        }


    }//GEN-LAST:event_addBTNActionPerformed

    private void playlist2BTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playlist2BTN1ActionPerformed
        // TODO add your handling code here:
        //get the last song of the liked playlist (front song)
        //add it to the playlist 2
        //print stuff on list 2
        Song song = likedList.frontSong();

        if (likedList.isEmpty()) {
            musicTA.append("Sorry The Are No More Songs That Can Be Added.\n");
        } else {
            playlist2.addSong(song);
            musicTA.append("The Song " + song + " Has Been Added To Playlist 2\n");
            musicTA.append("The Playlist 2 now contains:\n");
            musicTA.append(playlist2.getSongsAsString());
        }
    }//GEN-LAST:event_playlist2BTN1ActionPerformed

    private void playlist1BTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playlist1BTN1ActionPerformed
        // TODO add your handling code here:
        //get the last song of the liked playlist (front song)
        //add it to the playlist 1
        Song song = likedList.frontSong();

        if (likedList.isEmpty()) {
            musicTA.append("Sorry The Are No More Songs That Can Be Added.\n");
        } else {
            playlist1.addSong(song);
            musicTA.append("The Song " + song + " Has Been Added To Playlist 1\n");
            musicTA.append("The Playlist 1 now contains:\n");
            musicTA.append(playlist1.getSongsAsString());
        }
        //print stuff on list 1    


    }//GEN-LAST:event_playlist1BTN1ActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed

        //delete from playlist1 and playlist2 (deleteSong()) and  the stack thing
        String songName;
        //if textfield isnt empty
        songName = songTF.getText();   
        if (!songName.isBlank()) {
//search for thing to be deleted in 3 of them
            if ((playlist1.searchSong(songName) == null) && (playlist2.searchSong(songName) == null) && (likedList.searchSong(songName) == null)) {
                musicTA.append("Song " + songName + " Was not Found.\n");

            } else {
                playlist1.deleteSong(songName);
                playlist2.deleteSong(songName);
                likedList.deleteSong(songName);
                musicTA.append("Song " + songName + " Was Deleted.\n");
                //delete if found 
            }
            songTF.setText("");
            genreTF.setText("");
        } else {
            musicTA.append("Please Enter A Song Name.\n");
        }

    }//GEN-LAST:event_deleteBTNActionPerformed

    private void searchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBTNActionPerformed
        // we can just use the search function!!
        String songName;
        songName = songTF.getText();
        if (!songName.isBlank()) {

            if ((playlist1.searchSong(songName) == null) && (playlist2.searchSong(songName) == null) && (likedList.searchSong(songName) == null)) {
                musicTA.append("Song " + songName + " Was not Found.\n");

            } else {
                musicTA.append("Song " + songName + " Was Found.\n");
            }
            //if you find the song
            //print that you found the song
            songTF.setText("");
            genreTF.setText("");
        }/* else {
            musicTA.append("Cannot Find This Song. Please Try Again.\n");
            songTF.setText("");
            genreTF.setText("");
        }*/ else {
            musicTA.append("Please Enter A Song Name.\n");
        }
    }//GEN-LAST:event_searchBTNActionPerformed

    private void playlist1to2BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playlist1to2BTNActionPerformed
        //delete from one playlis and add to another
        //print stuff on list 1
        Song song = playlist1.frontSong();
        if (playlist1.songCount() <= 0) {//todo fix
            musicTA.append("Sorry The Are No More Songs That Can Be Added.\n");
        } else {
            playlist2.addSong(song);
            musicTA.append("The Song " + song + " Has Been Added To Playlist 2\n");
            musicTA.append("The Playlist 2 contains:\n");
            musicTA.append(playlist2.getSongsAsString());
            playlist1.pop();
            // playlist1.deleteSong(songName);
        }
    }//GEN-LAST:event_playlist1to2BTNActionPerformed

    private void playlist2to1BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playlist2to1BTNActionPerformed
        // TODO add your handling code here:
        Song song = playlist2.frontSong();
        if (playlist2.songCount() <= 0) {//todo fix
            musicTA.append("Sorry The Are No More Songs That Can Be Added.\n");
        } else {
            playlist1.addSong(song);
            musicTA.append("The Song " + song + " Has Been Added To Playlist 1\n");
            musicTA.append("The Playlist 1 contains:\n");
              musicTA.append(playlist1.getSongsAsString());
            playlist2.pop();
        }
    }//GEN-LAST:event_playlist2to1BTNActionPerformed

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
            java.util.logging.Logger.getLogger(musicGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(musicGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(musicGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(musicGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new musicGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBTN;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JLabel genreLBL;
    private javax.swing.JTextField genreTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea musicTA;
    private javax.swing.JButton playlist1BTN1;
    private javax.swing.JButton playlist1to2BTN;
    private javax.swing.JButton playlist2BTN1;
    private javax.swing.JButton playlist2to1BTN;
    private javax.swing.JButton searchBTN;
    private javax.swing.JLabel songLBL;
    private javax.swing.JTextField songTF;
    // End of variables declaration//GEN-END:variables

}
