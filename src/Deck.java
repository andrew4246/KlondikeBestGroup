import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class Deck extends Pile{

    public Deck(int x, int y, ArrayList<Card> lst) {
        super(x, y, lst);
        //TODO Auto-generated constructor stub
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
