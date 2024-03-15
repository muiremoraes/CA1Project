/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package music;

import java.util.*;

/**
 *
 * @author marym
 */
public class StackPlaylist implements Playlist {

    private ArrayList<Song> songList;

    public StackPlaylist() {
        songList = new ArrayList<>();
    }

    public void addSong(Song song) {
        songList.add(0,song);
    }

//    public void deleteSong(int index) {
//        if (index <= songList.size() - 1 && index >= 0) {
//            // index is less than the size - 1 and index is greate or equal to 0
//            // size 4 delete indexx 3 
//            songList.remove(index);
//        }
//    }
        
    public void deleteSong(String songName)
    {
        Song theSong=this.searchSong(songName);
        if((theSong!=null))
        {
             songList.remove(theSong);
        }
       
    }
    
      public Song frontSong() { //changed from object to song 
// to find the first song which is top of stack 
//if (LikedStack.size() > 0){            
        if (!songList.isEmpty()) {
            return songList.get(0);
        } else {
            return null;
//"Liked List Is Empty. Please Add Songs."; 
// if playlist is empty will send this message 
        }
    }
    
      public Song pop() { //changed from object to song 
        if (!(songList.isEmpty())) {
            return songList.remove(0); // removes item from top of the stack
        }
        return null;
//"liked List Is Empty. Please Add Songs."; 
// returns with message if the stack is empty 
    }

//     public void moveUp(int index){
//         
//     }
//     
//     
//     public void moveDown(int index){
//         
//     }
    public Song searchSong(String songName) {
        for (Song s : songList) {
            //.contain means u find piece of that string in the name of the song 
            if (s.getName().contains(songName)) {
                return s;
            }
        }
        return null;
    }
    public int songCount()
    {
        return songList.size();
    }
    
    
    public boolean isEmpty() {
        return songList.isEmpty();
    }
// returns true of false depending on if the stack is contains anything or not
    
 
     public String getSongsAsString() {
        String returnString = "";
        if (songList.isEmpty()) {
            return "No Songs In The List";
        }
        for (Song s : songList) {
            returnString += s.toString() + "\n";
        }
        return returnString;
    }
   
  
}
