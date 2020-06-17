package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fortune implements ActionListener {
        public void showButton() {
            System.out.println("Button clicked");
            JFrame frame = new JFrame();
            frame.setVisible(true);
            JButton button = new JButton();
            frame.add(button);
            frame.pack();
            button.addActionListener(this);
            int rand = new Random().nextInt(5);
           if (rand == 0) {
			System.out.println("fortune1");
		}
           if (rand == 1) {
			System.out.println("fortune2");
		}
           if (rand == 2) {
			System.out.println("fortune3");
		}
           if (rand == 3) {
			System.out.println("fortune4");
		}
           if (rand == 4) {
			System.out.println("fortune5");
		}   
       }

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(null, "Woohoo");
		}
    }

