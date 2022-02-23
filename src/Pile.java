
/** A Pile is a collection of cards.  This needs to be
 * Drawable because it will be shown on the GUI. Put code
 * here that ALL Piles share.  The ways in which Piles are 
 * different belong in the subclasses.  The draw method should 
 * be implemented here.  Updateable may have empty implementation.
 * You WILL write subclasses of Pile
 */
import java.util.*;
public abstract class Pile implements Drawable, Updateable {
    
    public abstract boolean canAddCard(Card c);
    protected int x;
    protected int y;
    protected ArrayList<Card> list = new ArrayList<Card>();
    
    public Pile(int xVal, int yVal, ArrayList<Card> lst){
        this.x = xVal;
        this.y = yVal;
        this.list = lst;
    }

    private void addCard(Card c){
        list.add(c);
    }

    private void removeCards(int length){ // make a return method to see what cards were removed
        for(int i = 0; i < length; i++){
            list.remove(list.size()-1);
        }
    }


}
