package _08_jack_in_the_box;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.print.DocFlavor.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JackInTheBox implements MouseListener{
	int num = 0;
	JFrame frame = new JFrame();
	JButton button = new JButton();
	public void run() {
		frame.add(button);
		button.setText("Suprise!");
		frame.setVisible(true);
		frame.pack();
		button.addMouseListener(this);
		if(num==5) {
			
		}
		
			
		
		
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		num+=1;
		System.out.println(num);
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}


private void showPicture(String fileName) { 
      try {
           JLabel imageLabel = createLabelImage(fileName);
           JFrame frame = new JFrame();
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.add(imageLabel);
           frame.setVisible(true);
           frame.pack();
      } catch (Exception e) {
           e.printStackTrace();
      }
 }



private JLabel createLabelImage(String fileName) {
     try {
	          java.net.URL imageURL = getClass().getResource(fileName);
          if (imageURL == null) {
               System.err.println("Could not find image " + fileName);
               return new JLabel();
           } else {
                Icon icon = new ImageIcon(imageURL);
                JLabel imageLabel = new JLabel(icon);
                return imageLabel;
          }
      } catch (Exception e) {
           System.err.println("Could not find image " + fileName);
           return new JLabel();
     }
 }

}
