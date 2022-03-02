import java.awt.Graphics;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.awt.event.ActionEvent;
import javax.imageio.ImageIO;

public class Deck extends Pile{
    
    Image backImage;

    public Deck(int x, int y){
        super(x,y);
        try {
			backImage = ImageIO.read(new File("images/cards/b1fv.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
        for(int i = 0; i < 4; i++){
            for(int t = 1; t < 14; t++){
                list.add(new Card(i,t));
            }
        }
        Collections.shuffle(list);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(new Color(155,155, 155));
        g.fillRect(x, y, 71, 96);
        if(list.size()>0){
            g.drawImage(backImage, x, y, null);
        }
    }
/**Collections.shuffle(list); */
    public void shuffle(){Collections.shuffle(list);}

/** list.remove(list.size()-1);*/
    public Card draw(){return list.remove(list.size()-1);}

/**list.add(c); */
    public void addCard(Card c){list.add(c);}

/**list.addAll(p.getList()); */
    public void addPile(Pile p){list.addAll(p.getList());}

    @Override
    public void update(ActionEvent a) {
        // TODO Auto-generated method stub
        if(list.get(list.size()-1).isFaceUp()){list.get(list.size()-1).flip();}
    }

    @Override
    public boolean canAddCard(Card c) {
        // TODO Auto-generated method stub
        return false;
    }
}
