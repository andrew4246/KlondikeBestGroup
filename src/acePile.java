import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

import java.util.ArrayList;

public class acePile extends Pile{
    private int x = 550 , y = 50, nth;
    

    public acePile(ArrayList<Card> cards, int nth){
        super(cards);
        this.nth = nth;
        x += 50*nth;
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
