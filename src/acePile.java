import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

import java.util.ArrayList;

public class acePile extends Pile{

    public acePile(int x, int y, ArrayList<Card> cards){
        super(x, y, cards);
    }

    @Override
    public void draw(Graphics g) {

		g.setColor(new Color(40, 155, 70));
        g.drawRect(x, y, GameBoard.xDim, GameBoard.yDim);

    }

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
