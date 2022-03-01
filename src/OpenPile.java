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

		g.setColor(new Color(40, 155, 100));
        g.drawRect(x, y, 70, 95);
        for(int i = 0; i < list.size(); i++){
            list.get(i).draw(g);
        }

    }

    @Override
    public void update(ActionEvent a) {
        // TODO Auto-generated method stub
        int i = 0;
        for(int x = 0; x < list.size(); x++){
            list.get(x).updateLocation(this.x, (y + (i*28) + ((x-i)*14) ));
            if(list.get(x).isFaceUp()){
                i++;
            }
        }
    }

    public Card getTopCard(){
        return list.get(list.size() - 1);
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
