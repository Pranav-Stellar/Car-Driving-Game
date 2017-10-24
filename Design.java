import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.ImageIO;
import java.awt.event.*;
import javax.swing.Timer;
import java.util.*;
import javax.swing.*;
class Design extends Canvas{
		int x,c=147,h=400,i=0,v,random,count=0,xcoord1 = 194,xcoord2 = 45,xcoord;
		int slept = 200,score =0,result=0;
		JFrame f1,f2;
		Font font;
		JPanel p;
		JLabel label,label1;
		JButton b;
		Random ran;
		//img = image for road
		//img1,img2,img3,img4,img5,img6,img7,img8 = images for different cars
		BufferedImage img = null;
		BufferedImage img1 = null;	//car5
		BufferedImage img2 = null;	//car1
		BufferedImage img3 = null;	//car2
		BufferedImage img4 = null;	//car3
		BufferedImage img5 = null;	//car4
		BufferedImage img6 = null;	//car6
		BufferedImage img7 = null;	//car7
		BufferedImage img8 = null;	//car8

		public void draw(int xx,int vv,JFrame ff){
		x = xx;
		//h = hh;
		v = vv;
		f2 = ff;
		//h=h/2 + 100;
		File road = new File("r.jpg");
		File car = new File("car5.png");
		File car1 = new File("car1.png");
		File car2 = new File("car2.png");
		File car3 = new File("car3.png");
		File car4 = new File("car4.png");
		File car5 = new File("car6.png");
		File car6 = new File("car7.png");
		File car7 = new File("car8.png");

				try{
					img = ImageIO.read(road);
					img1 = ImageIO.read(car);
					img2 = ImageIO.read(car1);
					img3 = ImageIO.read(car2);
					img4 = ImageIO.read(car3);
					img5 = ImageIO.read(car4);
					img6 = ImageIO.read(car5);
					img7 = ImageIO.read(car6);
					img8 = ImageIO.read(car7);

				}
		catch(IOException err){}
	//	repaint();
	}

	public void paint(Graphics g){
				g.drawImage(img,0,i-598,null);
				g.drawImage(img,0,i,null);
				if(count==0){
					ran = new Random();
					random = ran.nextInt(7) + 1;
					count++;
				}
				if(random==1){
					xcoord = xcoord1;
					g.drawImage(img2,xcoord,i-35,null);

				}
				else if(random==2){
					xcoord = xcoord2;
					g.drawImage(img3,xcoord,i-35,null);

				}
				else if(random==3){
					xcoord = xcoord1;
					g.drawImage(img4,xcoord,i-35,null);

				}
				else if(random==4){
					xcoord = xcoord2;
					g.drawImage(img5,xcoord,i-35,null);

				}
				else if(random==5){
					xcoord = xcoord1;
					g.drawImage(img6,xcoord,i-35,null);

				}
				else if(random==6){
					xcoord = xcoord2;
					g.drawImage(img7,xcoord,i-35,null);

				}
				else if(random==7){
					xcoord = xcoord1;
					g.drawImage(img8,xcoord,i-35,null);

				}

				if(v==1){

					g.drawImage(img1,194,h,null);
					if(xcoord==194 && (i>=300 && i<=550)){
						i=-11;

					}




				}
				else if(c<x){

					g.drawImage(img1,194,h,null);

					if(xcoord==194 && (i>=300 && i<=550)){

						i=-11;
					}



				}
				else if(c>x){

					g.drawImage(img1,45,h,null);

					if(xcoord==45 && (i>=300 && i<=550)){

						i=-11;
					}


				}
				else{

					g.drawImage(img1,194,h,null);

					if(xcoord==194 && (i>=300 && i<=550)){

						i=-11;
					}

				}
				if(i!=-11){
					score++;

				}
				if(i==-11){

				result=1;
				f1 = new JFrame("Car Driving");
				f1.setSize(400,400);
				f2.setVisible(false);
				font = new Font("Arial",Font.BOLD,16);
				p = new JPanel();
				p.setPreferredSize(new Dimension(400,400));

				label = new JLabel("Your Score is " + score ,0);
				label.setPreferredSize(new Dimension(400,50));
				label.setFont(font);
				p.add(label);
				if(score<=200){
					label1 = new JLabel("You Need More Practice",0);
					label1.setPreferredSize(new Dimension(400,50));
					label1.setFont(font);
					p.add(label1);
				}
				else if(score>200 && score<=1000){
					label1 = new JLabel("You Played Well",0);
					label1.setPreferredSize(new Dimension(400,50));
					label1.setFont(font);
					p.add(label1);
				}
				else if(score> 1000){
					label1 = new JLabel("You are Champion",0);
					label1.setPreferredSize(new Dimension(400,50));
					label1.setFont(font);
					p.add(label1);

				}
				p.setBackground(Color.yellow);
				f1.setLayout(new FlowLayout());
				b = new JButton("OK");
				b.setPreferredSize(new Dimension(100,50));
				b.addMouseListener(new MouseAdapter(){
					public void mouseClicked(MouseEvent rt){
						System.exit(0);

					}

				});
				p.add(b);
				f1.add(p);
				f1.setVisible(true);

				}



			if(result==0){
			try{

				repaint();
				Thread.sleep(slept);
				i=i+10;
				if(slept>50){
					slept--;
				}
				else if(slept<=50){
					slept = 40;
				}
				if(i==600){
					ran = new Random();
					random = ran.nextInt(7) + 1;
					i=0;
				}

			}
			catch(InterruptedException err){}
		}



}

}
