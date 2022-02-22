import java.lang.reflect.AnnotatedWildcardType;
import java.util.ArrayList;

/** A Pile is a collection of cards.  This needs to be
 * Drawable because it will be shown on the GUI. Put code
 * here that ALL Piles share.  The ways in which Piles are 
 * different belong in the subclasses.  The draw method should 
 * be implemented here.  Updateable may have empty implementation.
 * You WILL write subclasses of Pile
 */
public abstract class Pile implements Drawable, Updateable {
    private int x, y;
    private ArrayList <Card> pile = new ArrayList<>();

    public Pile (int x, int y){
        this.x = x;
        this.y = y;
    }
    
    
    public abstract boolean canAddCard(Card c);
}
