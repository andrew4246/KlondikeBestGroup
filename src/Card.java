import java.awt.Graphics;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.imageio.ImageIO;

/** represents a playing card that can draw itself. */
public class Card implements Drawable, Updateable{

    private int suit, value, color, x, y;
    private boolean faceUp;
    private String[] suitRef = {"c", "s", "h", "d"};
    Image frontImage, backImage;

/** Constructor for a new Card. Takes in the suit, value, x coordinate, and y coordinate. The suit is an int (0-3) 0 = club, 1 = spade, 2 = heart, 3 = daimond. The color of the card (0 - black, 1 - red) is determined from the suit.
*/
    public Card(int suit, int value, int x, int y){
        this.suit = suit;
        this.value = value;
        faceUp = false;

        String fileName = "";
        fileName += "images/cards/";
        fileName += suitRef[suit];
        fileName += value;
        fileName += ".png";

        try {
			frontImage = ImageIO.read(new File(fileName));
			backImage = ImageIO.read(new File("images/cards/b1fv.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    public void draw(Graphics g){

    }

    public void update(ActionEvent e){

    }
}
