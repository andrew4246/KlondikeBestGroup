import java.awt.Graphics;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import java.awt.*;

/** represents a playing card that can draw itself. */
public class Card implements Drawable, Updateable{

    private int suit;
    private int value;
    private boolean faceUp; 
    private int x;
    private int y;
    static Image back;
    static Image front;
    public String[] ss = {"c", "d", "h", "s"};
    public String[] vs = {"1", "2", "3", "4", "5", "6", "7", 
    "8", "9", "10", "j", "q", "k"};
    public ArrayList<Card> card = new ArrayList<>(52);

    public Card(int suit, int value, int x, int y){
        this.suit = suit;
        this.value = value;
        faceUp = false;
        this.x = x;
        this.y = y;
    }

    public int getSuit(){
        return suit;
    }
    public int getValue(){
        return value;
    }

    public void draw(Graphics g, int suit, int value){
        try {
            back = ImageIO.read(new File("images/cards/b1fv.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            String s = "images/cards/" + ss[suit] + vs[value] + ".png";
            front = ImageIO.read(new File(s));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void update(ActionEvent e){

    }

    @Override
    public void draw(Graphics g) {
        // TODO Auto-generated method stub
        
    }
}

