import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

import java.util.ArrayList;

public class OpenPile extends Pile{

    public OpenPile(int x, int y){
        super(x, y);
    }

    @Override
    public void draw(Graphics g) {

		g.setColor(new Color(40, 155, 70));
        g.drawRect(x, y, 71, 96);

    }

    @Override
    public void update(ActionEvent a) {
        // TODO Auto-generated method stub
    }

    @Override
    public boolean canAddCard(Card c) {
        /*
        if(this.list.size() == c.getValue() ){
            return true;
        }
        return false;
        */
        return true;
    }
}
