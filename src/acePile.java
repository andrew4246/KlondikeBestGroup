import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

import java.util.ArrayList;

<<<<<<< HEAD
public class AcePile extends Pile{

    public AcePile(int x, int y){
        super(x, y);
=======
public class acePile extends Pile{
    private int x = 550 , y = 50, nth;
    

    public acePile(ArrayList<Card> cards, int nth){
        super(cards);
        this.nth = nth;
        x += 50*nth;
>>>>>>> da0fc47738edd98dbcfb77d0aa29822ba2dfb773
    }

    @Override
    public void draw(Graphics g) {

<<<<<<< HEAD
		    g.setColor(new Color(40, 155, 70));
            g.drawRect(x, y, 71, 96);
    }
    /*
    private boolean canAdd(Card c){
        if(this.list.size() == c.getValue() && c.getSuit().equals(this.list.get(list.size()).getSuit())){
            return true;
        }
        return false;
=======
		g.setColor(new Color(40, 155, 70));
        g.drawRect(x, y, GameBoard.xDim, GameBoard.yDim);

>>>>>>> da0fc47738edd98dbcfb77d0aa29822ba2dfb773
    }
*/
    @Override
    public void update(ActionEvent a) {
        // TODO Auto-generated method stub
    }

    @Override
    public boolean canAddCard(Card c) {
        if(this.list.size() == c.getValue() && c.getSuit().equals(this.list.get(list.size()).getSuit())){
            return true;
        }
        return false;
    }

}
