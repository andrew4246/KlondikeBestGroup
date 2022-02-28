import java.awt.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class GameBoard implements Drawable, Updateable {
	

	Image testImage, backImage;
	public static final int OFFSET_X = 40, OFFSET_Y = 20;
	private ArrayList<Card> cards = new ArrayList<Card>();
	 
	private int numdraws=0;
	
	
	
	public GameBoard() {
		try {
			testImage = ImageIO.read(new File("images/cards/dj.png"));
			backImage = ImageIO.read(new File("images/cards/b1fv.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	/** @param g Graphics context onto which all Objects in the game
	 * draw themselves.  This should NOT change the Objects
	 */
	public void draw(Graphics g) {
		numdraws++;
		g.setColor(new Color(40, 155, 70));
		g.fillRect(0, 0, 3000, 2000);
		Card c = new Card(1, 1);
		c.updateLocation(100, 100);
		c.draw(g);
		c.updateLocation(100, 120);
		c.flip();
		c.draw(g);
		// this is just to test drawing a card
		g.drawImage(testImage, 30, 80, null);
		g.drawImage(backImage, 100, 80, null);
		g.drawImage(backImage, 105, 100, null);
	}


	/**
	 * This method is called by the game when a click has been made 
	 * on the panel.  Must determine if the click makes sense (is it 
	 * a valid location, If it is the first click, then note it and
	 * the next click will attempt a move (maybe).
	 * @param me
	 */
	public void justClicked(MouseEvent me) {
		Point p = me.getPoint();
		System.out.println("You just clicked "+p);


	}
	public void drawPiles(){
		/* GET THE COORDINATES FOR THE ACEPILES
		for(int i = 1; i < 5; i++){
			new acePile(,, cards);
		}
		*/
		for(int x = 1; x < 6; x++){
			new OpenPile(150*(x*100), 250*(x*50));
		}
	}

	@Override
	// this update will be called each time the timer in the KlondikeGame
	// goes off.  This will be convenient for animating.
	public void update(ActionEvent a) {
		
		
	}

}
