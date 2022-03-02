import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class SidePile extends Pile{

    public SidePile(int x, int y, ArrayList<Card> lst) {
        super(x, y);
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
