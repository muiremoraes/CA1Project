/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package music;

/**
 *
 * @author marym
 */
public interface Stack {
    public void deleteSong(String songName);
  
    public void addSong(Song song);
    public Song pop();
    public Song searchSong(String songName);
    public int songCount();
    public String getSongsAsString();
    
}
