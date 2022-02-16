import java.awt.Graphics;
import java.awt.event.*;

/** represents a playing card that can draw itself. */
public class Card implements Drawable, Updateable{

    private int suit;
    private int value;
    private boolean faceUp; 
    private Location L;

    public Card(int suit, int value, Location L){
        this.suit = suit;
        this.value = value;
        faceUp = false;
        this.L = L;
    }

    public void draw(Graphics g){

    }

    public void update(ActionEvent e){

    }
}
