/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package music;

/**
 *
 * @author marym
 */
public interface QueueInterface {

    public boolean isEmpty();

    public int songSize();

    public Song frontSong();

    public Song pop();

    public void push(Song song);

}
