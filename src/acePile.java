import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;

public class acePile extends Pile{
    private ArrayList<Card> list = new ArrayList<Card>();
    public acePile(int x, int y){
        super(x, y);
    }

    @Override
    public void draw(Graphics g) {

        try {
		    g.setColor(new Color(40, 155, 70));
            g.drawRect(x, y, GameBoard.xDim, GameBoard.yDim);

		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    private void addCard(Card c){
        list.add(c);
    }
    private void removeCards(int length){ // make a return method to see what cards were removed
        for(int i = 0; i < length; i++){
            list.remove(list.size()-1);
        }
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
