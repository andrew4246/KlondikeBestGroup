import java.awt.Graphics;
import java.awt.event.*;

/** represents a playing card that can draw itself. */
public class Card implements Drawable, Updateable{

    private int suit, value, x, y;
    private boolean faceUp;

    public Card(int suit, int value, int x, int y){
        this.suit = suit;
        this.value = value;
        faceUp = false;
    }

    public void draw(Graphics g){

    }

    public void update(ActionEvent e){

    }
}
