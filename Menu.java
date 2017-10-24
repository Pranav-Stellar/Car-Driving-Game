import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Menu1{
	JFrame f;
	JPanel p;
	JLabel l1,l2;
	JButton b;
	Menu1(){
		f = new JFrame("Car Driving");
		f.setSize(400,400);
		f.setBackground(Color.red);
		f.setLayout(new FlowLayout());
		p = new JPanel();
		p.setPreferredSize(new Dimension(500,400));
		p.setBackground(Color.red);
		l1 = new JLabel("CAR DRIVING",0);
		l1.setPreferredSize(new Dimension(100,50));
		//road.gif = gif of any road for menu display
		l2 = new JLabel(new ImageIcon("road.gif"),0);s
		l2.setPreferredSize(new Dimension(500,250));
		b= new JButton("Play");
		b.setPreferredSize(new Dimension(100,20));
		p.add(l1);
		p.add(l2);
		p.add(b);
		f.add(p);
		f.setVisible(true);
		b.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent err){
				f.setVisible(false);
				new Game();
			}

		});

	}


}
class Menu{
	public static void main(String s[]){
		new Menu1();
	}

}
