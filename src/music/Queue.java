/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package music;

import java.util.*; //import classes from util package

/**
 *
 * @author marym
 */
public class Queue implements QueueInterface {

    private ArrayList<Song> LikedStack;

//queue structure to store songs stack
    public Queue() {
        LikedStack = new ArrayList<>();
    }

    public boolean isEmpty() {
        return LikedStack.isEmpty();
// returns true of false depending on if the stack is contains anything or not
    }

    public int songSize() {
        return LikedStack.size();
    }

    public Song frontSong() { //changed from object to song 
// to find the first song which is top of stack 
//if (LikedStack.size() > 0){            
        if (!LikedStack.isEmpty()) {
            return LikedStack.get(0);
        } else {
            return null;
//"Liked List Is Empty. Please Add Songs."; 
// if playlist is empty will send this message 
        }
    }

    public Song pop() { //changed from object to song 
        if (!(LikedStack.isEmpty())) {
            return LikedStack.remove(0); // removes item from top of the stack
        }
        return null;
//"liked List Is Empty. Please Add Songs."; 
// returns with message if the stack is empty 
    }

    public void push(Song song) { // type of Song is song; song is instance of Song - class 
        LikedStack.add(0, song);
    }

}
