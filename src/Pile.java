
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
    
    public Pile(int x, int y){
        this.x = x;
        this.y = y;
    }

    private void addCard(Card c){
        list.add(c);
    }

    private ArrayList<Card> removeCards(int length){ // make a return method to see what cards were removed
        //SPLIT ARRAYLIST
        List<Card> answ = list.subList(list.size()-length, list.size());
        for(int i = 0; i < length; i++){
            list.remove(list.size()-1);
        }
        return (ArrayList<Card>) answ;
    }




}
