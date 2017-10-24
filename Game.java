import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Game{
	JFrame f;
	int x,y,v=0;
	Design t;
	Game(){
		f = new JFrame("'Click to Play'");
		f.setSize(306,600);
		f.setBackground(Color.BLACK);
		f.setResizable(false);
		t = new Design();
		t.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				f.setTitle("Car Driving");
				x = e.getX();
				y = e.getY();
				v++;
				//y = e.getY();
				//h = f.getHeight();
				//System.out.println( " " + x + " " + y + " ");
				t.draw(x,v,f);

			}

		});



		f.add(t);
		f.setVisible(true);

	}
}
