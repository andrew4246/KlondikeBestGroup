import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.util.*;
/** Extends Pile class - Pile where all cards are shown, either face up or face down. Used for the 5 play piles.
 */
public class OpenPile extends Pile{
    
    private int horizonal;

    
    public OpenPile(int x, int y, int horizonal){
        super(x, y);
        this.horizonal = horizonal;
    }
    @Override
    public void draw(Graphics g) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void update(ActionEvent a) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean canAddCard(Card c) {
        // TODO Auto-generated method stub
        return false;
    }
    
}