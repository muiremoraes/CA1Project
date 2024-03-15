/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package music;

/**
 *
 * @author marym
 */
public interface Playlist {
    
 //   public void deleteSong(int index);
    
//    public void moveUp(int index);
//    
//    public void moveDown(int index);
    
    public void deleteSong(String songName);
  
    public void addSong(Song song); //add song
    public Song pop(); // get rid of top one
    public Song searchSong(String songName); // serach for the song
    public int songCount();
    //size 
    public String getSongsAsString();
    // add list here 
}
